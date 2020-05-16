package com.example.onlinemarketapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private Button createAccountButton;
    private EditText inputName, inputSurname, inputEmail, inputPassword;
    //private ProgressBar loadingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        createAccountButton = (Button) findViewById(R.id.register_btn);
        inputName = (EditText) findViewById(R.id.register_name_input);
        inputSurname = (EditText) findViewById(R.id.register_surname_input);
        inputEmail = (EditText) findViewById(R.id.register_email_input);
        inputPassword = (EditText) findViewById(R.id.register_password_input);

//        createAccountButton.setOnClickListener((new View.OnClickListener() {
//            @RequiresApi(api = Build.VERSION_CODES.O)
//            @Override
//            public void onClick(View view) {
//                createAccount();
//            }
//        }));
//    }
//
//    @RequiresApi(api = Build.VERSION_CODES.O)
//    private void createAccount() {
//        String name = inputName.getText().toString();
//        String surname = inputSurname.getText().toString();
//        String email = inputEmail.getText().toString();
//        String password = inputPassword.getText().toString();
//        //loadingBar = new ProgressBar(this);
//
//        if(TextUtils.isEmpty(name)){
//            Toast.makeText(this, "Please write your name", Toast.LENGTH_SHORT).show();
//        }
//        else if(TextUtils.isEmpty(surname)){
//            Toast.makeText(this, "Please write your surname", Toast.LENGTH_SHORT).show();
//        }
//        else if(TextUtils.isEmpty(email)){
//            Toast.makeText(this, "Please write your email", Toast.LENGTH_SHORT).show();
//        }
//        else if(TextUtils.isEmpty(password)){
//            Toast.makeText(this, "Please write your password", Toast.LENGTH_SHORT).show();
//        }
//        else{
////            loadingBar.setTitle("Creating your account");
////            loadingBar.setMessage("Please wait while we set up your account");
////            loadingBar.setCanceledOnTouchOutside(false);
////            loadingBar.show();
//
//            String salt = Encryption.getSalt(10);
//            String encryptedPassword = Encryption.generateSecurePassword(password, salt);
//
//            validateEmail(name, surname, email, encryptedPassword, salt);
//        }
//
//    }
//
//    private void validateEmail(final String name, final String surname, final String email, final String password, final String salt) {
//        final DatabaseReference myDatabaseReference;
//        myDatabaseReference = FirebaseDatabase.getInstance().getReference();
//
//        myDatabaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                if(!(dataSnapshot.child("Buyers").child(email).exists())){
//                    HashMap<String, Object> userdataMap = new HashMap<>();
//                    userdataMap.put("email", email);
//                    userdataMap.put("name", name);
//                    userdataMap.put("surname", surname);
//                    userdataMap.put("password", password);
//                    userdataMap.put("salt", salt);
//
//                    myDatabaseReference.child("Buyers").child(email).updateChildren(userdataMap).addOnCompleteListener(new OnCompleteListener<Void>() {
//                        @Override
//                        public void onComplete(@NonNull Task<Void> task) {
//                            if(task.isSuccessful()) {
//                                Toast.makeText(RegisterActivity.this, "Account has been created successfully", Toast.LENGTH_SHORT).show();
//                                //loadingBar.dismiss();
//
//                                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
//                                startActivity(intent);
//                            }
//                            else{
//                                //loadingBar.dismiss();
//                                Toast.makeText(RegisterActivity.this, "Error! Something went home. Please try again", Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                    });
//                }
//                else{
//                    Toast.makeText(RegisterActivity.this, "There is already an account made using the email " + email, Toast.LENGTH_SHORT).show();
//                    //loadingBar.dismiss();
//
//                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
//                    startActivity(intent);
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
    }
}
