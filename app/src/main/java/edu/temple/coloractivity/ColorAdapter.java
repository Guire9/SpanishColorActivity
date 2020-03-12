package edu.temple.coloractivity;

import android.widget.BaseAdapter;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;

public class ColorAdapter extends BaseAdapter {
    private Context context;
    private String[] colors;
    private LayoutInflater inflater;

    public ColorAdapter(Context context, String[] colors) {
        this.context = context;
        this.colors = colors;
        inflater = (LayoutInflater.from(context));
    }
    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        TextView textView = new TextView(context);
        textView.setText(colors[position]);

        String CurrentLang = Locale.getDefault().getLanguage();
        if (CurrentLang.equals(Locale.ENGLISH.toString())) {
            textView.setBackgroundColor(Color.parseColor(textView.getText().toString()));
        } else {
            if (textView.getText().toString().equals("Blanco")) {
                textView.setBackgroundColor(Color.WHITE);
            }
            if (textView.getText().toString().equals("Rojo")) {
                textView.setBackgroundColor(Color.RED);
            }
            if (textView.getText().toString().equals("Azul")) {
                textView.setBackgroundColor(Color.BLUE);
            }
            if (textView.getText().toString().equals("Verde")) {
                textView.setBackgroundColor(Color.GREEN);
            }
            if (textView.getText().toString().equals("Amarillo")) {
                textView.setBackgroundColor(Color.YELLOW);
            }
            if (textView.getText().toString().equals("Verde azulado")) {
                textView.setBackgroundColor(Color.parseColor("Teal"));
            }
            if (textView.getText().toString().equals("Cian")) {
                textView.setBackgroundColor(Color.CYAN);
            }
            if (textView.getText().toString().equals("Lima")) {
                textView.setBackgroundColor(Color.parseColor("Lime"));
            }
            if (textView.getText().toString().equals("Armada")) {
                textView.setBackgroundColor(Color.parseColor("Navy"));
            }

            if (textView.getText().toString().equals("Púrpura")) {
                textView.setBackgroundColor(Color.parseColor("Purple"));
            }
            if (textView.getText().toString().equals("Plata")) {
                textView.setBackgroundColor(Color.parseColor("Silver"));
            }
        }
        return textView;
    }
}