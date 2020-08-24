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

public class MainAdapter1 extends RecyclerView.Adapter<MainAdapter1.ViewHolder> {
    ArrayList<Monan1> monans1;
    Context context1;

    public MainAdapter1(Context context, ArrayList<Monan1> monans1) {
        this.context1 = context1;
        this.monans1 = monans1;
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
        holder.tenhinh1.setImageResource(monans1.get(position).getHinnhmonan1());
        //set ten vao textview
        holder.tenmon1.setText(monans1.get(position).getTenmonan1());
        holder.diachi1.setText(monans1.get(position).getDiachi1());
        holder.khuyenmai1.setText(monans1.get(position).getKhuyenmai1());

    }

    @Override
    public int getItemCount() {
        return monans1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //Initialize Variables
        ImageView tenhinh1;
        TextView tenmon1, diachi1, khuyenmai1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Assign Variables
            tenhinh1 = itemView.findViewById(R.id.imageViewMonAn);
            tenmon1 = itemView.findViewById(R.id.textViewTenMonAn);
            diachi1 = itemView.findViewById(R.id.textViewDiaChiMonAn);
            khuyenmai1 = itemView.findViewById(R.id.textviewkhuyenmai);
        }
    }
}
