package com.pedro.listavip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.pedro.listavip.R;
import com.pedro.listavip.controller.CursoController;
import com.pedro.listavip.controller.PessoaController;
import com.pedro.listavip.model.Pessoa;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    PessoaController controller;
    Pessoa pessoa;
    List<String> nomesCursos;

    CursoController cursoController;



    EditText edit_primeiro;
    EditText edit_sobrenome;
    EditText edit_curso;
    EditText edit_celular;
    Button btn_limpar;
    Button btn_salvar;
    Button btn_finalizar;

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        pessoa= new Pessoa();

        controller= new PessoaController(MainActivity.this);
        controller.buscar(pessoa);

        cursoController = new CursoController();
        nomesCursos = cursoController.dadosParaSpinner();


        edit_primeiro = findViewById(R.id.edit_primeiro);
        edit_sobrenome = findViewById(R.id.edit_sobrenome);
        edit_curso = findViewById(R.id.edit_curso);
        edit_celular = findViewById(R.id.edit_celular);
        spinner = findViewById(R.id.spinner);

        btn_limpar = findViewById(R.id.btn_limpar);
        btn_salvar = findViewById(R.id.btn_salvar);
        btn_finalizar = findViewById(R.id.btn_finalizar);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cursoController.dadosParaSpinner());

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(adapter);
        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit_primeiro.setText("");
                edit_sobrenome.setText("");
                edit_curso.setText("");
                edit_celular.setText("");

                controller.limpar();
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

                controller.salvar(pessoa);

            }
        });




    }
}