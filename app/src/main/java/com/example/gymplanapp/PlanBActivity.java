package com.example.gymplanapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PlanBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_b);

        TextView textView = findViewById(R.id.textViewPlanB);
        textView.setText("Diet Plan B: \n\n" +
                "Breakfast: Smoothie with protein powder\n" +
                "Calories: 350 kcal | Protein: 20g | Carbs: 45g\n\n" +
                "Lunch: Quinoa salad with chickpeas\n" +
                "Calories: 450 kcal | Protein: 15g | Carbs: 60g\n\n" +
                "Dinner: Grilled chicken with sweet potatoes\n" +
                "Calories: 500 kcal | Protein: 35g | Carbs: 50g\n\n" +
                "Total Calories: 1300 kcal | Total Protein: 70g | Total Carbs: 155g");
    }
}
