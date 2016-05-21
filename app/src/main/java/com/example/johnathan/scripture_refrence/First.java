package com.example.johnathan.scripture_refrence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class First extends AppCompatActivity {

    public Button but1;
    public void init() {
        but1 = (Button) findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(First.this, Second.class);

                startActivity(toy);
            }
        });
    }

    private EditText bookName;

    public void buttonOnClick(View v){
        Button button = (Button) v;
        bookName = (EditText)findViewById(R.id.Book);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        init();
    }
}
