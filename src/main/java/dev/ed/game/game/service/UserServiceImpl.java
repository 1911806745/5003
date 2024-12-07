package dev.ed.game.game.service;

import dev.ed.game.game.dal.UserMapper;
import dev.ed.game.game.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.selectList(null);
    }

    @Override
    public void saveUsers(User user) {
        User select = userMapper.selectById(user.getId());
        if(select != null) {
            throw new IllegalStateException("This user has already existed.");
        }
        userMapper.insert(user);
    }

    @Override
    public void deleteUsersById(Integer id) {
        User select = userMapper.selectById(id);
        if(select == null) {
            throw new IllegalStateException("This user has not existed.");
        }
        userMapper.deleteById(id);
    }

    @Override
    public void updateUserDescriptionById(Integer id, String description) {
        User select = userMapper.selectById(id);
        if(select == null) {
            throw new IllegalStateException("This user has not existed.");
        }
        if(!Objects.equals(description, select.getDescription())) {
            select.setDescription(description);
        }
        userMapper.updateById(select);
    }
}
