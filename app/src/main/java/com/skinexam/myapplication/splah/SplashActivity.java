package com.skinexam.myapplication.splah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.skinexam.myapplication.R;


public class SplashActivity extends Activity implements View.OnClickListener {

    //Button postProblem_btn ;
    TextView signIn_tv;
    Button btnRegist;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        // postProblem_btn = (Button) findViewById(R.id.post_problem_btn);
        signIn_tv = (TextView) findViewById(R.id.SignIn_tv);
        signIn_tv.setOnClickListener(this);
        btnRegist = (Button) findViewById(R.id.btnRegist);
        btnRegist.setOnClickListener(this);
    }
//        postProblem_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent post_intent = new Intent(com.skinexam.myapplication.splah.SplashActivity.this, PostProblemActivity_1.class);
//                startActivity(post_intent);
//            }
//        });

//        signIn_tv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent sign_intent = new Intent(com.skinexam.myapplication.splah.SplashActivity.this, com.skinexam.myapplication.splah.SignInActivity.class);
//                startActivity(sign_intent);
//            }
//        });
//    }
//
//    @Override
//    public void onClick(View v) {
//
//    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.SignIn_tv:
                Intent sign_intent = new Intent(com.skinexam.myapplication.splah.SplashActivity.this, com.skinexam.myapplication.splah.SignInActivity.class);
                startActivity(sign_intent);
                break;
            case R.id.btnRegist:
               Intent regist_intent = new Intent(com.skinexam.myapplication.splah.SplashActivity.this, com.skinexam.myapplication.splah.UserRegister.class);
               startActivity(regist_intent);
               break;
        }
    }
}
