package com.example.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class ContactFragment extends DialogFragment implements View.OnClickListener {
    private EditText name;
    private EditText address;
    private EditText image;
    private Button button;
    DialogListener listener;

    public ContactFragment() {
        // Required empty public constructor
    }

    public static ContactFragment newInstance() {
        ContactFragment fragment = new ContactFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        name = view.findViewById(R.id.nameEdit);
        address = view.findViewById(R.id.addressEdit);
        image = view.findViewById(R.id.imageEdit);
        button = view.findViewById(R.id.button);
        button.setOnClickListener(this);

        name.requestFocus();

        getDialog().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listener = (DialogListener)context;
    }

    @Override
    public void onClick(View view) {
        Data contact = new Data(name.getText().toString(), address.getText().toString(), image.getText().toString());

        listener.addDialog(contact);

        dismiss();
    }
}
