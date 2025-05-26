package com.mycompany.poeassessmentpart1;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class POEassessmentPart1 {
    
      
    

    public static void main(String[] args) { 
        boolean exit = false; 

        // Display a welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the User System!");

        while (!exit) {
            String[] options = {"Register", "Login", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "User  System",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            // Registration
            if (choice == 0) {
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
            else if (choice == 1) {
                String username = JOptionPane.showInputDialog("Enter username:");
                if (username == null) return;
                String password = JOptionPane.showInputDialog("Enter password:");
                if (password == null) return; 

                UserLogin user = new UserLogin(username, password, null); // phone number is not needed for login
                if (user.loginUser  (username, password)) {
                    JOptionPane.showMessageDialog(null, "Login successful! Welcome back " + username);
                    JOptionPane.showMessageDialog(null, "Welcome to QuickChat."); // Added welcome message
                    int maxMessages = Integer.parseInt(JOptionPane.showInputDialog("How many messages would you like to send?"));
                    
                   
    ArrayList<String> storedMessages = new ArrayList<>(); 

    while (true) {
        String message = JOptionPane.showInputDialog("Type your message (or type 'exit' to quit):");
        if (message == null || message.equalsIgnoreCase("exit")) {
            break; // Exit the message input loop
        }

        String action = JOptionPane.showInputDialog("Choose an action:\n1) Send Message\n2) Disregard Message\n3) Store Message for Later");
        switch (action) {
            case "1":
            {
                int messageCount = 0;
                if (messageCount < maxMessages) {
                    Message msg = new Message();
                    msg.setContent(message); // Assuming Message class has a setContent method
                    msg.sendMessage();
                    messageCount++;
                } else {
                    JOptionPane.showMessageDialog(null, "You have reached the message limit.");
                }
            }
                break;


            case "2":
                JOptionPane.showMessageDialog(null, "Message disregarded.");
                break;

            case "3":
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
                    message.append("Message ").append(i + 1).append(": ").append(storedMessages.get(i)).append("\n");
                }
                JOptionPane.showMessageDialog(null, "Stored Messages:\n" + message.toString());
            }
        }
    }
}}}}}

            
