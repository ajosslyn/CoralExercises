package com.bootcamp;

import java.util.HashMap;
import java.util.Map;

//helpful links:
// https://www.tutorialspoint.com/java/util/hashmap_values.htm
// https://www.tutorialspoint.com/java/util/hashmap_size.htm
// http://www.tutorialspoint.com/java/util/hashmap_put.htm

//The Student class
class Student{
    int age;
    String name;
    Map<String, Integer> books = new HashMap<String, Integer>();

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void addBooks(String bookName, int bookPages) {
        this.books.put(bookName, bookPages);

    }


    public int totalPages(){
        int sum = 0;
        for (int var : this.books.values()) {
            sum += var;
        }

        return sum; //replace this 0 with a variable called sum
    }
    public int numOfBooks(){
        return this.books.size();
    }
}
