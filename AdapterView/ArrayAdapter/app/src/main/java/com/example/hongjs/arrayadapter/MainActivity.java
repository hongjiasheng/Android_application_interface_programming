package com.example.hongjs.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> FruitList = new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruitList();
        ListView listView = findViewById(R.id.list_view);
        FruitAdapter arrayAdapter = new FruitAdapter(this,R.layout.layout,FruitList);
        listView.setAdapter(arrayAdapter);



    }

    private void initFruitList(){
        FruitList.add(new Fruit(getString(R.string.Apple),R.drawable.apple_pic));
        FruitList.add(new Fruit(getString(R.string.Banana),R.drawable.banana_pic));
        FruitList.add(new Fruit(getString(R.string.Orange),R.drawable.orange_pic));
        FruitList.add(new Fruit(getString(R.string.Watermelon),R.drawable.watermelon_pic));
        FruitList.add(new Fruit(getString(R.string.Pear),R.drawable.pear_pic));
        FruitList.add(new Fruit(getString(R.string.Grape),R.drawable.grape_pic));
        FruitList.add(new Fruit(getString(R.string.Pineapple),R.drawable.pineapple_pic));
        FruitList.add(new Fruit(getString(R.string.Strawberry),R.drawable.strawberry_pic));
        FruitList.add(new Fruit(getString(R.string.Cherry),R.drawable.cherry_pic));
        FruitList.add(new Fruit(getString(R.string.Mango),R.drawable.mango_pic));
    }
}
