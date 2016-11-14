package com.example.android.reportcard;

/**
 * Created by tyrone3 on 02.11.16.
 */

public class Student {

    private String mName;
    private String mMath;
    private String mEnglish;
    private String mGerman;
    private String mPhysics;
    private String mGeographie;
    private String mGymnastics;

    public Student(String name, String math, String english, String german, String physics, String geographie, String gymnastics){
        mName = name;
        mMath = math;
        mEnglish = english;
        mGerman = german;
        mPhysics = physics;
        mGeographie = geographie;
        mGymnastics = gymnastics;

    }

    public String getName() {return mName;};
    public String getMath() {return mMath;};
    public String getEnglish() {return mEnglish;};
    public String getGerman() {return mGerman;};
    public String getPhysics() {return mPhysics;};
    public String getGeographie() {return mGeographie;};
    public String getGymnastics() {return mGymnastics;};

    @Override
    public String toString() {
        return mName + " your notes are:\n"   + "Math: " + mMath
                + "\nEnglish: " + mEnglish
                + "\nGerman: " + mGerman
                + "\nPhysics: " + mPhysics
                + "\nGeographie: " + mGeographie
                + "\nGymnastics: " + mGymnastics;
    }
}
