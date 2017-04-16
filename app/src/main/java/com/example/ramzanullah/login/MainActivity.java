package com.example.ramzanullah.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.logIn);
        b2 = (Button) findViewById(R.id.Reg);
    }


    public void btn_Login(View v){
        Intent i = new Intent(this,Login.class);
        startActivity(i);
    }

    public void btn_Reg(View v){
        Intent i = new Intent(this,Register.class);
        startActivity(i);
    }


}
