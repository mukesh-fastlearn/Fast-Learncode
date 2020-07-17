package com.example.rtech.fastlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.PdfDocument;

import java.io.File;

public class Fullview extends AppCompatActivity {
    PDFView myPdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullview);

        Intent intent= getIntent();
        String url=intent.getStringExtra("url");

        myPdfView = (PDFView)findViewById(R.id.pdf);



        if (url.equals("https://fast-learn17.000webhostapp.com/Ch%201.pdf")){
            File file = new File(url);
            myPdfView.fromFile(file).load();

        }
    }
}
