package com.example.medicdeminakhozicheva;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        EditText editTextTextEmailAddress = (EditText) findViewById(R.id.editTextTextEmailAddress);
        Button button = (Button) findViewById(R.id.button);
        button.setBackground(ContextCompat.getDrawable(MainActivity5.this, R.drawable.button_nr));
        button.setEnabled(false);

        editTextTextEmailAddress.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (editTextTextEmailAddress.getText().toString().contains("@") && editTextTextEmailAddress.getText().toString().contains(".")){
                    button.setBackground(ContextCompat.getDrawable(MainActivity5.this, R.drawable.button_r));
                    button.setEnabled(true);
                } else if (!editTextTextEmailAddress.getText().toString().contains("@.")){
                    button.setBackground(ContextCompat.getDrawable(MainActivity5.this, R.drawable.button_nr));
                    button.setEnabled(false);
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLogin();
            }

            public void toLogin() {
                Intent intent = new Intent(MainActivity5.this, MainActivity7.class);
                startActivity(intent);
                finish();
            }
        });
    }
}