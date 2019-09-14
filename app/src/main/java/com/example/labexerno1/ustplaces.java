package com.example.labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ustplaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ustplaces);
    }
public void buttonBack(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void buttonH (View view)
    {
        Intent intent = new Intent(this, Usthospital.class);
        startActivity(intent);

    }
    public void buttonBenavides (View view)
    {
        Intent intent = new Intent(this, benavidesbldg.class);
        startActivity(intent);

    }
    public void buttonRoque (View view)
    {
        Intent intent = new Intent(this, Roque.class);
        startActivity(intent);

    }
    public void buttonMain (View view)
    {
        Intent intent = new Intent(this, Mainbldg.class);
        startActivity(intent);

    }
}
