package com.company;

import java.security.MessageDigest;


/**
 *
 * Vi tar i bruk SHA-256
 * https://en.bitcoin.it/wiki/SHA-256
 * Blir brukt som poofe of work algoritmen i bitcoin
 *
 */


public class Kryptografi {


    public static String sha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            //Innput blir til SHA-256
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();//Gjør hashen om til heksadesimaler.

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}







