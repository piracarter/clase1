package com.cursoandroid.example5.data;

import java.util.ArrayList;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.cursoandroid.example5.R;
import com.cursoandroid.example5.models.PostData;

public class customAdapter extends ArrayAdapter<PostData> {
	ArrayList<PostData> data;
	LayoutInflater inflater;
	
	public customAdapter(Context context, ArrayList<PostData> objects) {
		 super(context, -1, objects);
		 this.data = objects;
		 this.inflater = LayoutInflater.from(context);
		 Log.d("Respuesta", "Pasando Objeto customAdapter creado");
	}
	 
	 @Override
	public View getView(int position, View convertView, ViewGroup parent) {

		 ViewHolder holder;
		 Log.d("Respuesta", "Pasando por getView entrante");
		 PostData current_post = data.get(position);
		 Log.d("Respuesta", "Pasando por getView entrante");
		 if (convertView == null){
			 Log.d("Respuesta", "Pasando por getView convertView == null");
			 convertView = inflater.inflate(R.layout.linear_row, null);
			 holder = new ViewHolder();
             holder.fecha_publicacion = (TextView) convertView.findViewById(R.id.tvFecha_publicacion);
             holder.titulo = (TextView) convertView.findViewById(R.id.tvTitulo);
             holder.leido = (CheckBox) convertView.findViewById(R.id.leido);
             convertView.setTag(holder);
		 } else
		 {
			 Log.d("Respuesta", "Pasando por getView else convertView == null");
			 holder = (ViewHolder)convertView.getTag();
             
		 }
		 
		 holder.fecha_publicacion.setText(current_post.getFecha_publicacion());
         holder.titulo.setText(current_post.getTitulo());
         holder.leido.setChecked(current_post.isLeido());

		 return convertView;
	}
	 
	 private static class ViewHolder {
         public TextView fecha_publicacion;
         public TextView titulo;
         public CheckBox leido;

 }
 
	 
}
