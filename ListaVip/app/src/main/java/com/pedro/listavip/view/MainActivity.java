package com.pedro.listavip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.pedro.listavip.R;
import com.pedro.listavip.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    String dados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pessoa= new Pessoa();
        pessoa.setFirstName("Pedro");
        pessoa.setLastName("Almeida");
        pessoa.setCourse("CC");
        pessoa.setContact("16 993697830");
        dados = pessoa.getFirstName();
        Log.i("poo", pessoa.toString());
    }
}