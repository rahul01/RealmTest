package com.test.realmtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemList = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            Item item = new Item();
            itemList.add(item);
        }
    }

    public void test(View v) {
        DataBase dataBase = new DataBase(this);

        dataBase.deleteExistingAndInsertNewItemsInDb(itemList);
        dataBase.getItemListFromDB();

        dataBase.deleteExistingAndInsertNewItemsInRealm(itemList);
        dataBase.getItemListFromRealm();
    }
}
