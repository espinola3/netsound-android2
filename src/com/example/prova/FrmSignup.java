package com.example.prova;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.DialogInterface;
import android.content.Intent;

 
public class FrmSignup extends Activity {
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        
        final EditText txtUser  = (EditText)findViewById(R.id.TxtUser);
        final EditText txtPwd   = (EditText)findViewById(R.id.TxtSignupPwd);
        final EditText txtPwd2  = (EditText)findViewById(R.id.TxtSignupPwd2);
        final EditText txtEmail = (EditText)findViewById(R.id.TxtEmail);
        final Button btnSignup  = (Button)findViewById(R.id.BtnSignup);
        
      
      //Implementamos el evento “click” del botón
        btnSignup.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) {
                  //Creamos el Intent
                  Intent intent =
                          new Intent(FrmSignup.this, MainActivity.class);
                  
                  if(txtPwd.getText().toString().equals(txtPwd2.getText().toString())){
                  //Creamos la información a pasar entre actividades
                  Bundle b = new Bundle();
                  b.putString("NOMBRE", txtUser.getText().toString());
 
                  //Añadimos la información al intent
                  intent.putExtras(b);
 
                  //Iniciamos la nueva actividad
                  startActivity(intent);
                  }
                  else
                  {
                	  			
                		        FragmentManager fragmentManager = getFragmentManager();
                		        DialogoAlerta dialogo = new DialogoAlerta();
                		        dialogo.show(fragmentManager, "tagAlerta");
                		    
                		
                  }
             }
        });
      
}
    
    
    }

