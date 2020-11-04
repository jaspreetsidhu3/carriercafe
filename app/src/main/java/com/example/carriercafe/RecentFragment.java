package com.example.carriercafe;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class RecentFragment extends Fragment {
private TextView textscrap;
public static final String TAG="Test";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_recent, container, false);
        textscrap=view.findViewById(R.id.txtscrap);
        new MyAsyncTask().execute();
//        textscrap.setMovementMethod(new ScrollingMovementMethod());
        return view;
    }
    class MyAsyncTask extends AsyncTask<Void,Void,Void>{
        String words;
        @Override
        protected Void doInBackground(Void... voids) {
            Document document= null;
            try {
                document=Jsoup.connect("https://www.geeksforgeeks.org/10-important-interview-questions/").get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Log.d(TAG, "doInBackground: "+document.getElementById());
            words=document.toString();
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            textscrap.setText(words);
        }
    }
}