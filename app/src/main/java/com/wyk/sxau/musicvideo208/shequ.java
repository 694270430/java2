package com.wyk.sxau.musicvideo208;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class shequ extends AppCompatActivity{
    private ImageButton zan_btn1;
    private ImageButton zan_btn2;
    private TextView addOne;// +1
    private android.view.animation.Animation animation;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_shequ);

        Button btn131=(Button)findViewById(R.id.home);
        btn131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent131=new Intent(shequ.this,main.class);
                startActivity(intent131);
            }
        });
        Button btn13=(Button)findViewById(R.id.aduio);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13=new Intent(shequ.this,music_main.class);
                startActivity(intent13);
            }
        });


        Button btn22=(Button)findViewById(R.id.personal);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent22=new Intent(shequ.this,personal.class);
                startActivity(intent22);
            }
        });


        //  初始化 动画
        animation = AnimationUtils.loadAnimation(this, R.anim.add_score_anim);
        zan_btn1 = (ImageButton) findViewById(R.id.dianzan12);
        zan_btn2 = (ImageButton) findViewById(R.id.dianzan21);
        addOne = (TextView) findViewById(R.id.addOne_tv1);
        addOne = (TextView) findViewById(R.id.addOne_tv2);
        //  按钮点击 触发动画
        zan_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOne.setVisibility(View.VISIBLE);
                addOne.startAnimation(animation);
                new Handler().postDelayed(new Runnable() {      //延迟显示
                    public void run() {
                        addOne.setVisibility(View.GONE);
                    }
                }, 1000);
            }
        });
        zan_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOne.setVisibility(View.VISIBLE);
                addOne.startAnimation(animation);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        addOne.setVisibility(View.GONE);
                    }
                }, 1000);
            }
        });




    }
}
