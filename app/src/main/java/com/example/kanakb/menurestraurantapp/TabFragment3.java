package com.example.kanakb.menurestraurantapp;

/**
 * Created by KANAK#B on 4/7/2016.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TabFragment3 extends Fragment {

    ListView listview;

    String[] food_menu={"Chaat Papri","Cham-Cham","Chana Dal","Chana Masala","Chicken 65"
    };



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.tab_fragment_3, container, false);

          listview = (ListView) v.findViewById(R.id.listview3);


        listview.setAdapter(new ArrayAdapter<>(v.getContext(),
                android.R.layout.simple_list_item_1 , food_menu));


        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        listview = (ListView) view.findViewById(R.id.listview3);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent myIntent = new Intent(getActivity(), ItemsDetailsPage.class);
                myIntent.putExtra("food_name", food_menu[position]);
                startActivity(myIntent);

//                Toast t = Toast.makeText(getActivity(), "Message",
//                        Toast.LENGTH_SHORT);
//                t.show();
            }
        });


    }
}
