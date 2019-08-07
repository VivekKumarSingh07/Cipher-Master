package com.example.ciphermaster;

public class EncryptionAlgorithms {
    static String getEncryptedMessgae(String s, String input){
        String encryptedMessage = "";
        switch(input){
            case "Caesar's Cipher": encryptedMessage = caesarCipher(s);break;
        }
        return encryptedMessage;
    }

    static String caesarCipher(String message)
    {
        String result = "";
        for (int i=0; i<message.length(); i++)
        {
            if(!Character.isAlphabetic(message.charAt(i))) {
                result = "";
                break;
            }
            if (Character.isUpperCase(message.charAt(i)))
            {
                char ch = (char)(((int)message.charAt(i) + 4 - 65) % 26 + 65);
                result += Character.toString(ch);
            }
            else
            {
                char ch = (char)(((int)message.charAt(i) + 4 - 97) % 26 + 97);
                result += Character.toString(ch);
            }
        }
        return result;
    }

}
