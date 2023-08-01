package com.example.comoestate.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.comoestate.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LogInActivity extends AppCompatActivity {
TextInputEditText editTextEmail, editTextPassword;
Button Sign_in;
TextView Sign_up;

FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);


        editTextEmail=findViewById(R.id.Email);
        editTextPassword =findViewById(R.id.Password);

        Sign_in =findViewById(R.id.Sign_in);
        Sign_up =findViewById(R.id.Sign_up);

        Sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(LogInActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email,Password;
                Email = String.valueOf(editTextEmail.getText());

                Password = String.valueOf(editTextPassword.getText());

                if (TextUtils.isEmpty(Email)){

                    Toast.makeText(LogInActivity.this,"Enter Email", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(Password)){

                    Toast.makeText(LogInActivity.this,"Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }


                firebaseAuth.signInWithEmailAndPassword(Email,Password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()){
                                    Toast.makeText(LogInActivity.this,"Log in successful", Toast.LENGTH_SHORT).show();
                                    Intent intent= new Intent(LogInActivity.this, MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                                else {
                                    Toast.makeText(LogInActivity.this,"Authentication failed", Toast.LENGTH_SHORT).show();
                                }

                            }
                        });




            }
        });



    }
}