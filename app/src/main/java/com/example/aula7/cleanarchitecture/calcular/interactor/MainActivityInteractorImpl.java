package com.example.aula7.cleanarchitecture.calcular.interactor;

import com.example.aula7.cleanarchitecture.calcular.presenter.MainActivityPresenter;

/**
 * Created by AULA 7 on 15/05/2018.
 */

public class MainActivityInteractorImpl implements MainActivityInteractor {

    private MainActivityPresenter presenter;

    public MainActivityInteractorImpl(MainActivityPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void sumar(String num1, String num2) {
        Integer result = Integer.valueOf(num1) + Integer.valueOf(num2);
        presenter.showResult(String.valueOf(result));
    }
}
