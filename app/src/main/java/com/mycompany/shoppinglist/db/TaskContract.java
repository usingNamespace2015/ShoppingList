package com.mycompany.shoppinglist.db;

import android.provider.BaseColumns;

/**
 * Created by jmortenson on 7/19/2016.
 */
public class TaskContract {
    public static final String DB_NAME = "com.mycompany.shoppinglist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns{
        public static final String TABLE = "items";
        public static final String COL_TASK_TITLE = "title";
    }
}
