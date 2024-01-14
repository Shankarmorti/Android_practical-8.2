package com.example.practical82;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] countries={"Management","Programming With Python","Mobile Application Development","Emerging Trends in Computer and Information Technolgy","Entrepreneurship Development","Capstone ProjectExecution","\tWeb Based Application Development Using Php"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,countries);
        AutoCompleteTextView actv =(AutoCompleteTextView) findViewById(R.id.ac_Country);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                {
                    Toast.makeText(getApplicationContext(), "selected item" + parent.getSelectedItem(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
