package kata.web.service;

import kata.web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
    User getUser(long id);
}
