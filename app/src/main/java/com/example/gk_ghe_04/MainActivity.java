package com.example.gk_ghe_04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Ghe_OnClick {
    private RecyclerView rcv_Ghe;
    private ArrayList<Ghe> gheArrayList;
    private Ghe_Adapter adapter;
    Ghe ghe;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_Ghe = findViewById(R.id.rcv_ghe_main01);

        gheArrayList = new ArrayList<>();
        gheArrayList.add(new Ghe("Ghe 01", 10, R.drawable.images1, 1));
        gheArrayList.add(new Ghe("Ghe 02", 20, R.drawable.images2, 1));
        gheArrayList.add(new Ghe("Ghe 03", 30, R.drawable.images3, 1));
        gheArrayList.add(new Ghe("Ghe 04", 40, R.drawable.images4, 1));

        adapter = new Ghe_Adapter(this, gheArrayList, this);
        rcv_Ghe.setAdapter(adapter);
        rcv_Ghe.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rcv_Ghe.setLayoutManager(gridLayoutManager);



    }

    @Override
    public void itemClick(Ghe ghe) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("key1", ghe);
        startActivity(intent);


    }
}