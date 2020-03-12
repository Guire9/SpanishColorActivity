package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    TextView tv;
    String key;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        constraintLayout = findViewById(R.id.activity2);

        Intent intent = getIntent();
        int color = intent.getIntExtra(key,0);
        constraintLayout.setBackgroundColor(color);

        String text = intent.getStringExtra("key2");
        tv=findViewById(R.id.textView2);
        tv.setText(text);

    }
}
