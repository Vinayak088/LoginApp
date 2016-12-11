package com.example.lenovo.assignment;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Sign_in extends AppCompatActivity {
     Button b1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final AlertDialog.Builder builder=new AlertDialog.Builder(this);
        setContentView(R.layout.activity_sign_in);
        b1=(Button)findViewById(R.id.b1);
        e1=(EditText)findViewById(R.id.e1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=e1.getText().toString();
                Double b=Double.parseDouble(a);
                if(b==77952850)
                {
                    Intent intent =new Intent(getApplicationContext(),Register.class);
                    startActivity(intent);
                }
                else {
                    AlertDialog alertDialog = builder.create();
                    alertDialog.setTitle("Sign in Failed This number is not Registered");
                    alertDialog.show();
                }
            }
        });


    }
}
