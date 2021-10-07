package com.estacio.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private Spinner spnNome;
    private Spinner spnCidade;
    private Button btnCadastro;
    private List<String> ListaCidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnNome = findViewById(R.id.spnNome);
        spnCidade = findViewById(R.id.spnCidade);

        btnCadastro = findViewById(R.id.btnCadastro);

        spnNome.setOnItemSelectedListener(this);
        spnNome.setOnItemSelectedListener(this);
        btnCadastro.setOnClickListener(this);
    }

    private void carregarListaNome(){
        ArrayAdapter<CharSequence> adp = ArrayAdapter.createFromResource(
                this,R.array.lista_nome, android.R.layout.simple_spinner_item);

        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spnNome.setAdapter(adp);
    }

    private void carregarListaCidade(){
        ListaCidade = new ArrayList<>();

        ListaCidade.add("Fortaleza");
        ListaCidade.add("Fortaleza");
        ListaCidade.add("Fortaleza");

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ListaCidade);
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spnCidade.setAdapter(adp);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String item = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(this,item,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}