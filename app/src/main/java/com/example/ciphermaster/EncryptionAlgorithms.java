package com.example.ciphermaster;

import java.util.HashMap;

public class EncryptionAlgorithms {
    static String getEncryptedMessgae(String s, String input) {
        String encryptedMessage = "";
        switch (input) {
            case "Caesar's Cipher":
                encryptedMessage = caesarCipher(s);
                break;
            case "ROT13 Cipher":
                encryptedMessage = ROT13Cipher(s);
                break;
            case "Null Cipher":
                encryptedMessage = nullCipher(s);
                break;
            case "Atbash Cipher":
                encryptedMessage = atbashCipher(s);
                break;

        }
        return encryptedMessage;
    }

    static String caesarCipher(String message) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (!Character.isAlphabetic(message.charAt(i))) {
                result.append(' ');
            }
            else if (Character.isUpperCase(message.charAt(i))) {
                char ch = (char) (((int) message.charAt(i) + 4 - 65) % 26 + 65);
                result.append(ch);
            }
            else if(Character.isLowerCase(message.charAt(i))) {
                char ch = (char) (((int) message.charAt(i) + 4 - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();
    }

    static String ROT13Cipher(String message) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (!Character.isAlphabetic(message.charAt(i))) {
                return "";
            }
            if (Character.isUpperCase(message.charAt(i))) {
                char ch = (char) (((int) message.charAt(i) + 14 - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) message.charAt(i) + 14 - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();
    }

    static String nullCipher(String message) {
        StringBuilder result = new StringBuilder();
        String[] words = message.split(" ");

        for (int i = 0; i < words.length; i++) {
            result.append(words[i].charAt(0));
        }
        return result.toString().toLowerCase();
    }


    static String atbashCipher(String message) {
        HashMap<Character, Character> map;
        map = new HashMap<>();
        map.put('A', 'Z');
        map.put('B', 'Y');
        map.put('C', 'X');
        map.put('D', 'W');
        map.put('E', 'V');
        map.put('F', 'U');
        map.put('G', 'T');
        map.put('H', 'S');
        map.put('I', 'R');
        map.put('J', 'Q');
        map.put('K', 'P');
        map.put('L', 'O');
        map.put('M', 'N');
        map.put('N', 'M');
        map.put('O', 'L');
        map.put('P', 'K');
        map.put('Q', 'J');
        map.put('R', 'I');
        map.put('S', 'H');
        map.put('T', 'G');
        map.put('U', 'F');
        map.put('V', 'E');
        map.put('W', 'D');
        map.put('X', 'C');
        map.put('Y', 'B');
        map.put('Z', 'A');
        map.put('a', 'z');
        map.put('b', 'y');
        map.put('c', 'x');
        map.put('d', 'w');
        map.put('e', 'v');
        map.put('f', 'u');
        map.put('g', 't');
        map.put('h', 's');
        map.put('i', 'r');
        map.put('j', 'q');
        map.put('k', 'p');
        map.put('l', 'o');
        map.put('m', 'n');
        map.put('n', 'm');
        map.put('o', 'l');
        map.put('p', 'k');
        map.put('q', 'j');
        map.put('r', 'i');
        map.put('s', 'h');
        map.put('t', 'g');
        map.put('u', 'f');
        map.put('v', 'e');
        map.put('w', 'd');
        map.put('x', 'c');
        map.put('y', 'b');
        map.put('z', 'a');

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {

            if (message.charAt(i) != ' ') {
                result.append(map.get(message.charAt(i)));
            } else if (message.charAt(i) == ' ') {
                result.append(' ');
            } else {
                return "";
            }

        }
        return result.toString();
    }

}
