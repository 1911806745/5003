package dev.ed.game.game.service;

import cn.hutool.core.collection.ListUtil;
import dev.ed.game.game.dal.GameMapper;
import dev.ed.game.game.domain.Game;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Service
public class GameServiceImpl implements GameService {

    @Resource
    private GameMapper gameMapper;

    @Override
    public List<Game> getGames() {
        return gameMapper.selectList(null);
    }

    @Override
    public void saveGames(Game game) {
        Game select =  gameMapper.selectByTitle(game.getTitle());
        if(select != null) {
            throw new IllegalStateException("title has already existed.");
        }
        gameMapper.insert(game);
    }

    @Override
    public void deleteGameById(Integer gameId) {
        Game select = gameMapper.selectById(gameId);
        if(select == null) {
            throw new IllegalStateException("This game has not existed.");
        }
        gameMapper.deleteById(gameId);
    }

    @Override
    @Transactional
    public void updateTitleGameById(Integer gameId, String title) {
        Game select = gameMapper.selectById(gameId);
        if(select == null) {
            throw new IllegalStateException("This game has not existed");
        }
        if(title != null && !title.isEmpty() && !Objects.equals(title, select.getTitle())) {
            select.setTitle(title);
        }
        gameMapper.updateById(select);
    }
}
