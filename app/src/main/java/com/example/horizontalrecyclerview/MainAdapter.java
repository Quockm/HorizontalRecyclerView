package com.example.horizontalrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    ArrayList<Monan> monans;
    Context context;

    public MainAdapter(Context context, ArrayList<Monan> monans) {
        this.context = context;
        this.monans = monans;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //create View
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //set hinh vao imageview
        holder.tenhinh.setImageResource(monans.get(position).getHinnhmonan());
        //set ten vao textview
        holder.tenmon.setText(monans.get(position).getTenmonan());
        holder.diachi.setText(monans.get(position).getDiachi());
        holder.khuyenmai.setText(monans.get(position).getKhuyenmai());

    }

    @Override
    public int getItemCount() {
        return monans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //Initialize Variables
        ImageView tenhinh;
        TextView tenmon, diachi, khuyenmai;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Assign Variables
            tenhinh = itemView.findViewById(R.id.imageViewMonAn);
            tenmon = itemView.findViewById(R.id.textViewTenMonAn);
            diachi = itemView.findViewById(R.id.textViewDiaChiMonAn);
            khuyenmai = itemView.findViewById(R.id.textviewkhuyenmai);
        }
    }
}
