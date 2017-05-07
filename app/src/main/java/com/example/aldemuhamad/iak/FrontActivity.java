package com.example.aldemuhamad.iak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class FrontActivity extends AppCompatActivity {

    Button tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        tombol = (Button) findViewById(R.id.mBtnMasuk);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(FrontActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
