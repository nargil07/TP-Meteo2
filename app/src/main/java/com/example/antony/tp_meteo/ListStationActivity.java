package com.example.antony.tp_meteo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.antony.tp_meteo.metier.Station;

import java.util.ArrayList;

public class ListStationActivity extends AppCompatActivity {

    ListView listView_station;
    ArrayList<Station> list_station = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_station);

        list_station.add(new Station("Montélimar", "Les station du sud"));
        list_station.add(new Station("Albousiere", "Les station du nord"));

        listView_station = (ListView) findViewById(R.id.listView_station);
    }
}
