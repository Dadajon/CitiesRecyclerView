package com.example.dadajonjurakuziev.citiesrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsActivity extends AppCompatActivity {
    private static final String TAG = "RestaurantsActivity";

    //vars for Sights
    RecyclerView restaurantsRecyclerView;
    RestaurantsViewAdapter restaurantsViewAdapter;
    List<Restaurants> restaurantsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        restaurantsRecyclerView = findViewById(R.id.restaurants_recyclerView);
        restaurantsRecyclerView.setHasFixedSize(true);
        restaurantsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        restaurantsList = new ArrayList<>();

        getIncomingIntent();

        restaurantsViewAdapter = new RestaurantsViewAdapter(this, restaurantsList);
        restaurantsRecyclerView.setAdapter(restaurantsViewAdapter);
    }
    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            Log.d(TAG, "getIncomingIntent: found intent extras.");
            String restaurantsCityTitle = bundle.getString("restaurants_city_title");

            assert restaurantsCityTitle != null;
            //Tashkent
            if(restaurantsCityTitle.equals("in Tashkent")){ Tashkent(); }
            //Bukhara
            if(restaurantsCityTitle.equals("in Bukhara")){ Bukhara(); }
            //Samarkand
            if(restaurantsCityTitle.equals("in Samarkand")){ Samarkand(); }
            //Khiva
            if(restaurantsCityTitle.equals("in Khiva")){ Khiva(); }
            //Nukus
            if(restaurantsCityTitle.equals("in Nukus")){ Nukus(); }
            //Kokand
            if(restaurantsCityTitle.equals("in Kokand")){ Kokand(); }
            //Fergana
            if(restaurantsCityTitle.equals("in Fergana")){ Fergana(); }
            //Termiz
            if(restaurantsCityTitle.equals("in Termiz")){ Termiz(); }
            //Andijon
            if(restaurantsCityTitle.equals("in Andijon")){ Andijon(); }
            //Shakhrisabz
            if(restaurantsCityTitle.equals("in Shakhrisabz")){ Shakhrisabz(); }

            setImage(restaurantsCityTitle);
        }
    }

    private void setImage(String restaurantsCityTitle){
        Log.d(TAG, "setImage: setting image and name to widgets.");
        TextView cTitle = findViewById(R.id.restaurants_city);
        cTitle.setText(restaurantsCityTitle);
    }

    private void Tashkent() {
        List<Restaurants> restaurants = restaurantsList;
        restaurants.add(
                new Restaurants(1,
                        "Afsona",
                        "Uzbek",
                        R.drawable.restaurant_one,
                        "Hours : 9AM - 5PM (Mon - Fri)\n             10AM - 3PM (Sat)\nPrice  : admission 10,000 UZS\nAddress : Khast Imom Sq, Tashkent",
                        "Desription Afsonaaaaa"));
        restaurants.add(
                new Restaurants(1,
                        "Jumanji",
                        "International",
                        R.drawable.restaurant_two,
                        "",
                        ""));
        restaurants.add(
                new Restaurants(1,
                        "City Grill",
                        "International",
                        R.drawable.restaurant_three,
                        "",
                        ""));
        restaurants.add(
                new Restaurants(1,
                        "National Food",
                        "Uzbek",
                        R.drawable.restaurant_four,
                        "",
                        ""));
        restaurants.add(
                new Restaurants(1,
                        "Central Asian Plov Centre",
                        "Uzbek",
                        R.drawable.restaurant_five,
                        "",
                        ""));
        restaurants.add(
                new Restaurants(1,
                        "Efendi",
                        "Turkish",
                        R.drawable.restaurant_six,
                        "",
                        ""));
        restaurants.add(
                new Restaurants(1,
                        "Amaretto",
                        "Italian",
                        R.drawable.restaurant_seven,
                        "",
                        ""));
        restaurants.add(
                new Restaurants(1,
                        "II Perfetto",
                        "Italian",
                        R.drawable.restaurant_eight,
                        "",
                        ""));
        restaurants.add(
                new Restaurants(1,
                        "Ovqat Bozari",
                        "Uzbek",
                        R.drawable.restaurant_nine,
                        "",
                        ""));
        restaurants.add(
                new Restaurants(1,
                        "B&B Coffee House",
                        "Uzbek",
                        R.drawable.coffee_house,
                        "",
                        ""));
    }

    private void Bukhara() { }

    private void Samarkand() {
        List<Restaurants> restaurants = restaurantsList;
        restaurants.add(
                new Restaurants(1,
                        "Platan",
                        "International",
                        R.drawable.restaurant_two,
                        "Hours : 10AM - 11PM\nPrice  : mains 20,000 - 28,000 UZS\nAddress : 2 Pushkin St, Samarkand\nTel : (+998)66 233 80 49\nWebsite : en.platan.uz",
                        "Possibly the best restaurant in Samarkand, Platan has a classy interior and a summer terrace for shady al fresco dining in the summer. The menu includes some Middle Eastern and Thai influences alongside regional dishes like Russian-style red caviar or cooling Uzbek chalop (cucumber, dill, green onion and sour cream soup).\n" +
                                "\nThe salad menu is particularly good: try the excellent lobio (a Georgian bean, walnut, garlic, lemon and parsley salad), the Thai beef salad or the zingy Bloody Mary salad. Reservations are advised for dinner."));
        restaurants.add(
                new Restaurants(1,
                        "Old city",
                        "International",
                        R.drawable.restaurant_one,
                        "Hours : 10AM - 11PM\nPrice  : mains 14,000 - 16,000 UZS\nAddress : 100/1 Abdurahmon Jomi St\nTel : (+998)93 346 80 20",
                        "This charming place in the Russian part of town is recommended for its interesting dishes, such as basturma cold smoked beef, lavash (flat bread) with feta-like brinza cheese, and over 40 salads, including a delicious beetroot and walnut option. Service is friendly and assured, the classy interior has a cosy fireplace, and while it caters largely to tourists, standards are high."));
        restaurants.add(
                new Restaurants(1,
                        "Cafe Magistr",
                        "Cafe",
                        R.drawable.coffee_house,
                        "",
                        ""));
        restaurants.add(
                new Restaurants(1,
                        "Karimbek",
                        "Uzbek",
                        R.drawable.restaurant_three,
                        "",
                        ""));
        restaurants.add(
                new Restaurants(1,
                        "Art Cafe Norgis",
                        "Uzbek",
                        R.drawable.restaurant_four,
                        "",
                        ""));
        restaurants.add(
                new Restaurants(1,
                        "Samarkand Restaurant",
                        "Uzbek",
                        R.drawable.restaurant_five,
                        "",
                        ""));
        restaurants.add(
                new Restaurants(1,
                        "Besh Chinor",
                        "Uzbek",
                        R.drawable.restaurant_six,
                        "",
                        ""));
        restaurants.add(
                new Restaurants(1,
                        "Kyzyl Chaixona",
                        "Central Asia",
                        R.drawable.restaurant_seven,
                        "",
                        ""));
        restaurants.add(
                new Restaurants(1,
                        "Cafe Labig'or",
                        "Uzbek",
                        R.drawable.restaurant_eight,
                        "",
                        ""));
    }

    private void Khiva() { }
    private void Nukus() { }
    private void Kokand() { }
    private void Fergana() { }
    private void Termiz() { }
    private void Andijon() { }
    private void Shakhrisabz() { }
}
