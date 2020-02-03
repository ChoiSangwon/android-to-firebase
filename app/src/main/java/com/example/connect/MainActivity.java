package com.example.connect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendbutton = (Button) findViewById(R.id.button);

        sendbutton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                EditText editText = (EditText)findViewById(R.id.editText);
                databaseReference.push().setValue(editText.getText().toString());
            }
        });
    }

}
