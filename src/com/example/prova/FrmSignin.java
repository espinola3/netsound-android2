package com.example.prova;

import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class FrmSignin extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        final EditText txtUser = (EditText)findViewById(R.id.TxtUser);
        final Button btnLogin = (Button)findViewById(R.id.BtnLogin);
        final Button btnSignup = (Button)findViewById(R.id.BtnSignup);

        
      //Implementamos el evento “click” del botón Login
        btnLogin.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) {
                  //Creamos el Intent
                  Intent intent =
                          new Intent(FrmSignin.this, MainActivity.class);
                  //Creamos la información a pasar entre actividades
                  Bundle b = new Bundle();
                  b.putString("NOMBRE", txtUser.getText().toString());
 
                  //Añadimos la información al intent
                  intent.putExtras(b);
 
                  //Iniciamos la nueva actividad
                  startActivity(intent);
             }
        });
        
      //Implementamos el evento “click” del botón Signup
        btnSignup.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) {
                  //Creamos el Intent
                  Intent intent2 =
                          new Intent(FrmSignin.this, FrmSignup.class);
                  
                  //Iniciamos la nueva actividad
                  startActivity(intent2);
             }
        });
    
    }
}
    
    
 
