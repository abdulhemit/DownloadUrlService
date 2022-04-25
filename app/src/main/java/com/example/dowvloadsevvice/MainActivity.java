package com.example.dowvloadsevvice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Download(View view){

        Intent intent = new Intent(this,DownloadService.class);
         startService(intent);
    }
    public void Stop(View view){
        Intent intent = new Intent(this,DownloadService.class);
        stopService(intent);
    }
}