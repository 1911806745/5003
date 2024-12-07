package dev.ed.game.game.service;

import dev.ed.game.game.domain.User;

import java.util.List;

public interface UserService {

    /**
     *
     * @return
     */
    List<User> getUsers();

    /**
     *
     * @param user
     */
    void saveUsers(User user);

    /**
     *
     * @param id
     */
    void deleteUsersById(Integer id);

    /**
     *
     * @param id
     * @param description
     */
    void updateUserDescriptionById(Integer id, String description);
}
