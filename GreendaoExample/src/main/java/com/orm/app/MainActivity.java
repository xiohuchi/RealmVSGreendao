package com.orm.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.orm.app.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import greendao.User;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_content)
    TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_addData, R.id.btn_delectData, R.id.btn_selectData, R.id.btn_addList})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_addData:
                break;
            case R.id.btn_delectData:
                UserRepository.clearUseres(this);
                break;
            case R.id.btn_selectData:
                break;
            case R.id.btn_addList:
                List<User> userList = new ArrayList<>();
                for (int i = 0; i < 300000; i++) {
                    //Long id, String name, String passWord, String email, String phoneNumber, String description
                    userList.add(new User(null, "name" + i, "passWord" + i, "email" + i, "phoneNumber" + i, "description" + i));
                }
                UserRepository.insertuserList(this, userList);
                break;
        }
    }
}
