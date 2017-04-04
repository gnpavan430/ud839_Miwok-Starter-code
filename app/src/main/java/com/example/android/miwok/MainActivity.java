/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button numbersButton;
    private Button familyButton;
    private Button colorsButton;
    private Button phrasesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //On click listener implementation of Numbers button
        numbersButton = (Button) findViewById(R.id.numbers);
        numbersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumbers(v);
            }
        });
        //On click listener implementation of Family button
        familyButton = (Button) findViewById(R.id.family);
        familyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFamily(v);

            }
        });
        //On click listener implementation of Family button
        colorsButton = (Button) findViewById(R.id.colors);
        colorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             openColors(v);
            }
        });
        //On click listener implementation of Phrases button
        phrasesButton = (Button) findViewById(R.id.phrases);
        phrasesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhrases(v);
            }
        });
    }

    //Intent implementation to Numbers class
    public void openNumbers(View view) {
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);

    }
    //Intent implementation to Family class
    public void openFamily(View view) {
        Intent intent = new Intent(this,FamilyMembersActivity.class);
        startActivity(intent);

    }
    //Intent implementation to Colors class
    public void openColors(View view) {
        Intent intent = new Intent(this,ColorsActivity.class);
        startActivity(intent);

    }
    //Intent implementation to Phrases class
    public void openPhrases(View view) {
        Intent intent = new Intent(this,PhrasesActivity.class);
        startActivity(intent);


    }
}
