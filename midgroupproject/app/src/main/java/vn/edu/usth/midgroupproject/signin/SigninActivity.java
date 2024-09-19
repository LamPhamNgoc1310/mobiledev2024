package vn.edu.usth.midgroupproject.signin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import vn.edu.usth.midgroupproject.R;

public class SigninActivity extends AppCompatActivity {

    private EditText usernameOrEmail, password;
    private Button signinBtn, recoveryPasswordBtn;
    private ImageView googleBtn, appleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        // Initialize views
        usernameOrEmail = findViewById(R.id.Usernam_Or_Email);
        password = findViewById(R.id.password_input);
        signinBtn = findViewById(R.id.signin_btn);
        recoveryPasswordBtn = findViewById(R.id.recovery_password_btn);
        googleBtn = findViewById(R.id.google_btn);
        appleBtn = findViewById(R.id.apple_btn);

        // Set click listeners
        signinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle sign in logic here
                Toast.makeText(SigninActivity.this, "Sign In Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        recoveryPasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle password recovery logic here
                Toast.makeText(SigninActivity.this, "Password Recovery Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Google sign in logic here
                Toast.makeText(SigninActivity.this, "Google Sign In Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        appleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Apple sign in logic here
                Toast.makeText(SigninActivity.this, "Apple Sign In Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}