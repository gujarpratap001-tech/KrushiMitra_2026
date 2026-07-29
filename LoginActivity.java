//hi file com.example.krushimitra madhe thev

package com.example.krushimitra;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText etMobile;
    Button btnSendOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etMobile = findViewById(R.id.etMobile);
        btnSendOtp = findViewById(R.id.btnSendOtp);

        btnSendOtp.setOnClickListener(v -> {

            String mobile = etMobile.getText().toString().trim();

            if (mobile.length() != 10) {

                Toast.makeText(this,
                        "Enter Valid Mobile Number",
                        Toast.LENGTH_SHORT).show();

            } else {

                Intent intent =
                        new Intent(LoginActivity.this,
                                OtpActivity.class);

                intent.putExtra("mobile", mobile);

                startActivity(intent);

            }

        });

    }
}
