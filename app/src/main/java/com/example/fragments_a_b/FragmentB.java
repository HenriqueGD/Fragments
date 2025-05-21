package com.example.fragments_a_b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {

    public FragmentB() {
        // Construtor vazio obrigatório
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b, container, false);

        TextView textView = view.findViewById(R.id.textViewMessage);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String message = bundle.getString("message");
            textView.setText(message);
        }

        return view;
    }
}
