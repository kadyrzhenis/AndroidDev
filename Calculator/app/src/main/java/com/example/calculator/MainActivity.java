package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  int res;
    private TextView result;
    private EditText el1,el2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         el1=(EditText)findViewById(R.id.Num1);
         el2=(EditText)findViewById(R.id.Num2);
        result=findViewById(R.id.Oper);
        if(savedInstanceState!=null){
        res = savedInstanceState.getInt("apple");
        result.setText(String.valueOf(res));}
    }
    public void onButtonClick(View v){
        int num1= Integer.parseInt(el1.getText().toString());
        int num2= Integer.parseInt(el2.getText().toString());
         res=num1+num2;
        result.setText(Integer.toString(res));
    }
    public void twoClick(View v){
        int num1= Integer.parseInt(el1.getText().toString());
        int num2= Integer.parseInt(el2.getText().toString());
         res=num1*num2;
        result.setText(Integer.toString(res));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("apple",res);
    }

}
