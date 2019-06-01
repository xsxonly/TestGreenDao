package com.example.xushengxia.testgreendao.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.DaoException;
import com.example.xushengxia.testgreendao.db.DaoSession;
import com.example.xushengxia.testgreendao.db.UserDao;

/**
 * Created by xushengxia on 2019/5/8.
 * 创建一个实体类
 */

@Entity(//表明这个实体类会在数据库中生成一个与之对应的表
        //schema="myschema",告知GreenDao当前实体属于哪个schema
        active = true//标记一个实体处于一个活跃状态，活动实体有更新、删除和刷新方法
        ,nameInDb = "User",
        indexes = {@Index(value = "sName DESC",unique = true)},
        createInDb = true,//标记创建数据库表（默认：true）
        generateConstructors = true,//自动创建全参构造方法（同时会生成一个无参构造方法）（默认：true）
        generateGettersSetters = true//自动生成 getters and setters 方法（默认：true）

)
public class User {

    @Id
    private String sId;

    @Index(unique = true)
    private String sName;
    private String age;
    private String gender;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1507654846)
    private transient UserDao myDao;

    @Generated(hash = 1593573659)
    public User(String sId, String sName, String age, String gender) {
        this.sId = sId;
        this.sName = sName;
        this.age = age;
        this.gender = gender;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public String getsId() {
        return sId;
    }

    public String getsName() {
        return sName;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


    public void setsId(String sId) {
        this.sId = sId;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSId() {
        return this.sId;
    }

    public void setSId(String sId) {
        this.sId = sId;
    }

    public String getSName() {
        return this.sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 2059241980)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUserDao() : null;
    }
}
