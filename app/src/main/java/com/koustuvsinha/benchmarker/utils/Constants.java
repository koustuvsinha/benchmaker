package com.koustuvsinha.benchmarker.utils;

import com.koustuvsinha.benchmarker.models.DbFactoryModel;

import java.util.ArrayList;

/**
 * Created by koustuv on 24/5/15.
 */
public class Constants {

    public final static String APP_NAME = "Benchmarker";

    public final static int DB_TYPE_DEFAULT = 0;
    public final static int DB_TYPE_REALM = 1;
    public final static int DB_TYPE_SNAPPY = 2;
    public final static int DB_TYPE_ORMLITE = 3;
    public final static int DB_TYPE_SUGARORM = 4;
    public final static int DB_TYPE_GREENDAO = 5;
    public final static int DB_TYPE_ACTIVEANDROID = 6;
    public final static int DB_TYPE_DBFLOW = 7;

    public final static ArrayList<DbFactoryModel> DB_LIST = new ArrayList<DbFactoryModel>() {{
        add(new DbFactoryModel(DB_TYPE_DEFAULT,"Android SQLite","v1.0","Android",true));
        add(new DbFactoryModel(DB_TYPE_REALM,"Realm","v0.83.3","Realm",true));
        add(new DbFactoryModel(DB_TYPE_SNAPPY,"SnappyDB","v0.1.0","nhachicha",true));
        add(new DbFactoryModel(DB_TYPE_ORMLITE,"ORM Lite Android","v4.48","ORM Lite",true));
        add(new DbFactoryModel(DB_TYPE_SUGARORM,"Sugar ORM","v1.4","Satya Narayan",true));
        add(new DbFactoryModel(DB_TYPE_GREENDAO,"Green DAO","v1.3","Green DAO",true));
        add(new DbFactoryModel(DB_TYPE_ACTIVEANDROID,"Active Android","v3.0","Michael Pardo",true));
        add(new DbFactoryModel(DB_TYPE_DBFLOW,"DBFlow","v2.0.0","Raizlabs",true));
    }};

    public final static String DB_TYPE = "dbType";

    public final static String DB_TEST_SERVICE = "db_performance_testing_service";
    public final static String DB_NUM_RECORDS = "numRecords";
    public final static int DB_DEFAULT_RECORDS = 10;

    public final static String RECEIVE_STATUS = "RecieveStatus";
    public final static String RECEIVE_MSG = "ReceiveMsg";
    public final static String RECEIVE_RESULT = "ReceiveResult";

    public final static int RECEIVE_STATUS_MSG = 101;
    public final static int RECEIVE_INSERT_TIME = 102;
    public final static int RECEIVE_READ_TIME = 103;
    public final static int RECEIVE_UPDATE_TIME = 104;
    public final static int RECEIVE_DELETE_TIME = 105;
    public final static int TESTING_START = 111;
    public final static int TESTING_END = 112;

    public final static String RECEIVER_INTENT = "receiver";

    public final static int DB_MODE_READ = 113;
    public final static int DB_MODE_WRITE = 114;

    public final static String[] TEST_LIMIT = {"1000", "10000", "100000" };
    public final static int[] TEST_LIMIT_VAL = {1000,10000,100000};
    public final static Integer[] TEST_LIMIT_VAL_OBJ = {1000,10000,100000};
    public final static String TEST_LIMIT_SELECTED = "selectedTestLimit";

    public final static int PERCENT_TOTAL = 24;
    public final static int PERCENT_STATUS = 120;

    public final static String SELECTED_DB_TEST = "selectedDb";
    public final static String INTENT_FILTER = "com.koustuvsinha.benchmarker.services.DbTestRunnerService";

    public final static int RESULT_FIRST_DATA = 130;
    public final static int RESULT_LAST_DATA = 131;
}
