package com.example.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView textView;
    private TextView textView2;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        textView = itemView.findViewById(R.id.textView);
        textView2 = itemView.findViewById(R.id.textView2);
    }

    public void setImageResource(String url) {
        Picasso.get().load(url).error(R.drawable.ic_face).into(imageView);
    }

    public void setName(String name) {
        this.textView.setText(name);
    }

    public void setAddress(String address) {
        this.textView2.setText(address);
    }
}
