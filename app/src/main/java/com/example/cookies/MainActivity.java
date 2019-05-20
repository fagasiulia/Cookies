package com.example.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten
     */
    public void eatCookie(View view){
        // Change the text
        TextView hungryToFull = (TextView)findViewById(R.id.status_text_view);
        hungryToFull.setText("I'm so full");

        //Change the image
        ImageView cookie = (ImageView)findViewById(R.id.android_cookie_image_view);
        cookie.setImageDrawable(getResources().getDrawable(R.drawable.after_cookie));

        //Change the button text
        Button eat = (Button) findViewById(R.id.eat_button);
        eat.setText("NEW COOKIE");
    }
}
