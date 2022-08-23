package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view)
    {
        String [] frases = {
                "As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.",
                "Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer.",
                "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.",
                "No meio da dificuldade encontra-se a oportunidade."
        };

        int numero = new Random().nextInt(4);

        TextView texto = findViewById(R.id.textoResultado);
        texto.setText( frases[numero] );
    }

}