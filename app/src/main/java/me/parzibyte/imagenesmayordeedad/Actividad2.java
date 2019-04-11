package me.parzibyte.imagenesmayordeedad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        // Obtener referencias al ImageView y al TextView
        TextView textView = findViewById(R.id.textView);
        ImageView imageView = findViewById(R.id.imageView);

        // Obtener el intent que se nos fue enviado
        Intent intent = getIntent();

        // Recuperar los datos. Recuerda que el segundo argumento es el valor por defecto
        // en caso de que no exista un dato con la clave solicitada
        int edad = intent.getIntExtra("edad", 0);
        // Ahora el nombre, ese es una cadena
        String nombre = intent.getStringExtra("nombre");

        // Hacer la comprobación
        if (edad >= 18) {
            // Es mayor de edad, así que ponemos un mensaje de "Bienvenido"
            String mensaje = "Bienvenido, " + nombre;
            textView.setText(mensaje);

            // Al ImageView le ponemos el auto
            imageView.setImageResource(R.drawable.auto);
        } else {
            // Si no, un mensaje de "no permitido"
            String mensaje = "No puedes ver el contenido, " + nombre;
            textView.setText(mensaje);

            // Y le ponemos la imagen del juguete
            imageView.setImageResource(R.drawable.juguete);
        }
    }
}
