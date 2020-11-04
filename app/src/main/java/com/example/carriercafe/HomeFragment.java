package com.example.carriercafe;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment implements RecyclerViewAdapte.OnCustomClick {
private RecyclerView recyclerView;
private RecyclerView.LayoutManager layoutManager;
SingleRow singleRow;
ArrayList<SingleRow> singleRowArrayList;
    String cn[];
    String link[];
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
        cn=getResources().getStringArray(R.array.companies);
        link=getResources().getStringArray(R.array.links);
        singleRowArrayList=new ArrayList<>();
        for(int i=0;i<cn.length;i++){
            singleRow=new SingleRow(cn[i],link[i],image[i]);
            singleRowArrayList.add(singleRow);
        }
        recyclerViewAdapte=new RecyclerViewAdapte(getContext(),singleRowArrayList,this);
        recyclerView.setAdapter(recyclerViewAdapte);
        return view;
    }

    @Override
    public void oncustomclick(int position) {
        Intent intent=new Intent(getContext(),CarrierWebView.class);
        intent.putExtra("intent_key",link[position]);
        startActivity(intent);
    }

}