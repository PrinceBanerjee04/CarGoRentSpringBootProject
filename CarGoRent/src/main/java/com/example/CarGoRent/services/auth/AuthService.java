package com.example.CarGoRent.services.auth;

import com.example.CarGoRent.dto.SignupRequest;
import com.example.CarGoRent.dto.UserDto;

public interface AuthService {

    boolean hasCustomerWithEmail(String email);
    UserDto createCustomer(SignupRequest signupRequest);
}
