package com.example.tcarvajal3941.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by tcarvajal3941 on 5/10/2018.
 */

public class ColorWheel {
    // Fields or Member Variables - Properties about the Object
    // Methods - Actions the object can take

    private String[] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getColor() {
        //Clicked Button, Create new Color
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        int color = Color.parseColor(colors[randomNumber]);
        return color;
    }
}