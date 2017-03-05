package com.xiaoxing.profile;

/**
 * Created by silen on 16-11-22.
 */
public class SQLCommand {
   // public static final String UNCHECK_ENGINEER__NAME="Uengineer";

    public static final String PROFILE__NAME="XiaoxingProfile";
    private static final String CREATE_TABLE_PROFILE_SQL  = "CREATE TABLE XiaoxingProfile(pId INTEGER PRiMARY KEY AUTO_INCREMENT,userId INTEGER,name TEXT,birth INTEGER,address TEXT,illness TEXT,height INTEGER,weight INTEGER)";
}
