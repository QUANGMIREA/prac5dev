package com.example.prac5dev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        TextView textView = new TextView(this);
//        textView.setBackgroundColor(0xffe8eaf6);
//        textView.setTextColor(0xff5c6bc0);
//        textView.setAllCaps(true);
//        textView.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
//        textView.setText("Hello Android!");
//        textView.setTypeface(Typeface.create("casual", Typeface.NORMAL));
//        textView.setTextSize(26);
//        ConstraintLayout.LayoutParams layoutParams = new
//                ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                        ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        textView.setLayoutParams(layoutParams);
//        constraintLayout.addView(textView);
//
//        setContentView(constraintLayout);

        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.editText);
        EditText textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                editText.addTextChangedListener(new TextWatcher() {
//                    public void afterTextChanged(Editable s) {}
//                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                    }
//                    public void onTextChanged(CharSequence s, int start, int before, int count)
//                    {
//                        EditText textView = findViewById(R.id.textView);
//                        editText.setText(s);
//                    }
//                });
                Snackbar snackbar = Snackbar.make(view, "Hello Android", Snackbar.LENGTH_LONG);
                snackbar.setTextColor(0XFF81C784);
                snackbar.setBackgroundTint(0XFF555555);
                snackbar.setActionTextColor(0XFF0277BD);
                snackbar.setAction("Next>>>", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(getApplicationContext(), "Next clicked!",Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
                snackbar.show();
                textView.setText("Message is:" + editText.getText());
            }
        });
    Button button2 = findViewById(R.id.button2);
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
    });



    }
}


