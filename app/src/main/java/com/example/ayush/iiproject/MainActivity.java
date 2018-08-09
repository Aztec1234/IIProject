package com.example.ayush.iiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   Button donor1,receiver1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        donor1 = (Button) findViewById(R.id.donor);
        receiver1 = (Button) findViewById(R.id.receiver);

        donor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DonorPage = new Intent(MainActivity.this,DonorActivity.class);
                startActivity(DonorPage);
            }
        });

        receiver1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ReceiverPage = new Intent(MainActivity.this,ReceiverActivity.class);
                startActivity(ReceiverPage);
            }
        });


    }
}
