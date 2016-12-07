package com.example.mbcoppol.project02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.app.FragmentTransaction;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickStopwatch(View view){
        Intent intent = new Intent(this, StopwatchActivity.class);
        startActivity(intent);
    }

    public void onClickWeight(View view) {
        Intent intent = new Intent(this, workoutActivity.class);
        startActivity(intent);
    }

    public void onClickAbout(View view) {
        Intent charlie = new Intent(this, AboutActivity.class);
        startActivity(charlie);
    }

}
