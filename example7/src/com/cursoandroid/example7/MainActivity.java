package com.cursoandroid.example7;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	private MenuItem itemUp, itemDown;
	private boolean flag = true;
	private boolean flag2 = true;
	private Button b,c,d,e;
	/*
	 * (non-Javadoc)
	 * 
	 * (1) Crear la app basica que muestre los menos y probar.
	 * (2) Agregar el metodo onOptionsItemSelected
	 * (3) Configurar para que se utilize http://actionbarsherlock.com
	 * (4) Regresar el codigo sin la compatibilidad de actionbarsherlock
	 * (5) Agregar un boton a activity_main, cambiar su texto con String
	 * (6) Agregar el codigo correspondiente para desactivar el boton 
	 * (7) Agregar el codigo para ocultar la barra de accion
	 * (8) Agregar el codigo para cambiar el texto de la barra de accion
	 * (9) Agregar el codigo para poner un fondo en el ActionBar
	 * (10) Agregar el codigo para atenuar los botones de navegacion
	 * 
	 */
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b = (Button) findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
				if (flag)
					b.setText("Enable");
				else
					b.setText("Disable");
				
				flag = !flag;
				itemUp.setEnabled(flag);
			}
			
		});
		c = (Button) findViewById(R.id.btn_accion2);
		c.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View arg0) {
				ActionBar actionbar = getActionBar();
				if (flag2)
					c.setText("Show ActionBar");
				else
					c.setText("Hide ActionBar");
				
				flag2 = !flag2;
				if (flag2)
					actionbar.show();
				else
					actionbar.hide();
			} 
			
			
		});
		d = (Button) findViewById(R.id.btn_accion3);
		d.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {
				ActionBar actionBar = getActionBar();
				actionBar.setSubtitle("mytest");
				actionBar.setTitle("vogella.com");
				actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_launcher));
				 
			} 
			
		});
		e = (Button) findViewById(R.id.btn_accion4);
		e.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {
				Log.d("Respuesta", "Pasando por click boton e");
				getWindow().
				  getDecorView().
				  setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
			} 
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		itemUp = menu.getItem(1);
		itemDown = menu.getItem(2);
		return true;
	}
	@Override
	 public boolean onOptionsItemSelected(MenuItem item) {
	  
	  switch(item.getItemId()){
	  case R.id.action_settings:
	   Toast.makeText(getApplicationContext(), 
	     "Setting...", 
	     Toast.LENGTH_SHORT).show();
	   break;
	  case R.id.action_up:
	   Toast.makeText(getApplicationContext(), 
	     "Up...", 
	     Toast.LENGTH_SHORT).show();
	   break;
	  case R.id.action_down:
	   Toast.makeText(getApplicationContext(), 
	     "Down...", 
	     Toast.LENGTH_SHORT).show();
	   break;
	  case R.id.action_other:
	   Toast.makeText(getApplicationContext(), 
	     "Other...", 
	     Toast.LENGTH_SHORT).show();
	   break;
	  default:
	   Toast.makeText(getApplicationContext(), 
	     "Unknown...", 
	     Toast.LENGTH_SHORT).show();
	   break;
	  }
	  
	  //Return false to allow normal menu processing to proceed, 
	  //true to consume it here.
	  return false;
	 }
}
