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
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<MainListItem> earthquakes = new ArrayList<>();
        earthquakes.add(new MainListItem("San Francisco", "4.5", "july,12/4/2016"));
        earthquakes.add(new MainListItem("London", "6", "april,4/8/2013"));
        earthquakes.add(new MainListItem("Tokyo", "7.5", "february,6/12/2019"));
        earthquakes.add(new MainListItem("MexicoCity", "6", "april,4/8/2013"));
        earthquakes.add(new MainListItem("Moscow", "3", "april,4/8/2013"));
        earthquakes.add(new MainListItem("Rio de Janeiro", "4", "february,6/12/2019"));
        earthquakes.add(new MainListItem("Paris", "3.8", "july,12/4/2016"));

        RecyclerView recyclerView = findViewById(R.id.my_recycler_view);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MainAdapter(this, earthquakes));
    }
}
