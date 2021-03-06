# Java Programming tutorial
A repository of programming concepts and examples in Java.

## Binary converter
The `binaryconverter` package contains algorithms to convert a binary number to decimal format and vice versa. 

## Abstract data types
The `adt` package contains code demos for a custom implementation of the following abstract data types:

### List
The `adt.list` package contains two implementations for a list ADT that holds integers, in the form of a linked list and array list. 
There is also an implementation of a generic array list that uses a custom List interface.

### Hashtable
The `adt.hashtable` package contains a String to String hashtable implementation and an example of a generic hashtable. The generic hashtable, being an abstract class, leaves the collision resolution to a concrete sub class to handle. Provided is a concrete implementation of a hashtable that does **not** handle collisions.

### Graph
The `adt.graph` package contains implementations for a graph ADT using an adjacency list and an adjacency matrix. Strings are used to represent a vertex. Undirected graph implementations are also provided. All graphs use the `GraphInterface` which provides common methods available across all implementations.

### Graph Algorithms
The `adt.graph.algorithms` package contains algorithms that deal with graphs. The algorithms for the following have been implemented:
- Prim's algorithm for a spanning tree (note that this does not find the MST)
- Check if a graph is weakly connected
- Check if a graph contains a cycle
- Check if a graph is simple
- Check if a graph is a tree
- Check if a graph is a valid spanning tree

## Sorting
The `sorting` package contains implementations of various sorting algorithms. They all inherit the `Sorter` abstract class, which provides a method to sort an Object and a method to verify that the Object is sorted. 

The sorting algorithms provided are written to sort integer arrays, and all inherit the `IntegerArraySorter` class which provides a verification method. 

The following sorting algorithms have been implemented:
- Bubble sort
- Selection sort
- Insertion sort
- Merge sort
- Quick sort

## Problem solving
The `problemsolving` package contains implementations of various problem solving examples. 

The following problems have a sample solution:
- Fake Coin (12 coins)

## Competition sample solutions
The `comp` package contains sample solutions to programming competition tasks.
The following task sets have solutions (links can be found in the source file):
* UNSW High Schools Programming Competition 2015: Open Round

## Exercise Solutions
The `solutions` package contains sample solutions to problem solving tasks.
The problem statement can be found in the source file.
