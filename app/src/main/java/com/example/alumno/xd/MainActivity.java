package com.example.alumno.xd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.alumno.xd.activities.login;
import com.example.alumno.xd.generals.Settings;

public class MainActivity extends AppCompatActivity {

    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Button
        btnEntrar=(Button) findViewById(R.id.btn_Entrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Clic me", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, login.class);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Settings.DEBUG, "La aplicacion entró en start");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(Settings.DEBUG, "La aplicacion entró en resume");
        Toast.makeText(this, "La aplicacion acaba de iniciar", Toast.LENGTH_SHORT).show();
        // put your code here...
    }
    @Override
    protected void onStop() {
        // call the superclass method first
        super.onStop();
        Log.d(Settings.DEBUG, "La aplicacion entró en stop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v(Settings.DEBUG, "La aplicacion entró en pause");
        Toast.makeText(this, "No te vayas!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Settings.DEBUG, "La aplicacion entró en destroy");
    }
}
