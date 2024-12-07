package dev.ed.game.game.api;

import dev.ed.game.game.domain.Game;
import dev.ed.game.game.service.GameService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/v1/game")
public class GameController {

    @Resource
    private GameService gameService;

    @GetMapping
    public List<Game> getGames() {
        return gameService.getGames();
    }

    @PostMapping
    public void saveGames(@RequestBody Game game) {
        gameService.saveGames(game);
    }

    // api/v1/student/1
    @DeleteMapping(path = "{gameId}")
    public void deleteGameById(@PathVariable Integer gameId) {
        gameService.deleteGameById(gameId);
    }

    // api/
    @PutMapping(path = "{gameId}")
    public void updateTitleGameById(@PathVariable Integer gameId,
                               @RequestParam String name) {
        gameService.updateTitleGameById(gameId, name);
    }
}
