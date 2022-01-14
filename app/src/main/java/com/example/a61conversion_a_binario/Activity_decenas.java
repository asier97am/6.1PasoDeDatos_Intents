package com.example.a61conversion_a_binario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class Activity_decenas extends AppCompatActivity {

    TextView tv2;
    EditText et2;
    Button bt2;
    String mensaje;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decenas);

        bt2 = findViewById(R.id.bt2);

        tv2 = findViewById(R.id.tv2);
        et2 = findViewById(R.id.et2);
        extras = this.getIntent().getExtras();
        mensaje = extras.getString("centenas");
        tv2.setText(mensaje);


    }
    public void siguiente(View vista) {
        et2 = findViewById(R.id.et2);
        String decenas = et2.getText().toString();

        //String centenas= tv2.getText().toString();
        String centenas=extras.getString("centenas");

        Intent my_intent_decenas = new Intent(this, Activity_unidades.class);

        my_intent_decenas.putExtra("centenas", centenas);
        my_intent_decenas.putExtra("decenas", decenas);
        startActivity(my_intent_decenas);

    }

//    public void s3guiente(View view) {
//
//        et2 = findViewById(R.id.et3);
//        String mensaje_siguiente = et2.getText().toString();
////
////        int numDecenas = Integer.parseInt(mensaje_siguiente);
////        int numCentenas = Integer.parseInt(mensaje);
////        int suma=numCentenas+numDecenas;
////        tv2.setText(suma);
//        //mensaje_siguiente=Integer.toString(suma);
//        mensaje_siguiente = tv2.getText().toString();
//
//        Intent my_resultado = new Intent(this,activity_unidades.class);
//        my_resultado.putExtra("Extra_vuelta", mensaje_siguiente);
//        setResult(RESULT_OK, my_resultado);
//        startActivity(my_resultado);
//    }
}