package com.example.carriercafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class CarrierWebView extends AppCompatActivity {
private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrier_web_view);
        webView=findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Toast.makeText(getApplicationContext(),"Loading Please Wait ...",Toast.LENGTH_SHORT).show();
        String url=getIntent().getExtras().getString("intent_key");
        CookieManager.getInstance().setAcceptCookie(true);
        webView.loadUrl(url);
    }
}