package com.example.kanakb.menurestraurantapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {

    TextView textView,textViewq;

    ArrayList<ArrayList<String>> list = new ArrayList<>();

    /** Declaring an ArrayAdapter to set items to ListView */
    ArrayAdapter<ArrayList<String>> adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);

//        textView=(TextView)findViewById(R.id.textView2);
//        textViewq=(TextView)findViewById(R.id.textView3);

        listView=(ListView)findViewById(R.id.list);




        //String s=getIntent().getStringExtra("food_name_cart");
        Bundle extras = getIntent().getExtras();

        list.add(extras.getStringArrayList("data"));
        listView.setAdapter(adapter);



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
