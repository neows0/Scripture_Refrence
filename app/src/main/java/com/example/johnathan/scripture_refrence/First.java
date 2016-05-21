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

                bookName = (EditText)findViewById(R.id.Book);
                chap = (EditText) findViewById(R.id.Chapter);
                verse = (EditText) findViewById(R.id.Verse);

                String refrence = "";
                refrence += bookName.getText().toString() + " "
                         + chap.getText().toString();
                if (verse.getText().toString().length() != 0){
                    refrence += ":" + " "
                            + verse.getText().toString();
                }

                toy.putExtra("BOOK_NAME",refrence);

                startActivity(toy);
            }
        });
    }

    private EditText bookName;
    private EditText chap;
    private EditText verse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        //pBook = (TextView)findViewById(R.id.Book);
        //pBook.setText(bookName.getText().toString());
        init();
    }
}
