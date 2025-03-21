package com.example.securitydemo.jwt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class LoginResponse {

    private String jwtToken;
    private String username;
    private List<String> roles;

    public List<String> getRoles() {
        return roles;
    }
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getJwtToken() {
        return jwtToken;
    }
    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
    public LoginResponse(String username, List<String> roles, String jwtToken){
        this.username = username;
        this.roles = roles;
        this.jwtToken = jwtToken;
    }

}
