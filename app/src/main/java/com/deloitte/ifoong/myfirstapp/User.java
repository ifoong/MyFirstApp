package com.deloitte.ifoong.myfirstapp;

import android.nfc.Tag;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;
import com.deloitte.ifoong.myfirstapp.common.logger.Log;
import com.deloitte.ifoong.myfirstapp.common.logger.LogView;
import com.deloitte.ifoong.myfirstapp.common.logger.LogWrapper;
import com.deloitte.ifoong.myfirstapp.common.logger.MessageOnlyLogFilter;

/**
 * Created by ifoong on 2/3/2016.
 */
public class User {

    private String gender;
    private String bloodType;
    private int age;
    private String memberID;

    public User(String g, String b, int a, String m) {
        gender = g;
        bloodType = b;
        age = a;
        memberID = m;
    };

    // Gender
    public void setGender(String g){
        gender = g;
    };
    public String getGender(){
        return gender;
    };

    // BloodType
    public void setBloodType(String b){
        bloodType = b;
    };
    public String getBloodType(){
        return bloodType;
    };

    // Age
    public void setAge(int a){
        age = a;
    };
    public int getAge(){
        return age;
    };

    // Member ID
    public void setMemberID(String m){
        memberID = m;
    };
    public String getMemberID(){
        return memberID;
    };

    // String of user details
    public String toString(){
        HashMap userHash = toHash();
        return userHash.toString();
    };

    public static HashMap toHash(){
        HashMap userHash = new HashMap();
        userHash.put("gender", "Male");
        userHash.put("bloodType", "A+");
        userHash.put("age", 33);
        userHash.put("memberID", "test@gmail.com");
        return userHash;
    };

    public static String getUserTest() {
        HashMap testUserHash = toHash();
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(testUserHash);
        JSONObject jsonUser = new JSONObject();
        try {
            jsonUser.put("demographics",jsonArray);
        }catch (JSONException e) {
            Log.i("TAG", "Successfully deleted today's step count data");
        }

        String jsonUserString = jsonUser.toString();
        return jsonUserString;
    };
}
