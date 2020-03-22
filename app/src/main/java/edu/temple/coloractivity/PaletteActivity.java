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

public class PaletteActivity extends AppCompatActivity implements PaletteFragment.ColorSelectedInterface {
    PaletteFragment f1;
    CanvasFragment f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1 = new PaletteFragment();
        f2 = new CanvasFragment();


        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container1,f1)
                .add(R.id.container2, f2)
                .addToBackStack(null)
                .commit();

    }
    @Override
    public void ColorSelected(String c) {
        int x= makeColor(c);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container2, f2)
                .addToBackStack(null)
                .commit();
        f2.changeColor2(x);
    }
    public int makeColor(String c){
        if (c.equals("Blanco")) {
            int x= Color.WHITE;
            return x;
        }else if (c.equals("Rojo")) {
            int x= Color.RED;
            return x;
        } else if (c.equals("Azul")) {
            int x= Color.BLUE;
            return x;
        }else if (c.equals("Verde")) {
            int x= Color.GREEN;
            return x;
        } else if (c.equals("Amarillo")) {
            int x= Color.YELLOW;
            return x;
        }else if (c.equals("Verde azulado")) {
            int x= Color.parseColor("Teal");
            return x;
        }else if (c.equals("Cian")) {
            int x= Color.CYAN;
            return x;
        }else if (c.equals("Lima")) {
            int x= Color.parseColor("Lime");
            return x;
        }else if (c.equals("Armada")) {
            int x= Color.parseColor("Navy");
            return x;
        }else if (c.equals("Púrpura")) {
            int x= Color.parseColor("Purple");
            return x;
        }else if (c.equals("Plata")) {
            int x= Color.parseColor("Silver");
            return x;
        }else{
            int x=Color.parseColor(c);
            return  x;
        }

    }
}
