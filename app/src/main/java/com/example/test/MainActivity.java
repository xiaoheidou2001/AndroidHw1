package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn1 = findViewById(R.id.btn_str);
        final TextView tv = findViewById(R.id.txt);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Thank you!");
            }
        });

        final Button btn2 = findViewById(R.id.btn_img);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imgv = findViewById(R.id.imageView);
                imgv.setImageResource(R.drawable.cat);
            }
        });

        final Button btn3 = findViewById(R.id.btn_chk);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox chk1 = findViewById(R.id.checkBox1);
                CheckBox chk2 = findViewById(R.id.checkBox2);
                TextView tv2 = findViewById(R.id.txt2);
                if(chk1.isChecked() && !chk2.isChecked()) {
                    tv2.setText("You've chosen COFFEE.");
                }
                else if(!chk1.isChecked() && chk2.isChecked()){
                    tv2.setText("You've chosen TEA.");
                }
                else if(chk1.isChecked() && chk2.isChecked()){
                    tv2.setText("You've chosen COFFEE and TEA.");
                }
                else {
                    tv2.setText("");
                }
            }
        });

        Log.i("111111", "onCreate: 1111");
    }
}
