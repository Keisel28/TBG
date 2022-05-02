package com.example.tbg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button saveButton = (Button) findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new ActionHandler());


    }

    private class ActionHandler implements View.OnClickListener {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.userImageUrl:


                    break;

                case R.id.userBirthDate:


                    break;

                case R.id.saveButton:
                    storeToDatabase();
            }
        }
    }

    private void storeToDatabase() {
        startActivity(new Intent(ProfileActivity.this, HomeActivity.class));
        finish();
    }
}