package com.bytecoder.project_4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Founder> founderList;
    FounderAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        founderList = new ArrayList<>();

        founderList.add(new Founder("Mark Zuckerberg", "Co-founder of Facebook", R.drawable.mark));
        founderList.add(new Founder("Elon Musk", "CEO of Tesla and SpaceX", R.drawable.elon));
        founderList.add(new Founder("Bill Gates", "Co-founder of Microsoft", R.drawable.bill));
        founderList.add(new Founder("Steve Jobs", "Co-founder of Apple", R.drawable.steve));

        adapter = new FounderAdapter(this, founderList);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener((AdapterView<?> parent, android.view.View view, int position, long id) -> {
            Founder founder = founderList.get(position);
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("name", founder.name);
            intent.putExtra("description", founder.description);
            intent.putExtra("image", founder.imageResId);
            startActivity(intent);
        });
    }
}
