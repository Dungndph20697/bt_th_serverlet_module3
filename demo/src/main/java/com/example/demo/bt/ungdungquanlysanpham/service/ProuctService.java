package com.example.demo.bt.ungdungquanlysanpham.service;

import java.util.List;

public interface ProuctService<P> {
    List<P> findAll();

    void save(P product);

    P findById(int id);

    void update(int id, P product);

    void remove(int id);

    List<P> searchByName(String name);

}
