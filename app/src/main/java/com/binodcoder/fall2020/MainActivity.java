package com.binodcoder.fall2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name, address;
    private Button send, binod, bijay, shrawan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mapping
        name=(EditText)findViewById(R.id.et_name);
        address=(EditText)findViewById(R.id.et_address);
        send=(Button)findViewById(R.id.btn_send);
        binod=(Button)findViewById(R.id.btn_binod);
        bijay=(Button)findViewById(R.id.btn_bijay);
        shrawan=(Button)findViewById(R.id.btn_shrawan);

        binod.setOnClickListener(v->{
            Toast.makeText(MainActivity.this, "Hello Binod", Toast.LENGTH_SHORT).show();
        });
        bijay.setOnClickListener(v->{
            Toast.makeText(MainActivity.this, "Hello Bijay", Toast.LENGTH_SHORT).show();
        });
        shrawan.setOnClickListener(v->{
            Toast.makeText(MainActivity.this, "Hello Shrawan", Toast.LENGTH_SHORT).show();
        });

        send.setOnClickListener(v->{
            String userName=name.getText().toString();
            String userAddress=address.getText().toString();
            Intent intent=new Intent(MainActivity.this, SecondActivity.class);
            Bundle bundle=new Bundle();
            bundle.putString("name", userName);
            bundle.putString("address", userAddress);
            intent.putExtras(bundle);
            startActivity(intent);
        });

    }
}