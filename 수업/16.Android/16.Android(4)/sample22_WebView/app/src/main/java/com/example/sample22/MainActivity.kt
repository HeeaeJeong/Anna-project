package com.example.sample22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)

        // 1. url
        // webView.loadUrl("https://m.naver.com")

        // 2. 태그 호출
        // val html = "<html><head><meta charset=\"UTF-8\"></head><body>Hello World! 안녕하세요!</body></html>"
        // webView.loadData(html, "text/html", "UTF-8")

        // 3. html 문서 호출
        webView.loadUrl("file:///android_asset/hello.html")

        webView.settings.javaScriptEnabled = true

        webView.webChromeClient = WebChromeClient()
    }
}