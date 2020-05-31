package com.uygaryasar.storingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }
    public void goExercise(View view){

        Intent intent = new Intent(Main1Activity.this,Main2Activity.class);
        startActivity(intent);
    }

    public void goDiet(View view){

        Intent intent = new Intent(Main1Activity.this,Main1Activity.class);
        startActivity(intent);
    }
}
