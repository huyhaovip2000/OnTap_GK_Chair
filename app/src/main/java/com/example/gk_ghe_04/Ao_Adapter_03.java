package com.example.gk_ghe_04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Ao_Adapter_03 extends RecyclerView.Adapter<Ao_Adapter_03.ThingViewHolder> {
    private Context context;
    private ArrayList<Ghe> gheArrayList;
    Ghe ghe;

    public Ao_Adapter_03(Context context, ArrayList<Ghe> gheArrayList) {
        this.context = context;
        this.gheArrayList = gheArrayList;
    }

    @NonNull
    @Override
    public Ao_Adapter_03.ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout03, parent, false);

        return new ThingViewHolder(view, this);
    }



    @Override
    public int getItemCount() {
        return gheArrayList.size();
    }

    public class ThingViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName_03, tvGia_03, tvSoLuong;
        private ImageView imageView_03;
        private ImageButton imageButton_Minus_03, getImageButton_Add_03;

        public ThingViewHolder(@NonNull View itemView, Ao_Adapter_03 ao_adapter_03) {
            super(itemView);
            tvName_03 = itemView.findViewById(R.id.tvName_03);
            tvGia_03 = itemView.findViewById(R.id.tvGia_03);
            tvSoLuong = itemView.findViewById(R.id.tvSoLuong_03);
            imageView_03 = itemView.findViewById(R.id.imageView_03);


        }
    }


    @Override
    public void onBindViewHolder(@NonNull Ao_Adapter_03.ThingViewHolder holder, int position) {

        Ghe ghe = gheArrayList.get(position);

        holder.tvName_03.setText(ghe.getTvName());
        holder.tvGia_03.setText(ghe.getTvGia()+"");
        holder.imageView_03.setImageResource(ghe.getImageview());

    }
}
