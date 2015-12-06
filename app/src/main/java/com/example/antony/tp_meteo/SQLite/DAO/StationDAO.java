package com.example.antony.tp_meteo.SQLite.DAO;

import android.content.Context;

import com.example.antony.tp_meteo.metier.Station;

import org.json.JSONObject;

/**
 * Created by Antony on 06/12/2015.
 */
public class StationDAO extends AbstractDAO<Station> {


    public StationDAO(Context context) {
        super(context);
    }

    @Override
    public Station getById(String id) {
        return null;
    }

    @Override
    public void insertByJson(JSONObject jsonObject) {
    }
}
