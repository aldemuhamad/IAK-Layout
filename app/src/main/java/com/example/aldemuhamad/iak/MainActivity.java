package com.example.aldemuhamad.iak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tombolShare, isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombolShare = (TextView) findViewById(R.id.mTextShare);
        isi = (TextView) findViewById(R.id.mTextContent);

        tombolShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, isi.getText().toString());
                i.setType("text/plain");
                startActivity(i);
            }
        });

    }
}
