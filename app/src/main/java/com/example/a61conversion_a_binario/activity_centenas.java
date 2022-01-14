package com.example.a61conversion_a_binario;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_centenas extends AppCompatActivity {

    public EditText editText1;
    public Button bt1;

    ActivityResultLauncher<Intent> my_ActivityResultLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centenas);

        bt1 = findViewById(R.id.bt1);


    }

    public void lanzar_actividad(View view) {
        editText1 = findViewById(R.id.editText1);
        String centenas = editText1.getText().toString();

        Intent my_intent = new Intent(this, activity_decenas.class);
        my_intent.putExtra("centenas", centenas);
        startActivity(my_intent);// antes era //startActivity(my_intent);

    }
}