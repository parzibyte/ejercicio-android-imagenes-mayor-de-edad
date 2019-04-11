package me.parzibyte.imagenesmayordeedad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencias
        final EditText editTextNombre = findViewById(R.id.editText),
                editTextEdad = findViewById(R.id.editText2);
        Button botonEntrar = findViewById(R.id.button);

        // Ahora escuchamos el click del botón
        botonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener nombre y edad como texto

                String nombre = editTextNombre.getText().toString(),
                        edadComoString = editTextEdad.getText().toString();
                // Si están vacíos detenemos la ejecución de este código
                if (nombre.isEmpty() || edadComoString.isEmpty()) return;
                // Si no, entonces vamos a convertir la edad a entero
                int edad = Integer.parseInt(edadComoString);

                // Ahora vamos a mandar esos datos que tenemos a la otra actividad
                Intent intent = new Intent(MainActivity.this, Actividad2.class);
                // Le agregamos el nombre
                intent.putExtra("nombre", nombre);
                //La edad también
                intent.putExtra("edad", edad);

                // Lo iniciamos y nos vemos en Actividad2
                startActivity(intent);
            }
        });
    }
}
