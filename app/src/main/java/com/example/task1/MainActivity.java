package com.example.task1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Context context;
    Resources resources;
    private Button btnEng, btnRus, btnIta, btnSrp, btnBreakfast, btnLunch, btnDinner;
    private CardView cardSpaghetti, cardSalad, cardPancakes;
    private TextView spaghetti, salad, pancakes;
    private boolean filterBreakfast, filterLunch, filterDinner = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnEng = findViewById(R.id.btn_english);
        btnRus = findViewById(R.id.btn_russian);
        btnIta = findViewById(R.id.btn_italian);
        btnSrp = findViewById(R.id.btn_serbian);
        btnBreakfast = findViewById(R.id.btn_breakfast);
        btnLunch = findViewById(R.id.btn_lunch);
        btnDinner = findViewById(R.id.btn_dinner);
        cardSpaghetti = findViewById(R.id.card_dish1);
        cardSalad = findViewById(R.id.card_dish2);
        cardPancakes = findViewById(R.id.card_dish3);
        spaghetti = findViewById(R.id.spaghetti);
        salad = findViewById(R.id.salad);
        pancakes = findViewById(R.id.pancakes);

        btnEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = LocaleHelper.setLocale(MainActivity.this, "en");
                resources = context.getResources();
                btnEng.setText(resources.getString(R.string.english));
                btnRus.setText(resources.getString(R.string.russian));
                btnIta.setText(resources.getString(R.string.italian));
                btnSrp.setText(resources.getString(R.string.serbian));
                btnBreakfast.setText(resources.getString(R.string.breakfast));
                btnLunch.setText(resources.getString(R.string.lunch));
                btnDinner.setText(resources.getString(R.string.dinner));
                spaghetti.setText(resources.getString(R.string.spaghetti_title));
                salad.setText(resources.getString(R.string.salad_title));
                pancakes.setText(resources.getString(R.string.pancakes_title));
            }
        });

        btnRus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = LocaleHelper.setLocale(MainActivity.this, "ru");
                resources = context.getResources();
                btnEng.setText(resources.getString(R.string.english));
                btnRus.setText(resources.getString(R.string.russian));
                btnIta.setText(resources.getString(R.string.italian));
                btnSrp.setText(resources.getString(R.string.serbian));
                btnBreakfast.setText(resources.getString(R.string.breakfast));
                btnBreakfast.setText(resources.getString(R.string.breakfast));
                btnLunch.setText(resources.getString(R.string.lunch));
                btnDinner.setText(resources.getString(R.string.dinner));
                spaghetti.setText(resources.getString(R.string.spaghetti_title));
                salad.setText(resources.getString(R.string.salad_title));
                pancakes.setText(resources.getString(R.string.pancakes_title));
            }
        });

        btnIta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = LocaleHelper.setLocale(MainActivity.this, "it");
                resources = context.getResources();
                btnEng.setText(resources.getString(R.string.english));
                btnRus.setText(resources.getString(R.string.russian));
                btnIta.setText(resources.getString(R.string.italian));
                btnSrp.setText(resources.getString(R.string.serbian));
                btnBreakfast.setText(resources.getString(R.string.breakfast));
                btnBreakfast.setText(resources.getString(R.string.breakfast));
                btnLunch.setText(resources.getString(R.string.lunch));
                btnDinner.setText(resources.getString(R.string.dinner));
                spaghetti.setText(resources.getString(R.string.spaghetti_title));
                salad.setText(resources.getString(R.string.salad_title));
                pancakes.setText(resources.getString(R.string.pancakes_title));
            }
        });

        btnSrp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = LocaleHelper.setLocale(MainActivity.this, "sr");
                resources = context.getResources();
                btnEng.setText(resources.getString(R.string.english));
                btnRus.setText(resources.getString(R.string.russian));
                btnIta.setText(resources.getString(R.string.italian));
                btnSrp.setText(resources.getString(R.string.serbian));
                btnBreakfast.setText(resources.getString(R.string.breakfast));
                btnBreakfast.setText(resources.getString(R.string.breakfast));
                btnLunch.setText(resources.getString(R.string.lunch));
                btnDinner.setText(resources.getString(R.string.dinner));
                spaghetti.setText(resources.getString(R.string.spaghetti_title));
                salad.setText(resources.getString(R.string.salad_title));
                pancakes.setText(resources.getString(R.string.pancakes_title));
            }
        });

        btnBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (filterBreakfast) {
                    filterBreakfast = false;
                } else {
                    filterBreakfast = true;
                    filterLunch = false;
                    filterDinner = false;
                }
                updateFilter();
            }
        });

        btnLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (filterLunch) {
                    filterLunch = false;
                } else {
                    filterBreakfast = false;
                    filterLunch = true;
                    filterDinner = false;
                }
                updateFilter();
            }
        });

        btnDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (filterDinner) {
                    filterDinner = false;
                } else {
                    filterBreakfast = false;
                    filterLunch = false;
                    filterDinner = true;
                }
                updateFilter();
            }
        });

        cardSpaghetti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Spaghetti.class);
                startActivity(intent);
            }
        });

        cardSalad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Salad.class);
                startActivity(intent);
            }
        });

        cardPancakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Pancakes.class);
                startActivity(intent);
            }
        });
    }

    private void updateFilter() {
        int activeColor = Color.rgb(0, 100, 100);
        int inactiveColor = Color.rgb(0, 150, 136);

        btnBreakfast.setBackgroundColor(filterBreakfast ? activeColor : inactiveColor);
        btnLunch.setBackgroundColor(filterLunch ? activeColor : inactiveColor);
        btnDinner.setBackgroundColor(filterDinner ? activeColor : inactiveColor);

        if (!filterBreakfast && !filterLunch && !filterDinner) {
            cardPancakes.setVisibility(View.VISIBLE);
            cardSalad.setVisibility(View.VISIBLE);
            cardSpaghetti.setVisibility(View.VISIBLE);
        } else {
            cardPancakes.setVisibility(filterBreakfast ? View.VISIBLE : View.GONE);
            cardSalad.setVisibility(filterLunch ? View.VISIBLE : View.GONE);
            cardSpaghetti.setVisibility(filterDinner ? View.VISIBLE : View.GONE);
        }
    }
}