package com.example.god_tm.final_application_implementation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Learn_Multplatform_Programming_BG : AppCompatActivity() {

    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn__multplatform__programming__bg)
        webView = findViewById(R.id.mp_bg_webview)
        webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = MyWebViewClient()
        webView.loadUrl("https://kotlinlang.org/docs/reference/building-mpp-with-gradle.html")
    }

    override fun onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack()
        }
        else{
            super.onBackPressed()
        }
    }
}