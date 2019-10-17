package com.example.menubarapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout ndrawerlayout;
    private ActionBarDrawerToggle ntoggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ndrawerlayout=(DrawerLayout)findViewById(R.id.drawerLayout);
        ntoggle=new ActionBarDrawerToggle(this,ndrawerlayout,R.string.open,R.string.close);
        ndrawerlayout.addDrawerListener(ntoggle);
        ntoggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(ntoggle.onOptionsItemSelected(item)){
            return(true);
        }

        return super.onOptionsItemSelected(item);
    }

}
