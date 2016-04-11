package com.example.kanakb.menurestraurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] food_menu={"Biryani",
            "Alu Gobi","Alu Matar","Barfi","Beef Vindaloo","Butter Chicken","Carrot Halwa","Chaat Papri","Cham-Cham","Chana Dal","Chana Masala","Chicken 65"
    };

    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < food_menu.length; ++i) {
            list.add(food_menu[i]);
        }

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, list);
        autoCompleteTextView.setAdapter(adapter);

        //autoCompleteTextView.setAdapter(new ArrayAdapter<>(this,R.layout.list_detail,food_menu));



    }

    @Override
    public void onResume() {

        super.onResume();
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);



        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent myIntent = new Intent(getApplicationContext(), ItemsDetailsPage.class);
                myIntent.removeCategory("String[]");
                myIntent.putExtra("String", food_menu[position]);
                startActivity(myIntent);

            }
        });
    }

    public void showList(View view){
        Intent myIntent = new Intent(this, MenuListActivity.class);
        startActivity(myIntent);
    }


}
