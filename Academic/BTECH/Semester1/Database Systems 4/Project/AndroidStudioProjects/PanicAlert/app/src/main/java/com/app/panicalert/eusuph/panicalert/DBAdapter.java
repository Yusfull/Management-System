package com.app.panicalert.eusuph.panicalert;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Eusuph on 2016-05-11.
 */
public class DBAdapter {

    public static final String KEY_ROWID = "_id";
    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_NUMBER = "number";
    private static final String TAG = "DBAdapter";

    private static final String DATABASE_NAME = "DB1";
    private static final String DATABASE_TABLE = "vips";
    private static final int DATABASE_VERSION = 1;
    private static final String tag = "DBAdapter class";

    private static final String DATABASE_CREATE =
            "create table vips (_id integer primary key autoincrement, "
                    + "name text not null, email text not null, number text not null);";

    private final Context context;

    private DatabaseHelper DBHelper;
    private SQLiteDatabase db;

    public DBAdapter(Context ctx) {
        this.context = ctx;
        DBHelper = new DatabaseHelper(context);
    }

    public DBAdapter open() throws SQLException {
        db = DBHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        DBHelper.close();
    }

    public long insertContact(String name, String email, String number) {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_NAME, name);
        initialValues.put(KEY_EMAIL, email);
        initialValues.put(KEY_NUMBER, number);
        return db.insert(DATABASE_TABLE, null, initialValues);
    }

    public boolean deleteContact(long rowId) {
        return db.delete(DATABASE_TABLE, KEY_ROWID + "=" + rowId, null) > 0;

    }

    public Cursor getAllContacts() {
        return db.query(DATABASE_TABLE, new String[]{KEY_ROWID, KEY_NAME, KEY_EMAIL, KEY_NUMBER}, null, null, null, null, null);

    }

    public Cursor getContact(long rowId) throws SQLException {
//Cursor mCursor = db.query(true, DATABASE_TABLE, new String[] {KEY_ROWID, KEY_NAME, KEY_EMAIL}, KEY_ROWID + "=" + rowId, null, null, null);
        Cursor mCursor =
                db.query(true, DATABASE_TABLE, new String[]{KEY_ROWID,
                                KEY_NAME, KEY_EMAIL, KEY_NUMBER}, KEY_ROWID + "=" + rowId, null,
                        null, null, null, null);

        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }

    public boolean updateContact(long rowId, String name, String email, String number) {
        ContentValues args = new ContentValues();
        args.put(KEY_NAME, name);
        args.put(KEY_EMAIL, email);
        args.put(KEY_NUMBER, number);
        return db.update(DATABASE_TABLE, args, KEY_ROWID + "=" + rowId, null) > 0;
    }

    private static class DatabaseHelper extends SQLiteOpenHelper {

        DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);

        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL(DATABASE_CREATE);
                Log.d(tag, "Database Created successfully");
            } catch (SQLException e) {
                e.printStackTrace();
                Log.d(tag, "Error(hani): caught exception here.. 101");
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w(TAG, "Upgrading database from version " + oldVersion + " to " + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS vips");
            onCreate(db);
        }

    }//end of DatabaseHelper class

}


