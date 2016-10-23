package com.realm.app;

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
    }

    /**
     * 获得Realm对象
     *
     * @return
     */
    public Realm getRealm() {
        return Realm.getInstance(new RealmConfiguration.Builder(context).name(realName).build());
    }
}
