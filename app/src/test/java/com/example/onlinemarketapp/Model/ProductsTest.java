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
        Products test = new Products("Gigel", "nice", "1 grand", "file.png", "big", "081999", "10 pm", true, "123", "John", false);
        boolean expected = false;
        assertEquals(false, expected);
    }

    @Test
    public void getName() {
        Products test = new Products("Gigel", "nice", "1 grand", "file.png", "big", "081999", "10 pm", true, "123", "John", false);
        String name = new String("Gigel");
        String expected = test.getName();
        assertEquals(name, expected);
    }

    @Test
    public void getDescription() {
        Products test = new Products("Gigel", "nice", "1 grand", "file.png", "big", "081999", "10 pm", true, "123", "John", false);
        String description = new String("nice");
        String expected = test.getDescription();
        assertEquals(description, expected);
    }

    @Test
    public void getPrice() {
        Products test = new Products("Gigel", "nice", "1 grand", "file.png", "big", "081999", "10 pm", true, "123", "John", false);
        String price = new String("1 grand");
        String expected = test.getPrice();
        assertEquals(price, expected);
    }

    @Test
    public void getImage() {
        Products test = new Products("Gigel", "nice", "1 grand", "file.png", "big", "081999", "10 pm", true, "123", "John", false);
        String image = new String("file.png");
        String expected = test.getImage();
        assertEquals(image, expected);
    }

    @Test
    public void getCategory() {
        Products test = new Products("Gigel", "nice", "1 grand", "file.png", "big", "081999", "10 pm", true, "123", "John", false);
        String category = new String("big");
        String expected = test.getCategory();
        assertEquals(category, expected);
    }

    @Test
    public void isPending() {
        Products test = new Products("Gigel", "nice", "1 grand", "file.png", "big", "081999", "10 pm", true, "123", "John", false);
        boolean expected = test.isPending();
        assertEquals(true, expected);
    }

    @Test
    public void getDate() {
        Products test = new Products("Gigel", "nice", "1 grand", "file.png", "big", "081999", "10 pm", true, "123", "John", false);
        String date = new String("081999");
        String expected = test.getDate();
        assertEquals(date, expected);
    }

    @Test
    public void getTime() {
        Products test = new Products("Gigel", "nice", "1 grand", "file.png", "big", "081999", "10 pm", true, "123", "John", false);
        String time = new String("10 pm");
        String expected = test.getTime();
        assertEquals(time, expected);
    }

    @Test
    public void getPid() {
        Products test = new Products("Gigel", "nice", "1 grand", "file.png", "big", "081999", "10 pm", true, "123", "John", false);
        String pid = new String("123");
        String expected = test.getPid();
        assertEquals(pid, expected);
    }
}