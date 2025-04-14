
package com.mycompany.poeassessmentpart1;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author RC_Student_lab
 */

public class UserLogin {
    public final ArrayList<UserLogin> users = new ArrayList<>();
    private String username;
    private String Password;
    private String phonenumber;
    private static String Storedusername;
    private static String Storedpassword;
        
  
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    
    }

    public String getStoredusername() {
        return Storedusername;
    }

    public void setStoredusername(String Storedusername) {
        this.Storedusername = Storedusername;
    }

    public String getStoredpassword() {
        return Storedpassword;
    }

    public void setStoredpassword(String Storedpassword) {
        this.Storedpassword = Storedpassword;
    }
    
    public static boolean CheckUsername(String username){
     
        return username.contains("_") && username.length()<=5;
       
    }
    
    public static boolean CheckPasswordComplexity(String password) {
        
        return password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$");
    }

     public static boolean CheckPhoneNumber(String phoneNumber) {
         
        return Pattern.matches("\\+27[0-9]{9}", phoneNumber);
    }

 
    public static String registerUser(String username , String Password){
        if (!CheckUsername(username)){
            return "Username is incorrectly formatted. It must contain an underscore and no more than five letters";
        }
        if (!CheckPasswordComplexity(Password)){
            return"Password is incorrectly formatted. It must contain a capital letter, a number, a special character and it must be at least 8 letters";
        }
        Storedusername = username;
        Storedpassword = Password;
        return "User successfully registered!";
        
    }
    public static boolean loginUser ( String username , String Password){
        return username.equals(Storedusername)&& Password.equals(Storedpassword);
    }
    public String returnLoginStatus(String username , String Password){
        if(loginUser (username,Password)){
            return "Welcome" + Storedusername + " , it is great to see you again!";
        }else{
            return "Login failed. Please re-check your entered username and password.";
        }
    }
    
       
}
