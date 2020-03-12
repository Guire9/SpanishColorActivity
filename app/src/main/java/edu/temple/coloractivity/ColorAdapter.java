package edu.temple.coloractivity;

import android.content.res.Resources;
import android.widget.BaseAdapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Locale;

public class ColorAdapter extends BaseAdapter {
    private Context context;
    private String[] colors;
  //  private int backColor;
    private LayoutInflater inflater;

    public ColorAdapter(Context context,String[] colors){
        this.context=context;
        this.colors=colors;
        inflater=(LayoutInflater.from(context));
    }
    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position] ;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view =inflater.inflate(R.layout.support_simple_spinner_dropdown_item,null);
        TextView textView = new TextView(context);
        textView.setText(colors[position]);

      /*  Resources res = context.getResources();
        String[] hi = res.getStringArray(R.array.colors);
        textView.setText(hi[position]);
            //    res.getResources().getStringArray(R.array.colors); */

      //  Resources res = context.getResources();
      //  String CurrentLang = res.getConfiguration().locale.getLanguage();
        String CurrentLang = Locale.getDefault().getLanguage();

        if(CurrentLang.equals(Locale.ENGLISH.toString())){
            textView.setBackgroundColor(Color.parseColor(textView.getText().toString()));
        }

       else{
           textView.setBackgroundColor(0xffffffff);
        }
       return textView;
    }
}


