package com.spring.shoppingcart.services.user;

import com.spring.shoppingcart.dto.UserDto;
import com.spring.shoppingcart.model.User;
import com.spring.shoppingcart.request.CreateUserRequest;
import com.spring.shoppingcart.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
