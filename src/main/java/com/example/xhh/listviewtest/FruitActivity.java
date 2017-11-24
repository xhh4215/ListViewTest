package com.example.xhh.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FruitActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        initFruit();
        listView = (ListView) findViewById(R.id.listid);
        MyArrayAdapter adapter = new MyArrayAdapter(FruitActivity.this, R.layout.item_layout, fruitList);
        listView.setAdapter(adapter);
    }

    private void initFruit() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("apple", "xiaohei like eat apple");
            fruitList.add(apple);
            Fruit Banana = new Fruit("Banana", "xiaohei like eat Banana");
            fruitList.add(Banana);
            Fruit Orange = new Fruit("Orange", "xiaohei like eat Orange");
            fruitList.add(Orange);
            Fruit Watermelon = new Fruit("Watermelon", "xiaohei like eat Watermelon");
            fruitList.add(Watermelon);
            Fruit Pear = new Fruit("Pear", "xiaohei like eat Pear");
            fruitList.add(Pear);
        }
    }
}
