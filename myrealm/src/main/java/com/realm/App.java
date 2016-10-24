package com.realm;

import android.app.Application;
import android.content.Context;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by YangBin on 2016/10/23.
 */

public class App extends Application {
    private Context context;
    private String realName = "myRealm.realm";


    @Override
    public void onCreate() {
        super.onCreate();
        this.context = getApplicationContext();
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this).name(realName).build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }


}
