package com.es.babelstore.ejemplos.gastos;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button btnIngreGas;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnIngreGas = (Button)findViewById(R.id.btnIngreGas);
		btnIngreGas.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		Intent intent = new Intent();
        		// Leemos lo que se ha introducido en la caja de texto
        		intent.setClass(getApplicationContext(), IngresoGasActivity.class);
        		startActivity(intent);
        	}
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
