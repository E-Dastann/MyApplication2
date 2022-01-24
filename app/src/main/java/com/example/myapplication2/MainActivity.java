package com.example.myapplication2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.internal.TextWatcherAdapter;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText password;
    private EditText emileAddress;
    private TextView out;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        password = findViewById(R.id.password);
        emileAddress = findViewById(R.id.emile_address);
        out = findViewById(R.id.Nuber_2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().equals("admin") && emileAddress.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "Welcome new page", Toast.LENGTH_LONG).show();
                    button.setVisibility(view.GONE);
                } else {
                    Toast.makeText(MainActivity.this, "Извините вы не пополнили полю ", Toast.LENGTH_LONG).show();
                }
       /*         if (out.getAlpha() == 1) {
                    out.animate().alpha(0);
                } else {
                    out.animate().alpha(1);
                }*/
            }
        });



        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (password.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.purple_200));

                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }

        });
        emileAddress.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (emileAddress.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.purple_200));

                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }


            }
        });

    }


}









