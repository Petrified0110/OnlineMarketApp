package com.example.onlinemarketapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button loginButton, registerButton, browseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //We connect the buttons in main activity to the once from the xml
        loginButton = (Button) findViewById(R.id.main_login_button);
        registerButton = (Button) findViewById(R.id.main_register_button);
        browseButton = (Button) findViewById(R.id.main_browse_btn);

//        loginButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        registerButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        browseButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, BrowseActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
