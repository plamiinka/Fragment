package com.example.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private ArrayList<Data> contactList;
    private Context context;

    public ListAdapter(ArrayList<Data> contactList, Context context) {
        this.contactList = contactList;
        this.context = context;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.card_layout, parent, false);

        return new ContactViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        Data contact = contactList.get(position);

        holder.setName(contact.getName());
        holder.setAddress(contact.getAddress());
        holder.setImageResource(contact.getImageResource());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }
    public void addContact(Data contact) {
        contactList.add(0, contact);
        notifyItemChanged(0);
    }
}
