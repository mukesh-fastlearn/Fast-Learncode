package com.example.rtech.fastlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Button;

public class Classes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);


    }



    public void moveTo8th(View view) {
        startActivity(new Intent(getApplicationContext(), Class8.class));

    }

    public void moveTo9th(View view) {
        startActivity(new Intent(getApplicationContext(), Class9.class));

    }

    public void moveTo10th(View view) {
        startActivity(new Intent(getApplicationContext(), Class10.class));

    }

    public void moveTo11th(View view) {
        startActivity(new Intent(getApplicationContext(), class11th.class));

    }

    public void moveTo12th(View view) {
        startActivity(new Intent(getApplicationContext(), Class12.class));

    }

    public void moveTo11thCommerce(View view) {
        startActivity(new Intent(getApplicationContext(), class11commerce.class));

    }

    public void moveTo12thcommerce(View view) {
        startActivity(new Intent(getApplicationContext(), class12commerce.class));

    }
}
