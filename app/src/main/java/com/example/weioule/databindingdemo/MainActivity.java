package com.example.weioule.databindingdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.weioule.databindingdemo.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("MainActivity");

        //第一种方法
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //第二种方法
//        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
//        View view = binding.getRoot();
//        setContentView(view);

        //第三种方法
//        View view = getLayoutInflater().inflate(R.layout.activity_main, null);
//        ActivityMainBinding binding = ActivityMainBinding.bind(view);
//        setContentView(view);

        binding.setBean(new Bean("垚鑫"));
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondAvtivity.class));
            }
        });
    }
}
