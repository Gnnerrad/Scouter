package com.example.darre_000.scoutr;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Top Bar Stuff
        View topBar = findViewById(R.id.topBarLayout);

//Camera Button
        ImageButton cameraButton = (ImageButton) findViewById(R.id.cameraButton);
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

//Search Bar
        SearchView searchView = (SearchView) findViewById(R.id.searchView);

//End Top Bar Stuff



//Bottom Bar Stuff

//LeftButton
        ImageButton favourites = (ImageButton) findViewById(R.id.favourites);
        favourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "I couldn't remember what this button was ment to be so I called it favourites", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

//Middle button
        Button scoutrButton = (Button) findViewById(R.id.scoutr_social_network);
        scoutrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "I couldn't remember what this button was ment to be so I called it scoutrButton", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

//Menu button
        ImageButton menu = (ImageButton) findViewById(R.id.bottomMenuButton);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "A menu or somthing....", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
