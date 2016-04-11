package com.example.kanakb.menurestraurantapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {


    ArrayList<Food> arrayOfFood = new ArrayList<>();

    /** Declaring an ArrayAdapter to set items to ListView */
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

//        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);

        FoodAdapter adapter = new FoodAdapter(this, arrayOfFood);

//        textView=(TextView)findViewById(R.id.textView2);
//        textViewq=(TextView)findViewById(R.id.textView3);

        listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        Bundle extras = getIntent().getExtras();

        Food newFood=new Food(extras.getString("food_name"),extras.getString("quantity"));

        adapter.add(newFood);

        //String s=getIntent().getStringExtra("food_name_cart");






        //String quantity=getIntent().getStringExtra("quantity");
//        if(extras!=null){
//            listView.ssetText(extras.getString("food_name"));
//
//            textViewq.setText(extras.getString("quantity"));
//
//
//        }

    }


}
