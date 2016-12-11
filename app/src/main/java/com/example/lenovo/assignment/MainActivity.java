package com.example.lenovo.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.bn_signIn);
        b2 = (Button) findViewById(R.id.bn_signUp);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            if (v.getId()==R.id.bn_signIn)
            {
                Intent intent=new Intent(getApplicationContext(),Sign_in.class);
                startActivity(intent);
            }
        if (v.getId()==R.id.bn_signUp)
        {
            Intent intent=new Intent(getApplicationContext(),Register.class);
            startActivity(intent);
        }
    }
}