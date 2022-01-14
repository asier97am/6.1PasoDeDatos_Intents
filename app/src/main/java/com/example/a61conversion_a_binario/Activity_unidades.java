package com.example.a61conversion_a_binario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class Activity_unidades extends AppCompatActivity {

    TextView tv3;
    EditText et3;
    Button bt3;
    String mensaje;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unidades);

        bt3 = findViewById(R.id.bt3);

        tv3 = findViewById(R.id.tv3);
        et3 = findViewById(R.id.et2);
        extras = this.getIntent().getExtras();
        mensaje = extras.getString("decenas");
        tv3.setText(mensaje);

    }

    public void siguiente(View view) {

        et3 = findViewById(R.id.et3);

        //String decenas= tv3.getText().toString();
        String unidades = et3.getText().toString();
        String centenas=extras.getString("centenas");
        String decenas=extras.getString("decenas");

        Intent my_intent_unidades = new Intent(Activity_unidades.this, Activity_resultado.class);

        my_intent_unidades.putExtra("centenas", centenas);
        my_intent_unidades.putExtra("decenas", decenas);
        my_intent_unidades.putExtra("unidades", unidades);
        startActivity(my_intent_unidades);

//
    }
}