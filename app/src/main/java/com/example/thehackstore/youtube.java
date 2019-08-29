package com.example.thehackstore;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class youtube extends AppCompatActivity {

    long queueid;
    DownloadManager dm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

    }

    public void Download_Click(View v)
    {
        dm= (DownloadManager)getSystemService(DOWNLOAD_SERVICE);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse("https://thestore17.000webhostapp.com/youtube.apk"));


        queueid = dm.enqueue(request);
    };

    public void View_Click(View v)
    {
        Intent i= new Intent();
        i.setAction(DownloadManager.ACTION_VIEW_DOWNLOADS);
        startActivity(i);
    };

    public void browser1(View view) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW,Uri.parse("https://thestore17.000webhostapp.com/youtube.apk"));
        startActivity(browserIntent);
    }

    public void browser2(View view) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW,Uri.parse("https://thestore17.000webhostapp.com/microg.apk"));
        startActivity(browserIntent);
    }

}
