package com.example.demo.th.quanlyuser.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {
    private int id;
    private String name;
    private String email;
    private String country;

}
