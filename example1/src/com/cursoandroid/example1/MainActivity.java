package com.cursoandroid.example1;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	/*
	 * example1
	 * 
	 * OBJETIVOS
	 * (1) DEMOSTRAR COMO SE CREA UNA NUEVA APLICACION A TRAVES DE ECLIPSE.
	 * (2) EXPLORAR EL PROYECTO CREADO Y COMPRENDER SUS ELEMENTOS.
	 * 		clase R. layout, values, res.
	 * (3) EXPLICACION DE LOS METODOS onCreate y onCreateOptionsMenu
	 * (3) PREPARAR EL PROYECTO PARA EJECUTAR COMO PROYECTO DE ANDROID
	 */
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d("DEBUG", "Pasando por onCreate");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		Log.d("DEBUG", "Pasando por onCreateOptionsMenu");
		return true;
	}

}
