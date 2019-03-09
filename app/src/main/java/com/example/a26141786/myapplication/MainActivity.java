package com.example.a26141786.myapplication;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public TextInputEditText inputText;
    public double altura;
    public String altText;
    public RadioButton botao;
    public RadioButton botao2;
    public RadioGroup grupo;
    public TextView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText = findViewById(R.id.super);
        myView = findViewById(R.id.theView);
        grupo = findViewById(R.id.radioGroup);
    }

    public void CalcularAltura(View r)
    {
        if(grupo.getCheckedRadioButtonId() == R.id.masculinoButton)
        {
            altura = 72.7 * Double.parseDouble(inputText.getText().toString());
            altura = altura - 58.0;
            altText = Double.toString(altura);
            myView.setText(altText);

        }

        else
            {
                altura = 62.1 * Double.parseDouble(inputText.toString());
                altura = altura - 44.7;
            }
    }
}
