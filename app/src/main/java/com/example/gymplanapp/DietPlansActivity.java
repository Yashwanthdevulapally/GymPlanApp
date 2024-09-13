package com.example.gymplanapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class DietPlansActivity extends AppCompatActivity {

    private ListView lvDietPlans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_plans);

        lvDietPlans = findViewById(R.id.lvDietPlans);

        // Example data
        String[] dietPlans = {"Plan A: High Protein", "Plan B: Low Carb", "Plan C: Balanced"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dietPlans);
        lvDietPlans.setAdapter(adapter);
    }
}
