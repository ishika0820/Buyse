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


import java.util.UUID;

public class SellProduct extends AppCompatActivity {
    EditText ed_itemname,ed_price,ed_desc,ed_meetplace,ed_phoneno;
    Button importimage,submit;
    Button buy,sell;
    TextView buyse;
    public ImageView ProfilePic;
    public Uri imageUri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_product);

        ed_itemname = (EditText) findViewById(R.id.editTextItemName);
        ed_price = (EditText) findViewById(R.id.editTextPrice);
        ed_desc = (EditText) findViewById(R.id.editTextDescription);
        ed_meetplace = (EditText) findViewById(R.id.editTextMeetPlace);
        ed_phoneno = (EditText) findViewById(R.id.editTextPhone);
        importimage = (Button) findViewById(R.id.ImportButton);
        submit = (Button) findViewById(R.id.SubmitButton);

        buy = (Button)findViewById(R.id.buy);
        sell=(Button)findViewById(R.id.sell);

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (SellProduct.this, BuyseHome.class);
                startActivity(intent);
            }
        });
        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (SellProduct.this, SellProduct.class);
                startActivity(intent2);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (SellProduct.this, SellProduct.class);
                startActivity(intent);
            }
        });


    }
}
