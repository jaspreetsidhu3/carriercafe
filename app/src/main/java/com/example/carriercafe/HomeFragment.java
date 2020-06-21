package com.example.carriercafe;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
private RecyclerView recyclerView;
private RecyclerView.LayoutManager layoutManager;
SingleRow singleRow;
ArrayList<SingleRow> singleRowArrayList;
RecyclerViewAdapte recyclerViewAdapte;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=view.findViewById(R.id.recyclerview);
        layoutManager=new GridLayoutManager(getContext(),2,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        int image[]={R.drawable.amazon,R.drawable.google,R.drawable.micro,R.drawable.tcs,R.drawable.infosys,R.drawable.hcl,R.drawable.wipro,R.drawable.ibm,R.drawable.tm,R.drawable.oracle,R.drawable.cape};
        String cn[]=getResources().getStringArray(R.array.companies);
        String link[]=getResources().getStringArray(R.array.links);
        singleRowArrayList=new ArrayList<>();
        for(int i=0;i<cn.length;i++){
            singleRow=new SingleRow(cn[i],link[i],image[i]);
            singleRowArrayList.add(singleRow);
        }
        recyclerViewAdapte=new RecyclerViewAdapte(getContext(),singleRowArrayList);
        recyclerView.setAdapter(recyclerViewAdapte);
        return view;
    }
}