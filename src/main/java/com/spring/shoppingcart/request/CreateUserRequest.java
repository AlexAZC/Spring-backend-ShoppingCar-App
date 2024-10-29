package com.spring.shoppingcart.request;

import lombok.Data;


@Data
public class CreateUserRequest {

    private String firstName;
    private String lastname;
    private String email;
    private String password;

}
