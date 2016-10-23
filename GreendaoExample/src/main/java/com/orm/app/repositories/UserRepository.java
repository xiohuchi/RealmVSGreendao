package com.orm.app.repositories;

import android.content.Context;
import android.util.Log;

import com.orm.app.App;

import java.util.List;

import greendao.User;
import greendao.UserDao;

/**
 * Created by YangBin on 2016/10/23.
 */

public class UserRepository {

    public static void insertuserList(Context context, List<User> userList) {
        long time = System.currentTimeMillis();
        getUserDao(context).insertOrReplaceInTx(userList);
        Log.d("UserRepository", "添加列表数据的时间=" + (System.currentTimeMillis() - time));
    }

    public static void insertOrUpdate(Context context, User user) {
        long time = System.currentTimeMillis();
        getUserDao(context).insertOrReplace(user);
        Log.d("UserRepository", "添加or修改数据的时间=" + (System.currentTimeMillis() - time));
    }

    public static void clearUseres(Context context) {
        long time = System.currentTimeMillis();
        getUserDao(context).deleteAll();
        Log.d("UserRepository", "清除数据的时间=" + (System.currentTimeMillis() - time));
    }

    public static void deleteUserWithId(Context context, long id) {
        getUserDao(context).delete(getUserForId(context, id));
    }

    public static User getUserForId(Context context, long id) {
        return getUserDao(context).load(id);
    }

    public static List<User> getAllUseres(Context context) {
        return getUserDao(context).loadAll();
    }

    private static UserDao getUserDao(Context c) {
        return ((App) c.getApplicationContext()).getDaoSession().getUserDao();
    }
}
