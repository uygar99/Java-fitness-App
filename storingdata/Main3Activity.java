package com.uygaryasar.storingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText editText5;
    String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        userName = "";
        editText5 = findViewById(R.id.editText5);
    }
    public void goExercise(View view){
        userName = editText5.getText().toString();
        Toast.makeText(Main3Activity.this ,"Exercises is opening" , Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Main3Activity.this,Main2Activity.class);
        intent.putExtra("userInput" , userName);
        startActivity(intent);
    }

    public void goDiet(View view){
        userName = editText5.getText().toString();
        Toast.makeText(Main3Activity.this ,"Diet is opening" , Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Main3Activity.this,MainActivity.class);
        intent.putExtra("userInput" , userName);

        startActivity(intent);
    }
}
