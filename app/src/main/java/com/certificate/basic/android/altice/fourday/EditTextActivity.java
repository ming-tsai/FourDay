package com.certificate.basic.android.altice.fourday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        myEditText = findViewById(R.id.my_edit_text);
        findViewById(R.id.my_button).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, myEditText.getText(), Toast.LENGTH_SHORT).show();
    }

    public void passData(View view) {
        Intent intent = new Intent(this, AutoCompleteTextViewActivity.class);
        intent.putExtra("value1", "valor 1");
        intent.putExtra("value2", false);

        Bundle bundle = new Bundle();
        bundle.putString("name", "My Name");
        bundle.putInt("age", 21);

        intent.putExtra("person", bundle);
        startActivity(intent);
    }
}
