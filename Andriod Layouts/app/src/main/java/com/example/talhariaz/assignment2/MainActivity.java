package com.example.talhariaz.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onrClick(View v){
        Intent R_singup = new Intent(this,Rsignup.class);
        startActivity(R_singup);
    }
    public void oncClick(View v){
        Intent C_singup = new Intent(this,Csignup.class);
        startActivity(C_singup);
    }
}
