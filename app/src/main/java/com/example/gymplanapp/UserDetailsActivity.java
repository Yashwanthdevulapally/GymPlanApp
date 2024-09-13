package com.example.gymplanapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class UserDetailsActivity extends AppCompatActivity {

    private EditText etName, etAge, etWeight;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        etWeight = findViewById(R.id.etWeight);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString().trim();
                String age = etAge.getText().toString().trim();
                String weight = etWeight.getText().toString().trim();

                if (name.isEmpty() || age.isEmpty() || weight.isEmpty()) {
                    Toast.makeText(UserDetailsActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Save user details using shared preferences or other storage
                    Intent intent = new Intent(UserDetailsActivity.this, WelcomeActivity.class);
                    intent.putExtra("USER_NAME", name);
                    startActivity(intent);
                    finish(); // Close UserDetailsActivity
                }
            }
        });
    }
}
