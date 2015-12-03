package com.example.antony.tp_meteo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.antony.tp_meteo.list_adapter.StationAdapter;
import com.example.antony.tp_meteo.metier.Mesure;
import com.example.antony.tp_meteo.metier.Station;

import java.util.ArrayList;

public class ListStationActivity extends AppCompatActivity {

    ListView listView_station;
    ArrayList<Station> list_station = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_station);

        ArrayList<Mesure> mesureArrayList = new ArrayList<>();
        mesureArrayList.add(new Mesure("2015-10-25 10:00:00", "5.5", "4", "1008", null, null, null, null));

        list_station.add(new Station("Montélimar", "Les station du sud", mesureArrayList));
        mesureArrayList = new ArrayList<>();
        mesureArrayList.add(new Mesure("2015-10-25 10:00:00", "5.5", "4", "1008", null, null, null, null));
        mesureArrayList.add(new Mesure("2015-10-25 10:20:00", "15.5", "6", "1008", null, null, null, null));
        mesureArrayList.add(new Mesure("2015-10-25 10:00:00", "25.5", "9", "1008", null, null, null, null));
        list_station.add(new Station("Albousiere", "Les station du nord", mesureArrayList));

        listView_station = (ListView) findViewById(R.id.listView_station);
        listView_station.setAdapter(new StationAdapter(list_station, this));
        listView_station.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                StationAdapter stationAdapter = (StationAdapter) parent.getAdapter();
                Intent i = new Intent(getApplicationContext(), ListMesureActivity.class);
                i.putExtra("station", stationAdapter.getItem(position));
                startActivity(i);
            }
        });
    }
}
