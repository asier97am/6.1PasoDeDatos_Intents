package com.example.a61conversion_a_binario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_unidades extends AppCompatActivity {

    TextView tv3;
    EditText et3;
    String mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unidades);



        tv3 = findViewById(R.id.tv2);
        et3 = findViewById(R.id.et2);
        Bundle extras = this.getIntent().getExtras();
        mensaje = extras.getString("decenas");
        tv3.setText(mensaje);





    }

    public void siguiente(View view) {

        et3 = findViewById(R.id.et3);
        String mensaje_siguiente = et3.getText().toString();

        int numEntero = Integer.parseInt(mensaje_siguiente+mensaje);

        Intent my_resultado = new Intent(this,activity_unidades.class);
        my_resultado.putExtra("Extra_vuelta", mensaje_siguiente);
        setResult(RESULT_OK, my_resultado);
        startActivity(my_resultado);

        et3 = findViewById(R.id.et2);
        String unidades = et3.getText().toString();
        String decenas= tv3.getText().toString();
        Intent my_intent_decenas = new Intent(this, activity_unidades.class);

        my_intent_decenas.putExtra("centenas", centenas);
        my_intent_decenas.putExtra("decenas", decenas);
        startActivity(my_intent_decenas);



    }
}