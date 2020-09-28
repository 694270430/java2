package com.wyk.sxau.musicvideo208;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class man extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_man);
        Button btn15=(Button)findViewById(R.id.recommod);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent15=new Intent(man.this,music_playerfour.class);
                startActivity(intent15);
            }
        });
        Button btn222=(Button)findViewById(R.id.qita);
        btn222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent222=new Intent(man.this,shequ.class);
                startActivity(intent222);
            }
        });
        Button btn=(Button)findViewById(R.id.home);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(man.this,main.class);
                startActivity(intent);
            }
        });


        Button btn2=(Button)findViewById(R.id.teleplay);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(man.this,ju.class);
                startActivity(intent2);
            }
        });
        Button btn4=(Button)findViewById(R.id.movie);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(man.this,ying.class);
                startActivity(intent4);
            }
        });
        Button btn8=(Button)findViewById(R.id.veriety_show);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(man.this,zong.class);
                startActivity(intent8);
            }
        });
        Button btn10=(Button)findViewById(R.id.sports);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10=new Intent(man.this,ti.class);
                startActivity(intent10);
            }
        });
        Button btn12=(Button)findViewById(R.id.mv);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12=new Intent(man.this,mv.class);
                startActivity(intent12);
            }
        });
        Button btn13=(Button)findViewById(R.id.aduio);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13=new Intent(man.this,music_main.class);
                startActivity(intent13);
            }
        });

        ImageButton btn208=(ImageButton)findViewById(R.id.one);
        btn208.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent208=new Intent(man.this,man_main.class);
                startActivity(intent208);
            }
        });
        Button btn22=(Button)findViewById(R.id.personal);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent22=new Intent(man.this,personal.class);
                startActivity(intent22);
            }
        });
    }
}
