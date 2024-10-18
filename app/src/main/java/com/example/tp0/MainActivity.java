package com.example.tp0;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPrenom;
    private EditText editTextNom;
    private EditText editTextAge;
    private TextView textViewMessage;
    private Button buttonValider;
    private Button buttonQuitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form); // Change to your layout file name

        // Initialize views
        editTextPrenom = findViewById(R.id.editTextPrenom);
        editTextNom = findViewById(R.id.editTextNom);
        editTextAge = findViewById(R.id.editTextAge);
        textViewMessage = findViewById(R.id.textViewMessage);
        buttonValider = findViewById(R.id.buttonValider);
        buttonQuitter = findViewById(R.id.buttonQuitter);

        // Set onClick listener for the Valider button
        buttonValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input
                String prenom = editTextPrenom.getText().toString();
                String nom = editTextNom.getText().toString();
                String age = editTextAge.getText().toString();

                // Display message in the TextView
                textViewMessage.setText("Bonjour " + prenom + " " + nom + " " + age);

                // Display Toast message
                Toast.makeText(MainActivity.this, "C’est ok", Toast.LENGTH_SHORT).show();
            }
        });

        // Set onClick listener for the Quitter button
        buttonQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the application
                finish(); // This will close the activity and exit the app
            }
        });
    }
}
