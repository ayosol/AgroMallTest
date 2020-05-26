package com.example.agrocapture.activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.agrocapture.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    Button btn_login;
    EditText txt_email;
    EditText txt_password;
    String email, password;
    Boolean error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize Firebase Auth
        mFirebaseAuth = FirebaseAuth.getInstance();

        error = true;
        txt_email = findViewById(R.id.email_EditText);
        txt_password = findViewById(R.id.password_EditText);
        btn_login = findViewById(R.id.btn_login);

        //Firebase AuthListener check if user is logged in already
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
                if (mFirebaseUser != null) {
                    Toast.makeText(LoginActivity.this, "You're Logged In", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
                } else {
                    Toast.makeText(LoginActivity.this, "You're not Logged In", Toast.LENGTH_SHORT).show();
                }
            }
        };


        //Click Event
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the string inputs
                email = txt_email.getEditableText().toString().trim();
                password = txt_password.getEditableText().toString().trim();

                if (email.isEmpty()) {
                    error = true;
                    txt_email.setError("Please enter Email ID");
                    txt_email.requestFocus();
                } else if (password.isEmpty()) {
                    error = true;
                    txt_password.setError("Please enter Password");
                    txt_password.requestFocus();
                } else if (!(email.isEmpty() && password.isEmpty())) {
                    mFirebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                error = true;
                                customToast();
                            } else {
                                error = false;
                                customToast();
                                startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
                            }
                        }
                    });
                } else {
                    Toast.makeText(LoginActivity.this, "Error occurred", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }

    private void customToast() {
        //Inflate Custom Toast
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView textView = layout.findViewById(R.id.toast_text);
        if (error) {
            textView.setText("Login Failed! Enter correct details");
        } else {
            textView.setText("Login Successful");
        }
        //Set Toast
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 550);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

}
