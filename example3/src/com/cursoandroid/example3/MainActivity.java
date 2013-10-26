package com.cursoandroid.example3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private final static String TAG = "Debug";
    private String status_message = "";
    private TextView txt_msg;
    
    /*
     * PRIMERA PARTE
     * 
     * Implementar los metodos onCreate, onDestroy, onPause, onRestart, onResume, onStart, onStop
     *  para explicar el ciclo de vida de un Activity.
     *  
     *  
     * SEGUNDA PARTE
     * 
     * Implementar los clases CloseButtonOnClickListener y OpenButtonOnClickListener 
     * 
     * 
     * TERCER PARTE
     * 
     * Asignar onClickListener a btn_open y btn_close
     * 
     * 
     * CUARTA PARTE
     * 
     * Agregar un nuevo layout llamado activity_second y definir el TextView Correspondiente
     * 
     * 
     * QUINTA PARTE
     * 
     * Agregar una nueva clase llamada SecondActivity en el paquete com.cursoandroid.example3 y agregar el codigo.
     * 
     * 
     * SEXTA PARTE
     * 
     * Agregar un recurso de Menu llamano second.xml sin contenido
     * 
     * SEPTIMA PARTE
     * 
     * Agregar el codigo de onClick de la clase OpenButtonOnClickListener  
     * 
     * 
     * OCTAVA PARTE
     * 
     * Ejecutarlo y esto hara que la aplicacion finalize debido a una excepcion
     * 
     * 
     * Visualizar la excepcion en el LOGCAt y corregirla agregando SecondActivity al manifiest
     * 
     */
    
    @Override
    protected void onCreate(
                    Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            txt_msg = (TextView)findViewById(R.id.txt_msg);
            
            status_message = "Estado: OnCreate";
            txt_msg.setText(status_message);
            Log.e(TAG,status_message);
            
            Button btn_open = (Button)findViewById(R.id.btn_open);
            Button btn_close = (Button)findViewById(R.id.btn_close);
            
            btn_open.setOnClickListener(new OpenButtonOnClickListener());
            btn_close.setOnClickListener(new CloseButtonOnClickListener());
    }
    
    

    @Override
    protected void onDestroy() {
            // TODO Auto-generated method stub
            super.onDestroy();
            
            status_message = "Estado: onDestroy";
            txt_msg.setText(status_message);
            Log.e(TAG,status_message);                
    }



    @Override
    protected void onPause() {
            // TODO Auto-generated method stub
            super.onPause();
            
            status_message = "Estado: onPause";
            txt_msg.setText(status_message);
            Log.e(TAG,status_message);                
    }



    @Override
    protected void onRestart() {
            // TODO Auto-generated method stub
            super.onRestart();
            
            status_message = "Estado: onPause";
            txt_msg.setText(status_message);
            Log.e(TAG,status_message);                
    }



    @Override
    protected void onResume() {
            // TODO Auto-generated method stub
            super.onResume();
            status_message = "Estado: onResume";
            txt_msg.setText(status_message);
            Log.e(TAG,status_message);                
    }



    @Override
    protected void onStart() {
            // TODO Auto-generated method stub
            super.onStart();
            
            status_message = "Estado: onStart";
            txt_msg.setText(status_message);
            Log.e(TAG,status_message);                        
    }



    @Override
    protected void onStop() {
            // TODO Auto-generated method stub
            super.onStop();
            
            status_message = "Estado: onStop";
            txt_msg.setText(status_message);
            Log.e(TAG,status_message);                        
    }



    @Override
    public boolean onCreateOptionsMenu(
                    Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(
                            R.menu.main, menu);
            return true;
    }

    
    class CloseButtonOnClickListener implements OnClickListener {

        @Override
        public void onClick(View v) {
                finish();
        }
        
    }

    class OpenButtonOnClickListener implements OnClickListener {

        @Override
        public void onClick(View v) {
        	Intent i = new Intent(getApplicationContext(), SecondActivity.class);
            startActivity(i);   
        }
        
    }
    
}
