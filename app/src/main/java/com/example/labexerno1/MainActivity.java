package com.example.labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void buttonOne(View view)
{
    Intent intent = new Intent(this, ustplaces.class);
    startActivity(intent);

}
    public void ust(View view)
    {
        Intent ustIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ust.edu.ph/"));
        startActivity(ustIntent);
    }

}
