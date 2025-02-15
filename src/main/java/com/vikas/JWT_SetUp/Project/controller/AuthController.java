package com.vikas.JWT_SetUp.Project.controller;


import com.vikas.JWT_SetUp.Project.dto.LoginDto;
import com.vikas.JWT_SetUp.Project.jwt.JWTAuthResponse;
import com.vikas.JWT_SetUp.Project.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@AllArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<JWTAuthResponse> authenticate(@RequestBody LoginDto loginDto){
        String token = authService.login(loginDto);

        JWTAuthResponse response = new JWTAuthResponse();
        response.setAccessToken(token);

        return ResponseEntity.ok(response);
    }
}
