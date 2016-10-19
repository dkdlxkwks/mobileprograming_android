package org.androidtown.quickcoding02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Bingo extends AppCompatActivity {

    int mynum;
    Button button;
    Button button2;
    Button button3;
    Button button4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bingo1);

        Random random = new Random();

        int num1 = random.nextInt();

        MainActivity ma = new MainActivity();

        String str = "Ã£Àº È½¼ö´Â " + ma.count;

        TextView textView = (TextView)findViewById(R.id.textView2);
        textView.setText(str);


    }
}
