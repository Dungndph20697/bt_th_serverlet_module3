package com.example.demo.bt.ungdungquanlysanpham.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
    private String manufacturer;
}
