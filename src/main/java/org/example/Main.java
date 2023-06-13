package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String myName = "Tom";

        int nameLength = myName.length();

        if (nameLength % 2 == 0) {
            System.out.println("The number of letters in my name is even.");
        } else {
            System.out.println("The number of letters in my name is odd.");
        }
    }
}
