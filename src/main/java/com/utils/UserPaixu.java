package com.utils;


import java.util.*;

/**
 * Created by admin on 2016/7/13.
 */
public class UserPaixu  {
    int age ;
    String name;

    public UserPaixu(int age,String name){
        this.age = age;
        this.name = name;
    }



    @Override
    public String toString() {
        return this.age+" "+this.name;
    }

    public static void main(String [] a){
        UserPaixu u1 = new UserPaixu(1,"z");
        UserPaixu u2 = new UserPaixu(11,"x");
        UserPaixu u3 = new UserPaixu(2,"c");
        UserPaixu u4 = new UserPaixu(33,"v");
        UserPaixu u5 = new UserPaixu(4,"b");
        UserPaixu u6 = new UserPaixu(15,"n");
        List<UserPaixu> list = new ArrayList<UserPaixu>();
        list.add(u3);
        list.add(u6);
        list.add(u1);
        list.add(u2);
        list.add(u4);
        list.add(u5);
        System.out.println("排序前:  " + list);
        System.out.println("*************************** ");
        Collections.sort(list, new Comparator<UserPaixu>() {
            @Override
            public int compare(UserPaixu o1, UserPaixu o2) {
                if (o1.age>o2.age){
                    return 1;
                }
                if (o1.age==o2.age){
                    return 0;
                }
                return -1;
            }

        });
        System.out.println("排序后:  " + list);
    }
}
