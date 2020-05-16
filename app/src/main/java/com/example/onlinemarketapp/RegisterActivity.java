package com.example.onlinemarketapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private Button createAccountButton;
    private EditText inputName, inputSurname, inputEmail, inputPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        createAccountButton = (Button) findViewById(R.id.register_button);
        inputName = (EditText) findViewById(R.id.register_name_input);
        inputSurname = (EditText) findViewById(R.id.register_surname_input);
        inputEmail = (EditText) findViewById(R.id.register_email_input);
        inputPassword = (EditText) findViewById(R.id.register_passwor_input);

    }
}
