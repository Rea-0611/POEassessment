
package com.mycompany.poeassessmentpart1;
import javax.swing.JOptionPane;
import java.util.Random;

public class Message {
    
    private String messageID;
    private String recipientcellNumber;
    private String messageText;
    private int messageCounter = 1;
    private int maxMessages;
    private int messageCount = 0;
     
    // Validate the message ID (should be max 10 characters)
    public boolean checkMessageID(String id) {
        return id.length() <= 10;
    }

    // Validate the recipient cell number (max 10 chars and starts with '+')
    public int checkRecipientCell(String cell) {
        if (cell.length() <= 10 && cell.startsWith("+")) {
            return 1;
        } else {
            return 0;
        }
    }

    // Create and return a 10-digit random message hash (as string)
    public String createMessageHash() {
        Random rand = new Random();
        long hash = 1000000000L + (long)(rand.nextDouble() * 8999999999L);
        return String.valueOf(hash);
    }

    // Send message method
    public String sendMessage() {
        messageID = createMessageHash();

        // Get and validate recipient
        recipientcellNumber = JOptionPane.showInputDialog("Enter recipient cell (starts with +27, max 9 chars):");
        while (checkRecipientCell(recipientcellNumber) == 0) {
            recipientcellNumber = JOptionPane.showInputDialog("Invalid number. Enter recipient cell (starts with +27, max 9 chars):");
        }

        // Get and validate message
        messageText = JOptionPane.showInputDialog("Enter message (max 250 characters)   >>");
        while (messageText.length() > 250) {
            messageText = JOptionPane.showInputDialog("Too long. Please enter a message of less than 250 characters >>");
        }

        // Display final message details
        JOptionPane.showMessageDialog(null,
                "Message Sent!\n" +
                "Message ID: " + messageID + "\n" +
                "Recipient: " + recipientcellNumber + "\n" +
                "Message: " + messageText);

        return messageID;
    }

    void setContent(String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

