package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button OK1;
    EditText num1;
    EditText num2;
    String st;

    private Bundle saveInstanceState;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        OK1 = findViewById(R.id.OK1);
        OK1.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View view) {
                                       Intent intent_one = new Intent(FirstActivity.this,SecondActivity.class);
                                       startActivity(intent_one);
                                   }
                               });

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_first);

        OK1 = findViewById(R.id.OK1);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        OK1.setOnClickListener(new View.OnClickListener() {
            private void onClick() {
                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                st = num1.getText().toString();
                i.putExtra("Value", st);
                startActivity(i);
                finish();
            }

            public void onClick(View v) {
                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                st = num2.getText().toString();
                i.putExtra("Value", st);
                startActivity(i);
                finish();
            }

        }
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"Sending Message",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
        toast.show();
    }

    private void onCreate() {
        onCreate();
    }





}
