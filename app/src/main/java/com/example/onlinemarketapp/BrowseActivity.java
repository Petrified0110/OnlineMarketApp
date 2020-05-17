package com.example.onlinemarketapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class BrowseActivity extends AppCompatActivity {
    private Button logoutButton, accountButton, categoryButton;
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        logoutButton = findViewById(R.id.logout_button);
        accountButton = findViewById(R.id.account_button);
        categoryButton = findViewById(R.id.category_button); //to do
        logo = findViewById(R.id.login_applogo);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(BrowseActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        accountButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(BrowseActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });
    }
}
