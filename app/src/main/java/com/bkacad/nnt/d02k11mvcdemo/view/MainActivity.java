package com.bkacad.nnt.d02k11mvcdemo.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.bkacad.nnt.d02k11mvcdemo.R;
import com.bkacad.nnt.d02k11mvcdemo.presenter.MainPresenter;
import com.bkacad.nnt.d02k11mvcdemo.presenter.MainPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainView {

    private TextView tvResult;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_main_result);
        mainPresenter = new MainPresenterImpl(this);
    }

    @Override
    public void getDataSuccess(String data) {
        tvResult.setText(data);
        tvResult.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
    }

    @Override
    public void getDataFail(String error) {
        tvResult.setText(error);
        tvResult.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    // Onclick button
    public void clickGetData(View view) {
        mainPresenter.onGetData();
    }
}