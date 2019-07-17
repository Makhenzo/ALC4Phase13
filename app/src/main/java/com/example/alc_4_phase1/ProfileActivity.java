package com.example.alc_4_phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class ProfileActivity extends AppCompatActivity {

    public TextView track,country,phoneNumber,email,slackUsername,username;
    public User userObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        Gson gson = new Gson();
        Bundle bundle = getIntent().getExtras();
        if(bundle!= null) {
            getSupportActionBar().setTitle(bundle.getString("title"));
            String user = bundle.getString("user");
            userObject = gson.fromJson(user ,User.class);
        }

        track = findViewById(R.id.txtTrack);
        username = findViewById(R.id.txtUsername);
        slackUsername = findViewById(R.id.txtSusername);
        email = findViewById(R.id.txtEmail);
        phoneNumber = findViewById(R.id.txtPhoneNumber);
        country = findViewById(R.id.txtCountry);

        track.setText(userObject.getTrack());
        username.setText(userObject.getNames());
        slackUsername.setText(userObject.getSlackUsername());
        email.setText(userObject.getEmail());
        phoneNumber.setText(userObject.getPhoneNumber());
        country.setText(userObject.getCountry());


    }
}
