package com.example.demo.th.goistoredprocedures.DAO;

import com.example.demo.th.goistoredprocedures.model.User;

import java.util.List;

public interface IUserDAOTrancacsion {
    void addUserTransaction(User user, List<Integer> permission);
}
