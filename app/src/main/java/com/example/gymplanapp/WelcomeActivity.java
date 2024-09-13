package com.example.gymplanapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    private TextView tvWelcomeMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tvWelcomeMessage = findViewById(R.id.tvWelcomeMessage);

        // Get user name from the Intent
        String userName = getIntent().getStringExtra("USER_NAME");
        if (userName != null) {
            tvWelcomeMessage.setText("HELLO, " + userName + "!");
        }

        // Redirect to MainActivity after a short delay
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Close WelcomeActivity
            }
        }, 2000); // 2-second delay
    }
}
