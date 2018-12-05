package com.example.dadajonjurakuziev.citiesrecyclerview;

import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class SightsInnerActivity extends AppCompatActivity {
    private static final String TAG = "SightsInnerActivity";
    ExpandableTextView expandableTextView;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights_inner);

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            int sightsBG = bundle.getInt("sights_bg");
            String sightsTitle = bundle.getString("sights_title");
            String sightsDesc = bundle.getString("sights_desc");
            String sightsDetails = bundle.getString("sights_details");
            String sightsFullDesc = bundle.getString("sights_full_desc");

//            assert cityTitle != null;
//            //Tashkent
//            if(cityTitle.equals("in Tashkent")){ Tashkent(); }
//            //Bukhara
//            if(cityTitle.equals("in Bukhara")){ Bukhara(); }
//            //Samarkand
//            if(cityTitle.equals("in Samarkand")){ Samarkand(); }
//            //Khiva
//            if(cityTitle.equals("in Khiva")){ Khiva(); }
//            //Nukus
//            if(cityTitle.equals("in Nukus")){ Nukus(); }
//            //Kokand
//            if(cityTitle.equals("in Kokand")){ Kokand(); }
//            //Fergana
//            if(cityTitle.equals("in Fergana")){ Fergana(); }
//            //Termiz
//            if(cityTitle.equals("in Termiz")){ Termiz(); }
//            //Andijon
//            if(cityTitle.equals("in Andijon")){ Andijon(); }
//            //Shakhrisabz
//            if(cityTitle.equals("in Shakhrisabz")){ Shakhrisabz(); }

            setImage(sightsBG, sightsTitle, sightsDesc, sightsDetails, sightsFullDesc);
        }
    }

    private void setImage(int sightsBG, String sightsTitle, String sightsDesc, String sightsDetails, String sightsFullDesc){
        ImageView sightsInnerImageView =  findViewById(R.id.sights_inner_image);
        sightsInnerImageView.setImageResource(sightsBG);

        TextView sightsInnerTitle = findViewById(R.id.sights_inner_title);
        sightsInnerTitle.setText(sightsTitle);

        TextView sightsInnerDesc = findViewById(R.id.sights_inner_desc);
        sightsInnerDesc.setText(sightsDesc);

        TextView sightsInnerDetails= findViewById(R.id.sights_inner_details_text);
        sightsInnerDetails.setText(sightsDetails);

        expandableTextView = findViewById(R.id.expandable_text_view);
        expandableTextView.setText(sightsFullDesc);

        imageButton = findViewById(R.id.expand_collapse);
        imageButton.setColorFilter(0xff78849E, PorterDuff.Mode.SRC_ATOP);
    }
}
