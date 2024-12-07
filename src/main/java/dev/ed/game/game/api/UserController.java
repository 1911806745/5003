package dev.ed.game.game.api;

import dev.ed.game.game.domain.User;
import dev.ed.game.game.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public void saveUsers(@RequestBody User user) {
        userService.saveUsers(user);
    }

    @DeleteMapping(value = "{id}")
    public void deleteUsersById(@PathVariable Integer id) {
        userService.deleteUsersById(id);
    }

    @PutMapping(value = "{id}")
    public void updateUsersDescriptionById(@PathVariable Integer id,
                                           @RequestParam String description) {
        userService.updateUserDescriptionById(id, description);
    }
}
