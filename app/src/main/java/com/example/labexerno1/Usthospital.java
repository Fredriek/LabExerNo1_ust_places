package com.example.labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Usthospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usthospital);
    }

    public void ust(View view)
    {
        Intent ustIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.usthospital.com.ph"));
        startActivity(ustIntent);
    }
}
