package com.example.comoestate.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.comoestate.R;

public class NewsletterActivity extends AppCompatActivity {
    private EditText editTextEmail;
    private Button buttonSubscribe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsletter);

        editTextEmail = findViewById(R.id.editTextEmail);
        buttonSubscribe = findViewById(R.id.buttonSubscribe);

        buttonSubscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subscribeToNewsletter();
            }

            private void subscribeToNewsletter() {
                String email = editTextEmail.getText().toString();
                 if (isValidEmail(email)) {
                    // Perform the necessary actions (e.g., send confirmation email, save to database)
                    Toast.makeText(NewsletterActivity.this, "Subscribed to newsletter!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(NewsletterActivity.this, "Invalid email address", Toast.LENGTH_SHORT).show();
                }
            }

            private boolean isValidEmail(String email) {
                return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
            }
        });
        
    }
}