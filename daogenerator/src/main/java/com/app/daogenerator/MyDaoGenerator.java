package com.app.daogenerator;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Schema;

/**
 * Created by YangBin on 2016/10/23.
 */

public class MyDaoGenerator {

    public static void main(String args[]) throws Exception {
        Schema schema = new Schema(3, "greendao");
        addUser(schema);
        //E:\GitHub\GithubPull\RealmPKGreendao\GreendaoExample\src\main\java-gen
        new DaoGenerator().generateAll(schema, "E:\\GitHub\\GithubPull\\RealmPKGreendao\\GreendaoExample\\src\\main\\java-gen");
    }

    private static void addUser(Schema schema) {
        Entity box = schema.addEntity("User");
        box.addIdProperty().autoincrement();
        box.addStringProperty("name");
        box.addStringProperty("passWord");
        box.addStringProperty("email");
        box.addStringProperty("phoneNumber");
        box.addStringProperty("description");
    }
}