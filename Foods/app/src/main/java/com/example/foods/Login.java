package com.example.foods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void SignIn(View view) {
        EditText email = findViewById(R.id.IdUser);
        EditText pass = findViewById(R.id.IdPasswd);

        if (email.getText().toString().equals("") && pass.getText().toString().equals("")){
            Toast.makeText(this, "Both fields are empty", Toast.LENGTH_SHORT).show();
        } else if (email.getText().toString().equals("")){
            Toast.makeText(this, "Empty user field", Toast.LENGTH_SHORT).show();
        } else if (pass.getText().toString().equals("") ){
            Toast.makeText(this, "Empty password field", Toast.LENGTH_SHORT).show();
        }
    }

}
