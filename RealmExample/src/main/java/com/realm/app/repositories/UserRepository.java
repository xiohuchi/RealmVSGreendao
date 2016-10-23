package com.realm.app.repositories;

import android.content.Context;
import android.util.Log;

import com.realm.app.User;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by YangBin on 2016/10/23.
 */

public class UserRepository {

    public static void insertuserList(Context context, List<User> userList) {
        long time = System.currentTimeMillis();
        Log.d("UserRepository", "添加列表数据的时间=" + (System.currentTimeMillis() - time));
    }

    public static void insertOrUpdate(Context context, User user) {
        long time = System.currentTimeMillis();
        Log.d("UserRepository", "添加or修改数据的时间=" + (System.currentTimeMillis() - time));
    }

    public static void clearUseres(Context context) {
        long time = System.currentTimeMillis();
        Log.d("UserRepository", "清除数据的时间=" + (System.currentTimeMillis() - time));
    }

    public static void deleteUserWithId(Context context, long id) {
    }
}
