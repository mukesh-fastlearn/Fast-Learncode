package com.example.rtech.fastlearn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {

    EditText EmailID, Password;
    Button button17;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EmailID = findViewById(R.id.Email1);
        Password = findViewById(R.id.Password1);
        button17 = findViewById(R.id.loginButton);

        mFirebaseAuth = FirebaseAuth.getInstance();


        mAuthStateListener = new FirebaseAuth.AuthStateListener() {


            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
                if (mFirebaseAuth != null) {
                    Toast.makeText(Login.this, "You are logged in", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Login.this,Tution_classes.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(Login.this, "Please login", Toast.LENGTH_SHORT).show();

                }


            }
        };
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = EmailID.getText().toString().trim();
                String password = Password.getText().toString().trim();
                if (email.isEmpty()) {
                    EmailID.setError("Please provide email id");
                    EmailID.requestFocus();

                } else if (password.isEmpty()) {
                    Password.setError("Pleas enter your password");
                    Password.requestFocus();

                } else if (email.isEmpty() && password.isEmpty()) {
                    Toast.makeText(Login.this, "Fields are empty!", Toast.LENGTH_SHORT).show();
                } else if (!(email.isEmpty() && password.isEmpty())) {
                    mFirebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(Login.this, "Login Error, pleas login again ", Toast.LENGTH_SHORT).show();

                            } else {
                                Intent intToTution_classes = new Intent(Login.this, Tution_classes.class);
                                startActivity(intToTution_classes);
                            }
                        }

                    });
                }
                else {
                    Toast.makeText(Login.this, "Error occurred!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }
}





