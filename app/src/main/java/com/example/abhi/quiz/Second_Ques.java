package com.example.abhi.quiz;

import android.os.Bundle;
import android.widget.TextView;

public class Second_Ques extends MainActivity {
    private TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        tx = (TextView)findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            int m = extras.getInt("value1");
            tx.setText(m);
        }
    }
}
