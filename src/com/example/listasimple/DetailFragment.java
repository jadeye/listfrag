package com.example.listasimple;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater
				.inflate(R.layout.fragment_detail, container, false);
		TextView textNombre = (TextView) view.findViewById(R.id.textNombre);
		
		Bundle args = getArguments();
		
		String nombre = args.getString("nombre");

		textNombre.setText(nombre);
		return view;
	}

	public static DetailFragment newInstance(Bundle extras) {
		DetailFragment fragment = new DetailFragment();
		fragment.setArguments(extras);
		return fragment;
	}
}
