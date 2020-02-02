package com.zosamaju.wedge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class ActivityInicio extends AppCompatActivity {
    TextView tv1,tv2;
    Button bnt1, bnt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        tv1 = findViewById(R.id.tv_inicio_nombre);
        tv2 = findViewById(R.id.tv_inicio);
        bnt1 = findViewById(R.id.bt_inicio_email);
        bnt2 = findViewById(R.id.bt_inicio_google);


        Animation a_1 = AnimationUtils.loadAnimation(this, R.anim.anim_1);
        Animation a_2 = AnimationUtils.loadAnimation(this,R.anim.anim_2);
        Animation a_3 = AnimationUtils.loadAnimation(this,R.anim.anim_3);

        tv1.startAnimation(a_1);
        tv2.startAnimation(a_2);
        bnt1.startAnimation(a_3);
        bnt2.startAnimation(a_3);
    }

    public void goLogin(View view) {
        startActivity(new Intent(getApplicationContext(),ActivityLogin.class));
        overridePendingTransition(R.anim.anim_1,R.anim.anim_1_1);
    }

    public void goGoogle(View view) {
        //TODO:
    }
}
