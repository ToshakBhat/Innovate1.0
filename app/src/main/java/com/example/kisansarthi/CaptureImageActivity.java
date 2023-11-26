package com.example.kisansarthi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class CaptureImageActivity extends AppCompatActivity {
    private ImageView imgView;
    private ImageView imgView2;
    private Button btnChange;
    private Button send_to_expert;
    private Uri imageUri;
    private ActivityResultLauncher<Uri> contract = registerForActivityResult(
            new ActivityResultContracts.TakePicture(),
            new ActivityResultCallback<Boolean>() {
                @Override
                public void onActivityResult(Boolean result) {
                    if (result) {
                        imgView.setImageURI(null);
                        imgView.setImageURI(imageUri);
                    }
                }
            }
    );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture_image);

        Intent i = getIntent();
        int userName = i.getIntExtra("name",0);
        //String val = getIntent().getStringExtra('Image');
        imgView2 = findViewById(R.id.source);
        imgView2.setImageResource(userName);
        imgView = findViewById(R.id.imageView);
        btnChange = findViewById(R.id.captureButton);
        send_to_expert = findViewById(R.id.send_to_expert);

        imageUri = createImageUri();

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takePicture();
                //imgView.setImageURI(imageUri);
            }
        });
        send_to_expert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CaptureImageActivity.this,SuccessActivity.class);
                startActivity(intent);
            }
        });
    }

    private void takePicture() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
        contract.launch(imageUri);
    }

    private Uri createImageUri() {
        File imageFile = new File(getApplicationContext().getFilesDir(), "camera_photo.png");
        return FileProvider.getUriForFile(
                getApplicationContext(),
                "com.example.kisansarthi.fileprovider",
                imageFile
        );
    }
}
