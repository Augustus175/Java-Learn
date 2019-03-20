package com.zzb.learn.dao;


import java.util.*;

public class Some {
    School[] schools;
    String[] strings;
    List<String> myList;
    Set<String> mySet;
    Map<String ,Object> myMap;
    Properties myPros;

    public void setSchools(School[] schools) {
        this.schools = schools;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, Object> myMap) {
        this.myMap = myMap;
    }

    public void setMyPros(Properties myPros) {
        this.myPros = myPros;
    }

    @Override
    public String toString() {
        return "Some{" +
                "schools=" + Arrays.toString(schools) +
                ", strings=" + Arrays.toString(strings) +
                ", myList=" + myList +
                ", mySet=" + mySet +
                ", myMap=" + myMap +
                ", myPros=" + myPros +
                '}';
    }
}
