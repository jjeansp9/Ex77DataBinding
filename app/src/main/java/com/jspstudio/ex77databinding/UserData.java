package com.jspstudio.ex77databinding;

import android.view.View;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

public class UserData {
    // 데이터가 변경되었을 때 화면이 자동 갱신되려면 이 데이터를 가진 변수가 관찰가능한 변수여야만 함
    public ObservableField<String> name= new ObservableField<>();
    public ObservableInt age= new ObservableInt();

    public UserData(String name, int age){
        this.name.set(name);
        this.age.set(age);
    }

    // 이름을 변경하는 기능 메소드
    public void changeName(View view){
        this.name.set("ROBIN");
    }

}
