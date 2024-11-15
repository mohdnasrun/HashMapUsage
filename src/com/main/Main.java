package com.main;

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class Main
{
	public static void main(String[] args) {
	    // Initializing HashMap with initial capacity and load factor
        Map<String, Integer> hashMap = new HashMap<>(16, 0.75f);
        
        // Adding entries
        hashMap.put("One", 1);
        hashMap.put("Two", 2);

        // Using computeIfAbsent
        hashMap.computeIfAbsent("Two", k -> 2);
        
        // Using merge
        hashMap.merge("Two", 2, Integer::sum);

        // Iterating using entrySet
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // ConcurrentHashMap example
        Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("Four", 4);
        concurrentMap.put("Five", 5);

        concurrentMap.computeIfAbsent("Six", k -> 6);
        concurrentMap.merge("Five", 5, Integer::sum);

        for (Map.Entry<String, Integer> entry : concurrentMap.entrySet()) {
            System.out.println("Concurrent map: " + entry.getKey() + " = " + entry.getValue());
        }
	}
}

