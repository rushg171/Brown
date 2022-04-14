package com.plat.brown;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.InputType;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class EPSignUpFragment extends Fragment {
    public static final String ARG_POS = "position";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_e_p_sign_up, container, false);
    }

    @Override
    public void onViewCreated(@Nullable View view, @Nullable Bundle savedInstanceState){
        Bundle args = getArguments();
        EditText editText = view.findViewById(R.id.editTextTextEmailAddress3);
        TextView textView = view.findViewById(R.id.textView);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        if (args.getInt(ARG_POS)==1){
            editText.setInputType(InputType.TYPE_CLASS_PHONE);
            editText.setHint(R.string.phoneHint);
        }
    }
}