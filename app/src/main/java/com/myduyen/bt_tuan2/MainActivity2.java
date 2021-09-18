package com.myduyen.bt_tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView imgTaylor, imgNhac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imgTaylor = findViewById(R.id.imageView11);
        imgNhac = findViewById(R.id.imageView12);

        Animation xoayTaylor = AnimationUtils.loadAnimation(this,R.anim.anim_quaydia);
        Animation lacnhac = AnimationUtils.loadAnimation(this,R.anim.anim_laccaichuong);

        imgTaylor.startAnimation(xoayTaylor);
        imgNhac.startAnimation(lacnhac);
    }
}