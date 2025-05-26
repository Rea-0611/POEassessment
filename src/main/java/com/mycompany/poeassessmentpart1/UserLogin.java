package com.mycompany.poeassessmentpart1;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class UserLogin {
    private final ArrayList<UserLogin> users = new ArrayList<>();

    private String username;
    private String password;
    private String phoneNumber;

    public UserLogin() {
        // Default constructor
    }

    public UserLogin(String username, String password, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public  boolean checkUsername(String username) {
        if (username == null) 
            return false;
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        if (password == null) 
            return false;
        return password.matches("^(?=.*[A-Z])(?=.*\\d).{9,}$");
    }

    public boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber == null)
            return false;
        // Correct regex for South African phone number starting with +27 followed by 9 digits
        String regex = "^\\+27[0-9]{9}$";
        boolean isValid = Pattern.matches(regex, phoneNumber);
        if (!isValid) {
            JOptionPane.showMessageDialog(null,
                "Phone number is incorrectly formatted. It must start with +27 and contain exactly 9 digits.");
        }
        return isValid;
    }

    public boolean registerUser() {
        if (!checkUsername(this.username)) {
            JOptionPane.showMessageDialog(null,
                "Username is incorrectly formatted. It must contain an underscore and no more than five characters.");
            return false;
        }
        if (!checkPhoneNumber(this.phoneNumber)) {
            return false;
        }
        if (!checkPasswordComplexity(this.password)) {
            JOptionPane.showMessageDialog(null,
                "Password is incorrectly formatted. It must contain a capital letter, a number, and be at least 9 characters long.");
            return false;
        }
        // Check if username already exists (case-insensitive)
        for (UserLogin user : users) {
            if (user.getUsername().equalsIgnoreCase(this.username)) {
                JOptionPane.showMessageDialog(null,
                    "Username already exists. Please choose a different username.");
                return false;
            }
        }
        
        JOptionPane.showMessageDialog(null, "User successfully registered!");
        return true;
    }

    public  boolean loginUser(String username, String password) {
        if (username == null || password == null) return false;
        for (UserLogin user : users) {
            if (this.username.equals(username) 
                && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public String returnLoginStatus(String username, String password) {
        if (loginUser(username, password)) {
            return "Welcome " + username + ", it is great to see you again!";
        } else {
            return "Login failed. Please re-check your entered username and password.";
        }
    }

}

