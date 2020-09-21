package com.rodrigo.contenedores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_spinner, btn_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_recycler = findViewById(R.id.btn_recycler);
        btn_spinner = findViewById(R.id.btn_spinner);

        // Para cambiar de pantalla necesitamos un Intent


        btn_spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this,"Spinner",Toast.LENGTH_LONG).show();
                // Intent(ACTIVITY ACTUAL, ACTIVITY QUE QUIERO DESPLEGAR)
                Intent intento = new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(intento);
            }
        });

        btn_recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this,"Recycler",Toast.LENGTH_LONG).show();
                Intent intento2 = new Intent(MainActivity.this,RecyclerActivity.class);
                startActivity(intento2);

                //startActivity(new Intent(MainActivity.this,RecyclerActivity.class));
            }
        });
    }
}