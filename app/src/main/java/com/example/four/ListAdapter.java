package com.example.four;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter<ListItem> {
    private final LayoutInflater inflater;
    private final int layout;
    private final List<ListItem> items;


    public ListAdapter(@NonNull Context context, int resource, List<ListItem> items) {
        super(context, resource, items);
        this.inflater = LayoutInflater.from(context);
        this.layout = resource;
        this.items = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);
        TextView TitleItem = view.findViewById(R.id.TitleItem);
        TextView DescItem = view.findViewById(R.id.DescItem);

        return view;
    }
}
