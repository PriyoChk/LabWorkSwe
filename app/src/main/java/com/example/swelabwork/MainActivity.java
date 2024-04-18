package com.example.swelabwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
     static  int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        count++;
        if(count%4==3)
        {
            textView.setText("Tamal");
        }
    }
});

    }
}