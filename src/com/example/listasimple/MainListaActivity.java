package com.example.listasimple;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class MainListaActivity extends FragmentActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainfragment);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_lista, menu);
		return true;
	}

}
