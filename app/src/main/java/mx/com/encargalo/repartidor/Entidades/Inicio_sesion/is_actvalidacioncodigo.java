//Creado por Duran Llamacuri Kevin - Universidad Continental - 2022
package mx.com.encargalo.repartidor.Entidades.Inicio_sesion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mx.com.repartidor.R;

public class is_actvalidacioncodigo extends AppCompatActivity {
    Button is_vcbtnreenviar,is_vcbtncontinuar;
    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is_actvalidacioncodigo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.is_iconback);
        getSupportActionBar().setTitle(R.string.toolbar_is);
        is_vcbtnreenviar = findViewById(R.id.is_vcbtnreenviar);
        is_vcbtncontinuar = findViewById(R.id.is_vcbtncontinuar);
       context= getApplicationContext();
        is_vcbtncontinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, MainActivity.class);
                // Intent i = new Intent( is_actvalidacioncodigo.this, is_actiniciosesionprincipal.class);
                startActivity(i);
            }
        });
    }
}