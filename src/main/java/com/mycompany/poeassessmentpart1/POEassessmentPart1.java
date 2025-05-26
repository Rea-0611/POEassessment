package com.mycompany.poeassessmentpart1;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class POEassessmentPart1 {
    
      
    

    public static void main(String[] args) { 
        Message msg = new Message();
        boolean exit = false; 
          
        
        while (!exit) {
            String[] options = {"Register", "Login", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Quickchat",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            // Registration
            if (choice == 1) {
                String username = JOptionPane.showInputDialog(null, "Enter your username:");
                String password = JOptionPane.showInputDialog(null, "Enter your password:");
                String phoneNumber = JOptionPane.showInputDialog(null, "Enter your phone number:");

                UserLogin user = new UserLogin(username, password, phoneNumber); // Create UserLogin object

                // Registration logic
                if (user.registerUser  ()) {
                    JOptionPane.showMessageDialog(null, "Registration successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Registration failed. Please try again.");
                }
            }

            // Login
            if (choice == 2) {
                String username = JOptionPane.showInputDialog("Enter username:");
                if (username == null) 
                    return;
                
                String password = JOptionPane.showInputDialog("Enter password:");
                if (password == null) 
                    return; 

                UserLogin user = new UserLogin(username, password, null); // phone number is not needed for login
                if (user.loginUser  (username, password)) {
                    JOptionPane.showMessageDialog(null, "Login successful! Welcome back " + username);
                    
                    JOptionPane.showMessageDialog(null, "Welcome to QuickChat."); // Added welcome message
                    int menu = Integer.parseInt(JOptionPane.showInputDialog("Please choose \n1 send messages \n2 for show recently sent messages \n3 quit"));
                    while(menu != 3){
                    switch (menu){
               case 1:
                   int maxMessage = Integer.parseInt(JOptionPane.showInputDialog("How many messages do you want to send?"));
                   for(int y = 0; y < maxMessage;y++){
                       String recipientcellNumber = JOptionPane.showInputDialog("Enter recipient's cell number");
                       msg.setRecipientcellNumber(recipientcellNumber);
                       
                   }
                break;


            case 2:
                JOptionPane.showMessageDialog(null, "Message disregarded.");
                break;

            case 3:
                storedMessages.add(message);
                JOptionPane.showMessageDialog(null, "Message stored for later use.");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid choice. Please select 1, 2, or 3.");
        }

        // Display stored messages
        if (storedMessages.size() > 0) {
             choice = JOptionPane.showConfirmDialog(null, "Do you want to view stored messages?", "Stored Messages", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                
                for (int i = 0; i < storedMessages.size(); i++) {
                   
                }
                JOptionPane.showMessageDialog(null, "Stored Messages:\n" + message.toString());
            }
        }
    } else {
        // Login failed
        JOptionPane.showMessageDialog(null, "Invalid username or password.");
}}}}}}}

            
