package com.example.horizontalrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView, recyclerView1;

    MainAdapter mainAdapter;
    MainAdapter1 mainAdapter1;

    ArrayList<Monan> monans;

    ArrayList<Monan1> monans1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        recyclerView1 = findViewById(R.id.recycler_view1);

        //Create array
        Integer[] hinhmonan = {R.drawable.hinh_1, R.drawable.hinh_2, R.drawable.hinh_3
                , R.drawable.hinh_4, R.drawable.hinh_5};

        //Create String Array
        String[] tenmonan = {"Amun Restaurant & Lounge", "Bao Bei - Chinese Restaurant - Viettel Tower", "Hao Yu - Grilled Fish Restaurant"
                , "Play Dim Sum - Thái Văn Lung", "Gyu Shige - Ngưu Phồn - Nướng Nhật Bản - Hồ Tùng Mậu"};

        String[] diachi = {"Tầng 3, 215-217 Lý Tự Trọng, P. Bến Thành, Quận 1", "Tầng 2 Viettel Tower, 285 Cách Mạng Tháng 8, P. 12, Quận 10"
                , "17-19 Hồ Xuân Hương, P. 6, Quận 3", "12 -14 Thái Văn Lung, P. Bến Nghé, Quận 1", "119 Hồ Tùng Mậu, P. Bến Nghé, Quận 1"};


        String[] khuyenmai = {"Ăn tối - Giảm 25%", "Cả ngày - Giảm 10%"
                , "Cả ngày - Giảm 30%", "Cả ngày - Giảm 35%", "Cả ngày - Giảm 15%"};

        //Create array
        Integer[] hinhmonan1 = {R.drawable.hinh_6, R.drawable.hinh_7
                , R.drawable.hinh_8, R.drawable.hinh_9, R.drawable.hinh_10};

        //Create String Array
        String[] tenmonan1 = {"The First Steakhouse - Cách Mạng Tháng 8", "Sushi Osaka 88 Premium", "Póc - Nướng & Bia"
                , "Yu Hua - Buffet Lẩu Đài Loan", "Nhà Hàng Parsley - Steak, Pasta & Hơn Thế Nữa!"};

        String[] diachi1 = {"6/7 Cách Mạng Tháng 8, Quận 1", "3A Ngô Văn Năm, P. Bến Nghé, Quận 1", "62 Trần Não, P. Bình An, Quận 2"
                , "291B Lê Văn Sỹ, P. 1, Quận Tân Bình", "130 Nguyễn Trãi, P. Bến Thành, Quận 1"};


        String[] khuyenmai1 = {"Ăn tối - Giảm 25%", "Cả ngày - Giảm 35%", "Cả ngày - Giảm 25%"
                , "Ăn trưa - Giảm 30%", "Cả ngày - Giảm 25%"};

        //Initalize Arraylist
        monans = new ArrayList<>();
        for (int i = 0; i < hinhmonan.length; i++) {
            Monan monan = new Monan(hinhmonan[i], tenmonan[i], diachi[i], khuyenmai[i]);
            monans.add(monan);
        }

        monans1 = new ArrayList<>();
        for (int i = 0; i < hinhmonan1.length; i++) {
            Monan1 monan1 = new Monan1(hinhmonan1[i], tenmonan1[i], diachi1[i], khuyenmai1[i]);
            monans1.add(monan1);
        }


        //Design Horizontal Layout
        Context context;
        LinearLayoutManager layoutManager = new LinearLayoutManager(
                MainActivity.this, LinearLayoutManager.HORIZONTAL, false);

        Context context1;
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(
                MainActivity.this, LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        //Initalize MainAdapter
        mainAdapter = new MainAdapter(MainActivity.this, monans);
        recyclerView.setAdapter(mainAdapter);

        mainAdapter1 = new MainAdapter1(MainActivity.this, monans1);
        recyclerView1.setAdapter(mainAdapter1);

    }
}