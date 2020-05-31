package com.uygaryasar.storingdata;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView5;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2=findViewById(R.id.textView2);
        textView5=findViewById(R.id.textView5);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("userInput");
        textView5.setText("Merhaba " +userName);
    }
}
