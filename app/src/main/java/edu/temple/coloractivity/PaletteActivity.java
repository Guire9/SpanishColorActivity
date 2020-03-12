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

import java.util.Locale;


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
        Intent intent = new Intent(getApplicationContext(), CanvasActivity.class);
        String CurrentLang = Locale.getDefault().getLanguage();
        if (CurrentLang.equals(Locale.ENGLISH.toString())) {
            int color = Color.parseColor(text);
            intent.putExtra(key, color);
        } else {
            if (text.equals("Blanco")) {
                int color = Color.WHITE;
                intent.putExtra(key, color);
            }
            if (text.equals("Rojo")) {
                int color = Color.RED;
                intent.putExtra(key, color);
            }
            if (text.equals("Azul")) {
                int color = Color.BLUE;
                intent.putExtra(key, color);
            }
            if (text.equals("Verde")) {
                int color = Color.GREEN;
                intent.putExtra(key, color);
            }
            if (text.equals("Amarillo")) {
                int color = Color.YELLOW;
                intent.putExtra(key, color);
            }
            if (text.equals("Verde azulado")) {
                int color = Color.parseColor("Teal");
                intent.putExtra(key, color);
            }
            if (text.equals("Cian")) {
                int color = Color.CYAN;
                intent.putExtra(key, color);
            }
            if (text.equals("Lima")) {
                int color = Color.parseColor("Lime");
                intent.putExtra(key, color);
            }
            if (text.equals("Armada")) {
                int color = Color.parseColor("Navy");
                intent.putExtra(key, color);
            }
            if (text.equals("Púrpura")) {
                int color = Color.parseColor("Purple");
                intent.putExtra(key, color);
            }
            if (text.equals("Plata")) {
                int color = Color.parseColor("Silver");
                intent.putExtra(key, color);
            }
            intent.putExtra("key2", text);
            startActivity(intent);

        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}

