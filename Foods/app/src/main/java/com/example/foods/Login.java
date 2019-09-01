package com.example.foods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void SignIn(View view) {
        int a = 20;
        int b = 20;

        if (a == b) {
            Toast.makeText(this, "Login Correcto", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Login Incorrecto", Toast.LENGTH_SHORT).show();
        }
    }

}
