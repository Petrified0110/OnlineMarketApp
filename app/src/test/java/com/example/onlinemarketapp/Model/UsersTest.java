package com.example.onlinemarketapp.Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {

    @Test
    public void getUsername() {
        Users test = new Users("Ron01", "Ronald", "Edwin",
                 "Ron_Edwin3000@yahoo.com", "RoniEdwi21", "Employee",
                "072837123", "TMSTR3NR21",true);
        String expect = new String("Ron01");
        String user = test.getUsername();
        assertEquals(user, expect);
    }

    @Test
    public void getName() {
        Users test = new Users("Ron01", "Ronald", "Edwin",
                "Ron_Edwin3000@yahoo.com", "RoniEdwi21", "Employee",
                "072837123", "TMSTR3NR21",true);
        String expect = new String("Ronald");
        String name = test.getName();
        assertEquals(name, expect);
    }

    @Test
    public void getSurname() {
        Users test = new Users("Ron01", "Ronald", "Edwin",
                "Ron_Edwin3000@yahoo.com", "RoniEdwi21", "Employee",
                "072837123", "TMSTR3NR21",true);
        String expect = new String("Edwin");
        String surname = test.getSurname();
        assertEquals(surname, expect);
    }

    @Test
    public void getEmail() {
        Users test = new Users("Ron01", "Ronald", "Edwin",
                "Ron_Edwin3000@yahoo.com", "RoniEdwi21", "Employee",
                "072837123", "TMSTR3NR21",true);
        String expect = new String("Ron_Edwin3000@yahoo.com");
        String email = test.getEmail();
        assertEquals(email, expect);
    }

    @Test
    public void getPassword() {
        Users test = new Users("Ron01", "Ronald", "Edwin",
                "Ron_Edwin3000@yahoo.com", "RoniEdwi21", "Employee",
                "072837123", "TMSTR3NR21",true);
        String expect = new String("RoniEdwi21");
        String pass = test.getPassword();
        assertEquals(pass, expect);
    }

    @Test
    public void getUserType() {
        Users test = new Users("Ron01", "Ronald", "Edwin",
                "Ron_Edwin3000@yahoo.com", "RoniEdwi21", "Employee",
                "072837123", "TMSTR3NR21",true);
        String expect = new String("Employee");
        String type = test.getUserType();
        assertEquals(type, expect);
    }

    @Test
    public void isPending() {
        Users test = new Users("Ron01", "Ronald", "Edwin",
                "Ron_Edwin3000@yahoo.com", "RoniEdwi21", "Employee",
                "072837123", "TMSTR3NR21",true);
        boolean expect = true;
        boolean pending = test.isPending();
        assertEquals(pending, expect);
    }

    @Test
    public void getPhone() {
        Users test = new Users("Ron01", "Ronald", "Edwin",
                "Ron_Edwin3000@yahoo.com", "RoniEdwi21", "Employee",
                "072837123", "TMSTR3NR21",true);
        String expect = new String("072837123");
        String phonenr = test.getPhone();
        assertEquals(phonenr, expect);
    }

    @Test
    public void getAddress() {
        Users test = new Users("Ron01", "Ronald", "Edwin",
                "Ron_Edwin3000@yahoo.com", "RoniEdwi21", "Employee",
                "072837123", "TMSTR3NR21",true);
        String expect = new String("TMSTR3NR21");
        String address = test.getAddress();
        assertEquals(address, expect);
    }
}