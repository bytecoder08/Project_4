package com.bytecoder.project_4;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView detailImage;
    TextView detailName, detailDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailImage = findViewById(R.id.detailImage);
        detailName = findViewById(R.id.detailName);
        detailDescription = findViewById(R.id.detailDescription);

        // Get data from Intent
        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("description");
        int image = getIntent().getIntExtra("image", 0);

        detailImage.setImageResource(image);
        detailName.setText(name);
        detailDescription.setText(description);
    }
}
