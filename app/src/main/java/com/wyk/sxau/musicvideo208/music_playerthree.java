package com.wyk.sxau.musicvideo208;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

public class music_playerthree extends AppCompatActivity {
    private MediaPlayer mediaPlayer;//MediaPlayer对象
    private  boolean isPause=false;//暂停
    private ImageView preButton;
    private  ImageView playButton;
    private ImageView nextButton;
    private ImageView downButton;
    private SeekBar seekBar;
    private Thread thread;//线程
    private boolean isStop;//线程标志位

    //运用Handler中的handleMessage方法接收子线程传递的信息
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            // 将SeekBar位置设置到当前播放位置
            seekBar.setProgress(msg.what);

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_musicthree);

        mediaPlayer=new MediaPlayer();//实例化对象
        //重新播放,当播放完成时重新开始音乐播放
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                play();
            }
        });


///绑定监听事件的id
        bindID();

//监听滚动条事件
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //参数 ： fromUser即b 是用来标识是否来自用户的手动操作  true 用户动过手动方式更改的进度条
                if (b){

                    //seekto方法是异步方法
                    //seekto方法的参数是毫秒，而不是秒
                    mediaPlayer.seekTo(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        //对播放按钮进行事件监听
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
                if(isPause){
                    isPause=false;
                }
                preButton.setEnabled(true);
                nextButton.setEnabled(true);
                playButton.setEnabled(true);
            }
        });
        preButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent intent1=new Intent(music_playerthree.this,music_playersix.class);
                startActivity(intent1);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent intent2=new Intent(music_playerthree.this,music_playertwo.class);
                startActivity(intent2);
            }
        });

        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(music_playerthree.this,music_main.class);
                startActivity(intent3);
            }
        });
    }

    //绑定id的类
    private void bindID() {
        seekBar = findViewById(R.id.music_seekbar);
        preButton=(ImageView)this.findViewById(R.id.music_prev_img);
        playButton=(ImageView)this.findViewById(R.id.music_pause_img);
        nextButton=(ImageView)this.findViewById(R.id.music_next_img);
        downButton=(ImageView)this.findViewById(R.id.music_down_imgv);
    }
    private void play() {
        isStop = false;

        //重置，当切换音乐时不会放前一首歌的歌曲
        mediaPlayer.reset();

        mediaPlayer = MediaPlayer.create(this, R.raw.secret);

        // 启动
        mediaPlayer.start();

        // 设置seekbar的最大值
        seekBar.setMax(mediaPlayer.getDuration());
        // 创建一个线程
        thread = new Thread(new music_playerthree.MuiscThread());
        // 启动线程
        thread.start();


    }

    //点击事件


    //销毁时所做的工作
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.reset();
    }


    //建立一个子线程实现Runnable接口
    class MuiscThread implements Runnable {

        @Override
        //实现run方法
        public void run() {
            //判断音乐的状态，在不停止与不暂停的情况下向总线程发出信息
            while (mediaPlayer != null && isStop == false) {

                try {
                    // 每100毫秒更新一次位置
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //发出的信息
                handler.sendEmptyMessage(mediaPlayer.getCurrentPosition());
            }

        }

    }

    public void seekPlayPositiom(int positon){
        mediaPlayer.seekTo(positon);
    }
}
