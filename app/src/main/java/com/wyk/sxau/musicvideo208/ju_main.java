package com.wyk.sxau.musicvideo208;


import android.content.Context;
import android.content.Intent;

import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;

import android.view.Surface;
import android.view.View;

import android.view.WindowManager;
import android.widget.Button;

import android.widget.MediaController;
import android.widget.RelativeLayout;

import android.widget.Toast;
import android.widget.VideoView;

public class ju_main extends AppCompatActivity {
    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_videoone);

        video=(VideoView)findViewById(R.id.video);

        String uri = "android.resource://" + getPackageName() + "/" + R.raw.ju;
        video.setVideoURI(Uri.parse(uri));
        MediaController mc=new MediaController(ju_main.this);
        video.setMediaController(mc);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT, RelativeLayout.LayoutParams.FILL_PARENT);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        video.setLayoutParams(layoutParams);


        video.requestFocus();
        video.start();

        //为VideoView添加完成事件监听
        video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(ju_main.this,"视频播放完毕",Toast.LENGTH_SHORT).show();
            }
        });
        video.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(ju_main.this,"视频播放错误",Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        Button btn22=(Button)findViewById(R.id.back);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent22=new Intent(ju_main.this,ju.class);
                startActivity(intent22);
            }
        });


    }


    public class MyVideoView extends VideoView {
        private int mVideoWidth;
        private int mVideoHeight;

        public MyVideoView(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
        }

        public MyVideoView(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public MyVideoView(Context context) {
            super(context);
        }

        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            // TODO Auto-generated method stub

            int width = getDefaultSize(mVideoWidth, widthMeasureSpec);
            int height = getDefaultSize(mVideoHeight, heightMeasureSpec);
            setMeasuredDimension(width, height);
        }
    }

//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//        int rot = getWindowManager().getDefaultDisplay().getRotation();
//
//        if(rot == Surface.ROTATION_90 || rot == Surface.ROTATION_270){
//            mVideoViewLayoutParams = mVideoLayout.getLayoutParams();
//            RelativeLayout.LayoutParams layoutParams =
//                    new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
//            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
//            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
//            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
//            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
//            mVideoLayout.setLayoutParams(layoutParams);
//            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
//        }else if(rot == Surface.ROTATION_0){
////            RelativeLayout.LayoutParams lp = new  RelativeLayout.LayoutParams(320,240);
////            lp.addRule(RelativeLayout.CENTER_IN_PARENT);
//            mVideoLayout.setLayoutParams(mVideoViewLayoutParams);
//        }
//    }


}
