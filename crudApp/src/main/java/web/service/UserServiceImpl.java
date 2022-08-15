package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void removeUserById(long id) {
        userDao.removeUser(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.getAllUsers();
    }

    @Override
    public User findById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public void cleanUsersTable() {
    }

    @Override
    public void update(User user) {
        userDao.updateUser(user);
    }
}
