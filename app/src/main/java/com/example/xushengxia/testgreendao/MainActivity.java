package com.example.xushengxia.testgreendao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xushengxia.testgreendao.MyApplication.MyApplication;
import com.example.xushengxia.testgreendao.bean.Student;
import com.example.xushengxia.testgreendao.db.DaoSession;
import com.example.xushengxia.testgreendao.db.StudentDao;
import com.example.xushengxia.testgreendao.db.UserDao;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnadd;
    private Button btnquery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApplication application = (MyApplication) getApplication();
        DaoSession daoSession = application.getDaoSession();
        final StudentDao studentDao = daoSession.getStudentDao();

        btnadd = findViewById(R.id.btn_add);
        btnquery = findViewById(R.id.btn_query);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Student> list = new ArrayList<>();
                Student student1 = new Student();
                student1.setSId("001");
                student1.setAge(20);
                student1.setSex("男性");
                student1.setSName("张三");
                list.add(student1);

                Student student2 = new Student();
                student2.setSId("002");
                student2.setAge(34);
                student2.setSex("男性");
                student2.setSName("李四");
                list.add(student2);

                Student student3 = new Student();
                student3.setSId("003");
                student3.setAge(45);
                student3.setSex("男性");
                student3.setSName("王五");
                list.add(student3);

                Student student4 = new Student();
                student4.setSId("004");
                student4.setAge(23);
                student4.setSex("女性");
                student4.setSName("小明");
                list.add(student4);

                Student student5 = new Student();
                student5.setSId("005");
                student5.setAge(23);
                student5.setSex("女性");
                student5.setSName("小众");
                list.add(student5);

                Student student6 = new Student();
                student6.setSId("006");
                student6.setAge(46);
                student6.setSex("女性");
                student6.setSName("小张");
                list.add(student6);

                Student student7 = new Student();
                student7.setSId("007");
                student7.setAge(25);
                student7.setSex("女性");
                student7.setSName("潇湘");
                list.add(student7);

                Student student8 = new Student();
                student8.setSId("008");
                student8.setAge(43);
                student8.setSex("男性");
                student8.setSName("小马");
                list.add(student8);

                Student student9 = new Student();
                student9.setSId("009");
                student9.setAge(23);
                student9.setSex("女性");
                student9.setSName("小明");
                list.add(student9);

                Student student10 = new Student();
                student10.setSId("010");
                student10.setAge(23);
                student10.setSex("女性");
                student10.setSName("fgsd");
                list.add(student10);

                studentDao.insertInTx(list);
            }
        });

        btnquery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Student> studentList = studentDao.queryBuilder()
                        .where(StudentDao.Properties.Age.gt(18))
                        .build().list();
                System.out.println(studentList);

            }
        });
    }


}
