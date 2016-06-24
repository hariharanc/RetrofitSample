package com.sample.retrofit;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by hariharan on 22-06-2016.
 */
public class ResponseActivity extends AppCompatActivity {

    /***
     * Varaible Declaration Part
     ***/
    private TextView mTxtResponse;
    private Intent mIntent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_response);
        initViews();
    }

    private void initViews() {
        mTxtResponse=(TextView)findViewById(R.id.txt_response);
        mIntent=getIntent();
        if(mIntent.getStringExtra("response")!=null){
            mTxtResponse.setText(mIntent.getStringExtra("response"));
        }

    }
}
