package com.example.game;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@SuppressLint("SetJavaScriptEnabled")
public class MainActivity extends ActionBarActivity {
	WebView web;

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		web = (WebView) findViewById(R.id.webView);

		web.loadUrl("file:///android_asset/index.html");

		web.getSettings().setRenderPriority(RenderPriority.HIGH);
		web.getSettings().setJavaScriptEnabled(true);
		web.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
		web.getSettings().setLayoutAlgorithm(
				WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
		// web.getSettings().setUseWideViewPort(false);
		web.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
		web.requestFocusFromTouch();
		web.setWebViewClient(new WebViewClient());
		web.setWebChromeClient(new WebChromeClient());

	}

}
