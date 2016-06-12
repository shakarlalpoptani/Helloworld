package com.shankarlalpoptanigmail.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Look this is the layout file i m linking.
        setContentView(R.layout.activity_my);
    }
}
