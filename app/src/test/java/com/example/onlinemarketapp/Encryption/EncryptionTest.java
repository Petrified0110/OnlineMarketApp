package com.example.onlinemarketapp.Encryption;

import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import static org.junit.Assert.*;

public class EncryptionTest {

    @Test
    public void getSalt() {
        Encryption test = new Encryption();
        String output = test.getSalt(10);
        StringBuilder expect = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            expect.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }

        assertFalse((new String(expect)).equals(output));
    }

    @Test
    public void generateSecurePassword() {
        Encryption test = new Encryption();
        char[] pass = {'d','u','m','m','y','p','a','s','s','s'};
        StringBuilder salt = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            salt.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }

        PBEKeySpec spec = new PBEKeySpec(pass, new String(salt).getBytes(), ITERATIONS, KEY_LENGTH);
        Arrays.fill(pass, Character.MIN_VALUE);
        byte[] hash;
        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            hash = skf.generateSecret(spec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new AssertionError("Error while hashing a password: " + e.getMessage(), e);
        } finally {
            spec.clearPassword();
        }

        String expect = Base64.getEncoder().encodeToString(hash);
        String saltString = new String(salt);
        String output = test.generateSecurePassword("dummypasss", saltString);

        assertEquals(output, expect);

    }

    @Test
    public void verifyUserPassword() {
        boolean expect = false;
        Encryption test = new Encryption();
        boolean output =  test.verifyUserPassword("AJHSGDJAHSGD",
                "KQJHKJHASD","AKJSDHKJASHD");
        assertEquals(expect, output);
    }

    private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final int ITERATIONS = 10000;
    private static final int KEY_LENGTH = 256;

}