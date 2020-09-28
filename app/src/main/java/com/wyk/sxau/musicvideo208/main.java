package com.wyk.sxau.musicvideo208;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class main extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn222=(Button)findViewById(R.id.qita);
        btn222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent222=new Intent(main.this,shequ.class);
                startActivity(intent222);
            }
        });

        ImageButton btn14=(ImageButton)findViewById(R.id.zero);
        Button btn15=(Button)findViewById(R.id.recommod);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent15=new Intent(main.this,music_playerfour.class);
                startActivity(intent15);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent14=new Intent(main.this,music_playerfour.class);
                startActivity(intent14);
            }
        });
        ImageButton btn1=(ImageButton)findViewById(R.id.one);
        Button btn2=(Button)findViewById(R.id.teleplay);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(main.this,ju.class);
                startActivity(intent1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(main.this,ju.class);
                startActivity(intent2);
            }
        });

        ImageButton btn3=(ImageButton)findViewById(R.id.two);
        Button btn4=(Button)findViewById(R.id.movie);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(main.this,ying.class);
                startActivity(intent3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(main.this,ying.class);
                startActivity(intent4);
            }
        });

        ImageButton btn5=(ImageButton)findViewById(R.id.three);
        Button btn6=(Button)findViewById(R.id.anime);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(main.this,man.class);
                startActivity(intent5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(main.this,man.class);
                startActivity(intent6);
            }
        });

        ImageButton btn7=(ImageButton)findViewById(R.id.four);
        Button btn8=(Button)findViewById(R.id.veriety_show);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(main.this,zong.class);
                startActivity(intent7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(main.this,zong.class);
                startActivity(intent8);
            }
        });

        ImageButton btn9=(ImageButton)findViewById(R.id.five);
        Button btn10=(Button)findViewById(R.id.sports);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9=new Intent(main.this,ti.class);
                startActivity(intent9);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10=new Intent(main.this,ti.class);
                startActivity(intent10);
            }
        });

        ImageButton btn11=(ImageButton)findViewById(R.id.six);
        Button btn12=(Button)findViewById(R.id.mv);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11=new Intent(main.this,mv.class);
                startActivity(intent11);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12=new Intent(main.this,mv.class);
                startActivity(intent12);
            }
        });

        Button btn13=(Button)findViewById(R.id.aduio);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13=new Intent(main.this,music_main.class);
                startActivity(intent13);
            }
        });


        Button btn22=(Button)findViewById(R.id.personal);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent22=new Intent(main.this,personal.class);
                startActivity(intent22);
            }
        });
    }

}
