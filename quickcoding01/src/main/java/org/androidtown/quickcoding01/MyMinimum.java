package org.androidtown.quickcoding01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyMinimum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myminimum);

        String str = "The Result : " + Minimum();

        MainActivity mainActivity = new MainActivity();

        TextView textView = (TextView)findViewById(R.id.textView2);
        textView.setText(mainActivity.str);

        findViewById(R.id.button).setOnClickListener(mClickerListner);
        findViewById(R.id.button2).setOnClickListener(mClickerListner);

        TextView textView1 = (TextView)findViewById(R.id.textView3);
        textView1.setText(str);
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

    public int Minimum(){
        MainActivity mainActivity = new MainActivity();

        int min = mainActivity.num[0];

        for(int i =0 ; i<mainActivity.num.length; i++){
            if(min > mainActivity.num[i]) {
                min = mainActivity.num[i];
            }
        }

        return min;
    }
}
