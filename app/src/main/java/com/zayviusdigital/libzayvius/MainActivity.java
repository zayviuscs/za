package com.zayviusdigital.libzayvius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.zayviusdigital.zayvius_1.StringUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StringUtil stringUtil = new StringUtil();
        Log.e("MainActivity","Result : "+stringUtil.reverse("Hello"));
    }
}