package com.example.kisansarthi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FarmerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer);
        ImageView apple = (ImageView) findViewById(R.id.apple);
        ImageView cherry = (ImageView) findViewById(R.id.cherry);
        ImageView peach = (ImageView) findViewById(R.id.peach);
        ImageView tomato = (ImageView) findViewById(R.id.tomato);
        ImageView corn = (ImageView) findViewById(R.id.corn);
        ImageView strawberry = (ImageView) findViewById(R.id.strawberry);
        ImageView mango = (ImageView) findViewById(R.id.potato);
        ImageView pepper = (ImageView) findViewById(R.id.pepper);
        ImageView raspberry = (ImageView) findViewById(R.id.raspberry);

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CaptureImageActivity.class);
                intent.putExtra("name",R.drawable.apple);
                startActivity(intent);
            }
        });

        peach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FarmerActivity.this,CaptureImageActivity.class);
                intent.putExtra("name",R.drawable.peach);
                startActivity(intent);
            }
        });

        cherry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FarmerActivity.this,CaptureImageActivity.class);
                intent.putExtra("name",R.drawable.cherry);
                startActivity(intent);
            }
        });

        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FarmerActivity.this,CaptureImageActivity.class);
                intent.putExtra("name",R.drawable.mango);
                startActivity(intent);
            }
        });

        raspberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FarmerActivity.this,CaptureImageActivity.class);
                intent.putExtra("name",R.drawable.raspberry);
                startActivity(intent);
            }
        });

        pepper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FarmerActivity.this,CaptureImageActivity.class);
                intent.putExtra("name",R.drawable.pepper);
                startActivity(intent);
            }
        });

        tomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FarmerActivity.this,CaptureImageActivity.class);
                intent.putExtra("name",R.drawable.tomato);
                startActivity(intent);
            }
        });

        corn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FarmerActivity.this,CaptureImageActivity.class);
                intent.putExtra("name",R.drawable.corn);
                startActivity(intent);
            }
        });

        strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FarmerActivity.this,CaptureImageActivity.class);
                intent.putExtra("name",R.drawable.strawberry);
                startActivity(intent);
            }
        });
    }
}