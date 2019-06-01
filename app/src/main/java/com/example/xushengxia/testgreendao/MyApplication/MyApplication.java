package com.example.xushengxia.testgreendao.MyApplication;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.example.xushengxia.testgreendao.db.DaoMaster;
import com.example.xushengxia.testgreendao.db.DaoSession;


/**
 * Created by xushengxia on 2019/5/8.
 */

public class MyApplication extends Application {

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        iniGreenDao();
    }

    /**
     * 初始化引用greendao
     */
    private void iniGreenDao() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,"customer.db");
        SQLiteDatabase database = helper.getWritableDatabase();
        DaoMaster dm = new DaoMaster(database);
        daoSession = dm.newSession();
    }

    /**
     * 获取daoSession
     */
    public DaoSession getDaoSession() {
        return daoSession;
    }
}
