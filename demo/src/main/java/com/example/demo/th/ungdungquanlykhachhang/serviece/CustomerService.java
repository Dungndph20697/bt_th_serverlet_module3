package com.example.demo.th.ungdungquanlykhachhang.serviece;

import com.example.demo.th.ungdungquanlykhachhang.model.Customer;

import java.util.List;

public interface CustomerService<C> {
    List<C> findAll();

    void save(C customer);

    C findById(int id);

    void update(int id, C c);

    void remove(int id);
}
