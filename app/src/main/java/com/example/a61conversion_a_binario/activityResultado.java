package com.example.a61conversion_a_binario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activityResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


        int decimalInicial = 8;

        // de decimal a binario
        String binario = Integer.toBinaryString(decimalInicial);
        System.out.println(binario); // 1000

        // de binario a decimal
        int decimalConvertido = Integer.parseInt(binario, 2);
        System.out.println(decimalConvertido); // 8



    }
}