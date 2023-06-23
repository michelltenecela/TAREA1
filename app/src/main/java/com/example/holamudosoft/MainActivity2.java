package com.example.holamudosoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtSaludo = (TextView)findViewById(R.id.txtInfo);

        Bundle bundle = this.getIntent().getExtras();

        txtSaludo.setText("Hola!, Bienvenido \n " +
                bundle.getString("NOMBRE") + "\n" +
                bundle.getString("CEDULA") + "\n" +
                bundle.getString("FECHA") + "\n" +
                bundle.getString("TELEFONO") + "\n" +
                bundle.getString("CIUDAD")+ "\n" +
                bundle.getString("GENERO"));
    }


}