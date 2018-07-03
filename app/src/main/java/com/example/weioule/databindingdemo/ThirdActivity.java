package com.example.weioule.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.weioule.databindingdemo.databinding.ActivityThirdBinding;

import java.util.ArrayList;
import java.util.List;


public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ThirdActivity");

        ActivityThirdBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_third);
        binding.setBean(new Bean("垚鑫"));
        List<String> list = new ArrayList<>();
        list.add("I Am List Item");
        binding.setList(list);
    }
}
