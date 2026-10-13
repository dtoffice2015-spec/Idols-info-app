package com.example.myfirstapplication;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView imgDetail;
    TextView tvDetailName, tvDetailInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // 1. Top Action Bar me Back Arrow (<) enable karna
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        imgDetail = findViewById(R.id.imgDetail);
        tvDetailName = findViewById(R.id.tvDetailName);
        tvDetailInfo = findViewById(R.id.tvDetailInfo);

        String name = getIntent().getStringExtra("name");
        String info = getIntent().getStringExtra("info");
        int imageRes = getIntent().getIntExtra("imageRes", 0);

        tvDetailName.setText(name);
        tvDetailInfo.setText(info);
        if (imageRes != 0) {
            imgDetail.setImageResource(imageRes);
        }
    }

    // 2. Back Arrow par click hone par Wapas (Back) bhejna
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // Current screen ko close karke main screen par wapas le jayega
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}