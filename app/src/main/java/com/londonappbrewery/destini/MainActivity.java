package com.londonappbrewery.destini;

import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button mButtonTop;
    private Button mButtonBottom;
    private TextView mStoryTextView;

    private int mStoryIndex = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);


        mStoryTextView.setText(R.string.T1_Story);
        mButtonTop.setText(R.string.T1_Ans1);
        mButtonBottom.setText(R.string.T1_Ans2);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(mStoryIndex){
                    case 1: case 2:
                        mStoryIndex = 3;
                        updateStory(3);
                        break;
                    case 3:
                        mStoryIndex = 6;
                        updateStory(6);
                        break;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(mStoryIndex){
                    case 1:
                        mStoryIndex = 2;
                        updateStory(2);
                        break;
                    case 2:
                        mStoryIndex = 4;
                        updateStory(4);
                        break;
                    case 3:
                        mStoryIndex = 5;
                        updateStory(5);
                        break;
                }}
        });

    }

    private void updateStory(int i) {
        if (i == 2) {
            mStoryTextView.setText(R.string.T2_Story);
            mButtonTop.setText(R.string.T2_Ans1);
            mButtonBottom.setText(R.string.T2_Ans2);
        }else if (i == 3) {
            mStoryTextView.setText(R.string.T3_Story);
            mButtonTop.setText(R.string.T3_Ans1);
            mButtonBottom.setText(R.string.T3_Ans2);
        }else if(i == 4) {
            mStoryTextView.setText(R.string.T4_End);
            mButtonBottom.setVisibility(View.GONE);
            mButtonTop.setVisibility(View.GONE);
        }else if (i == 5) {
            mStoryTextView.setText(R.string.T5_End);
            mButtonBottom.setVisibility(View.GONE);
            mButtonTop.setVisibility(View.GONE);
        }else if(i == 6 ) {
            mStoryTextView.setText(R.string.T6_End);
            mButtonBottom.setVisibility(View.GONE);
            mButtonTop.setVisibility(View.GONE);
        }
    }
}
