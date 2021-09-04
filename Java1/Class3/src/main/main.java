package main;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

public class main {
    public static void main(String[] args){

        // Initialize 1 ArrayList
        // Uninitialized ArrayList will throw NullPointerException
        ArrayList<Student> students = new ArrayList<>();

        // Create students
        Student student1 = new Student(1, "Brown", "Arthur", 24);
        Student student2 = new Student(2, "Dupond", "Catherine", 27);
        Student student3 = new Student(3, "Ford", "Emily", 18);
        Student student4 = new Student(4, "Hopkins", "George", 25);
        Student student5 = new Student(5, "Jackson", "Ilana", 33);

        // Add the students to the ArrayList
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Student num: students) {
            System.out.println(String.format("Student %d, Name: %s %s ", num.getId(), num.getFirstName(), num.getLastName()));
        }


        for (Student s: students) {
            System.out.println(s);
        }

        //Add the students



/*        for (Entry<Integer,Student> e: studentsMap.entrySet()){
            Integer key = studentEntry.getKey();
            Integer value = studentEntry.getValue();
        }*/



        // Number of students in the ArrayList
        System.out.println(students.size());

    }
}





//        ArrayList<Integer> n = new ArrayList<>(5);
//
//        System.out.println(n);
//        ArrayList<Integer> numbers = new ArrayList<>(5);
//
//        numbers.add(2);  // 2
//        numbers.add(4);  // 2 , 4
//        numbers.add(6);  // 2 , 4,6
//
//        System.out.println(numbers.get(2)); //6

//        for (Integer n: numbers){
//                System.out.println(numbers.get(i));
//        }



//          numbers.add(2);  // 2
//        numbers.add(4);  // 2 , 4
//        numbers.add(6);  // 2 , 4,6
//        //System.out.println(numbers.size());  //3
//        //numbers.add(2,null);  //2,4,null ,6
//        numbers.set(2,null);  //2,4,null  Replace the valor index 2 for Null
//          numbers.remove(2);  //2,4

//        for (Integer n: numbers){
//                System.out.println(n);
//                }


//        String temp = "Hello";
//        System.out.println("Upper :" + temp.toUpperCase());