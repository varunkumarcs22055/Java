package org.example;

public class Reverse {
    public String ReverseString(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return inputString;
        }
        StringBuilder stringBuilder = new StringBuilder(inputString);
        return stringBuilder.reverse().toString();
    }
}
