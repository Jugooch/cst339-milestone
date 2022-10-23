package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginModel {

    @NotNull(message="User name is a required field")
    @Size(min=1, max=32, message="User name must be between 1 and 32 characters")
    private String username;    
    
    @NotNull(message="Password is a required field")
    @Size(min=1, max=32, message="Password must be between 1 and 32 characters")
    private String password;
    

    
    public void setUsername(String user) {
        username = user;
    }
    
    public String getUsername() {
        return username;
    }
    public void setPassword(String pass) {
        password = pass;
    }
    
    public String getPassword() {
        return password;
    }
}
