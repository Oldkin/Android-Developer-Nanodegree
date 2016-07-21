package com.itrus.akashsappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_1 = (Button) findViewById(R.id.Button_1);
        assert button_1 != null;
        button_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                String text1 = getString(R.string.toast);
                String text2 = getString(R.string.button_1);
                Toast toast = Toast.makeText(context, text1 + " " + text2, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button_2 = (Button) findViewById(R.id.Button_2);
        assert button_2 != null;
        button_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                String text1 = getString(R.string.toast);
                String text2 = getString(R.string.button_2);
                Toast toast = Toast.makeText(context, text1 + " " + text2, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button_3 = (Button) findViewById(R.id.Button_3);
        assert button_3 != null;
        button_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                String text1 = getString(R.string.toast);
                String text2 = getString(R.string.button_3);
                Toast toast = Toast.makeText(context, text1 + " " + text2, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button_4 = (Button) findViewById(R.id.Button_4);
        assert button_4 != null;
        button_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                String text1 = getString(R.string.toast);
                String text2 = getString(R.string.button_4);
                Toast toast = Toast.makeText(context, text1 + " " + text2, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button_5 = (Button) findViewById(R.id.Button_5);
        assert button_5 != null;
        button_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                String text1 = getString(R.string.toast);
                String text2 = getString(R.string.button_5);
                Toast toast = Toast.makeText(context, text1 + " " + text2, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button_6 = (Button) findViewById(R.id.Button_6);
        assert button_6 != null;
        button_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getApplicationContext();
                String text1 = getString(R.string.toast);
                String text2 = getString(R.string.button_6);
                Toast toast = Toast.makeText(context, text1 + " " + text2, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
