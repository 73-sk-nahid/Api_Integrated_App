package com.example.location_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;
import android.os.Handler;

import java.io.StringReader;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.editTextText2);
        bt = findViewById(R.id.button);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String IP = et.getText().toString().trim();
                Log.d("IP", IP);
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("et", IP);
                startActivity(intent);
            }
        });
    }
  /* public void getIpDetails(View view){
        String tempUrl = "";
        String IP = et.getText().toString().trim();
        if(IP.equals("")){
            tv.setTextColor(Color.rgb(255,0,0));
            tv.setText("Please Enter an IP Address Please");
        } else {
            tempUrl = url + IP;
            Log.d("MyURL: ", tempUrl);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, tempUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                String output = "";
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    String country = jsonResponse.getString("country");

                    output += "Country: " + country;
                    tv.setText(output);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.toString().trim(), Toast.LENGTH_SHORT).show();
                Log.d("Error", error.toString());

            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(stringRequest);
    }
    }*/


}