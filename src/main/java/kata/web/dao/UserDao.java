package kata.web.dao;

import kata.web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
    User getUser(long id);
}
