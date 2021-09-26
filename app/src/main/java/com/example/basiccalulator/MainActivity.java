package com.example.basiccalulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void add(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String int1 = myTextField.getText().toString();
        int num1 = Integer.parseInt(int1);

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String int2 = myTextField2.getText().toString();
        int num2 = Integer.parseInt(int2);

        int sum = num1 + num2;
        goToActitivity2(sum);
    }

    public void subtract(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String int1 = myTextField.getText().toString();
        int num1 = Integer.parseInt(int1);

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String int2 = myTextField2.getText().toString();
        int num2 = Integer.parseInt(int2);

        int diff = num1 - num2;
        goToActitivity2(diff);
    }

    public void multiply(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String int1 = myTextField.getText().toString();
        int num1 = Integer.parseInt(int1);

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String int2 = myTextField2.getText().toString();
        int num2 = Integer.parseInt(int2);

        int prod = num1 * num2;
        goToActitivity2(prod);
    }

    public void divide(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String int1 = myTextField.getText().toString();
        int num1 = Integer.parseInt(int1);

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String int2 = myTextField2.getText().toString();
        int num2 = Integer.parseInt(int2);

        int quot = num1 / num2;
        goToActitivity2(quot);
    }

    public void goToActitivity2(int value){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", value);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}