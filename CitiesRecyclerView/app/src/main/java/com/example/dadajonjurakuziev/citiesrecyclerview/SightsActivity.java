package com.example.dadajonjurakuziev.citiesrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SightsActivity extends AppCompatActivity {
    private static final String TAG = "SightsActivity";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);
        Log.d(TAG, "onCreate: started SightsActivity.");
    }
}
