package com.example.holamudosoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btEnviar(View view)
    {
        EditText txtnombre =  (EditText)findViewById(R.id.textnombre);
        Toast.makeText(this.getApplicationContext(),"hola " + txtnombre.getText().toString(), Toast.LENGTH_SHORT).show();
    }

}


