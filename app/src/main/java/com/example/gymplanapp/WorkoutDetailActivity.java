package com.example.gymplanapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WorkoutDetailActivity extends AppCompatActivity {

    private TextView txtWorkoutDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_detail);

        txtWorkoutDetails = findViewById(R.id.txtWorkoutDetails);

        // Get the level from intent
        String level = getIntent().getStringExtra("LEVEL");

        // Display workouts based on the selected level
        if (level != null) {
            String workoutDetails = getWorkoutDetails(level);
            txtWorkoutDetails.setText(workoutDetails);
        }
    }

    private String getWorkoutDetails(String level) {
        switch (level) {
            case "Easy":
                return "Easy Workout Plan:\n1. Walking - 30 mins\n2. Light Jogging - 20 mins\n3. Stretching - 10 mins";
            case "Medium":
                return "Medium Workout Plan:\n1. Jogging - 30 mins\n2. Bodyweight Exercises - 20 mins\n3. Core Workout - 15 mins";
            case "Hard":
                return "Hard Workout Plan:\n1. Running - 30 mins\n2. HIIT - 20 mins\n3. Strength Training - 30 mins";
            default:
                return "No workout plan available.";
        }
    }
}
