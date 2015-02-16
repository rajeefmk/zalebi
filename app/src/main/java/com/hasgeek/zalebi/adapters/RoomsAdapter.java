package com.hasgeek.zalebi.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hasgeek.zalebi.R;
import com.hasgeek.zalebi.api.model.Room;

import java.util.List;

/**
 * Created by karthik on 30-12-2014.
 */
public class RoomsAdapter extends RecyclerView.Adapter<RoomsAdapter.ListItemViewHolder> {
    private final Context context;
    private final List<Room> rooms;

    public RoomsAdapter(Context context, List<Room> rooms) {
        this.context = context;
        this.rooms = rooms;
    }

    @Override
    public ListItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.fragment_space_room_list_row,
                        viewGroup,
                        false);

        return new ListItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ListItemViewHolder viewHolder, int position) {
        Room r = rooms.get(position);
        viewHolder.title.setText(r.getTitle());
        viewHolder.description.setText(r.getDescription());

    }

    @Override
    public int getItemCount() {
        return rooms.size();
    }

    public final static class ListItemViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView description;

        public ListItemViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.fragment_space_room_list_row_title);
            description = (TextView) itemView.findViewById(R.id.fragment_space_room_list_row_description);
        }
    }

}
