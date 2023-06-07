package com.example.medicdeminakhozicheva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {
    private TextView skip;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    ImageView i1;
    ImageView i2;
    ImageView i3;
    ImageView i4;
    ImageView i5;
    String kod="";
    public void chColor(Button but){
        but.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_UP)
                {but.setBackgroundColor(getResources().getColor(R.color.gray));}
                else if (event.getAction()==MotionEvent.ACTION_DOWN){
                    but.setBackgroundColor(getResources().getColor(R.color.blue));
                }
                return false;
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        b1=findViewById(R.id.button9);
        b2=findViewById(R.id.button10);
        b3=findViewById(R.id.button11);
        b4=findViewById(R.id.button12);
        b5=findViewById(R.id.button13);
        b6=findViewById(R.id.button14);
        b7=findViewById(R.id.button15);
        b8=findViewById(R.id.button16);
        b9=findViewById(R.id.button17);
        b0=findViewById(R.id.button18);
        i5=findViewById(R.id.imageView16);
        chColor(b2);
        chColor(b3);
        chColor(b4);
        chColor(b5);
        chColor(b6);
        chColor(b7);
        chColor(b8);
        chColor(b9);
        chColor(b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"1";
                    i1=findViewById(R.id.imageView);
                    i1.setImageResource(R.drawable.el);
                }
                else if(kod.length()==1){
                    kod=kod+"1";
                    i2=findViewById(R.id.imageView3);
                    i2.setImageResource(R.drawable.el);
                }
                else if(kod.length()==2){
                    kod=kod+"1";
                    i3=findViewById(R.id.imageView5);
                    i3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"1";
                    i4=findViewById(R.id.imageView6);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"2";
                    i1=findViewById(R.id.imageView);
                    i1.setImageResource(R.drawable.el);
                }
                else if(kod.length()==1){
                    kod=kod+"2";
                    i2=findViewById(R.id.imageView3);
                    i2.setImageResource(R.drawable.el);
                }
                else if(kod.length()==2){
                    kod=kod+"2";
                    i3=findViewById(R.id.imageView5);
                    i3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"2";
                    i4=findViewById(R.id.imageView6);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"3";
                    i1=findViewById(R.id.imageView);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"3";
                    i2=findViewById(R.id.imageView3);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"3";
                    i3=findViewById(R.id.imageView5);
                    i3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"3";
                    i4=findViewById(R.id.imageView6);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"4";
                    i1=findViewById(R.id.imageView);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"4";
                    i2=findViewById(R.id.imageView3);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"4";
                    i3=findViewById(R.id.imageView5);
                    i3.setImageResource(R.drawable.el);
                }
                else if (kod.length()==3){
                    kod=kod+"4";
                    i4=findViewById(R.id.imageView6);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"5";
                    i1=findViewById(R.id.imageView);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"5";
                    i2=findViewById(R.id.imageView3);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"5";
                    i3=findViewById(R.id.imageView5);
                    i3.setImageResource(R.drawable.el);
                }
                else if (kod.length()==3){
                    kod=kod+"5";
                    i4=findViewById(R.id.imageView6);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"6";
                    i1=findViewById(R.id.imageView);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"6";
                    i2=findViewById(R.id.imageView3);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"6";
                    i3=findViewById(R.id.imageView5);
                    i3.setImageResource(R.drawable.el);
                }
                else if (kod.length()==3){
                    kod=kod+"6";
                    i4=findViewById(R.id.imageView6);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"7";
                    i1=findViewById(R.id.imageView);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"7";
                    i2=findViewById(R.id.imageView3);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"7";
                    i3=findViewById(R.id.imageView5);
                    i3.setImageResource(R.drawable.el);
                }
                else if (kod.length()==3){
                    kod=kod+"7";
                    i4=findViewById(R.id.imageView6);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"8";
                    i1=findViewById(R.id.imageView);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"8";
                    i2=findViewById(R.id.imageView3);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"8";
                    i3=findViewById(R.id.imageView5);
                    i3.setImageResource(R.drawable.el);
                }
                else if (kod.length()==3){
                    kod=kod+"8";
                    i4=findViewById(R.id.imageView6);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"9";
                    i1=findViewById(R.id.imageView);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"9";
                    i2=findViewById(R.id.imageView3);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"9";
                    i3=findViewById(R.id.imageView5);
                    i3.setImageResource(R.drawable.el);
                }
                else if (kod.length()==3){
                    kod=kod+"9";
                    i4=findViewById(R.id.imageView6);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        chColor(b0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"0";
                    i1=findViewById(R.id.imageView);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"0";
                    i2=findViewById(R.id.imageView3);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"0";
                    i3=findViewById(R.id.imageView5);
                    i3.setImageResource(R.drawable.el);
                }
                else if (kod.length()==3){
                    kod=kod+"0";
                    i4=findViewById(R.id.imageView6);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                }
                else if (kod.length()==1){
                    kod="";
                    i2=findViewById(R.id.imageView);
                    i2.setImageResource(R.drawable.oval);
                }
                else if (kod.length()==2){
                    kod=kod.substring(0, kod.length()-1);
                    i3=findViewById(R.id.imageView3);
                    i3.setImageResource(R.drawable.oval);
                }
                else if (kod.length()==3){
                    kod=kod.substring(0, kod.length()-1);
                    i4=findViewById(R.id.imageView5);
                    i4.setImageResource(R.drawable.oval);
                }
                else if (kod.length()==4){
                    kod=kod.substring(0, kod.length()-1);
                    i4=findViewById(R.id.imageView6);
                    i4.setImageResource(R.drawable.oval);
                }
            }
        });
        skip = findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLogin();
            }

            public void toLogin() {
                Intent intent = new Intent(MainActivity8.this, MainActivity9.class);
                startActivity(intent);
                finish();
            }
        });


        GridLayout gridLayout = new GridLayout(this);


    }
}