package com.example.antony.tp_meteo.SQLite.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.antony.tp_meteo.SQLite.MeteoOpenHelper;
import com.example.antony.tp_meteo.SQLite.SQLiteConstante;

/**
 * Created by antony on 04/12/2015.
 */
public abstract class AbstractDAO<T> implements SQLiteConstante{
    private SQLiteDatabase bdd;
    private MeteoOpenHelper maBase;

    public AbstractDAO(Context context) {
        maBase = new MeteoOpenHelper(context, DB_NAME, null, DB_VERSION);
    }

    public void open(){
        bdd = maBase.getWritableDatabase();
    }

    public void close(){ bdd.close(); }

    public T getById(String id){
        bdd.
    }


}
