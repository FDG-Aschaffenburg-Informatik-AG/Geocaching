package com.example.geocaching;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Bitte klicke auf den Button", Toast.LENGTH_LONG).show();

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNextPage(view);
            }
        });
    }

    private void setNextPage(View view)
    {
        Intent nextPage = new Intent(this, MapViewActivity.class);
        startActivity(nextPage);
    }
}