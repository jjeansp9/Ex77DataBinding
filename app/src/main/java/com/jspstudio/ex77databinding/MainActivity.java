package com.jspstudio.ex77databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.jspstudio.ex77databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // DataBinding : 데이터가 변경되었을 때 뷰가 자동 갱신되도록 하는 기능 [ ViewBinding은 자동 켜짐 ]

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActivityMainBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_main);

        // 데이터를 가진 객체
        UserData user= new UserData("sanddf", 20);
        binding.setUser(user);



    }
}