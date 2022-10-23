package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegistrationModel {
    
    /**
     * 
     * Private Member variables
     * 
     */

    @NotNull(message="First name is a required field")
    @Size(min=1, max=32, message="First name must be between 1 and 32 characters")
    private String firstName;

    @NotNull(message="Last name is a required field")
    @Size(min=1, max=32, message="Last name must be between 1 and 32 characters")
    private String lastName;

    @NotNull(message="Email is a required field")
    @Size(min=1, max=32, message="Email must be between 1 and 32 characters")
    private String email;

    @NotNull(message="Username is a required field")
    @Size(min=1, max=32, message="Username must be between 1 and 32 characters")
    private String username;

    @NotNull(message="Phone is a required field")
    @Size(min=1, max=32, message="Phone must be between 1 and 32 characters")
    private String phone;

    @NotNull(message="Password is a required field")
    @Size(min=1, max=32, message="Password must be between 1 and 32 characters")
    private String password;
    
    
    /**
     * 
     * getters and setters for member variables of user model
     * 
     * @return
     */
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
