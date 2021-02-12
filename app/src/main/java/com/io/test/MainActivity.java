package com.io.test;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);


        // явный интент
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//
//                startActivity(intent);
//
//
//            }
//        });
        // не явный интент
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Отправка текста

//                Intent intent = new Intent();
//                intent.putExtra(Intent.EXTRA_TEXT, "GeekTech");
//                intent.setAction(Intent.ACTION_SEND);
//                intent.setType("text/plain");
//                startActivity(intent);


//                //Ввод номера телефона
//                String phoneNumber = "tel: (+996)700700700";
//                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(phoneNumber));
//                startActivity(intent);


//                Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA); //Фото
                // или
//                Intent intent = new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA); //Видео

//                startActivity(intent);

                // интент на результат
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                startActivityForResult(intent, 202);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 202) {
            if (resultCode == RESULT_OK) {
                String info = data.getStringExtra("key");
                Log.e("text", info);
            }
        }
    }
}