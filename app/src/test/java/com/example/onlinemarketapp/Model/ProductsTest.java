package com.example.onlinemarketapp.Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductsTest {

    @Test
    public void getSeller() {
        Products test = new Products("Gigel", "nice", "1 grand", "file.png", "big", "081999", "10 pm", true, "123", "John", false);
        String name = new String("John");
        String expected = test.getSeller();
        assertEquals(name, expected);
    }

    @Test
    public void isApproved() {
    }

    @Test
    public void getName() {
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getPrice() {
    }

    @Test
    public void getImage() {
    }

    @Test
    public void getCategory() {
    }

    @Test
    public void isPending() {
    }

    @Test
    public void getDate() {
    }

    @Test
    public void getTime() {
    }

    @Test
    public void getPid() {
    }
}