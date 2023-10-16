package com.example.localwifipositioning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingScreen extends Activity {
    private Button learnButton;
    private Button locateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starting_screen);

        learnButton = findViewById(R.id.learn_button);
        locateButton = findViewById(R.id.locate_button);

        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartingScreen.this, Buildings.class);
                startActivity(intent);
            }
        });

        locateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartingScreen.this, Locate.class);
                startActivity(intent);
            }
        });
    }
}
