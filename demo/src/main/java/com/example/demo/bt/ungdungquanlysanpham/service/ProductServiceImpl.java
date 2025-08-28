package com.example.demo.bt.ungdungquanlysanpham.service;

import com.example.demo.bt.ungdungquanlysanpham.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductServiceImpl implements ProuctService<Product> {

    private static List<Product> products;
    private int genId = 0;

    static {
        products = new ArrayList<>();
        products.add(new Product(1, "Iphone 12", 1000, "New", "Apple"));
        products.add(new Product(2, "Samsung Galaxy S21", 900, "New", "Samsung"));
        products.add(new Product(3, "Google Pixel 5", 800, "New", "Google"));
        products.add(new Product(4, "OnePlus 9", 700, "New", "OnePlus"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        product.setId(genId());
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        products.set(indexOf(id), product);
    }

    @Override
    public void remove(int id) {
        products.remove(indexOf(id));
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }

    private int indexOf(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    private int genId() {
        genId++;
        for (Product product : products) {
            if (product.getId() == genId) {
                genId();
            }
        }
        return genId;
    }
}
