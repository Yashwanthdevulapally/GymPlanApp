package com.example.gymplanapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PlanCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_c);

        TextView textView = findViewById(R.id.textViewPlanC);
        textView.setText("Diet Plan C: \n\n" +
                "Breakfast: Eggs and avocado toast\n" +
                "Calories: 400 kcal | Protein: 15g | Carbs: 30g\n\n" +
                "Lunch: Turkey wrap with veggies\n" +
                "Calories: 450 kcal | Protein: 30g | Carbs: 40g\n\n" +
                "Dinner: Stir-fried tofu with rice\n" +
                "Calories: 500 kcal | Protein: 25g | Carbs: 70g\n\n" +
                "Total Calories: 1350 kcal | Total Protein: 70g | Total Carbs: 140g");
    }
}
