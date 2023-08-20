package com.pedro.listavip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pedro.listavip.R;
import com.pedro.listavip.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pessoa= new Pessoa();
    }
}