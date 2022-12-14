package com.hfad.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //this bit would be in fragment or second screen?



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflator = getMenuInflater();
        inflator.inflate(R.menu.horoscope_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.itemTest:
                Toast.makeText(this,"Item 1 selected",Toast.LENGTH_LONG);
            case R.id.itemTest2:
                Toast.makeText(this,"Item 2 selected",Toast.LENGTH_LONG);
            case R.id.itemTest3:
                Toast.makeText(this,"Item 3 selected",Toast.LENGTH_LONG);
        }

        return super.onOptionsItemSelected(item);
    }
}