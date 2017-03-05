package com.xiaoxing.profile.server;

import com.xiaoxing.profile.SQLCommand;
import com.xiaoxing.profile.model.Profile;
import com.xiaoxing.profile.sql.SQLBase;

import java.util.List;
import java.util.Map;

/**
 * Created by silen on 17-2-26.
 */
public class ProfileManager {
    private static final String QUERY_ALL_PROFILE_SQL = "select * from " + SQLCommand.PROFILE__NAME + " where userid=%d";
    private static final String ADD_PROFILE_SQL = "INSERT INTO " + SQLCommand.PROFILE__NAME + "(userId,name,birth,address,illness,height,weight) VALUES(%d,\"%s\",%d,\"%s\",\"%s\",%d,%d)";
    private static final String DELETE_PROFILE_SQL = "delete form " + SQLCommand.PROFILE__NAME + " where pId=%d";
    private static final String MODIFY_PROFILE_SQL = "update "+SQLCommand.PROFILE__NAME+" set name=\"%s\",birth=%d,address=\"%s\",illness=\"%s\",height=%d,weight=%d where pId=%d";

    public static List<Map<String, Object>> getAllProfile(int userId) {
        return new SQLBase().queryDataWithReturn(String.format(QUERY_ALL_PROFILE_SQL, new Object[]{userId}));
    }

    public static boolean addProfile(Profile profile) {
        return new SQLBase().executeSQL(String.format(ADD_PROFILE_SQL, new Object[]{profile.getUserId(), profile.getName(), profile.getBirth(), profile.getAddress(), profile.getIllness(),profile.getHeight(),profile.getWeight()}));
    }

    public static boolean deleteProfile(int pId) {
        return new SQLBase().executeSQL(String.format(DELETE_PROFILE_SQL, new Object[]{pId}));
    }
    public static boolean modifyProfile(Profile profile){
        return new SQLBase().executeSQL(String.format(MODIFY_PROFILE_SQL,new Object[]{profile.getName(),profile.getBirth(),profile.getAddress(),profile.getHeight(),profile.getWeight(),profile.getpId()}));
    }

}
