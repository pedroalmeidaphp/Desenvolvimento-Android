package com.pedro.listavip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.pedro.listavip.R;
import com.pedro.listavip.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    String dados;

    EditText edit_primeiro;
    EditText edit_sobrenome;
    EditText edit_curso;
    EditText edit_celular;

    Button btn_limpar;
    Button btn_salvar;
    Button btn_finalizar;
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

        edit_primeiro = findViewById(R.id.edit_primeiro);
        edit_sobrenome = findViewById(R.id.edit_sobrenome);
        edit_curso = findViewById(R.id.edit_curso);
        edit_celular = findViewById(R.id.edit_celular);

        btn_limpar = findViewById(R.id.btn_limpar);
        btn_salvar = findViewById(R.id.btn_salvar);
        btn_finalizar = findViewById(R.id.btn_finalizar);

        edit_primeiro.setText(pessoa.getFirstName());
        edit_sobrenome.setText(pessoa.getLastName());
        edit_curso.setText(pessoa.getCourse());
        edit_celular.setText(pessoa.getContact());

        

        Log.i("poo", pessoa.toString());
    }
}