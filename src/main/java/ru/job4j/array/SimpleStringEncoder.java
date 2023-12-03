package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else if (symbol != input.charAt(i) && counter < 2) {
                result = (result + input.charAt(i - 1));
                counter = 1;
                symbol = input.charAt(i);
            } else {
                result = (result + input.charAt(i - 1)) + counter;
                counter = 1;
                symbol = input.charAt(i);
            }
        }
        if (counter < 2) {
            result = (result + input.charAt(input.length() - 1));
        } else {
            result = (result + input.charAt(input.length() - 1)) + counter;
        }
        return result;
    }
}
