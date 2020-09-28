package com.wyk.sxau.musicvideo208;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class music_main extends AppCompatActivity {
    private ImageView menuButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_main);

        menuButton=(ImageView)this.findViewById(R.id.main_menu_imgv);
        Button  btn1=(Button)findViewById(R.id.musicone_btn);
        Button  btn2=(Button)findViewById(R.id.musictwo_btn);
        Button  btn3=(Button)findViewById(R.id.musicthree_btn);
        Button  btn4=(Button)findViewById(R.id.musicfour_btn);
        Button  btn5=(Button)findViewById(R.id.musicfive_btn);
        Button  btn6=(Button)findViewById(R.id.musicsix_btn);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(music_main.this,main.class);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new  Intent(music_main.this,music_playerone.class);
                startActivity(intent1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new  Intent(music_main.this,music_playertwo.class);
                startActivity(intent2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new  Intent(music_main.this,music_playerthree.class);
                startActivity(intent3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new  Intent(music_main.this,music_playerfour.class);
                startActivity(intent4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new  Intent(music_main.this,music_playerfive.class);
                startActivity(intent5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new  Intent(music_main.this,music_playersix.class);
                startActivity(intent6);
            }
        });
    }
}
