package com.example.xushengxia.testgreendao.bean;

/**
 * Created by xushengxia on 2019/5/13.
 */

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Keep;

import com.example.xushengxia.testgreendao.db.DaoSession;
import com.example.xushengxia.testgreendao.db.StudentDao;

@Entity(//表明这个实体类会在数据库中生成一个与之对应的表
        //schema="myschema",告知GreenDao当前实体属于哪个schema
        active = true//标记一个实体处于一个活跃状态，活动实体有更新、删除和刷新方法
        ,nameInDb = "Student",
        indexes = {@Index(value = "sName DESC",unique = true)},
        createInDb = true,//标记创建数据库表（默认：true）
        generateConstructors = true,//自动创建全参构造方法（同时会生成一个无参构造方法）（默认：true）
        generateGettersSetters = true//自动生成 getters and setters 方法（默认：true）
)
public class Student {
    
    @Id
    private String sId;

    @Index
    private String sName;
    private int age;
    private String sex;


/** Used to resolve relations */
@Generated(hash = 2040040024)
private transient DaoSession daoSession;

/** Used for active entity operations. */
@Generated(hash = 1943931642)
private transient StudentDao myDao;
    @Generated(hash = 1979095405)
    public Student(String sId, String sName, int age, String sex) {
        this.sId = sId;
        this.sName = sName;
        this.age = age;
        this.sex = sex;
    }
public Student() {
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
public int getAge() {
    return this.age;
}
public void setAge(int age) {
    this.age = age;
}
public String getSex() {
    return this.sex;
}
public void setSex(String sex) {
    this.sex = sex;
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
@Generated(hash = 1701634981)
public void __setDaoSession(DaoSession daoSession) {
    this.daoSession = daoSession;
    myDao = daoSession != null ? daoSession.getStudentDao() : null;
}
}
