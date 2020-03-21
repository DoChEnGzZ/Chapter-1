package com.bytedance.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1=findViewById(R.id.button1);
        final TextView tv1=findViewById(R.id.HW);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("!dlrow olleh");
                Log.d("MainActivity","text has been reversed");
            }
        });
        Log.d(TAG, "MainActivity");
    }
}
