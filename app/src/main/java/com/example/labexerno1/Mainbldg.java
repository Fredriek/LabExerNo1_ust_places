package com.example.labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Mainbldg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainbldg);
    }
    public void ust(View view)
    {
        Intent ustIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.theurbanroamer.com/tag/ust-main-building"));
        startActivity(ustIntent);
    }
}
