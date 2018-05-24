package com.bootcamp;



//The FindAverage class
public class Algorithm {
    public static void main(String [] args) {

        //Questions:

        //1) What is the average number of pages ALL the students have read? show me results in a comment
        //2) If this book was added to object ted: ("Remembrance of Things Past", 4215")
        //would be the average number of pages ALL the students have read? show me results in a comment

        //Write your logic in static method averagePages() and instance method totalPages()

        Student carl = new Student("Carl Bevere", 25);
        carl.addBooks("Green Eggs and Ham", 20);
        carl.addBooks("War and Peace", 1225);
        carl.addBooks("Game of thrones", 694);

        Student ted = new Student("Ted Ytienne", 24);
        ted.addBooks("The Hobbit", 304);
        ted.addBooks("Life of Pi", 354);
        ted.addBooks("A Feast for Crows", 753);
        ted.addBooks("Remembrance of Things Past", 4215);


        Student nerine = new Student("Neriene Tarper", 23);
        nerine.addBooks("The Two Towers", 415);
        nerine.addBooks("War and Peace", 1225);
        nerine.addBooks("A Storm of Swords", 973);

        Student[] studentArray = {carl, ted, nerine};

        System.out.println(averagePages(studentArray));
        //662.0  , 1017.0
        // System.out.println(carl.totalPages());

    }

    public static double averagePages(Student[] students) {

        int sumPages = 0;
        int sumBooks = 0;
        int average = 0;
        for(int i = 0; i < students.length; i++){
            sumPages += students[i].totalPages();
            sumBooks += students[i].numOfBooks();

        }
        average = sumPages / sumBooks;

        return average; //replace this 0 with a variable called average

    }
}

