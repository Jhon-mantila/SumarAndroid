package com.example.datos_actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sumar(View vista){

        //Capturo el texto de los cuadros
        EditText cuadro1 = (EditText)findViewById(R.id.num1);

        EditText cuadro2 = (EditText)findViewById(R.id.num2);

        int num1 = Integer.parseInt(cuadro1.getText().toString());
        int num2 = Integer.parseInt(cuadro2.getText().toString());

        Intent i= new Intent(this, sumar.class);

        i.putExtra("numero1", num1);
        i.putExtra("numero2", num2);


        startActivity(i);
    }
}