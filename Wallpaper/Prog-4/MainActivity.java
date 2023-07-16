package com.example.changingwallpaperapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.Button;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import android.os.Bundle;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
public class MainActivity extends AppCompatActivity {
    Button myButton;
    Timer myTimer;
    Drawable myDRAWABLE;
    WallpaperManager myWpmgr;
    int prev = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTimer = new Timer();
        myButton = findViewById(R.id.button);
        myWpmgr = WallpaperManager.getInstance(this);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWallpaper();
            }
        });
    }

    private void setWallpaper() {
        myTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (prev == 1) {
                    myDRAWABLE = getResources().getDrawable(R.drawable.one);
                    prev = 2;
                } else if (prev == 2) {
                    myDRAWABLE = getResources().getDrawable(R.drawable.two);
                    prev = 3;
                } else if (prev == 3) {
                    myDRAWABLE = getResources().getDrawable(R.drawable.three);
                    prev = 4;
                } else if (prev == 4) {
                    myDRAWABLE = getResources().getDrawable(R.drawable.four);
                    prev = 5;
                } else if (prev == 5) {
                    myDRAWABLE = getResources().getDrawable(R.drawable.five);
                    prev = 1;
                }
                Bitmap wallpaper = ((BitmapDrawable) myDRAWABLE).getBitmap();

                try {
                    myWpmgr.setBitmap(wallpaper);
                } catch (IOException e) {
                    e.getStackTrace();
                }
            }


        },0,5000);
    }

}