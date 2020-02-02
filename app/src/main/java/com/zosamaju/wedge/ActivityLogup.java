package com.zosamaju.wedge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityLogup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logup);
    }

    public void goLogin(View view) {
        startActivity(new Intent(getApplicationContext(),ActivityLogin.class));
        overridePendingTransition(R.anim.anim_1,R.anim.anim_1_1);
    }

    public void goP1(View view) {
        startActivity(new Intent(getApplicationContext(),ActivityP1.class));
        overridePendingTransition(R.anim.anim_1,R.anim.anim_1_1);
    }

}
