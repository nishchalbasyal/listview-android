package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
ListView listView;
String[] arr = {"Apple","Ball","Cat","Dog","Elephant","Munna","Monk","Tunna","Juni","Funna","Conet","Baburam","Zillat","Kumsu","Faku"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        //using builtin Array Adapter
        // ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
       // listView.setAdapter(ad);

        NishchalAdapter ad = new NishchalAdapter(this,R.layout.my_nishchal_layout,arr);
        listView.setAdapter(ad);

        //this is for inbuilt Listview
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "You Clicked On This"+i, Toast.LENGTH_SHORT).show();
//            }
//        });



    }
}