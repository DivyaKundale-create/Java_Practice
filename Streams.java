package org.example;

import org.example.classes.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams {

//    Introduced in Java 8, the Stream API (java.util.stream) is a pipeline framework for processing collections of data declaratively. Instead of writing nested loops and conditional blocks (imperative style), you write what you want to achieve (functional style).A Stream is not a data structure—it does not store data. Instead, it carries data from a source (like a Collection, Array, or I/O channel) through a pipeline of operations.
//     3 pipeline steps: Source → Intermediate Operations → Terminal Operation.
//   [Collection] ──> Stream() ──> Filter() ──> Map() ──> Collect()
//  (Source)                     (Intermediate)          (Terminal)

//   1. Filter even numbers
    public void evenNumbersByStream()
    {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> evenNum = numbers.stream().filter(num -> num %2 ==0).collect(Collectors.toList()); //.collect() Available since Java 8
        System.out.println(evenNum);//we can replace print with logpoint
    }

    //Find numbers greater than 10
    public void greaterThan10ByStream(){

        List<Integer> numbers = List.of(12,0,5,33,9,78);
        List<Integer> ex =numbers.stream().filter(n -> n>10).toList(); //Available since Java 16+
        System.out.println(ex);

    }

    //Convert strings to uppercase
    public void upperCaseByStream() {
        List<String> names = List.of("java", "spring", "kafka");
        System.out.println(names.stream().map(String::toUpperCase).toList());
    }

    //Find the sum of numbers
    public void sum(){
        List<Integer> numbers = List.of(10, 20, 30, 40);
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
    }

    //Count numbers greater than 50
    public void countN(){
        List<Integer> numbers = List.of(10, 55, 20, 80, 90, 30);
        long count=numbers.stream().map(n->n>50).count(); ///if i write map then it Converts numbers to [false, true, false, true, true, false] and total count will be size of list 6
        //i must use filter for that
        System.out.println(numbers.stream().filter(n -> n >50).count());
    }

    //Remove duplicates
    public void removeDuplicates()
    {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5, 5);
        System.out.println(numbers.stream().distinct().toList());
    }

//    Sort numbers ascending
    public void sortAscending() {
        List<Integer> numbers =  List.of(5, 1, 8, 3, 2);
        System.out.println(numbers.stream().sorted().toList());
    }

//    Sort numbers descending
    public void sortDescending() {
    List<Integer> numbers =  List.of(5, 1, 8, 3, 2);
    System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).toList());
    }

//    Find the maximum number
public void maxNum() {
    List<Integer> numbers =  List.of(10, 50, 20, 80, 30);
    System.out.println(numbers.stream().max(Comparator.naturalOrder()).orElseThrow(() -> new RuntimeException("Stream is Empty")));
//   Comparator.naturalOrder() is a built-in static factory method in Java that returns a comparator to sort elements in their default, standard order.For numbers,
//   this means sorting from smallest to largest (ascending). For strings, it means alphabetical order (A to Z).
//    It relies directly on the Comparable interface.
}


    //Find the second-highest number
    public void secondHighest()
    {
        List<Integer> numbers =
                List.of(10, 50, 20, 80, 50, 30);
        System.out.println(
                numbers.stream().distinct()         // 1. Remove duplicate values
                .sorted(Comparator.reverseOrder()) // 2. Sort in descending order
                .skip(1)                        // 3. Skip the highest number
                .findFirst().get());                // 4. Grab the next available number
    }

    //Find strings starting with "A"
    public void findStringStartingWithA(){
        List<String> names =
                List.of("Amit", "Rahul", "Ankit", "Sneha", "Ajay");

        System.out.println(names.stream().filter(str->str.charAt(0)=='A').toList());
    }

    //Find the longest string
    public  void longestString()
    {
        List<String> names =
                List.of("Java", "Spring", "Microservices", "Kafka");

        String longStr= names.stream().max(Comparator.comparingInt(n->n.length())).
                orElse(" ");// Safely handles empty lists

        System.out.println(longStr);

//        Use Comparator.comparingInt when you need to sort objects by a property
//        that is a primitive int.Do not use the standard Comparator.comparing() for primitives.
//        comparingInt avoids autoboxing (converting int to Integer), which saves memory and speeds up performance.

    }

//    Count strings having length > 5
    public void lengthGreterThanFive()
    {
        List<String> words =
                List.of("Java", "Spring", "Kafka", "Microservices", "Docker");
        System.out.println(words.stream().filter(n->n.length()>5).toList());

    }

    public void test()
    {
        //        Collectors.groupingBy is a built-in Java Stream collector used to classify and group elements of a stream into a Map, similar to the GROUP BY clause in SQL.
        List<String> words = List.of("apple", "banana", "cherry", "pear");
        System.out.println("Collectors.groupingBy by length of string = "+  words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println("entryset = "+  words.stream().collect(Collectors.groupingBy(String::length)).entrySet());

    }
    //Find duplicate strings
    public void duplicateStrings()
    {
        List<String> names =
                List.of("Java", "Spring", "Java", "Kafka", "Spring");

        //This is trial for duplicate elements but not using all streams its mix
         Set<String> strings= new HashSet<>();
          List<String> list = names.stream().filter(s -> !strings.add(s)).toList();
        System.out.println("Duplicate elements "+list);

        //Using all stream functions
        System.out.println(
                "Duplicate Elements "+
                names.stream()
        .collect(Collectors.groupingBy(str->str, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())

        );



    }

    //Find the first non-repeated character
    public void nonRepeatedChar(){

        String str = "swiss";
        Character ch=   str.chars().     // IntStream of characters
        mapToObj(c -> (char)c )      // Convert to Stream<Character>
                .collect(Collectors.groupingBy(
                        Function.identity(),  // Group by the character itself
                        LinkedHashMap::new,  // Maintain insertion order
                        Collectors.counting()   // Count occurrences
                        ) )
        .entrySet()                             // Get the entry set of the map
                .stream()       // Stream the map entries
                .filter(entry -> entry.getValue()==1) // Filter out repeated characters
                .map(entry -> entry.getKey())// Extract the character key
                .findFirst()
                .orElse(null)
        ;

        System.out.println(ch);

    }

    //Group employees by department
    public void groupEmployees()
    {
        List<Employee> employees = List.of(
                new Employee("Amit", "IT", 70000),
                new Employee("Rahul", "IT", 90000),
                new Employee("Sneha", "HR", 60000),
                new Employee("Priya", "HR", 80000),
                new Employee("John", "Finance", 75000)
        );

        Map<String, List<Employee>> listEmployee= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        listEmployee.forEach((dept, empList) ->
                {
                    System.out.println("Department :" + dept);
                    empList.forEach(emp -> System.out.println(" - "+ emp.getName()));
                }
        );
    }


}

