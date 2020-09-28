package com.wyk.sxau.musicvideo208;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class personal extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        Button btn222=(Button)findViewById(R.id.qita);
        btn222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent222=new Intent(personal.this,shequ.class);
                startActivity(intent222);
            }
        });
        Button btn13=(Button)findViewById(R.id.aduio);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13=new Intent(personal.this,music_main.class);
                startActivity(intent13);
            }
        });
        Button btn=(Button)findViewById(R.id.home);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(personal.this,main.class);
                startActivity(intent);
            }
        });

    }
}
