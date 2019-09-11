package com.russ.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//TODO add another class with static methods to handle game logic (represent 3x3 board with 2d array of booleans, etc.)

public class MainActivity extends AppCompatActivity {


    //TODO replace single button with array to hold all 9 grid buttons
    private Button button;

    //TODO add reset game button
    //TODO add TextView
    //TODO add variable (boolean or otherwise) to keep track of player turn

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO initialize array to hold all 9 grid buttons
        //TODO find all buttons using R.id and add them to array using for loop
        button = findViewById(R.id.button3);

        //TODO add an OnClickListener to all 9 grid buttons using for loop
        //TODO add code to update each grid button's text upon user's click, as appropriate (ie, assuming its X's turn, place an X)
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button.setText("x");
            }
        });

        //TODO find reset game button and TextView using findViewById
        //TODO add functionality so rest game button clears all 9 grid button's text
        //TODO add functionality so TextView display's whose turn it is

    }

}
