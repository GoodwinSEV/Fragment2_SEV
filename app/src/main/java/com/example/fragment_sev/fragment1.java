package com.example.fragment_sev;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment1 extends Fragment implements View.OnClickListener{

    Button button1, button2, button3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment1, container, false);
        return rootView;

        Button button1 = (Button)rootView.findViewById(R.id.button1);
        Button button2 = (Button)rootView.findViewById(R.id.button2);
        Button button3 = (Button)rootView.findViewById(R.id.button3);

        button1.setOnClickListener(this::onClick);
        button2.setOnClickListener(this::onClick);
        button3.setOnClickListener(this::onClick);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                Toast.LENGTH_SHORT).show();
    }
}

