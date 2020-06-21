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

    public RecyclerViewAdapte(Context context, ArrayList<SingleRow> singleRows) {
        this.context = context;
        this.singleRows = singleRows;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.singlerow, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
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

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textcompanyname;
        ImageView imagecompany;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textcompanyname = itemView.findViewById(R.id.companyname);
            imagecompany = itemView.findViewById(R.id.imageview);
            imagecompany.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            String link[] = context.getResources().getStringArray(R.array.links);
            if (getLayoutPosition() == 0) {
                Toast.makeText(context, "" + link[0], Toast.LENGTH_SHORT).show();
            }
            if (getLayoutPosition() == 1) {
                Toast.makeText(context, "" + link[1], Toast.LENGTH_SHORT).show();
            }
            if (getLayoutPosition() == 2) {
                Toast.makeText(context, "" + link[2], Toast.LENGTH_SHORT).show();
            }
            if (getLayoutPosition() == 3) {
                Toast.makeText(context, "" + link[3], Toast.LENGTH_SHORT).show();
            }
            if (getLayoutPosition() == 4) {
                Toast.makeText(context, "" + link[4], Toast.LENGTH_SHORT).show();
            }
            if (getLayoutPosition() == 5) {
                Toast.makeText(context, "" + link[5], Toast.LENGTH_SHORT).show();
            }
            if (getLayoutPosition() == 6) {
                Toast.makeText(context, "" + link[6], Toast.LENGTH_SHORT).show();
            }
            if (getLayoutPosition() == 7) {
                Toast.makeText(context, "" + link[7], Toast.LENGTH_SHORT).show();
            }
            if (getLayoutPosition() == 8) {
                Toast.makeText(context, "" + link[8], Toast.LENGTH_SHORT).show();
            }
            if (getLayoutPosition() == 9) {
                Toast.makeText(context, "" + link[9], Toast.LENGTH_SHORT).show();
            }
            if (getLayoutPosition() == 10) {
                Toast.makeText(context, "" + link[10], Toast.LENGTH_SHORT).show();
            }
        }
    }
}
