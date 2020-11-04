package com.example.carriercafe;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class RecentFragment extends Fragment {
private WebView webView;
public static final String TAG="Test";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_recent, container, false);
        webView=view.findViewById(R.id.gfg);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Toast.makeText(getContext(),"Loading Please Wait ...",Toast.LENGTH_SHORT).show();
        CookieManager.getInstance().setAcceptCookie(true);
        webView.loadUrl("https://www.geeksforgeeks.org/company-interview-corner/");

        return view;
    }



}