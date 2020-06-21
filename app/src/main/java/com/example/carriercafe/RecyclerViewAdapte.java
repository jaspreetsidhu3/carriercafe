package com.example.carriercafe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapte extends RecyclerView.Adapter<RecyclerViewAdapte.MyViewHolder> {
    Context context;
    ArrayList<SingleRow> singleRows;
    OnCustomClick onCustomClick;

    public RecyclerViewAdapte(Context context, ArrayList<SingleRow> singleRows,OnCustomClick onCustomClick) {
        this.context = context;
        this.singleRows = singleRows;
        this.onCustomClick=onCustomClick;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.singlerow, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view,onCustomClick);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SingleRow singleRow = singleRows.get(position);
        holder.textcompanyname.setText(singleRow.getCompany());
        holder.imagecompany.setImageResource(singleRow.getImage());
    }

    @Override
    public int getItemCount() {
        return singleRows.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textcompanyname;
        ImageView imagecompany;
        OnCustomClick onCustomClick;
        public MyViewHolder(@NonNull View itemView,OnCustomClick onCustomClick) {
            super(itemView);
            this.onCustomClick=onCustomClick;
            textcompanyname = itemView.findViewById(R.id.companyname);
            imagecompany = itemView.findViewById(R.id.imageview);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            onCustomClick.oncustomclick(getAdapterPosition());
        }
    }
    public interface OnCustomClick{
        public void oncustomclick(int position);


    }
}
