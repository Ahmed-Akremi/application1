package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnInscription = findViewById(R.id.btn_inscription);
        Button btnArticles = findViewById(R.id.btn_articles);

        btnInscription.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InscriptionActivity.class);
            startActivity(intent);
        });

        btnArticles.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ArticlesListActivity.class);
            startActivity(intent);
        });
    }
}