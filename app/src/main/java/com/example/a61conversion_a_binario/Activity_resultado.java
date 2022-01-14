package com.example.a61conversion_a_binario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_resultado extends AppCompatActivity {

    TextView tvDatos,tvBinario;
    String mensaje;
    Button btnConvertirBinario;
    Bundle extras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        extras = this.getIntent().getExtras();

        btnConvertirBinario = findViewById(R.id.btnConvertirBinario);
        tvDatos = findViewById(R.id.tvDatos);
        tvBinario = findViewById(R.id.tvBinario);

        String centenas=extras.getString("centenas");
        String decenas=extras.getString("decenas");
        String unidades=extras.getString("unidades");

        String resultado=centenas+decenas+unidades;
        int numero=Integer.parseInt(resultado);

        tvDatos.setText(numero);

        String binario = Integer.toBinaryString(numero);
        tvBinario.setText(binario);

//
//        int decimalInicial = 8;
//
//        // de decimal a binario
//        String binario = Integer.toBinaryString(decimalInicial);
//        System.out.println(binario); // 1000
//
//        // de binario a decimal
//        int decimalConvertido = Integer.parseInt(binario, 2);
//        System.out.println(decimalConvertido); // 8


    }
}