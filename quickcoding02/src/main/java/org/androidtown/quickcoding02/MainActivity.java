package org.androidtown.quickcoding02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int mynum;
    Button button;
    Button button2;
    Button button3;
    Button button4;

    Random random = new Random();
    int num1 = random.nextInt();

    static int min = 0;
    static int max = 2147483647;
    static int count = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (min+max)/2;
        String str = "Your Number is " + num1;

        TextView textView = (TextView)findViewById(R.id.textView2);
        textView.setText(str);

        final EditText editText = (EditText)findViewById(R.id.editText);

        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mynum = Integer.parseInt(editText.getText().toString());
            }
        });

        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                min = num1;
                count++;
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                max = num1;
                count++;
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bingo.class);
                startActivity(intent);
            }
        });
    }
}
