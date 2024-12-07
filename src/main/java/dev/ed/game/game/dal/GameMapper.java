package dev.ed.game.game.dal;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import dev.ed.game.game.domain.Game;
import org.apache.ibatis.annotations.Select;

public interface GameMapper extends BaseMapper<Game> {

    @Select("select * from game.games where title = #{title}")
    Game selectByTitle(String title);
}
