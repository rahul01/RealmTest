package com.test.realmtest;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;


public class DataBase extends SQLiteOpenHelper {

    private Context mContext;

    private static final String NAME = "name";

    private static final String PROPERTY1 = "PROPERTY1";
    private static final String PROPERTY2 = " PROPERTY2";
    private static final String PROPERTY3 = " PROPERTY3";
    private static final String PROPERTY4 = " PROPERTY4";
    private static final String PROPERTY5 = " PROPERTY5";
    private static final String PROPERTY6 = " PROPERTY6";
    private static final String PROPERTY7 = " PROPERTY7";
    private static final String PROPERTY8 = " PROPERTY8";
    private static final String PROPERTY9 = " PROPERTY9";
    private static final String PROPERTY10 = " PROPERTY10";
    private static final String PROPERTY11 = " PROPERTY11";
    private static final String PROPERTY12 = " PROPERTY12";
    private static final String PROPERTY13 = " PROPERTY13";
    private static final String PROPERTY14 = " PROPERTY14";
    private static final String PROPERTY15 = " PROPERTY15";
    private static final String PROPERTY16 = " PROPERTY16";
    private static final String PROPERTY17 = " PROPERTY17";
    private static final String PROPERTY18 = " PROPERTY18";
    private static final String PROPERTY19 = " PROPERTY19";
    private static final String PROPERTY20 = " PROPERTY20";
    private static final String PROPERTY21 = " PROPERTY21";
    private static final String PROPERTY22 = " PROPERTY22";
    private static final String PROPERTY23 = " PROPERTY23";
    private static final String PROPERTY24 = " PROPERTY24";
    private static final String PROPERTY25 = " PROPERTY25";
    private static final String PROPERTY26 = " PROPERTY26";
    private static final String PROPERTY27 = " PROPERTY27";
    private static final String PROPERTY28 = " PROPERTY28";
    private static final String PROPERTY29 = " PROPERTY29";
    private static final String PROPERTY30 = " PROPERTY30";
    private static final String PROPERTY31 = " PROPERTY31";
    private static final String PROPERTY32 = " PROPERTY32";
    private static final String PROPERTY33 = " PROPERTY33";
    private static final String PROPERTY34 = " PROPERTY34";
    private static final String PROPERTY35 = " PROPERTY35";
    private static final String PROPERTY36 = " PROPERTY36";
    private static final String PROPERTY37 = " PROPERTY37";
    private static final String PROPERTY38 = " PROPERTY38";
    private static final String PROPERTY39 = " PROPERTY39";
    private static final String PROPERTY40 = " PROPERTY40";
    private static final String PROPERTY41 = " PROPERTY41";
    private static final String PROPERTY42 = " PROPERTY42";
    private static final String PROPERTY43 = " PROPERTY43";
    private static final String PROPERTY44 = " PROPERTY44";
    private static final String PROPERTY45 = " PROPERTY45";
    private static final String PROPERTY46 = " PROPERTY46";
    private static final String PROPERTY47 = " PROPERTY47";
    private static final String PROPERTY48 = " PROPERTY48";
    private static final String PROPERTY49 = " PROPERTY49";
    private static final String PROPERTY50 = " PROPERTY50";


    private static final String CREATE_TABLE = "CREATE TABLE " + NAME + "("

            + PROPERTY1 + " TEXT, "
            + PROPERTY2 + " TEXT, "
            + PROPERTY3 + " TEXT, "
            + PROPERTY4 + " TEXT, "
            + PROPERTY5 + " TEXT, "
            + PROPERTY6 + " TEXT, "
            + PROPERTY7 + " TEXT, "
            + PROPERTY8 + " TEXT, "
            + PROPERTY9 + " TEXT, "
            + PROPERTY10 + " TEXT, "
            + PROPERTY11 + " TEXT, "
            + PROPERTY12 + " TEXT, "
            + PROPERTY13 + " TEXT, "
            + PROPERTY14 + " TEXT, "
            + PROPERTY15 + " TEXT, "
            + PROPERTY16 + " TEXT, "
            + PROPERTY17 + " TEXT, "
            + PROPERTY18 + " TEXT, "
            + PROPERTY19 + " TEXT, "
            + PROPERTY20 + " TEXT, "
            + PROPERTY21 + " TEXT, "
            + PROPERTY22 + " TEXT, "
            + PROPERTY23 + " TEXT, "
            + PROPERTY24 + " TEXT, "
            + PROPERTY25 + " TEXT, "
            + PROPERTY26 + " TEXT, "
            + PROPERTY27 + " TEXT, "
            + PROPERTY28 + " TEXT, "
            + PROPERTY29 + " TEXT, "
            + PROPERTY30 + " TEXT, "
            + PROPERTY31 + " TEXT, "
            + PROPERTY32 + " TEXT, "
            + PROPERTY33 + " TEXT, "
            + PROPERTY34 + " TEXT, "
            + PROPERTY35 + " TEXT, "
            + PROPERTY36 + " TEXT, "
            + PROPERTY37 + " TEXT, "
            + PROPERTY38 + " TEXT, "
            + PROPERTY39 + " TEXT, "
            + PROPERTY40 + " TEXT, "
            + PROPERTY41 + " TEXT, "
            + PROPERTY42 + " TEXT, "
            + PROPERTY43 + " TEXT, "
            + PROPERTY44 + " TEXT, "
            + PROPERTY45 + " TEXT, "
            + PROPERTY46 + " TEXT, "
            + PROPERTY47 + " TEXT, "
            + PROPERTY48 + " TEXT, "
            + PROPERTY49 + " TEXT, "
            + PROPERTY50 + " TEXT "
            + ");";


    public static final String[] PROPERTYLIST =
            {
                    PROPERTY1,
                    PROPERTY2,
                    PROPERTY3,
                    PROPERTY4,
                    PROPERTY5,
                    PROPERTY6,
                    PROPERTY7,
                    PROPERTY8,
                    PROPERTY9,
                    PROPERTY10,
                    PROPERTY11,
                    PROPERTY12,
                    PROPERTY13,
                    PROPERTY14,
                    PROPERTY15,
                    PROPERTY16,
                    PROPERTY17,
                    PROPERTY18,
                    PROPERTY19,
                    PROPERTY20,
                    PROPERTY21,
                    PROPERTY22,
                    PROPERTY23,
                    PROPERTY24,
                    PROPERTY25,
                    PROPERTY26,
                    PROPERTY27,
                    PROPERTY28,
                    PROPERTY29,
                    PROPERTY30,
                    PROPERTY31,
                    PROPERTY32,
                    PROPERTY33,
                    PROPERTY34,
                    PROPERTY35,
                    PROPERTY36,
                    PROPERTY37,
                    PROPERTY38,
                    PROPERTY39,
                    PROPERTY40,
                    PROPERTY41,
                    PROPERTY42,
                    PROPERTY43,
                    PROPERTY44,
                    PROPERTY45,
                    PROPERTY46,
                    PROPERTY47,
                    PROPERTY48,
                    PROPERTY49,
                    PROPERTY50

            };


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public DataBase(Context context) {
        super(context, NAME, null, 1);
        mContext = context;
    }


    //SQLite Insert
    public void deleteExistingAndInsertNewItemsInDb(ArrayList<Item> itemList) {
        Log.d("REALM_TEST", "No. of Records :: " + itemList.size());
        long start;
        if (itemList != null && itemList.size() > 0) {
            start = System.nanoTime();
            SQLiteDatabase db = getWritableDatabase();
            db.beginTransaction();
            // delete existing items from the item list table for the provided userId
            db.delete(NAME, PROPERTY1 + "=" + PROPERTY1, null);
            // insert new item list into local DB.
            for (Item item : itemList) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(PROPERTY1, item.getPROPERTY1());
                contentValues.put(PROPERTY2, item.getPROPERTY2());
                contentValues.put(PROPERTY3, item.getPROPERTY3());
                contentValues.put(PROPERTY4, item.getPROPERTY4());
                contentValues.put(PROPERTY5, item.getPROPERTY5());
                contentValues.put(PROPERTY6, item.getPROPERTY6());
                contentValues.put(PROPERTY7, item.getPROPERTY7());
                contentValues.put(PROPERTY8, item.getPROPERTY8());
                contentValues.put(PROPERTY9, item.getPROPERTY9());
                contentValues.put(PROPERTY10, item.getPROPERTY10());
                contentValues.put(PROPERTY11, item.getPROPERTY11());
                contentValues.put(PROPERTY12, item.getPROPERTY12());
                contentValues.put(PROPERTY13, item.getPROPERTY13());
                contentValues.put(PROPERTY14, item.getPROPERTY14());
                contentValues.put(PROPERTY15, item.getPROPERTY15());
                contentValues.put(PROPERTY16, item.getPROPERTY16());
                contentValues.put(PROPERTY17, item.getPROPERTY17());
                contentValues.put(PROPERTY18, item.getPROPERTY18());
                contentValues.put(PROPERTY19, item.getPROPERTY19());
                contentValues.put(PROPERTY20, item.getPROPERTY20());
                contentValues.put(PROPERTY21, item.getPROPERTY21());
                contentValues.put(PROPERTY22, item.getPROPERTY22());
                contentValues.put(PROPERTY23, item.getPROPERTY23());
                contentValues.put(PROPERTY24, item.getPROPERTY24());
                contentValues.put(PROPERTY25, item.getPROPERTY25());
                contentValues.put(PROPERTY26, item.getPROPERTY26());
                contentValues.put(PROPERTY27, item.getPROPERTY27());
                contentValues.put(PROPERTY28, item.getPROPERTY28());
                contentValues.put(PROPERTY29, item.getPROPERTY29());
                contentValues.put(PROPERTY30, item.getPROPERTY30());
                contentValues.put(PROPERTY31, item.getPROPERTY31());
                contentValues.put(PROPERTY32, item.getPROPERTY32());
                contentValues.put(PROPERTY33, item.getPROPERTY33());
                contentValues.put(PROPERTY34, item.getPROPERTY34());
                contentValues.put(PROPERTY35, item.getPROPERTY35());
                contentValues.put(PROPERTY36, item.getPROPERTY36());
                contentValues.put(PROPERTY37, item.getPROPERTY37());
                contentValues.put(PROPERTY38, item.getPROPERTY38());
                contentValues.put(PROPERTY39, item.getPROPERTY39());
                contentValues.put(PROPERTY40, item.getPROPERTY40());
                contentValues.put(PROPERTY41, item.getPROPERTY41());
                contentValues.put(PROPERTY42, item.getPROPERTY42());
                contentValues.put(PROPERTY43, item.getPROPERTY43());
                contentValues.put(PROPERTY44, item.getPROPERTY44());
                contentValues.put(PROPERTY45, item.getPROPERTY45());
                contentValues.put(PROPERTY46, item.getPROPERTY46());
                contentValues.put(PROPERTY47, item.getPROPERTY47());
                contentValues.put(PROPERTY48, item.getPROPERTY48());
                contentValues.put(PROPERTY49, item.getPROPERTY49());
                contentValues.put(PROPERTY50, item.getPROPERTY50());

                // insert item details into local DB.
                db.insert(NAME, null, contentValues);
            }
            db.setTransactionSuccessful();
            db.endTransaction();
            // close database.
            db.close();
            long sum = System.nanoTime() - start;
            Log.d("REALM_TEST", "Sqlite Insert :: " + sum / 1000000);
        }
    }


    //SQLite Read
    public ArrayList<Item> getItemListFromDB() {

        ArrayList<Item> itemList = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        long start = System.nanoTime();
        Cursor cursor = db.query(NAME, PROPERTYLIST, PROPERTY1 + "=" + "PROPERTY1",
                null, null, null, null);
        if (cursor != null) {
            while (cursor.moveToNext()) {
                Item item = new Item();
                item.setPROPERTY1(cursor.getString(0));
                item.setPROPERTY2(cursor.getString(1));
                item.setPROPERTY3(cursor.getString(2));
                item.setPROPERTY4(cursor.getString(3));
                item.setPROPERTY5(cursor.getString(4));
                item.setPROPERTY6(cursor.getString(5));
                item.setPROPERTY7(cursor.getString(6));
                item.setPROPERTY8(cursor.getString(7));
                item.setPROPERTY9(cursor.getString(8));
                item.setPROPERTY10(cursor.getString(9));
                item.setPROPERTY11(cursor.getString(10));
                item.setPROPERTY12(cursor.getString(11));
                item.setPROPERTY13(cursor.getString(12));
                item.setPROPERTY14(cursor.getString(13));
                item.setPROPERTY15(cursor.getString(14));
                item.setPROPERTY16(cursor.getString(15));
                item.setPROPERTY17(cursor.getString(16));
                item.setPROPERTY18(cursor.getString(17));
                item.setPROPERTY19(cursor.getString(18));
                item.setPROPERTY20(cursor.getString(19));
                item.setPROPERTY21(cursor.getString(20));
                item.setPROPERTY22(cursor.getString(21));
                item.setPROPERTY23(cursor.getString(22));
                item.setPROPERTY24(cursor.getString(23));
                item.setPROPERTY25(cursor.getString(24));
                item.setPROPERTY26(cursor.getString(25));
                item.setPROPERTY27(cursor.getString(26));
                item.setPROPERTY28(cursor.getString(27));
                item.setPROPERTY29(cursor.getString(28));
                item.setPROPERTY30(cursor.getString(29));
                item.setPROPERTY31(cursor.getString(30));
                item.setPROPERTY32(cursor.getString(31));
                item.setPROPERTY33(cursor.getString(32));
                item.setPROPERTY34(cursor.getString(33));
                item.setPROPERTY35(cursor.getString(34));
                item.setPROPERTY36(cursor.getString(35));
                item.setPROPERTY37(cursor.getString(36));
                item.setPROPERTY38(cursor.getString(37));
                item.setPROPERTY39(cursor.getString(38));
                item.setPROPERTY40(cursor.getString(39));
                item.setPROPERTY41(cursor.getString(40));
                item.setPROPERTY42(cursor.getString(41));
                item.setPROPERTY43(cursor.getString(42));
                item.setPROPERTY44(cursor.getString(43));
                item.setPROPERTY45(cursor.getString(44));
                item.setPROPERTY46(cursor.getString(45));
                item.setPROPERTY47(cursor.getString(46));
                item.setPROPERTY48(cursor.getString(47));
                item.setPROPERTY49(cursor.getString(48));
                item.setPROPERTY50(cursor.getString(49));
                itemList.add(item);
            }
        }
        db.close();
        long sum = System.nanoTime() - start;
        Log.d("REALM_TEST", "Sqlite read list :: " + sum / 1000000 + "ms For " + itemList.size() + " records");
        return itemList;
    }

    //Realm Insert
    public void deleteExistingAndInsertNewItemsInRealm(ArrayList<Item> itemList) {

        Realm realm = Realm.getInstance(mContext);
        long start = System.nanoTime();
        //delete all objects
        RealmResults<RealmItem> results = realm.where(RealmItem.class).findAll();
        realm.beginTransaction();
        results.clear();

        for (Item item : itemList) {
            RealmItem realmItem = realm.createObject(RealmItem.class);
            realmItem.setPROPERTY1(item.getPROPERTY1());
            realmItem.setPROPERTY2(item.getPROPERTY2());
            realmItem.setPROPERTY3(item.getPROPERTY3());
            realmItem.setPROPERTY4(item.getPROPERTY4());
            realmItem.setPROPERTY5(item.getPROPERTY5());
            realmItem.setPROPERTY6(item.getPROPERTY6());
            realmItem.setPROPERTY7(item.getPROPERTY7());
            realmItem.setPROPERTY8(item.getPROPERTY8());
            realmItem.setPROPERTY9(item.getPROPERTY9());
            realmItem.setPROPERTY10(item.getPROPERTY10());
            realmItem.setPROPERTY11(item.getPROPERTY11());
            realmItem.setPROPERTY12(item.getPROPERTY12());
            realmItem.setPROPERTY13(item.getPROPERTY13());
            realmItem.setPROPERTY14(item.getPROPERTY14());
            realmItem.setPROPERTY15(item.getPROPERTY15());
            realmItem.setPROPERTY16(item.getPROPERTY16());
            realmItem.setPROPERTY17(item.getPROPERTY17());
            realmItem.setPROPERTY18(item.getPROPERTY18());
            realmItem.setPROPERTY19(item.getPROPERTY19());
            realmItem.setPROPERTY20(item.getPROPERTY20());
            realmItem.setPROPERTY21(item.getPROPERTY21());
            realmItem.setPROPERTY22(item.getPROPERTY22());
            realmItem.setPROPERTY23(item.getPROPERTY23());
            realmItem.setPROPERTY24(item.getPROPERTY24());
            realmItem.setPROPERTY25(item.getPROPERTY25());
            realmItem.setPROPERTY26(item.getPROPERTY26());
            realmItem.setPROPERTY27(item.getPROPERTY27());
            realmItem.setPROPERTY28(item.getPROPERTY28());
            realmItem.setPROPERTY29(item.getPROPERTY29());
            realmItem.setPROPERTY30(item.getPROPERTY30());
            realmItem.setPROPERTY31(item.getPROPERTY31());
            realmItem.setPROPERTY32(item.getPROPERTY32());
            realmItem.setPROPERTY33(item.getPROPERTY33());
            realmItem.setPROPERTY34(item.getPROPERTY34());
            realmItem.setPROPERTY35(item.getPROPERTY35());
            realmItem.setPROPERTY36(item.getPROPERTY36());
            realmItem.setPROPERTY37(item.getPROPERTY37());
            realmItem.setPROPERTY38(item.getPROPERTY38());
            realmItem.setPROPERTY39(item.getPROPERTY39());
            realmItem.setPROPERTY40(item.getPROPERTY40());
            realmItem.setPROPERTY41(item.getPROPERTY41());
            realmItem.setPROPERTY42(item.getPROPERTY42());
            realmItem.setPROPERTY43(item.getPROPERTY43());
            realmItem.setPROPERTY44(item.getPROPERTY44());
            realmItem.setPROPERTY45(item.getPROPERTY45());
            realmItem.setPROPERTY46(item.getPROPERTY46());
            realmItem.setPROPERTY47(item.getPROPERTY47());
            realmItem.setPROPERTY48(item.getPROPERTY48());
            realmItem.setPROPERTY49(item.getPROPERTY49());
            realmItem.setPROPERTY50(item.getPROPERTY50());

        }
        realm.commitTransaction();
        long sum = System.nanoTime() - start;
        Log.d("REALM_TEST", "Realm Insert :: " + sum / 1000000);
    }


    //Realm Read
    public ArrayList<Item> getItemListFromRealm() {

        ArrayList<Item> itemList = new ArrayList<>();
        Realm realm = Realm.getInstance(mContext);
        long start = System.nanoTime();
        RealmResults<RealmItem> results = realm.where(RealmItem.class)
                .equalTo("PROPERTY1", PROPERTY1).findAll();
        if (results != null) {
            for (RealmItem result : results) {

                Item item = new Item();
                item.setPROPERTY1(result.getPROPERTY1());
                item.setPROPERTY2(result.getPROPERTY2());
                item.setPROPERTY3(result.getPROPERTY3());
                item.setPROPERTY4(result.getPROPERTY4());
                item.setPROPERTY5(result.getPROPERTY5());
                item.setPROPERTY6(result.getPROPERTY6());
                item.setPROPERTY7(result.getPROPERTY7());
                item.setPROPERTY8(result.getPROPERTY8());
                item.setPROPERTY9(result.getPROPERTY9());
                item.setPROPERTY10(result.getPROPERTY10());
                item.setPROPERTY11(result.getPROPERTY11());
                item.setPROPERTY12(result.getPROPERTY12());
                item.setPROPERTY13(result.getPROPERTY13());
                item.setPROPERTY14(result.getPROPERTY14());
                item.setPROPERTY15(result.getPROPERTY15());
                item.setPROPERTY16(result.getPROPERTY16());
                item.setPROPERTY17(result.getPROPERTY17());
                item.setPROPERTY18(result.getPROPERTY18());
                item.setPROPERTY19(result.getPROPERTY19());
                item.setPROPERTY20(result.getPROPERTY20());
                item.setPROPERTY21(result.getPROPERTY21());
                item.setPROPERTY22(result.getPROPERTY22());
                item.setPROPERTY23(result.getPROPERTY23());
                item.setPROPERTY24(result.getPROPERTY24());
                item.setPROPERTY25(result.getPROPERTY25());
                item.setPROPERTY26(result.getPROPERTY26());
                item.setPROPERTY27(result.getPROPERTY27());
                item.setPROPERTY28(result.getPROPERTY28());
                item.setPROPERTY29(result.getPROPERTY29());
                item.setPROPERTY30(result.getPROPERTY30());
                item.setPROPERTY31(result.getPROPERTY31());
                item.setPROPERTY32(result.getPROPERTY32());
                item.setPROPERTY33(result.getPROPERTY33());
                item.setPROPERTY34(result.getPROPERTY34());
                item.setPROPERTY35(result.getPROPERTY35());
                item.setPROPERTY36(result.getPROPERTY36());
                item.setPROPERTY37(result.getPROPERTY37());
                item.setPROPERTY38(result.getPROPERTY38());
                item.setPROPERTY39(result.getPROPERTY39());
                item.setPROPERTY40(result.getPROPERTY40());
                item.setPROPERTY41(result.getPROPERTY41());
                item.setPROPERTY42(result.getPROPERTY42());
                item.setPROPERTY43(result.getPROPERTY43());
                item.setPROPERTY44(result.getPROPERTY44());
                item.setPROPERTY45(result.getPROPERTY45());
                item.setPROPERTY46(result.getPROPERTY46());
                item.setPROPERTY47(result.getPROPERTY47());
                item.setPROPERTY48(result.getPROPERTY48());
                item.setPROPERTY49(result.getPROPERTY49());
                item.setPROPERTY50(result.getPROPERTY50());
                itemList.add(item);
            }
        }
        long sum = System.nanoTime() - start;
        Log.d("REALM_TEST", "Realm read list :: " + sum / 1000000 + "ms For " + itemList.size() + " records");
        return itemList;
    }
}
