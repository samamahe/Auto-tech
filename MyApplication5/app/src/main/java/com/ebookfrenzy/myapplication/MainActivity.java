package com.ebookfrenzy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edit1,edit2;
    Button b1,b2;
    String Username,Passcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1= findViewById(R.id.editText);
        edit2= findViewById(R.id.editText2);
        b1= findViewById(R.id.button);
        b2=findViewById(R.id.button3);
       // Username=getIntent().getExtras().getString("key1");
       // Passcode=getIntent().getExtras().getString("key2");
        edit1.setText(Username);
        edit2.setText(Passcode);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Username = edit1.getText().toString();
                Passcode = edit2.getText().toString();

                Intent i1 = new Intent(MainActivity.this, Main2Activity.class);
                i1.putExtra("key3", "Username");
                i1.putExtra("key4", "Passcode");
                startActivity(i1);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Username = edit1.getText().toString();
                Passcode = edit2.getText().toString();

                Intent i1 = new Intent(MainActivity.this, Main3Activity.class);
                i1.putExtra("key3", "Username");
                i1.putExtra("key4", "Passcode");
                startActivity(i1);

            }
        });

    }
}
