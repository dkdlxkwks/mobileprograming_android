package org.androidtown.quickcoding04;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button button;
    Button button2;

    MainActivity ma = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText editText;
        editText = (EditText)findViewById(R.id.editText);
        String str =editText.getText().toString();

        save sv = new save();
        Gen<String,String> gen = new Gen<String,String>(sv.s, sv.s);
        //save sv1 = new save(str);

        TextView textView = (TextView)findViewById(R.id.textView3);
        textView.setText(gen.str1);

        TextView textView1 = (TextView)findViewById(R.id.textView5);
        textView1.setText(gen.str2);

        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isStringDouble(ma.str)){
                    //gen.str2 += ma.str + " ";
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(intent);
                }
                else {
                    //gen.str1 += ma.str + " ";
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(intent);
                }
            }
        });

        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    public static boolean isStringDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
