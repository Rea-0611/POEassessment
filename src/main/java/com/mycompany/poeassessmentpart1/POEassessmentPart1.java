
package com.mycompany.poeassessmentpart1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 */
public class POEassessmentPart1 {
private UserLogin UserLogin(String trim,String username , String Password, String phonenumber , String trim0) {
        throw new UnsupportedOperationException("Not supported yet."); 
}
  
       public static void main(String[] args) {
        Scanner cb = new Scanner(System.in);
        UserLogin ag = new UserLogin();
        
      
       String username;
       String Password;
       String phonenumber;
       
       
        System.out.println("Register: ");
        
        System.out.print("Enter your username: ");
        username = cb.nextLine();
        ag.setUsername(username);
        
        System.out.print("Enter your password: ");
        Password = cb.nextLine();
        ag.setPassword(Password);
        
        System.out.print("Enter your phone number: ");
        phonenumber = cb.nextLine();
        ag.setPhonenumber(phonenumber);
        
          String registerMessage = UserLogin.registerUser(username , Password);
           System.out.println("Register Message");
          
           if(UserLogin.registerUser.equals("User registered successfully!")){
               System.out.println("User registered successfully!");
               System.out.println("\n******User Login******");
               System.out.println("Enter your username: ");
               String loginUsername = cb.nextLine();
               System.out.println("Enter your password: ");
               String loginPassword = cb.nextLine();
             
           }else{
               System.out.println("Login failed. Please check your username and password.");
           }
           
        
       }
       }
        

   
    

// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody


