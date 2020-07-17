package com.example.rtech.fastlearn;

import android.graphics.Bitmap;
import android.webkit.WebView;

interface myWebClient {
    void onPageStarted(WebView view, String url, Bitmap favicon);

    boolean shouldOverrideUrlLoding(WebView view, String url);
}
