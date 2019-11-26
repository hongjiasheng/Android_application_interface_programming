package com.example.hongjs.arrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceID;
    public FruitAdapter(Context context, int id, List<Fruit> objects){
        super(context,id,objects);
        resourceID = id ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceID,parent,false);
        ImageView imageView = view.findViewById(R.id.fruit_image);
        CheckedTextView textView = view.findViewById(R.id.fruit_name);
        imageView.setImageResource(fruit.getImageId());
        textView.setText(fruit.getName());
        return view;
    }


}
