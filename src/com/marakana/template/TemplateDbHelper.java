package com.marakana.template;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class TemplateDbHelper extends SQLiteOpenHelper {
  static final String DB_NAME = "template.db";
  static final int DB_VERSION = 1;
  static final String TABLE = "table_table";

  public TemplateDbHelper(Context context) {
    super(context, DB_NAME, null, DB_VERSION);
  }
  public TemplateDbHelper(Context context, String name, CursorFactory factory,
      int version) {
    super(context, name, factory, version);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void onCreate(SQLiteDatabase db) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    // TODO Auto-generated method stub
    
  }

}
