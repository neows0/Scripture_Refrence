package com.example.johnathan.scripture_refrence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    public Button but2;
    public void init(){
        but2 = (Button)findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent action = new Intent(Second.this,First.class);

                startActivity (action);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle first = getIntent().getExtras();
        if(first == null) {
            Intent action = new Intent(Second.this,First.class);
            startActivity (action);
        }
        String book = first.getString("BOOK_NAME");
        TextView refrence = (TextView) findViewById(R.id.refrence);
        refrence.setText(book);

        init();
    }
}
