package com.example.four;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MuzeiListRecyclerViewAdapter extends RecyclerView.Adapter<MuzeiListRecyclerViewAdapter.ViewHolder> {

    private final List<MuzeiListItem> muzeiList;
    private final LayoutInflater inflater;

    public MuzeiListRecyclerViewAdapter(Context context, List<MuzeiListItem> userList) {
        this.muzeiList = userList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_muzei_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MuzeiListItem item = muzeiList.get(position);
        holder.muzeiNameItem.setText(item.getTextUserName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Item " + (holder.getAdapterPosition() + 1) + " clicked", Toast.LENGTH_SHORT).show();
                Log.d("myLogs", "Item " + (holder.getAdapterPosition() + 1) + " clicked");
            }
        });
    }

    @Override
    public int getItemCount() {
        return muzeiList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView muzeiNameItem;

        ViewHolder(View view) {
            super(view);
            muzeiNameItem = view.findViewById(R.id.muzeiNameItem);
        }
    }
}
