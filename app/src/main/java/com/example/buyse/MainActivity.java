package com.example.buyse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.view.View;
import android.widget.*;
import android.os.Bundle;
import android.content.*;


public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText ed1,ed2;
    TextView signup_redirect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText)findViewById(R.id.editTextTextEmailAddress);
        ed2 = (EditText)findViewById(R.id.editTextTextPassword);
        signup_redirect = (TextView)findViewById(R.id.SignupRedirect);
        b1 = (Button)findViewById(R.id.button2);

//      Switching between intents does not work but login and signup functionality works

        signup_redirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (MainActivity.this, SignUp.class);
                startActivity(intent2);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUserAccount();
            }
        });
    }



    private void loginUserAccount()
    {
        // Take the value of two edit texts in Strings
        String email, password;
        email =ed1.getText().toString();
        password = ed2.getText().toString();

        // validations for input email and password
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(),
                    "Please enter email!!",
                    Toast.LENGTH_LONG)
                    .show();
            return;
        }

        else if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(),
                    "Please enter password!!",
                    Toast.LENGTH_LONG)
                    .show();
            return;
        }

        else{
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent (MainActivity.this, BuyseHome.class);
                    startActivity(intent);
                }
            });
        }


    }
}
