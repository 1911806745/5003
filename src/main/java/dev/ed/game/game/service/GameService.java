package dev.ed.game.game.service;

import dev.ed.game.game.domain.Game;

import java.util.List;

public interface GameService {

    /**
     * return games information
     * @return
     */
    List<Game> getGames();

    /**
     * save game information
     * @param game
     */
    void saveGames(Game game);


    /**
     * delete game by gameId
     * @param gameId
     */
    void deleteGameById(Integer gameId);

    /**
     * update title by gameId
     * @param gameId
     * @param title
     */
    void updateTitleGameById(Integer gameId, String title);
}
