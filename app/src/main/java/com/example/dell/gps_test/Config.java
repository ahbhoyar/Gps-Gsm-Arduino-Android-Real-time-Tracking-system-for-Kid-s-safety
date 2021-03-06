package com.example.dell.gps_test;

public class Config {
    public static final String REGISTER_URL = "http://api.nsaindia.org/register.php";
    public static final String DATA_URL = "http://api.nsaindia.org/gps_api.php";
    public static final String STD_INFO = "http://api.nsaindia.org/stdinfo.php";
    public static final String DRV_INFO = "http://api.nsaindia.org/drvinfo.php?busId=1";

    public static final String TYPE_URL = "http://api.nsaindia.org/getUserType.php?userid=";
    public static final String STUDENT_URL = "http://api.nsaindia.org/getAllStudents.php?busno=";
    public static final String ADD_CHILD_URL = "http://api.nsaindia.org/getChild.php?id=";
    public static final String BUS_URL = "http://api.nsaindia.org/getRoute.php?busno=";
    public static final String ADDSTUDENT_URL = "http://api.nsaindia.org/addStudent.php";
    public static final String SETPARENT_URL = "http://api.nsaindia.org/addChild.php";
    public static final String ADDSTOP_URL = "http://api.nsaindia.org/addStop.php";
    public static final String UPDSTUDENT_URL = "http://api.nsaindia.org/updStudent.php";
    public static final String UPDBUS_URL = "http://api.nsaindia.org/updBus.php";
    public static final String LOGIN_URL = "http://api.nsaindia.org/login.php";
    public static final String UPDID_URL = "http://api.nsaindia.org/updEmail.php";
    public static final String UPDPASS_URL = "http://api.nsaindia.org/updPassword.php";
    public static final String DELETE_URL = "http://api.nsaindia.org/delUser.php";
    public static final String DELETE_STOP_URL = "http://api.nsaindia.org/delStop.php";
    public static final String DELETE_STUDENT_URL = "http://api.nsaindia.org/delStudent.php";
    public static final String DRIVER_URL = "http://api.nsaindia.org/getDriver.php?busno=";
    public static final String KEY_USERNAME = "username";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_NEW_USERNAME = "newid";
    public static final String KEY_NEW_PASSWORD = "newpass";
    public static final String DEST_LOCATION = "21.1813924,79.076156";
    public static final String STDINFO = "stdinfo";
    public static final String DRVINFO = "drvinfo";
    public static final String STUDENT_ID = "id";
    public static final String DRIVER_NAME = "name";
    public static final String DRIVER_CON = "contact";
    public static final String STUDENT_NAME = "name";
    public static final String STUDENT_PARENT = "parent";
    public static final String STUDENT_BUS = "busno";
    public static final String BUS_ID = "serialno";
    public static final String BUS_NAME = "stopid";
    public static final String BUS_AM = "amtime";
    public static final String BUS_PM = "pmtime";
    public static final String STUDENT_CLASS = "class";
    public static final String STUDENT_STATUS = "status";
    public static final String STUDENT_STOP = "stopid";
    public static final String KEY_LAT = "lat";
    public static final String KEY_TYPE = "usertype";
    public static final String KEY_LNG = "lon";
    public static final String KEY_SPEED = "spd";
    public static final String JSON_ARRAY = "d";


    // broadcast receiver intent filters
    public static final String REGISTRATION_COMPLETE = "registrationComplete";
    public static final String PUSH_NOTIFICATION = "pushNotification";

    // id to handle the notification in the notification tray
    public static final int NOTIFICATION_ID = 100;
    public static final int NOTIFICATION_ID_BIG_IMAGE = 101;

    public static final String SHARED_PREF = "ah_firebase";
}
