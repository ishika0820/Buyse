package com.example.buyse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class Profile extends AppCompatActivity {
    Button buy,sell,buyse;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        buyse = (Button)findViewById(R.id.buyse);
        buy = (Button)findViewById(R.id.buy);
        sell=(Button)findViewById(R.id.sell);

        buyse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Profile.this, BuyseHome.class);
                startActivity(intent);
            }
        });
        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (Profile.this, SellProduct.class);
                startActivity(intent2);
            }
        });

        buyse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Profile.this, BuyseHome.class);
                startActivity(intent);
            }
        });


    }
}
