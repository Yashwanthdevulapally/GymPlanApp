package com.example.gymplanapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PlanAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_a);

        TextView textView = findViewById(R.id.textViewPlanA);
        textView.setText("Diet Plan A: \n\n" +
                "Breakfast: Oatmeal with fruits\n" +
                "Calories: 300 kcal | Protein: 5g | Carbs: 54g\n\n" +
                "Lunch: Grilled chicken salad\n" +
                "Calories: 400 kcal | Protein: 35g | Carbs: 20g\n\n" +
                "Dinner: Baked salmon with veggies\n" +
                "Calories: 500 kcal | Protein: 40g | Carbs: 30g\n\n" +
                "Total Calories: 1200 kcal | Total Protein: 80g | Total Carbs: 104g");
    }
}
