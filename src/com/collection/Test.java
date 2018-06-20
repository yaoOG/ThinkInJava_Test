package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //自定义排序规则
        TreeSet<Person> set=new TreeSet<Person>(new MyComparator());
        set.add(new Person("A", 20));
        set.add(new Person("D", 10));
        set.add(new Person("E", 40));
        set.add(new Person("C", 50));
        set.add(new Person("B", 30));
        System.out.println(set);
    }
}

class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    //重写toString方法，制定输出格式：
    public String toString() {
        return "name:"+name+",age="+age;
    }
}
class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Person p1=(Person) o1;
        Person p2=(Person) o2;
        //自定义比较规则
        return (int) (p1.age-p2.age);
    }
}