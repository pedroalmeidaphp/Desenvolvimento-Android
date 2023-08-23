package com.pedro.listavip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pedro.listavip.R;
import com.pedro.listavip.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;

    Pessoa pessoa;
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



        edit_primeiro = findViewById(R.id.edit_primeiro);
        edit_sobrenome = findViewById(R.id.edit_sobrenome);
        edit_curso = findViewById(R.id.edit_curso);
        edit_celular = findViewById(R.id.edit_celular);

        btn_limpar = findViewById(R.id.btn_limpar);
        btn_salvar = findViewById(R.id.btn_salvar);
        btn_finalizar = findViewById(R.id.btn_finalizar);
        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit_primeiro.setText("");
                edit_sobrenome.setText("");
                edit_curso.setText("");
                edit_celular.setText("");
            }
        });
        btn_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Obrigado!", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pessoa.setFirstName(edit_primeiro.getText().toString());
                pessoa.setLastName(edit_sobrenome.getText().toString());
                pessoa.setCourse(edit_curso.getText().toString());
                pessoa.setContact(edit_celular.getText().toString());
            }
        });
    }
}