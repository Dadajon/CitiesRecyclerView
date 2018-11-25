package com.example.dadajonjurakuziev.citiesrecyclerview;


import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ms.square.android.expandabletextview.ExpandableTextView;

import java.util.ArrayList;
import java.util.List;

public class CityActivity extends AppCompatActivity {
    private static final String TAG = "CityActivity";
    ExpandableTextView expandableTextView;
    ImageButton imageButton;

    //vars for experiences_RecyclerView
    RecyclerView expRecyclerView;
    ExperiencesViewAdapter expAdapter;
    List<Experiences> experiencesList;

    //var for top sights
    CardView sights_cardView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        Log.d(TAG, "onCreate: started.");

        expRecyclerView = findViewById(R.id.experience_recyclerView);
        expRecyclerView.setHasFixedSize(true);
        expRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        getIncomingIntent();
        expAdapter = new ExperiencesViewAdapter(this, experiencesList);
        expRecyclerView.setAdapter(expAdapter);
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            int cityBg = bundle.getInt("city_bg");
            String cityTitle = bundle.getString("city_title");
            String cityDesc = bundle.getString("city_desc");

            assert cityTitle != null;
            //Tashkent
            if(cityTitle.equals("Tashkent")){ Tashkent(); }
            //Bukhara
            if(cityTitle.equals("Bukhara")){ Bukhara(); }
            //Samarkand
            if(cityTitle.equals("Samarkand")){ Samarkand(); }
            //Khiva
            if(cityTitle.equals("Khiva")){ Khiva(); }
            //Nukus
            if(cityTitle.equals("Nukus")){ Nukus(); }
            //Kokand
            if(cityTitle.equals("Kokand")){ Kokand(); }
            //Fergana
            if(cityTitle.equals("Fergana")){ Fergana(); }
            //Termiz
            if(cityTitle.equals("Termiz")){ Termiz(); }
            //Andijon
            if(cityTitle.equals("Andijon")){ Andijon(); }
            //Shakhrisabz
            if(cityTitle.equals("Shakhrisabz")){ Shakhrisabz(); }

            setImage(cityBg, cityTitle, cityDesc);
        }
    }
    
    private void setImage(int city_Bg, String cityTitle, String cityDesc){
        Log.d(TAG, "setImage: setting image and name to widgets.");

        ImageView cBG = findViewById(R.id.city_image);
        cBG.setImageResource(city_Bg);
        cBG.setColorFilter(0xffAEAEAE, PorterDuff.Mode.MULTIPLY);


        TextView cTitle = findViewById(R.id.city_title);
        cTitle.setText(cityTitle);

        expandableTextView = findViewById(R.id.expandable_text_view);
        expandableTextView.setText(cityDesc);

        imageButton = findViewById(R.id.expand_collapse);
        imageButton.setColorFilter(0xff78849E, PorterDuff.Mode.SRC_ATOP);
    }

    /**
     * Tashkent Experiences
     */
    private void Tashkent(){
        experiencesList = new ArrayList<>();
        final List<Experiences> exp_list = experiencesList;
        exp_list.add(
                new Experiences(
                        1,
                        "Moyie Mubarek Library Museum",
                        "Library in Tashkent",
                        R.drawable.exp_moyie_mubarek_library_museum,
                        "The primary attraction of Khast Imom square is this library museum, which houses the 7th-century Osman Quran (Uthman Quran), said to be the world’s oldest. This enormous deerskin tome was brought to Samarkand by Timur, then taken to Moscow by the Russians in 1868 before being returned to Tashkent by Lenin in 1924 as an act of goodwill towards Turkestan’s Muslims. It is Tashkent’s most important sight.\n"+
                "\nThe museum also contains 30 or 40 rare 14th- to 17th-century books among its collection, including one thumb-sized koran in an amulet case. Photos are not allowed. The library is in the southeast of the square, next to the spartan 1856 Telyashayakh Mosque."));
        exp_list.add(
                new Experiences(
                        1,
                        "Chorsu Bazaar",
                        "Top choice market in Tashkent",
                        R.drawable.exp_chorsu_bazaar,
                        "Tashkent’s most famous farmers market, topped by a giant green dome, is a delightful slice of city life spilling into the streets off the Old Town’s southern edge. There are acres of spices arranged in brightly coloured mountains, Volkswagen-sized sacks of grain, entire warehouses dedicated to sweets, and the freshest bread and fruits around. Souvenir hunters will find kurpacha (colourful sitting mattresses), skullcaps, chapan (traditional heavy quilted cloaks), ceramics and knives here.\n"));
        exp_list.add(
                new Experiences(
                        1,
                        "The State Museum of Arts of Uzbekistan",
                        "Top choice museum in Tashkent",
                        R.drawable.exp_the_state_museum_of_arts_of_uzbekistan,
                        "The four floors of this excellent museum walk you through 1500 years of art in Uzbekistan, from 7th-century Buddhist relics from Kuva and the Greek-inspired head of Hercules from Khalchayan near Termiz, to the art of Soviet Uzbekistan. There are even a few 19th-century paintings of second-tier Russian and European artists hanging about. There’s an impressive section on Uzbek applied art – notably some lovely ghanch (plaster carvings) from Bukhara, carved wooden doors from Khiva and the silk-on-cotton embroidered hangings called suzani."));
        exp_list.add(
                new Experiences(
                        1,
                        "Ilkhom Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.exp_ilkhom_theatre,
                        "Tashkent’s main cultural highlight is this progressive theatre, whose productions often touch on gay themes and racial subjects, to consternation of the more conservative elements of Uzbek society. Alongside the cutting-edge plays (performed in Russian but often with English subtitles) there are also occasional jazz concerts and art exhibitions in the lobby.\n"+
                "\nThe Ilkhom’s director, Mark Weil, who founded the theatre in 1976, was tragically stabbed to death in 2007, allegedly for blaspheming the Prophet Mohammed in his Pushkin-inspired play Imitations of the Koran. Imitations of the Koran remains in the repertoire today."));
        exp_list.add(
                new Experiences(
                        1,
                        "Alisher Navoi Opera & Ballet Theatre",
                        "Top choice theatre in Tashkent",
                        R.drawable.exp_alisher_navoi_opera_and_ballet_theatre,
                        "Tashkent's main opera and ballet theatre is worth a visit as much for its impressive interior as its fine opera and ballet performances. Verdi and Puccini are standards, or be bold and try a Soviet Uzbek opera by Mukhtar Ashrafi. The ticket office is hidden in one of the exterior pillars."));

        ImageView image = findViewById(R.id.top_sights_image);
        image.setImageResource(R.drawable.tashkent);

        sights_cardView = findViewById(R.id.sights_cardView);
        sights_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: pressed on top_sights_cardView");
                Toast.makeText(getApplicationContext(), "Clicked on top_sights", Toast.LENGTH_SHORT).show();

            }
        });
    }

    /**
     * Bukhara Experiences
     */
    private void Bukhara(){
        experiencesList = new ArrayList<>();
    }

    /**
     * Samarkand Experiences
     */
    private void Samarkand(){
        experiencesList = new ArrayList<>();

    }

    /**
     * Khiva Experiences
     */
    private void Khiva(){
        experiencesList = new ArrayList<>();
    }

    /**
     * Nukus Experiences
     */
    private void Nukus(){
        experiencesList = new ArrayList<>();
    }

    /**
     * Kokand Experiences
     */
    private void Kokand(){
        experiencesList = new ArrayList<>();
    }

    /**
     * Fergana Experiences
     */
    private void Fergana(){
        experiencesList = new ArrayList<>();
    }

    /**
     * Termiz Experiences
     */
    private void Termiz(){
        experiencesList = new ArrayList<>();
    }

    /**
     * Andijon Experiences
     */
    private void Andijon(){
        experiencesList = new ArrayList<>();
    }

    /**
     * Shakhrisabz Experiences
     */
    private void Shakhrisabz(){
        experiencesList = new ArrayList<>();
    }
}
