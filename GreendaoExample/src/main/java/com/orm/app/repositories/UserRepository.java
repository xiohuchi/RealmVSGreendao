package com.orm.app.repositories;

import android.util.Log;

import com.orm.app.App;

import java.util.List;

import greendao.User;
import greendao.UserDao;

/**
 * Created by YangBin on 2016/10/23.
 */

public class UserRepository {

    public static void insertuserList(List<User> userList) {
        long time = System.currentTimeMillis();
        getUserDao().insertOrReplaceInTx(userList);
        Log.d("UserRepository", "添加列表数据的时间=" + (System.currentTimeMillis() - time));
    }

    public static void insertOrUpdate(User user) {
        long time = System.currentTimeMillis();
        getUserDao().insertOrReplace(user);
        Log.d("UserRepository", "添加or修改数据的时间=" + (System.currentTimeMillis() - time));
    }

    public static void clearUseres() {
        long time = System.currentTimeMillis();
        getUserDao().deleteAll();
        Log.d("UserRepository", "清除数据的时间=" + (System.currentTimeMillis() - time));
    }

    public static void deleteUserWithId(long id) {
        getUserDao().delete(getUserForId(id));
    }

    public static User getUserForId(long id) {
        return getUserDao().load(id);
    }

    public static List<User> getAllUseres() {
        return getUserDao().loadAll();
    }

    private static UserDao getUserDao() {
        return App.getDaoInstant().getUserDao();
    }
}
