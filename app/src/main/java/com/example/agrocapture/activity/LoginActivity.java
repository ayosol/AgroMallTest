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

import androidx.appcompat.app.AppCompatActivity;

import com.example.agrocapture.R;


public class LoginActivity extends AppCompatActivity {

    Button btn_login;
    EditText txt_email, txt_password;
    String email, password;
    Boolean error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        error = true;
        txt_email = findViewById(R.id.email_EditText);
        txt_password = findViewById(R.id.password_EditText);
        btn_login = findViewById(R.id.btn_login);

        //Click Event
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(LoginActivity.this, DashboardActivity.class));

                /*//Get the string inputs
                email = txt_email.getEditableText().toString().trim();
                password = txt_password.getEditableText().toString().trim();

                if (email.equals("test@theagromall.com") && password.equals("password")) {
                    error = false;
                    startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
                    customToast();

                    //Clear Text Fields
                    txt_email.setText("");
                    txt_password.setText("");
                }
                //else return error message
                else {
                    error = true;
                    customToast();
                }*/

            }
        });

    }

    private void customToast() {
        //Inflate Custom Toast
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView textView = layout.findViewById(R.id.toast_text);
        if (error == true) {
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
