package com.example.weioule.databindingdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.weioule.databindingdemo.databinding.SecondAvtivityBinding;

import java.util.ArrayList;
import java.util.List;


public class SecondAvtivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("SecondAvtivity");

        SecondAvtivityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        Bean bean = new Bean("visible = true");
        bean.setVisible(true);
        bean.setTitle("我是title");
        binding.setBean(bean);
    }

    public void doNext(View view) {
        startActivity(new Intent(this, ThirdActivity.class));
    }
}
