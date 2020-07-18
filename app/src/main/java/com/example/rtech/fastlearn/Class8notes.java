package com.example.rtech.fastlearn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Class8notes extends AppCompatActivity {
    RecyclerView recyclerView;
    CustomAdepter customAdepter;

    String []urls;
    String[]titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class8notes);

        //Initialize and Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        //Perform ItemSelectListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuitem) {
                switch (menuitem.getItemId()) {
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext()
                                , Live.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                , Class8notes.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.notes:
                        startActivity(new Intent(getApplicationContext()
                                , Classes.class));
                        overridePendingTransition(0, 0);
                        return true;

                }
                return true;
            }
        });

    }






    public void moveTonoth(View view) {
        startActivity(new Intent(getApplicationContext(), pdfView.class));

    }

    public void moveTovith(View view) {
        startActivity(new Intent(getApplicationContext(), Fullview.class));

    }

    public void moveToteth(View view) {
        startActivity(new Intent(getApplicationContext(), Tution_classes.class));

    }

    public void moveTolith(View view) {
        startActivity(new Intent(getApplicationContext(), Live.class));
    }
}
