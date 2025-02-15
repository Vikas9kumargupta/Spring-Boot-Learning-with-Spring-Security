package com.vikas.JWT_SetUp.Project.service;

import com.vikas.JWT_SetUp.Project.dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
