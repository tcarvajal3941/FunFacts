package com.example.tcarvajal3941.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    //Declare our View Variables
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign the Views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = factBook.getFact();


                //Update screen with new Fact
                factTextView.setText(fact);
                int color = colorWheel.getColor();

                relativeLayout.setBackgroundColor(color);

                showFactButton.setTextColor(color);

            }
        };

        showFactButton.setOnClickListener(listener);

        // Toast.makeText(this, "Yay! Pepperoni!", Toast.LENGTH_SHORT).show();

        Log.d(TAG, "Yrrt Skrrt");


    }


}
