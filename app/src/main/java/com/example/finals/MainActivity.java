package com.example.finals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.small);
        Button btn2 = findViewById(R.id.large);

        btn2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                TextView tx = findViewById(R.id.name);
                tx.setTextSize(35);

                return false;
            }
        });{}

        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    public void browser(View view) {

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.google.com"));
        startActivity(i);

        }

        public void call(View view){

        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:+9666453535"));
        startActivity(i);
        }


        public void next(View view){

        Intent i = new Intent (this,NextPage.class);
        startActivity(i);

        }


    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.small){

            TextView tx = findViewById(R.id.name);
            tx.setTextSize(9);
        }
        else{

            TextView tx = findViewById(R.id.name);
            tx.setTextSize(35);
        }

    }
}
