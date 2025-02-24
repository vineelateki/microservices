package com.wipro.java.ms.d;

public class Main {
    public static void main(String[] args) {
        // Using FileReader (Reading from file)
        StringReader fileReader = new FileReader("input.txt");
        StringProcessor fileProcessor = new StringProcessor(fileReader);
        fileProcessor.processString();

        System.out.println();

        // Using UserInputReader (Reading from user input)
        StringReader userInputReader = new UserInputReader();
        StringProcessor userProcessor = new StringProcessor(userInputReader);
        userProcessor.processString();
    }
}