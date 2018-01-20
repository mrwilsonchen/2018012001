package com.example.mrwil.a2018012001;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.os.Environment;

import com.squareup.picasso.Picasso;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;
        imageView=(ImageView) findViewById(R.id.imageView);
        //Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").into(imageView);
        //Picasso.with(context).load("file:///storage/emulated/0/9967654.jpg").into(imageView);
        Picasso.with(context).load(Environment.getExternalStorageDirectory().toString()+ File.separator+"9967654.jpg").into(imageView);
        Log.d("URL",Environment.getExternalStorageDirectory().toString()+ File.separator+"9967654.jpg");
        //Picasso.with(context).load("file:///"+path).config(Bitmap.Config.RGB_565).fit().centerCrop().into(imageView);
        //Picasso.with(context).load("file:///storage/emulated/0/9967654.jpg").config(Bitmap.Config.RGB_565).fit().centerCrop().into(imageView);


    }
}
