package com.certificate.basic.android.altice.fourday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_comple_text_view);
        String [] animals = {
          "Dog","Cat","Mouse","Human"
        };

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(new ArrayAdapter<>(this
                ,android.R.layout.simple_list_item_1
                ,animals));
        autoCompleteTextView.setThreshold(1);

        //Get Data
        Intent intent = getIntent();
        if(intent.hasExtra("value1")){

            String value1 = intent.getStringExtra("value1");
            Toast.makeText(this,value1,Toast.LENGTH_SHORT).show();
        }
        //boolean value2 = intent.getBooleanExtra("value2", false);

        if(intent.hasExtra("person")){

            Bundle bundle = intent.getBundleExtra("person");
            autoCompleteTextView.setHint(bundle.getString("name") + " " +
                    bundle.getInt("age"));
        }
    }
}
