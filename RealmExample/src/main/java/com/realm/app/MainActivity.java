package com.realm.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;
import java.util.UUID;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testAdd();
        testQueryAgeLessThan15();
    }

    RealmConfiguration realmConfig = new RealmConfiguration
            .Builder(this)
            .build();
    Realm realm = Realm.getInstance(realmConfig);

    public void testAdd() {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                for (int i = 0; i < 10; i++) {
                    User user = realm.createObject(User.class);
                    user.setName("user" + i);
                    user.setAge(10 + i);
                    user.setId(UUID.randomUUID().toString());
                }
            }
        });
    }

    public void testQueryAgeLessThan15() {
        List<User> users = realm.where(User.class).lessThan("age", 15).findAll();
        for (User user : users) {
            Log.d("MainActivity", "id:" + user.getId() + " name:" + user.getName() + " age:" + user.getAge());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }
}
