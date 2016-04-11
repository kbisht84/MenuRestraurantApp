package com.example.kanakb.menurestraurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemsDetailsPage extends AppCompatActivity {

    private Button button;
    TextView textView;
    Spinner spinner;
    String quantity;
    ArrayList<String> list;
    String s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_details_page);

        list=new ArrayList<>();

         s=getIntent().getStringExtra("food_name");
        if(s!=null){
             textView=(TextView)findViewById(R.id.textView);
            textView.setText(s);
        }

         spinner=(Spinner)findViewById(R.id.spinner1);

        list.add(s);





        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                quantity = adapterView.getItemAtPosition(i).toString();
                list.add(quantity);
                addListernerOnButton(list);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }




    private void addListernerOnButton(final ArrayList<String> list ){
     button =(Button)findViewById(R.id.btnAddCart);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent=new Intent(getApplicationContext(),Cart.class);
                myIntent.putStringArrayListExtra("data",list);
//                myIntent.putExtra("food_name", s);
//                myIntent.putExtra("quantity",quantity);
                startActivity(myIntent);

//                Toast.makeText(MyAndroidAppActivity.this,
//                        "OnClickListener : " +
//                                "\nSpinner 1 : " + String.valueOf(spinner1.getSelectedItem()) +
//                                "\nSpinner 2 : " + String.valueOf(spinner2.getSelectedItem()),
//                        Toast.LENGTH_SHORT).show();
            }

        });

    }
}
