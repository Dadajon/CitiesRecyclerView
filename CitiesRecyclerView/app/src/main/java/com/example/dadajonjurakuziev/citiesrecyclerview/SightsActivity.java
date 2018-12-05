package com.example.dadajonjurakuziev.citiesrecyclerview;

import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class SightsActivity extends AppCompatActivity {
    private static final String TAG = "SightsActivity";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);
        Log.d(TAG, "onCreate: started SightsActivity.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            Log.d(TAG, "getIncomingIntent: found intent extras.");
            String cityTitle = bundle.getString("sights_city_title");
            setImage(cityTitle);
        }
    }

    private void setImage(String cityTitle){
        Log.d(TAG, "setImage: setting image and name to widgets.");
        TextView cTitle = findViewById(R.id.sights_city_title);
        cTitle.setText(cityTitle);
    }
}
