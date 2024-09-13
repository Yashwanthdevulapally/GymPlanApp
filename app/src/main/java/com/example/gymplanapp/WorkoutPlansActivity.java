package com.example.gymplanapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class WorkoutPlansActivity extends AppCompatActivity {

    private ListView lvWorkoutPlans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_plans);

        lvWorkoutPlans = findViewById(R.id.lvWorkoutPlans);

        // Detailed workout plans with specific activities
        String[] workoutPlans = {
                "Plan A: Cardio Activities\n" +
                        "1. Running - 30 minutes\n" +
                        "2. Cycling - 45 minutes\n" +
                        "3. Jump Rope - 15 minutes\n" +
                        "4. High-Intensity Interval Training (HIIT) - 20 minutes\n",

                "Plan B: Strength Training\n" +
                        "1. Push-ups - 3 sets of 15 reps\n" +
                        "2. Squats - 3 sets of 20 reps\n" +
                        "3. Dumbbell Rows - 3 sets of 12 reps per side\n" +
                        "4. Planks - 3 sets of 1 minute\n",

                "Plan C: Flexibility & Balance\n" +
                        "1. Yoga - 30 minutes\n" +
                        "2. Stretching Routine - 20 minutes\n" +
                        "3. Pilates - 30 minutes\n" +
                        "4. Tai Chi - 25 minutes\n"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, workoutPlans);
        lvWorkoutPlans.setAdapter(adapter);
    }
}
