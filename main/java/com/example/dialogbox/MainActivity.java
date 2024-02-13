package com.example.dialogbox;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
        //viewpager
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //cardViewObject
            View cardView = findViewById(R.id.cardView);
            View cardView1 = findViewById(R.id.cardView1);
            View cardView2 = findViewById(R.id.cardView2);
            //buttonObject
            Button button1 = findViewById(R.id.button1);
            Button button2 = findViewById(R.id.button2);
            Button button3 = findViewById(R.id.button3);
            //cardviewMethod
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    cardView.setBackgroundColor(getResources().getColor(R.color.light_brown)); // Change to your desired click color

                    // Revert color after delay or on another event
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            cardView.setBackgroundColor(getResources().getColor(R.color.white)); // Change back to original color
                        }
                    }, 200); // Delay in milliseconds
                }
        });
            cardView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    cardView1.setBackgroundColor(getResources().getColor(R.color.light_brown)); // Change to your desired click color

                    // Revert color after delay or on another event
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            cardView1.setBackgroundColor(getResources().getColor(R.color.white)); // Change back to original color
                        }
                    }, 200); // Delay in milliseconds
                }
        });
            cardView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    cardView2.setBackgroundColor(getResources().getColor(R.color.light_brown)); // Change to your desired click color

                    // Revert color after delay or on another event
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            cardView2.setBackgroundColor(getResources().getColor(R.color.white)); // Change back to original color
                        }
                    }, 200); // Delay in milliseconds
                }
            });
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "Dialog Box 1 Clicked",Toast.LENGTH_LONG).show();
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "Dialog Box 2 Clicked",Toast.LENGTH_LONG).show();
                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //dialogbox
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setView(R.layout.dialog_box);
                    builder.show();
                    //toast
                    Toast.makeText(getApplicationContext(), "Dialog Box 3 Clicked",Toast.LENGTH_LONG).show();
                }
            });
        }
}

