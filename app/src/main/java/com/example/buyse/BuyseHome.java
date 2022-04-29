package com.example.buyse;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.TextView;
        import android.widget.Toast;
        import android.content.*;

        import com.example.buyse.databinding.ActivityMainBinding;

public class BuyseHome extends AppCompatActivity {
    Button buy,sell;
    ImageButton profile;
    TextView buyse;

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);

        final String[] itemName={"Calculator", "Uniform","Calculator", "Uniform","Calculator", "Uniform","Calculator", "Uniform"};
        final int[] itemImage={R.drawable.logo2,R.drawable.logo1,R.drawable.logo2,R.drawable.logo1,R.drawable.logo2,R.drawable.logo1,R.drawable.logo2,R.drawable.logo1};


        GridAdapter gridAdapter=new GridAdapter(BuyseHome.this,itemName,itemImage );
        binding.gridView.setAdapter(gridAdapter);
        binding.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(BuyseHome.this,"You clicked on" +itemName[position], Toast.LENGTH_SHORT).show();
            }
        });
        buy = (Button)findViewById(R.id.buy);
        sell=(Button)findViewById(R.id.sell);
        profile=(ImageButton)findViewById(R.id.imageButton);

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (BuyseHome.this, BuyseHome.class);
                startActivity(intent);
            }
        });
        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (BuyseHome.this, SellProduct.class);
                startActivity(intent2);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent (BuyseHome.this, Profile.class);
                startActivity(intent3);
            }
        });
    }

}