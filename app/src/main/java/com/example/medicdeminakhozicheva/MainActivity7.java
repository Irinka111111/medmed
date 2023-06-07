package com.example.medicdeminakhozicheva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
    private TextView resend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        TextView timer = (TextView) findViewById(R.id.timer);
        TextView btn = findViewById(R.id.resend);
        timer.setVisibility(View.VISIBLE);
        btn.setVisibility(View.GONE);
        timer();
        EditText number1 = (EditText) findViewById(R.id.editTextTextEmailAddress7);
        EditText number2 = (EditText) findViewById(R.id.editTextTextEmailAddress6);
        EditText number3 = (EditText) findViewById(R.id.editTextTextEmailAddress5);
        EditText number4 = (EditText) findViewById(R.id.editTextTextEmailAddress4);
        String test = "1234";
        final String[] s1 = {"", "", "", ""};

        number1.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String s = number1.getText().toString();
                if (s.length() == 1) {
                    number2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        number2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String s = number2.getText().toString();
                if (s.length() == 0) {
                    number1.requestFocus();
                }
                if (s.length() == 1) {
                    number3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        number3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String s = number3.getText().toString();
                if (s.length() == 0) {
                    number2.requestFocus();
                }
                if (s.length() == 1) {
                    number4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        number4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if (s.length() == 1) {
                    s1[3] = number4.getText().toString();
                    String s_all = s1[0] +s1[1] + s1[2] + s1[3];
                    Log.i("string", (String) s_all);
                    if (s_all.equals(test)){
                        Intent intent = new Intent(MainActivity7.this, MainActivity8.class);
                        startActivity(intent);
                    }
                    else if (!s_all.equals(test)){
                        Intent intent = new Intent(MainActivity7.this, MainActivity8.class);
                        startActivity(intent);
                    }
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        resend = findViewById(R.id.resend);
        resend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLogin();
            }

            public void toLogin() {
                Intent intent = new Intent(MainActivity7.this, MainActivity8.class);
                startActivity(intent);
                finish();
            }
        });
    }


    public void timer (){
        TextView timer = (TextView) findViewById(R.id.timer);
        TextView btn = findViewById(R.id.resend);
        CountDownTimer time = new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText("Отправить код повторно можно\nбудет через " + millisUntilFinished/1000 + " секунд");
            }

            @Override
            public void onFinish() {
                timer.setVisibility(View.GONE);
                btn.setVisibility(View.VISIBLE);
            }
        }.start();
    }
}