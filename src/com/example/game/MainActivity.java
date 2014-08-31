package com.example.game;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends ActionBarActivity {
     WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        web=(WebView) findViewById(R.id.webView);
       
        web.loadUrl("file:///android_asset/index.html");
       
        web.getSettings().setRenderPriority(RenderPriority.HIGH);
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        web.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
       // web.getSettings().setUseWideViewPort(false);
        web.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        web.requestFocusFromTouch();
        web.setWebViewClient(new WebViewClient());
        web.setWebChromeClient(new WebChromeClient());
   
      
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

   
}
