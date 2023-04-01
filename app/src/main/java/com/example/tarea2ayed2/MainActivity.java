package com.example.tarea2ayed2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txt1;
    EditText txt2;
    TextView txtRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (EditText) findViewById(R.id.txtInput1);
        txt2 = (EditText) findViewById(R.id.txtInput2);
        txtRes = (TextView) findViewById(R.id.txtConcat);


    }
    public void accionBoton(View view){
        String concat;
        concat = txt1.getText().toString() + " "+ txt2.getText().toString();
        txtRes.setText(concat);
    }
}