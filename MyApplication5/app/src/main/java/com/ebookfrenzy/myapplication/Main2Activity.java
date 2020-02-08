package com.ebookfrenzy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5;
    String  Username,Mailid,password,ContactNumber,Address;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1=findViewById(R.id.editText3);
        e2=findViewById(R.id.editText4);
        e3=findViewById(R.id.editText8);
        e4=findViewById(R.id.editText7);
        e5=findViewById(R.id.editText6);
        b1=findViewById(R.id.button2);
        e1.setText(Username);
        e2.setText(Mailid);
        e3.setText(password);
        e4.setText(ContactNumber);
        e5.setText(Address);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Username =e1.getText().toString();
                Mailid =e2.getText().toString();
                password =e3.getText().toString();
                ContactNumber =e4.getText().toString();
                Address =e5.getText().toString();

                Intent i1 = new Intent(Main2Activity.this, MainActivity.class);
                i1.putExtra("key5", "Username");
                i1.putExtra("key6", "Mail id");
                i1.putExtra("key7", "Password");
                i1.putExtra("key8", "ContactNumber");
                i1.putExtra("key9", "Address");
                startActivity(i1);

            }
        });

    }
}
