package org.androidtown.quickcoding01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int num[] = new int[5];
    String str = "";
    public MainActivity(){
        num[0] = 32;
        num[1] = 25;
        num[2] = 95;
        num[3] = 40;
        num[4] = 17;

        str = num[0] +"," + num[1] + "," + num[2] + "," + + num[3] + "," + num[4];
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.textView2);
        textView.setText(str);

        findViewById(R.id.button).setOnClickListener(mClickerListner);
        findViewById(R.id.button2).setOnClickListener(mClickerListner);

        //TextView textView1 = (TextView)findViewById(R.id.textView3);
        //textView1.setText(add);
    }

    Button.OnClickListener mClickerListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button:
                    Intent intent = new Intent(getApplicationContext(), MyMinimum.class);
                    startActivity(intent);
                    break;
                case R.id.button2:
                    Intent intent1 = new Intent(getApplicationContext(), MyAverage.class);
                    startActivity(intent1);
                    break;
            }
        }
    };
}
