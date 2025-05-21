package com.example.fragments_a_b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {

    public FragmentA() {
        // Construtor vazio obrigatório
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a, container, false);

        EditText editText = view.findViewById(R.id.editTextMessage);
        Button btnSend = view.findViewById(R.id.btnSend);

        btnSend.setOnClickListener(v -> {
            String message = editText.getText().toString();

            FragmentB fragmentB = new FragmentB();
            Bundle bundle = new Bundle();
            bundle.putString("message", message);
            fragmentB.setArguments(bundle);

            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragmentB)
                    .commit();
        });

        return view;
    }
}