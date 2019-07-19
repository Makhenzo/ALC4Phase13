 package com.example.alc_4_phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.gson.Gson;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public Button profile ,about;
    public String user,url ,title;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        profile = findViewById(R.id.btnProfile);
        about = findViewById(R.id.btnAbout);

        User myself = new User();

        myself.setTrack("Android");
        myself.setNames("Kennedy Mathinya");
        myself.setCountry("South Africa");
        myself.setEmail("kennymath32@gmail.com");
        myself.setPhoneNumber("27793588245");
        myself.setSlackUsername("@kennedymath");

         user  = gson.toJson(myself);
         url = "https://andela.com/alc/"; //This was challenging to me manage to fix it thank you
         profile.setOnClickListener(this);
         about.setOnClickListener(this);
    }

     @Override
     public void onClick(View v) {

         switch (v.getId()) {
             case R.id.btnProfile:
                 Intent iProfile = new Intent(MainActivity.this, ProfileActivity.class);
                 title = getText(R.string.profile).toString();
                 iProfile.putExtra("user", user);
                 iProfile.putExtra("title",title);
                 startActivity(iProfile);
                 break;

             case R.id.btnAbout:
                 Intent iAbout = new Intent(MainActivity.this, AboutActivity.class);
                 title = getText(R.string.about).toString();
                 iAbout.putExtra("url",url);
                 iAbout.putExtra("title",title);
                 startActivity(iAbout);
                 break;
         }

     }
 }
