package com.example.onlinemarketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SellerBrowseActivity extends AppCompatActivity {

    private Button logoutButton, accountButton, addProductButton;
    private Button categoryButton, myProductsButton;
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_browse);
        Toast.makeText(this, "Welcome seller!...", Toast.LENGTH_SHORT).show();

        logoutButton = findViewById(R.id.logout_button);
        accountButton = findViewById(R.id.account_button);
        addProductButton = findViewById(R.id.add_prod_button);
        categoryButton = findViewById(R.id.category_button); //to do
        myProductsButton = findViewById(R.id.my_prod_button);
        logo = findViewById(R.id.login_applogo);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(SellerBrowseActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        accountButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(SellerBrowseActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });

        addProductButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(SellerBrowseActivity.this, SellerAddProductActivity.class);
                startActivity(intent);
            }
        });

        myProductsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(SellerBrowseActivity.this, SellerMyProductsActivity.class);
                startActivity(intent);
            }
        });

    }
}
