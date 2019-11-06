package com.example.slideupdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button slideUPButton;
    private Button slideDownButton;
    private Button fadeInButton;
    private Button fadeOutButton;
    private ImageView imgWeChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slideUPButton = (Button) findViewById(R.id.btnSlideUp);
        slideDownButton = (Button) findViewById(R.id.btnSlideDown);
        fadeInButton = (Button) findViewById(R.id.btnFadeIn);
        fadeOutButton = (Button) findViewById(R.id.btnFadeOut);
        imgWeChat = (ImageView) findViewById(R.id.imgWeChat);
    }

    public void makeImageSlideUp(View view){
        Animation animUp = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        imgWeChat.startAnimation(animUp);
    }

    public void makeImageSlideDown(View view){
        Animation animDown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        imgWeChat.startAnimation(animDown);
    }

    public void makeImageFadeIn(View view){
        Animation animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        imgWeChat.startAnimation(animFadeIn);
    }

    public void makeImageFadeOut(View view){
        Animation animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        imgWeChat.startAnimation(animFadeOut);
    }

    public void makeImageZoomIn(View view){
        Animation animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        imgWeChat.startAnimation(animZoomIn);
    }

    public void makeImageZoomOut(View view){
        Animation animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
        imgWeChat.startAnimation(animZoomOut);
    }
}
