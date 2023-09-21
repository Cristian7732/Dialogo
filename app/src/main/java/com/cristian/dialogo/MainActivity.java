package com.cristian.dialogo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void salir(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Advertencia");
        alertDialogBuilder.setIcon(R.drawable.pregunta);
        alertDialogBuilder.setMessage("Desea salir de la Aplicación");
        alertDialogBuilder.setCancelable(true);
        alertDialogBuilder.setPositiveButton("Si", new DialogInterface.OnClickListener(){
           @Override
            public void onClick(DialogInterface arg0, int arg1){
               finish();
           }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface arg0, int arg2){
                Toast.makeText(MainActivity.this, "Has seleccionado NO", Toast.LENGTH_LONG).show();
            }
        });
        alertDialogBuilder.setNeutralButton("Cancelar", new DialogInterface.OnClickListener(){
           public void onClick(DialogInterface arg0, int arg1){
               Toast.makeText(MainActivity.this, "Has seleccionado Cancelar", Toast.LENGTH_LONG).show();
           }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


}
