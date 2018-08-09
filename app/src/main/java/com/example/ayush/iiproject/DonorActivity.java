package com.example.ayush.iiproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DonorActivity extends AppCompatActivity {

    Button send1;
    EditText uname,contact,address,bloodG;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor);

        send1 = (Button) findViewById(R.id.button2);

        uname = (EditText)findViewById(R.id.editText5);
        address = (EditText)findViewById(R.id.editText6);
        bloodG = (EditText)findViewById(R.id.editText8);
        contact= (EditText) findViewById(R.id.editText7);

        databaseReference = FirebaseDatabase.getInstance().getReference();

        send1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedUserInformation();
            }
        });

    }

    private void savedUserInformation(){

        String name = uname.getText().toString().trim();
        String add = address.getText().toString().trim();
        String bloodg = bloodG.getText().toString().trim();
        String con = contact.getText().toString().trim();

        UserInformation userInformation = new UserInformation(name,add,bloodg,con);

        databaseReference.child("users").setValue(userInformation);

        Toast.makeText(this,"Information Saved..",Toast.LENGTH_LONG).show();
    }

}
