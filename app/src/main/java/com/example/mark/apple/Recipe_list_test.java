package com.example.mark.apple;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class Recipe_list_test extends AppCompatActivity{
    private ImageButton Btn1;
    private ImageButton Btn2;
    private ImageButton Btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list_test);

        Btn1 = (ImageButton) findViewById(R.id.Btn1);
        // Register the onClick listener with the implementation above
        Btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(), DonkeyActivity.class));
            }
        });

        Btn2 = (ImageButton) findViewById(R.id.Btn2);
        Btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(), GoatActivity.class));
            }
        });

        Btn3 = (ImageButton) findViewById(R.id.Btn3);
        Btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(), SlothActivity.class));
            }
        });


    }

}

