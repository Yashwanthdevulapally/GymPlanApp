package com.example.gymplanapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnWorkoutPlans = findViewById(R.id.btnWorkoutPlans);
        Button btnDietPlans = findViewById(R.id.btnDietPlans);
        Button btnProgressTracker = findViewById(R.id.btnProgressTracker);
        Button btnUserDetails = findViewById(R.id.btnUserDetails);

        btnWorkoutPlans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WorkoutPlansActivity.class);
                startActivity(intent);
            }
        });

        btnDietPlans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DietPlansActivity.class);
                startActivity(intent);
            }
        });

        btnProgressTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProgressTrackerActivity.class);
                startActivity(intent);
            }
        });

        btnUserDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}
