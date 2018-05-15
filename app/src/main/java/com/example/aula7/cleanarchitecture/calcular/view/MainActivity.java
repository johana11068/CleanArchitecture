package com.example.aula7.cleanarchitecture.calcular.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.aula7.cleanarchitecture.R;

public class MainActivity extends AppCompatActivity implements MainActivityView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showResult(String result) {

    }

    @Override
    public void showError(String error) {

    }
}
