package com.example.gk_ghe_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvName_02, tvGia_02, tvSoLuong;
    private ImageView imageView_02;
    private ImageButton imageButton_Minus_02, imageButton_Add_02;
    private Button btn_add;

    Ghe ghe;

    static ArrayList<Ghe> ghes;
    static {
        ghes = new ArrayList<>();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvName_02 = findViewById(R.id.tvName_02);
        tvGia_02 = findViewById(R.id.tvGia_02);
        tvSoLuong = findViewById(R.id.tvSoLuong_02);
        imageView_02 = findViewById(R.id.imageView_02);

        imageButton_Add_02 = findViewById(R.id.imageButton_Add_02);
        imageButton_Minus_02 = findViewById(R.id.imageButton_Minus_02);


        btn_add = findViewById(R.id.btn_Add);

        Intent intent = getIntent();
        if(intent !=  null){
            ghe = (Ghe) intent.getSerializableExtra("key1");
            tvName_02.setText(ghe.getTvName());
            tvGia_02.setText(ghe.getTvGia()+"");
            imageView_02.setImageResource(ghe.getImageview());


        }

        imageButton_Add_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soLuong = Integer.parseInt(tvSoLuong.getText().toString());
                soLuong++;
                tvSoLuong.setText(soLuong+"");
                ghe.setTvSoluong(soLuong);

            }
        });


        imageButton_Minus_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soLuong = Integer.parseInt(tvSoLuong.getText().toString());
               if(soLuong > 1){
                   soLuong--;
                   tvSoLuong.setText(soLuong+"");
                   ghe.setTvSoluong(soLuong);
               }


            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity3.class);
                ghes.add(ghe);
                startActivity(intent1);
            }
        });





    }
}