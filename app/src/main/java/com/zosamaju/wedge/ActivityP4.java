package com.zosamaju.wedge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityP4 extends AppCompatActivity {
    ImageButton bt_mapa,bt_noticias,bt_datos,bt_perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p4);


        bt_mapa=findViewById(R.id.bt_menu_bottom_mapa);
        bt_noticias=findViewById(R.id.bt_menu_bottom_noticias);
        bt_datos=findViewById(R.id.bt_menu_bottom_datos);
        bt_perfil=findViewById(R.id.bt_menu_bottom_perfil);

        bt_perfil.setImageResource(R.drawable.ic_perfil_select);
        bt_perfil.setBackgroundResource(R.color.c5);

        bt_mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ActivityP1.class));
                overridePendingTransition(R.anim.anim_1,R.anim.anim_1_1);
            }
        });
        bt_noticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ActivityP2.class));
                overridePendingTransition(R.anim.anim_1,R.anim.anim_1_1);
            }
        });
        bt_datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ActivityP3.class));
                overridePendingTransition(R.anim.anim_1,R.anim.anim_1_1);
            }
        });
    }
}
