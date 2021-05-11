package com.example.exercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        EditText n1,n2;
        Button btn;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            n1 =findViewById(R.id.n1);
            n2 =findViewById(R.id.n2);
            btn =findViewById(R.id.btn);

        }
        public void M(View v)
        {
            String nome1 = n1.getText().toString();
            String apelido = n2.getText().toString();
            Toast.makeText(this, "Olá " + nome1 + " " + apelido, Toast.LENGTH_SHORT).show();

            if((nome1.isEmpty()) || (apelido.isEmpty())){
                Toast.makeText(this, "Nome não inserido", Toast.LENGTH_SHORT).show();
            }
        }
    }
