package com.cursoandroid.example4;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	/*
	 * (non-Javadoc)
	 * 
	 * OBJETIVOS.
	 * 
	 * 1. Agregar un nuevo archivo: activity_list_view_android_example y agregar el codigo correspondiente a ListView
	 * 
	 * 2. Agregar una clase nueva: ListViewAndroidExample que extienda a Activity y agregar el codigo correspondiente a la clase
	 * 
	 * 3. Agregar ListViewAndroidExample como Activity al manifiest y cambiar el Activity de arranque.
	 * 
	 * 
	 * NOTAS
	 * 
	 * Otros layouts aparte de: android.R.layout.simple_list_item_1
	 * http://developer.android.com/reference/android/R.layout.html#simple_list_item_1
	 * 
	 * 
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
