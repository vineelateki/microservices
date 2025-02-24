package com.wipro.java.ms.d;

import java.util.Scanner;

public class UserInputReader implements StringReader {
    @Override
    public String readString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }
}