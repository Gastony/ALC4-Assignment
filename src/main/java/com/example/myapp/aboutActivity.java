package com.example.myapp;


import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        this.setTitle("About ALC");
        WebView webview = (WebView) findViewById(R.id.webview);
        WebSettings websettings = webview.getSettings();
        webview.setWebViewClient(new WebViewClient(){
                                     @Override
                                     public void onReceivedSslError(WebView View, SslErrorHandler handler, SslError error){
                                         handler.proceed();
                                     }
                                 }
        );
        websettings.setJavaScriptEnabled(true);

        webview.loadUrl("https://andela.com/alc/​");
    }
}
