package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText pass;
    private Button btn1,act;
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton();
    }
    public void addButton(){
        pass=(EditText)findViewById(R.id.editText);
        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.btn);
        act=(Button)findViewById(R.id.act_change);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setText("Done");
                btn1.setBackgroundColor(Color.RED);
                Toast.makeText(
                    MainActivity.this,pass.getText(),
                        Toast.LENGTH_SHORT

                ).show();
            }
        });
        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(".secondActivity");
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setBackgroundColor(Color.BLUE);
                btn2.setText("END");
                Toast.makeText(
                        MainActivity.this,"qwerty",
                        Toast.LENGTH_SHORT

                ).show();
            }
        });
    }
}
