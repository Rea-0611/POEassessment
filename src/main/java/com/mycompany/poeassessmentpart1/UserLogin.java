
package com.mycompany.poeassessmentpart1;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author RC_Student_lab
 */

public class UserLogin {
    
    private String username;
    private String Password;
    private String phonenumber;
    private String Storedusername;
    private String Storedpassword;
    
    
  
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
    
    public static boolean checkUsername(String username){
     
        return username.contains("_") && username.length()<=5;
       
    }
    
    
    
    
}
