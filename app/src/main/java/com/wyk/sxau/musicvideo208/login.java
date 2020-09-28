package com.wyk.sxau.musicvideo208;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);

        final EditText usernameET=findViewById(R.id.ET1);
        final EditText pswET=findViewById(R.id.ET2);
        Button btn=findViewById(R.id.login_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUsername=usernameET.getText().toString();
                String strPsw=pswET.getText().toString();
                if(strUsername.length()==6 && strPsw.length()> 5) {
                    Intent intent1 = new Intent(login.this, personal.class);
                    startActivity(intent1);
                }else{
                    Toast.makeText(login.this,"请输入正确的账户密码",Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sp=getSharedPreferences("userInfo",MODE_PRIVATE);
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("username",strUsername);
                editor.putString("password",strPsw);
                editor.commit();
            }
        });
    }
}
