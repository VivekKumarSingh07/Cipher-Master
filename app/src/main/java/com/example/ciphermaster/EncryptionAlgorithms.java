package com.example.ciphermaster;

public class EncryptionAlgorithms {
    static String getEncryptedMessgae(String s, String input){
        String encryptedMessage = "";
        switch(input){
            case "Ceaser's Cipher": encryptedMessage = s + "123";break;
        }
        return encryptedMessage;
    }

}
