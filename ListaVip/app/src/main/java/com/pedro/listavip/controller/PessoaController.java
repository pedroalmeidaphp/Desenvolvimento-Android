package com.pedro.listavip.controller;

import android.content.SharedPreferences;

import com.pedro.listavip.model.Pessoa;
import com.pedro.listavip.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;
    public static final String NOME_PREFERENCES = "pref_listaVip";

    public PessoaController(MainActivity mainActivity) {
        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();
    }

    public Pessoa buscar(Pessoa pessoa) {
        pessoa.setFirstName(preferences.getString("primeiroNome", "NA"));
        pessoa.setLastName(preferences.getString("sobrenome", "NA"));
        pessoa.setCourse(preferences.getString("curso", "NA"));
        pessoa.setContact(preferences.getString("contato", "NA"));

        return pessoa;
    }

    public void limpar() {
        listaVip.clear();
        listaVip.apply();
    }


    public void salvar(Pessoa pessoa) {
        listaVip.putString("primeiroNome", pessoa.getFirstName());
        listaVip.putString("sobrenome", pessoa.getLastName());
        listaVip.putString("curso", pessoa.getCourse());
        listaVip.putString("contato", pessoa.getContact());
        listaVip.apply();
    }
}
