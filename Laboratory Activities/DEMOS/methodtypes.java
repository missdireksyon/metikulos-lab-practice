package com.methodtypesdemo;
import java.util.Scanner;
import java.util.function.Predicate;

public class MethodTypesDemo extends BaseSystem {

    private String secretMessage;
    private String passcode;

    // Constructor Method Demo
    public MethodTypesDemo(String message, String passcode) {
        this.secretMessage = message;
        this.passcode = passcode;
        totalUsers++;
        System.out.println("Secret message saved!");
    }

    // Getter and Setter Method Demo
    public String getSecretMessage() {
        return secretMessage;
    }

    public void setSecretMessage(String message) {
        this.secretMessage = message;
    }

    // Instance Method Demo
    public void showMessage() {
        System.out.println("Your secret message is: " + secretMessage);
    }

    // Method Overloading Demo
    public void showMessage(String key) {
        if (key.equals(this.passcode)) {  // ← CHECK AGAINST USER'S PASSCODE
            System.out.println("Decoded message: " + secretMessage.toUpperCase());
        } else {
            System.out.println("Wrong Passcode — Access Denied!");
        }
    }

    // Static Method
    public static void showTotalUsers() {
        System.out.println("Total secret message sessions: " + totalUsers);
    }

    // Method Overriding
    @Override
    public void displaySystemInfo() {
        System.out.println("=== Methods Type Demo ===");
        System.out.println("This demo stores and reveals secret messages.");
    }

    // Final Method
    public final void showFinalMessage() {
        System.out.println("Demo finished. Your secret is safe with us :)");
    }

    // Synchronized Method
    public synchronized void updateSecretMessage(String newMessage) {
        this.secretMessage = newMessage;
        System.out.println("Secret message updated safely.");
    }

    // Recursive Method
    public void countdown(int n) {
        if (n <= 0) {
            System.out.println("Message unlocked!");
            showMessage();
            return;
        }
        System.out.println("Unlocking in... " + n);
        countdown(n - 1);
    }

    // Lambda Expression
    Predicate<String> isValidMsg = msg -> msg != null && msg.length() > 0 && !msg.trim().isEmpty();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lambda expression: checks if message is not empty
        Predicate<String> isValidMessage = msg -> msg != null && !msg.trim().isEmpty();

        System.out.print("Enter your secret message: ");
        String message = sc.nextLine();

        if (!isValidMessage.test(message)) {
            System.out.println("Invalid message. Program will exit.");
            sc.close();
            return;
        }


        System.out.print("Create a passcode to protect your message: ");
        String userPasscode = sc.nextLine();


        MethodTypesDemo demo = new MethodTypesDemo(message, userPasscode);


        demo.displaySystemInfo();

        // Static method
        MethodTypesDemo.showTotalUsers();

        // Instance method (commented out to keep message secret)
        // demo.showMessage();

        // Overloaded method
        System.out.print("Enter passcode to decode your secret message: ");
        String passcode = sc.nextLine();
        demo.showMessage(passcode);

        // Synchronized method
        System.out.print("Enter new secret message: ");
        String newMessage = sc.nextLine();
        demo.updateSecretMessage(newMessage);

        // Getter and setter
        System.out.println("Current message (via getter): " + demo.getSecretMessage());
        System.out.print("Update message again: ");
        String anotherMessage = sc.nextLine();
        demo.setSecretMessage(anotherMessage);
        System.out.println("Updated message (via getter): " + demo.getSecretMessage());

        // Recursive method
        System.out.println("\nStarting countdown from 3:");
        demo.countdown(3);

        // Final method
        demo.showFinalMessage();

        sc.close();
    }
}