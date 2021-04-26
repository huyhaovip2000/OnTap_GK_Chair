package com.example.gk_ghe_04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Ghe_Adapter extends RecyclerView.Adapter<Ghe_Adapter.ThingViewHolder> {

    private Context context;
    private ArrayList<Ghe> gheArrayList;
    private Ghe_OnClick ghe_onClick;


    public Ghe_Adapter(Context context, ArrayList<Ghe> gheArrayList, Ghe_OnClick ghe_onClick) {
        this.context = context;
        this.gheArrayList = gheArrayList;
        this.ghe_onClick = ghe_onClick;
    }

    @NonNull
    @Override
    public ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_01, parent, false);

        return new ThingViewHolder(view, this);
    }



    @Override
    public int getItemCount() {
        return gheArrayList.size();
    }

    public class ThingViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName_01, tvGia_01, tvSoLuong;
        private ImageView imageView_01;

        Ghe ghe;
        Ghe_Adapter adapter;

        public ThingViewHolder(@NonNull View itemView, Ghe_Adapter ghe_adapter) {
            super(itemView);

            tvName_01 = itemView.findViewById(R.id.tvName_01);
            tvGia_01 = itemView.findViewById(R.id.tvGia_01);
            imageView_01 = itemView.findViewById(R.id.imageView_01);

            this.adapter = ghe_adapter;

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ghe_onClick.itemClick(ghe);
                }
            });



        }
    }


    @Override
    public void onBindViewHolder(@NonNull ThingViewHolder holder, int position) {
            Ghe ghe = gheArrayList.get(position);

            holder.ghe = gheArrayList.get(position);

            holder.tvName_01.setText(ghe.getTvName());
            holder.tvGia_01.setText(ghe.getTvGia()+"");
            holder.imageView_01.setImageResource(ghe.getImageview());





    }
}
