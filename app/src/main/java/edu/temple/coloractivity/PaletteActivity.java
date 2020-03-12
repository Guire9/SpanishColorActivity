package edu.temple.coloractivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class PaletteActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    RelativeLayout relativeLayout;
    String text;
    String key;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        String[] colors = res.getStringArray(R.array.colors);
       Spinner spinner = findViewById(R.id.spinner);
        ColorAdapter adapter1 = new ColorAdapter(this,colors);
        spinner.setAdapter(adapter1);
        spinner.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        view.setBackgroundColor(0xffffffff);
        text = parent.getItemAtPosition(position).toString();
        Intent intent = new Intent(getApplicationContext(),CanvasActivity.class);
//        int color = Color.parseColor(text);
 //       intent.putExtra(key,color);
        intent.putExtra("key2",text);
        startActivity(intent);

    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}

