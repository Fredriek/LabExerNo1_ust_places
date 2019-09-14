package com.example.labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Roque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roque);
    }
    public void ust(View view)
    {
        Intent ustIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://foursquare.com/v/roque-rua%C3%B1o-building/4d4ede8a9d662d43d6a94b00"));
        startActivity(ustIntent);
    }
}
