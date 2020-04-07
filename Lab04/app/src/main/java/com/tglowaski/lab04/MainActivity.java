package com.tglowaski.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            jsonString("https://jsonplaceholder.typicode.com/users");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void jsonString(String url) throws IOException {
        URL link = new URL(url);
        link.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String output = in.readLine();
        Log.i(null,output);
    }
}
