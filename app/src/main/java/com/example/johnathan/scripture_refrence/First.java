package com.example.johnathan.scripture_refrence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
    private EditText chap;
    private EditText verse;

    public void but2(View v){
        Button button = (Button) v;
        bookName = (EditText)findViewById(R.id.Book);

        //Toast toast = new Toast(getApplicationContext());
        //toast.setGravity(Gravity.TOP| Gravity.LEFT, 0, 0);
        //toast.makeText(First.this, bookName.getText(), toast.LENGTH_SHORT).show();

    }

    public void but3(View v) {
        Button button = (Button) v;
        chap = (EditText) findViewById(R.id.Chapter);
    }

    public void but4(View v) {
        Button button = (Button) v;
        verse = (EditText) findViewById(R.id.Verse);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        //pBook = (TextView)findViewById(R.id.Book);
        //pBook.setText(bookName.getText().toString());
        init();
    }
}
