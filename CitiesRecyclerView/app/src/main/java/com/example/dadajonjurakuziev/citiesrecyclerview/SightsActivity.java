package com.example.dadajonjurakuziev.citiesrecyclerview;

import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SightsActivity extends AppCompatActivity {
    private static final String TAG = "SightsActivity";

    //vars for Sights
    RecyclerView sightsRecyclerView;
    SightsViewAdapter sightsViewAdapter;
    List<Sights> sightsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);
        Log.d(TAG, "onCreate: started SightsActivity.");

        sightsRecyclerView = findViewById(R.id.sights_recyclerView);
        sightsRecyclerView.setHasFixedSize(true);
        sightsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        sightsList = new ArrayList<>();
        getIncomingIntent();
        sightsViewAdapter = new SightsViewAdapter(this, sightsList);
        sightsRecyclerView.setAdapter(sightsViewAdapter);
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            Log.d(TAG, "getIncomingIntent: found intent extras.");
            String cityTitle = bundle.getString("sights_city_title");

            assert cityTitle != null;
            //Tashkent
            if(cityTitle.equals("in Tashkent")){ Tashkent(); }
            //Bukhara
            if(cityTitle.equals("in Bukhara")){ Bukhara(); }
            //Samarkand
            if(cityTitle.equals("in Samarkand")){ Samarkand(); }
            //Khiva
            if(cityTitle.equals("in Khiva")){ Khiva(); }
            //Nukus
            if(cityTitle.equals("in Nukus")){ Nukus(); }
            //Kokand
            if(cityTitle.equals("in Kokand")){ Kokand(); }
            //Fergana
            if(cityTitle.equals("in Fergana")){ Fergana(); }
            //Termiz
            if(cityTitle.equals("in Termiz")){ Termiz(); }
            //Andijon
            if(cityTitle.equals("in Andijon")){ Andijon(); }
            //Shakhrisabz
            if(cityTitle.equals("in Shakhrisabz")){ Shakhrisabz(); }

            setImage(cityTitle);
        }
    }

    private void setImage(String cityTitle){
        Log.d(TAG, "setImage: setting image and name to widgets.");
        TextView cTitle = findViewById(R.id.sights_desc);
        cTitle.setText(cityTitle);
    }

    private void Tashkent() {
        List<Sights> sights = sightsList;
        sights.add(
                new Sights(1,
                        "History Museum of the People of Uzbekistan",
                        "museum in Tashkent",
                        R.drawable.sights_tashkent_history_museum,
                        "Details",
                        "Full Description"));
        sights.add(
                new Sights(1,
                        "The state museum of arts of Uzbekistan",
                        "museum in Tashkent",
                        R.drawable.sights_tashkent_the_state_museum_of_arts,
                        "",
                        ""));
        sights.add(
                new Sights(1,
                        "Chorsu Bazaar",
                        "market in Tashkent",
                        R.drawable.sights_tashkent_chorsu_bazaar,
                        "",
                        ""));
        sights.add(
                new Sights(1,
                        "Museum of Applied Arts",
                        "museum in Tashkent",
                        R.drawable.sights_tashkent_museum_of_applied_arts,
                        "",
                        ""));
        sights.add(
                new Sights(1,
                        "Earthquake Memorial",
                        "monument in Tashkent",
                        R.drawable.sights_tashkent_earthquake_memorial,
                        "",
                        ""));
        sights.add(
                new Sights(1,
                        "Moyie Mubarek Library Museum",
                        "library in Tashkent",
                        R.drawable.exp_moyie_mubarek_library_museum,
                        "",
                        ""));
        sights.add(
                new Sights(1,
                        "Minor Mosque",
                        "mosque in Tashkent",
                        R.drawable.sights_tashkent_minor_mosque,
                        "",
                        ""));
        sights.add(
                new Sights(1,
                        "Assumption Cathedral",
                        "church in Tashkent",
                        R.drawable.sights_tashkent_assumption_cathedral,
                        "",
                        ""));

    }

    private void Bukhara() {
//        List<Sights> sights = sightsList;
//        sights.add(
//                new Sights(1,
//                        "History Museum of the People of Uzbekistan",
//                        "museum in Tashkent",
//                        R.drawable.sights_tashkent_history_museum));
    }

    private void Samarkand() {
//        List<Sights> sights = sightsList;
//        sights.add(
//                new Sights(1,
//                        "Registan",
//                        "plaza in Samarkand",
//                        R.drawable.sights_samarkand_registan));
//        sights.add(
//                new Sights(1,
//                        "Gur-e-Amir Mausoleum",
//                        "mausoleum in Samarkand",
//                        R.drawable.sights_samarkand_gur_e_amir));
//        sights.add(
//                new Sights(1,
//                        "Shah-i-Zinda",
//                        "islamic tomb in Samarkand",
//                        R.drawable.sights_samarkand_shah_i_zinda));
//        sights.add(
//                new Sights(1,
//                        "Bibi-Khanym Mosque",
//                        "mosque in Samarkand",
//                        R.drawable.sights_samarkand_bibi_khanym));
//        sights.add(
//                new Sights(1,
//                        "Tilla-Kari Medressa",
//                        "islamic Site in Samarkand",
//                        R.drawable.sights_samarkand_tilla_kari));
//        sights.add(
//                new Sights(1,
//                        "Ulugbek Medressa",
//                        "islamic site in Samarkand",
//                        R.drawable.sights_samarkand_ulugbek));
//        sights.add(
//                new Sights(1,
//                        "Sher Dor Medressa",
//                        "islamic site in Samarkand",
//                        R.drawable.sights_samarkand_sherdor));
//        sights.add(
//                new Sights(1,
//                        "Afrosiab Museum",
//                        "museum in Samarkand",
//                        R.drawable.sights_samarkand_afrosiab));
    }

    private void Khiva() {
//        List<Sights> sights = sightsList;
//        sights.add(
//                new Sights(1,
//                        "History Museum of the People of Uzbekistan",
//                        "museum in Tashkent",
//                        R.drawable.sights_tashkent_history_museum));
    }

    private void Nukus() {
//        List<Sights> sights = sightsList;
//        sights.add(
//                new Sights(1,
//                        "History Museum of the People of Uzbekistan",
//                        "museum in Tashkent",
//                        R.drawable.sights_tashkent_history_museum));
    }

    private void Kokand() {
//        List<Sights> sights = sightsList;
//        sights.add(
//                new Sights(1,
//                        "History Museum of the People of Uzbekistan",
//                        "museum in Tashkent",
//                        R.drawable.sights_tashkent_history_museum));
    }

    private void Fergana() {
//        List<Sights> sights = sightsList;
//        sights.add(
//                new Sights(1,
//                        "History Museum of the People of Uzbekistan",
//                        "museum in Tashkent",
//                        R.drawable.sights_tashkent_history_museum));
    }

    private void Termiz() {
//        List<Sights> sights = sightsList;
//        sights.add(
//                new Sights(1,
//                        "History Museum of the People of Uzbekistan",
//                        "museum in Tashkent",
//                        R.drawable.sights_tashkent_history_museum));
    }

    private void Andijon() {
//        List<Sights> sights = sightsList;
//        sights.add(
//                new Sights(1,
//                        "History Museum of the People of Uzbekistan",
//                        "museum in Tashkent",
//                        R.drawable.sights_tashkent_history_museum));
    }

    private void Shakhrisabz() {
//        List<Sights> sights = sightsList;
//        sights.add(
//                new Sights(1,
//                        "History Museum of the People of Uzbekistan",
//                        "museum in Tashkent",
//                        R.drawable.sights_tashkent_history_museum));
    }

}
