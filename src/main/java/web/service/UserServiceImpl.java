package web.service;

import org.springframework.stereotype.Component;
import web.dao.UserDAOImpl;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class UserServiceImpl{

    private final UserDAOImpl userDAOImpl;

    public UserServiceImpl(UserDAOImpl userDAOImpl) {
        this.userDAOImpl = userDAOImpl;
    }


    public List<User> getAllUsers() {
        return userDAOImpl.getAllUsers();
    }


    public User getUser(int id) {
        return userDAOImpl.getUser(id);
    }


    public void addUser(User user) {
        userDAOImpl.addUser(user);
    }


    public void updateUser(User user) {
        userDAOImpl.updateUser(user);
    }


    public void removeUser(int id) {
        userDAOImpl.removeUser(id);
    }
}
