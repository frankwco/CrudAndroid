package com.example.aluno.crudandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.aluno.crudandroid.banco.DAOLancamentos;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lancamento lancamento = new Lancamento();
        lancamento.setDescricao("Teste");
        lancamento.setValorLancamento(10.);
        lancamento.setTipoLancamento("Credito");
        new DAOLancamentos(this).inserir(lancamento);
    }
}
