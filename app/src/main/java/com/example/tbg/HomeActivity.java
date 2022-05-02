package com.example.tbg;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

import io.fabric.sdk.android.Fabric;

public class HomeActivity extends AppCompatActivity {
    private ActionBarDrawerToggle toggle;
    private GoogleMap mMap;
    private SupportMapFragment mapFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_home);

     /*   mNetworkReceiver = new MyNetworkReceiver(this);
        mLocationReceiver = new MyLocationReceiver(this);
        mUser = SharedPrefManager.getInstance(HomeActivity.this).getUser();

        //-----------------------------------------------| GPS/Location
        manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        checkGpsEnabled(manager); */

        //==========================================| Receive the data and observe the data from view model
     /*   PostAdViewModel mPostAdViewModel = ViewModelProviders.of(this).get(PostAdViewModel.class); //Initialize view model
        mPostAdViewModel.getAllPostAd().observe(this, new Observer<ArrayList<PostAd>>() {
            @Override
            public void onChanged(ArrayList<PostAd> postAds) {
                if (postAds != null) {
                    mArrayList.addAll(postAds);
                }
            }
        });*/

        //==========================================| findViewById
        //((Button) findViewById(R.id.list_id)).setOnClickListener(new ActionHandler());
        //((Button) findViewById(R.id.filter_id)).setOnClickListener(new ActionHandler());
        //((TextView) findViewById(R.id.log_out)).setOnLongClickListener(new ActionHandler());

        //====================================================| To Display Navigation Bar Icon and Back
        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowTitleEnabled(false); //Remove title
            getSupportActionBar().setDisplayShowHomeEnabled(false);
            //toolbar.getBackground().setAlpha(200);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        //navigationView.setNavigationItemSelectedListener(this);

        View hView = navigationView.getHeaderView(0);

/*
        // if (mUser != null) {
        // Picasso.get().load(mUser.getUserImageUrl()).into(((CircleImageView) hView.findViewById(R.id.nav_header_photo)));
        //((TextView) hView.findViewById(R.id.user_email)).setText(mUser.getUserEmail());
        ((TextView) hView.findViewById(R.id.user_full_name)).setText(SharedPrefManager2.getInstance(HomeActivity.this).getUser().getUsername());

        // }*/

        //====================================| Google Maps
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
       //     mapFragment.getMapAsync(this);
        }
    }


}
