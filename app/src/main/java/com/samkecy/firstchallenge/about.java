package com.samkecy.firstchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.lang.reflect.Method;

public class about extends AppCompatActivity {



    // Declares global varaibles

    WebView webview;
    private ProgressDialog progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);




        webview = (WebView)findViewById(R.id.webViewAlc);

        //get web settings

        final WebSettings settings = webview.getSettings();

        // set this javascript containing site

        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);

        settings.setLoadWithOverviewMode(true);


        settings.setSupportZoom(true);

        settings.setDisplayZoomControls(false);
        settings.setAppCacheEnabled(true);
        settings.setLoadsImagesAutomatically(true);





        settings.setDomStorageEnabled(true);

        webview.setScrollbarFadingEnabled(false);
        webview.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        progressBar = ProgressDialog.show(about.this, "Please Wait ", "While Content is Loading...");
        webview.loadUrl("https://andela.com/alc/");

        webview.setWebViewClient(new WebViewClient() {


            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon)
            {
                progressBar.show();
            }


            @Override
            public void onPageFinished(WebView view, String url) {
                progressBar.dismiss();



            }
        });


    }



    }

