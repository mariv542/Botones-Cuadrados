package com.example.botonescuadrados;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btn_One;
    private Button btn_Two;
    private Button btn_Three;
    private Button btn_Four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn_One = findViewById(R.id.btnOne);
        btn_One.setOnClickListener(v -> Toast.makeText(this, "One", Toast.LENGTH_SHORT).show());

        btn_Two = findViewById(R.id.btnTwo);
        btn_Two.setOnClickListener(v -> Toast.makeText(this, "Two", Toast.LENGTH_SHORT).show());

        btn_Three = findViewById(R.id.btnThree);
        btn_Three.setOnClickListener(v -> Toast.makeText(this, "Three", Toast.LENGTH_SHORT).show());

        btn_Four = findViewById(R.id.btnFour);
        btn_Four.setOnClickListener(v -> Toast.makeText(this, "Four", Toast.LENGTH_SHORT).show());
        }
}
