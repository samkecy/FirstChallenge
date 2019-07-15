package com.samkecy.firstchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button about, profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

about = (Button)findViewById(R.id.btnAbout);
profile = (Button)findViewById(R.id.btnProfile);

about.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent aboutAlc = new Intent(MainActivity.this, about.class);
        startActivity(aboutAlc);
    }
});



profile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent myProf = new Intent(MainActivity.this, myProfile.class);
        startActivity(myProf);
    }
});
    }
}
