package com.example.demo.th.goistoredprocedures.DAO;

import com.example.demo.th.goistoredprocedures.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO<U> {

    void insertUser(U u);

    U selectUser(int id);

    List<U> selectAllUsers();

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(U u);

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;
}
