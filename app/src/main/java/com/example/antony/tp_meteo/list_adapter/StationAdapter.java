package com.example.antony.tp_meteo.list_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.antony.tp_meteo.metier.Station;

import java.util.ArrayList;

/**
 * Created by antony on 19/11/2015.
 */
public class StationAdapter extends BaseAdapter{
    private ArrayList<Station> listStation;
    private LayoutInflater layoutInflater;

    public StationAdapter(ArrayList<Station> listStation, Context context) {
        this.listStation = listStation;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return this.listStation.size();
    }

    @Override
    public Station getItem(int position) {
        return listStation.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        return null;
    }
}
