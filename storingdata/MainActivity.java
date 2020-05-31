package com.uygaryasar.storingdata;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText2;
    EditText editText3;
    TextView textView;
    TextView textView3;
    TextView textView4;
    TextView textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        textView = findViewById(R.id.textView);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView6 = findViewById(R.id.textView6);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("userInput");
        textView6.setText("Merhaba " +userName);

    }


    public void save(View view){
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Save");
            alert.setMessage("Are you sure?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Saved", Toast.LENGTH_LONG).show();
                int burnedCalories = Integer.parseInt(editText2.getText().toString());
                int takenCalories = Integer.parseInt(editText3.getText().toString());
                textView.setText(String.format("Burned calories: %d", burnedCalories));
                textView3.setText(String.format("Taken calories: %d", takenCalories));
                int calories = takenCalories - burnedCalories;
                textView4.setText(String.format("Calorie difference: %d", calories));

            }
        }); alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Not saved", Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
        }

    public void delete (View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Save");
        alert.setMessage("Are you sure?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this ,"Deleted" , Toast.LENGTH_LONG).show();
                textView.setText("Burned Calories: ");
                textView3.setText("Taken Calories: ");
                textView4.setText("Kcal difference: ");

            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this ,"Not Deleted" , Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
    }
}
