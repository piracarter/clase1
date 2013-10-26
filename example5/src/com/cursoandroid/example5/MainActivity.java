package com.cursoandroid.example5;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ListView;

import com.cursoandroid.example5.data.customAdapter;
import com.cursoandroid.example5.models.PostData;

public class MainActivity extends ListActivity {

	
	/*
	 * (non-Javadoc)
	 * 
	 * 1. Agregar un nuevo layout llamado linear_row y agregar el resto de los controles.
	 * 
	 * 2. Las cadenas hardcodeadas substituirlas por cadenas definidas en String
	 * 
	 * 3. Agregar el archivo calendar.jpg necesario al proyecto.
	 * 
	 * 4. Crear una nueva clase PostData en un subpaquete com.cursoandroid.example5.models
	 * 
	 * 5. Agregar las propiedades de la clase PosData, agregar el constructor, agregar setters y getters
	 * 
	 * 6. Agregar un nuevo paquete com.cursoandroid.example5.data
	 * 
	 * 7. Agregar un archivo class customAdapter en el paquete data y agregar el codigo de esta clase.
	 *   variables, constructor, sobrecargar getView,
	 * 
	 * 8. Agregar un ListView a activity_main.xml
	 * 
	 * 9. 
	 * 
	 * 
	 * 
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		ArrayList<PostData> news = new ArrayList<PostData>(){
			{
			add(new PostData("31/09/2013","5o Aniversario del Sistema Android", false));
			add(new PostData("01/19/2013","New Version Angry Birds", false));
			}
		};
		
		Log.d("Respuesta", "Pasando por onCreate elementos en news: " + news.size());
		customAdapter adapter = new customAdapter(this, news);
		Log.d("Respuesta", "Pasando por onCreate despues de crear el adapter");
		ListView list = getListView();
		list.setAdapter(adapter);
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
