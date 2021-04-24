package com.binodcoder.fall2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView name, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //mapping
        name=(TextView)findViewById(R.id.tv_name);
        address=(TextView)findViewById(R.id.tv_address);

        Bundle bundle=getIntent().getExtras();

        //extracting the data
        String userName=bundle.getString("name");
        String userAddress=bundle.getString("address");

        //displaying data to UI
        name.setText(userName);
        address.setText(userAddress);
    }
}