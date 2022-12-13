package com.example.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText nameeditText, passedittext;
    private Button loginbutton;
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameeditText  = (EditText) findViewById(R.id.etnum);
        passedittext = (EditText) findViewById(R.id.etpass);
        loginbutton = (Button) findViewById(R.id.btn);
        textView = (TextView) findViewById(R.id.txv);


        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = nameeditText.getText().toString();
                String userpassword = passedittext.getText().toString();

                if (username.equals("Admin") && userpassword.equals("1234"));

                {
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }


            }
        });
    }
}