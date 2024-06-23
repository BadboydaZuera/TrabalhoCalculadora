package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText txtNr1;
    private EditText txtNr2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        txtNr1 = findViewById(R.id.txtNr1);
        txtNr2 = findViewById(R.id.txtNr2);
        tvResultado = findViewById(R.id.tvResultado);


        }

        public void somar(View view) {
        int valor1 = Integer.parseInt(txtNr1.getText().toString());
        int valor2 = Integer.parseInt(txtNr2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 + valor2));
    }

    public void subtrair(View view) {
        int valor1 = Integer.parseInt(txtNr1.getText().toString());
        int valor2 = Integer.parseInt(txtNr2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 - valor2));
    }

    public void multiplicar(View view) {
        int valor1 = Integer.parseInt(txtNr1.getText().toString());
        int valor2 = Integer.parseInt(txtNr2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 * valor2));
    }
    public void dividir(View view) {
        int valor1 = Integer.parseInt(txtNr1.getText().toString());
        int valor2 = Integer.parseInt(txtNr2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 / valor2));
    }
}