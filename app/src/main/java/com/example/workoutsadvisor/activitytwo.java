package com.example.workoutsadvisor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activitytwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);
    }
    public void calcbmi(View view){
        double height=0;
        double weight=0;
        double bmi=0;
        String mag="";

        EditText et1=(EditText) findViewById(R.id.edittext1);
        EditText et2=(EditText) findViewById(R.id.edittext2);
        Button b1=(Button) findViewById(R.id.button2);
        TextView t1=(TextView) findViewById(R.id.textViewone);
        TextView t2=(TextView) findViewById(R.id.textViewtwo);
        weight=Double.parseDouble(et1.getText().toString());
        height=Double.parseDouble(et2.getText().toString());
        bmi=height*height;
        bmi=weight/bmi;
        t1.setText(String.valueOf(bmi));

        if(bmi<18.5){
            mag="underweight";
        }
        else if(bmi>=18.5 && bmi<=25){
            mag="normal";
        }
        else if(bmi>25){
            mag="overweight";
        }
        t2.setText(mag);

    }

}