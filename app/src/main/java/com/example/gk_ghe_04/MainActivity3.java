package com.example.gk_ghe_04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    private RecyclerView rcv_main03;
    private ArrayList<Ghe> gheArrayList;
    private Ao_Adapter_03 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        rcv_main03 = findViewById(R.id.rcv_Ghe_main_03);

        adapter = new Ao_Adapter_03(this, MainActivity2.ghes);
        rcv_main03.setAdapter(adapter);
        rcv_main03.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));



    }
}