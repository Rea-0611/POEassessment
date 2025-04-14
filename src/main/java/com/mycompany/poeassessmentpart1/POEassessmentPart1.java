
package com.mycompany.poeassessmentpart1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 */
public class POEassessmentPart1 {
private final ArrayList<UserLogin> users = new ArrayList<>();
private UserLogin UserLogin(String trim, String Password, String trim0) {
        throw new UnsupportedOperationException("Not supported yet."); 
}
  
       public static void main(String[] args) {
        Scanner cb = new Scanner(System.in);
        UserLogin ag = new UserLogin();
        
      
       String username;
       String Password;
       String Phonenumber;
       
       
        System.out.println("Register: ");
        
        System.out.print("Enter your username: ");
        username = cb.nextLine();
        ag.setUsername(username);
        
        System.out.print("Enter your password: ");
        Password = cb.nextLine();
        ag.setPassword(Password);
        
        System.out.print("Enter your phone number: ");
        Phonenumber = cb.nextLine();
        ag.setPhonenumber(Phonenumber);
        
        
       }

    
        
        public String register(String username, String Password, String Phonenumber) {
        if (username == null || username.trim().isEmpty()) {
            return "Username cannot be empty.";
        }

        if (usernameExists(username)) {
            return "Username already exists.";
        }

        if (!isValidPassword(Password)) {
            return "Password must be at least 8 characters, include an uppercase letter and a number.";
        }

        if (!isValidPhoneNumber(Phonenumber)) {
            return "Phone number must start with '+27' and be a valid South African number.";
        }

        String hashedPassword = hashPassword(Password);
        users.add(UserLogin(username.trim(), Password, Phonenumber.trim()));
        return "Registration successful!";
    }

        public String login(String username, String password) {
        if (username == null || password == null) {
            return "Invalid username or password.";
        }

        for (UserLogin user : users) {
            if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(hashPassword(password))) {
                return "Welcome, " + username + "!";
            }
        }
        return "Invalid username or password.";
    }

    private boolean usernameExists(String username) {
        return users.stream().anyMatch(user -> user.getUsername().equalsIgnoreCase(username));
    }

    private boolean phoneNumberExists(String phoneNumber) {
        return users.stream().anyMatch(user -> user.getPhonenumber().equals(phoneNumber));
    }

    private boolean isValidPassword(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$");
    }

     private boolean isValidPhoneNumber(String phoneNumber) {
        // Validate SA phone number: must start with +27 and have 9 digits after
        return Pattern.matches("\\+27[0-9]{9}", phoneNumber);
    }

    private String hashPassword(String password) {
        // Replace with a proper hashing algorithm like SHA-256
        return Integer.toHexString(password.hashCode());
    }

// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
}

