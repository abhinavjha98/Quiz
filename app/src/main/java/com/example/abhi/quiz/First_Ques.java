package com.example.abhi.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class First_Ques extends MainActivity {
    private RadioGroup r1;
    private RadioButton rb1,rb2,rb3,rb4;
    Bundle value;
    private Button b1;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        b1 =(Button)findViewById(R.id.button2);
    r1 = (RadioGroup)findViewById(R.id.radiogroup);
    r1.clearCheck();
    r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if(checkedId==R.id.radioButton2){
            a= 7;
            }
            else if(checkedId==R.id.radioButton3){
            a=5;
            }else{
                a=4;
            }

        }
    });
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(First_Ques.this,Second_Ques.class);
            i.putExtra("value1",a);
            startActivity(i);
        }
    });
    }
}
