package com.example.hp.proquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.proquiz);
        Button button = findViewById(R.id.startButton);

        Animation animFadeIn = AnimationUtils.loadAnimation(this, R.anim.anims);
        imageView.setVisibility(View.VISIBLE);
        imageView.startAnimation(animFadeIn);

        Animation buttonFadeIn = AnimationUtils.loadAnimation(this, R.anim.anims);
        button.setVisibility(View.VISIBLE);
        button.startAnimation(buttonFadeIn);

        if (getIntent().getBooleanExtra("EXIT",false)){
            finish();
        }
    }

    public void startQuiz(View view) {
        Intent Intent = new Intent(this, QuizActivity.class);
        startActivity(Intent);
    }

}