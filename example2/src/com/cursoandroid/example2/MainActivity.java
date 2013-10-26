package com.cursoandroid.example2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    private final static String TAG = "Debug";
	
    /*
     * OBJETIVOS 
     * 
     * (1) EXPLICAR LOS DIVERSOS LAYOUTS
     * (2) EXPLICAR LAS NUEVAS PROPIEDADES DEL ACTIVITY_MAIN.XML
     * (3) EXPLICAR EL SISTEMA DE LOGS.
     * (4) EXPLICAR BREVEMENTE EL TOAST
     * (5) EXPLICAR EL ARCHIVO STRING.XML
     */
    
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btn_submit = (Button) findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new OnClickListener() {
                
                @Override
                public void onClick(View v) {
                        Log.d(TAG, "hizo click");
                        Toast.makeText(getApplicationContext(),
                                                 "hizo click",
                                                 Toast.LENGTH_SHORT).show();
                        
                }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
