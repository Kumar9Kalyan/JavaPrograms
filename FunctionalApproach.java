/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.functionalprogramming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
/**
 *
 * @author Kumar Kalyan
 */
public class FunctionalApproach {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        printAllNumbersInListStructure(List.of(12,3,9,6,22,34,45));
        printAllNumbersInListFunctional(List.of(66,77,88,99,43,22));
        printAllNumbersInListEven(List.of(3,5,33,2,34,556));
        printAllNumbersInListOdd(List.of(23,33,45,54,66));
        List<String> courses= List.of("AWS","ML","Deep Learning","Spring Boot","Spring","Azure");
        printAllCourses(courses);
        printAllNumbersInListEvenSquare(List.of(4,44,33,22,11,44));
        printAllNumbersInListOddCube(List.of(1,3,7,5,9));
        Optional<String> optional= Optional.of("Shankar");
        Optional<String> empty=Optional.empty();
        System.out.println(empty);
        System.out.println(optional);
        System.out.println(optional.get());
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.getClass());
    }
    
    private static void printAllCourses(List<String> courses){
        courses.stream().forEach(System.out::println);
        courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
        courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
        courses.stream().map(course->course+"-"+course.length()).forEach(System.out::println);
        Predicate<? super String> predicate= course-> course.startsWith("S");
                
        Optional<String> optional=  courses.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
                
        
    }
    
    private static void printAllNumbersInListStructure(List<Integer> numbers){
        for(int number: numbers){
            System.out.println(number);
        }
    }
       private static void printAllNumbersInListFunctional(List<Integer> list){
        list.stream().forEach(FunctionalApproach::print);
    }
   private static void printAllNumbersInListEven(List<Integer> list){
       list.stream().filter(number->number%2==0).forEach(System.out::println);}
   
     private static void  printAllNumbersInListOdd(List<Integer> list){
         list.stream().filter(number->number%2==1).forEach(System.out::println);
              
     }
     private static void printAllNumbersInListEvenSquare(List<Integer> list){
         list.stream().filter(number->number%2==0).map(mapper->mapper*mapper).forEach(System.out::println);
     }
 
    private static void printAllNumbersInListOddCube(List<Integer> list){
        list.stream().filter(number->number%2==1).map(mapper->mapper*mapper*mapper).forEach(System.out::println);
    }
    
    private static void print(int num){
        System.out.println(num);   
    }
}
