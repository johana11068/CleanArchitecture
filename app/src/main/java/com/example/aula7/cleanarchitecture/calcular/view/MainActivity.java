package com.example.aula7.cleanarchitecture.calcular.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aula7.cleanarchitecture.R;
import com.example.aula7.cleanarchitecture.calcular.presenter.MainActivityPresenter;
import com.example.aula7.cleanarchitecture.calcular.presenter.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainActivityView{

    private MainActivityPresenter presenter;
    private EditText editTextNum1;
    private EditText editTextNum2;
    private TextView textViewMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenterImpl(this);

        editTextNum1 = (EditText) findViewById(R.id.id_edt_num1);
        editTextNum2 = (EditText) findViewById(R.id.id_edt_num2);
        textViewMsg = (TextView) findViewById(R.id.id_txv_msg);
    }

    @Override
    public void showResult(String result) {
        textViewMsg.setText(result);
    }

    @Override
    public void showError(String error) {

    }

    public void onClickSuma(View view){
        presenter.suma(editTextNum1.getText().toString(),editTextNum2.getText().toString());
    }
}
