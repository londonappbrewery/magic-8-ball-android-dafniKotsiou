package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import static android.R.attr.button;
//sos to parakatw to bazw gia na leitourgisei to random
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button MyButton=findViewById(R.id.AskButton);

        final ImageView ballDisplay;
        ballDisplay=findViewById(R.id.image_eightBall);
        final int[] ballArray={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        // edw einai to action listener tou btn
        MyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d("eightBall","Your Answer");
                Random randomNumberGenerator = new Random();
                int number=randomNumberGenerator.nextInt(5);

                //bazw random th eikona
                ballDisplay.setImageResource(ballArray[number]);
            }
        });

    }
}
