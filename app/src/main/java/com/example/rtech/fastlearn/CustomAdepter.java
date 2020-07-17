package com.example.rtech.fastlearn;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.LinearLayout;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdepter extends RecyclerView.Adapter<CustomAdepter.CustomHolder>
{
    public CustomAdepter(Context context, String[] titles, String[] urlLinks) {
        this.context = context;
        this.titles = titles;
        this.urlLinks = urlLinks;
    }

    Context context;
    String []titles;
    String []urlLinks;

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.list_items, viewGroup,false );

        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CustomHolder customHolder, int i)
    {

        String title2= titles[i];
        final String urls=urlLinks[i];

        customHolder.textView.setText(title2);
        customHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,Fullview.class);
                intent.putExtra("url",urls);
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    class CustomHolder extends RecyclerView.ViewHolder {

        TextView textView;
        LinearLayout linearLayout;

        public CustomHolder(@NonNull View itemView) {
            super(itemView);
            textView=(TextView) itemView.findViewById(R.id.title1);
            linearLayout=(LinearLayout)itemView.findViewById(R.id.Liner);
        }
    }
}
