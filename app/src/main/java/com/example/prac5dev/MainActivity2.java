package com.example.prac5dev;
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.CheckBox;
//import android.widget.TextView;
//import android.widget.Toast;
//public class MainActivity2 extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main_2);
//    }
//    public void onCheckboxClicked(View view) {
//        // Получаем флажок
//        CheckBox checkBox = (CheckBox) view;
//        // Получаем, отмечен ли данный флажок
//        boolean checked = checkBox.isChecked();
//        TextView selection = findViewById(R.id.selection);
//        // Смотрим, какой именно из флажков отмечен
//        switch(view.getId()) {
//            case R.id.java1:
//                if (checked)
//                    Toast.makeText(this, "Вы выбрали Java ",Toast.LENGTH_LONG).show();
//                break;
//            case R.id.kotlin1:
//                if (checked)
//                    Toast.makeText(this, "Вы выбрали Kotlin",Toast.LENGTH_LONG).show();
//                break;
//            default:
//                selection.setText("");
//        }
//    }
//}

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        CheckBox javaCheckBox = findViewById(R.id.java1);
        CheckBox kotlinCheckBox = findViewById(R.id.kotlin1);
        TextView selection = findViewById(R.id.selection);

        // Đặt OnCheckedChangeListener cho CheckBox Java

        javaCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                updateSelectionText(javaCheckBox, kotlinCheckBox, selection);
            }
        });

        // Đặt OnCheckedChangeListener cho CheckBox Kotlin
        kotlinCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                updateSelectionText(javaCheckBox, kotlinCheckBox, selection);
            }
        });
        ToggleButton myToggleButton = findViewById(R.id.myToggleButton);
        myToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean on = ((ToggleButton) v).isChecked();
                if (on) {
                    Toast.makeText(getApplicationContext(), "Свет включен",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Свет выключен!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void updateSelectionText(CheckBox javaCheckBox, CheckBox kotlinCheckBox, TextView selection) {
        String selectedItems = "";
        if(javaCheckBox.isChecked())
            selectedItems += javaCheckBox.getText() + " ";
        if(kotlinCheckBox.isChecked())
            selectedItems += kotlinCheckBox.getText();
        selection.setText(selectedItems);
    }
    }
//    public void onCheckboxClicked(View view) {
//        // Получаем флажки
//        CheckBox java = findViewById(R.id.java1);
//        CheckBox kotlin = findViewById(R.id.kotlin1);
//        String selectedItems = "";
//        if(java.isChecked())
//            selectedItems +=java.getText() + " ";
//        if(kotlin.isChecked())
//            selectedItems +=kotlin.getText();
//        TextView selection = findViewById(R.id.selection);
//        selection.setText(selectedItems);
//    }
// Lấy tham chiếu đến CheckBox

