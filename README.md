# Java Object Oriented Programming - The Best Damn Review In The World

## Table of Contents

1.  [Trace and Evaluate Assignment Sequences](#1-trace-and-evaluate-assignment-sequences)
2.  [Identify Valid Java Identifiers](#2-identify-valid-java-identifiers)
3.  [Evaluate Java Expressions](#3-evaluate-java-expressions)
4.  [Identify Java Primitive Types by Name, Literal, and Expression](#4-identify-java-primitive-types-by-name-literal-and-expression)
5.  [Choose the Best Java Data Type](#5-choose-the-best-java-data-type)
6.  [Declare a Variable of a Specified Primitive Type](#6-declare-a-variable-of-a-specified-primitive-type)
7.  [Demonstrate Comprehension of Identifier Semantics](#7-demonstrate-comprehension-of-identifier-semantics)
8.  [Trace and Evaluate Code with Multiple Methods](#8-trace-and-evaluate-code-with-multiple-methods)
9.  [Trace Code with Decisions and Loops](#9-trace-code-with-decisions-and-loops)
10. [Declare and Instantiate Arrays (Including 2-D Arrays)](#10-declare-and-instantiate-arrays-including-2-d-arrays)
11. [Manipulate Arrays with Indexes and Loops](#11-manipulate-arrays-with-indexes-and-loops)
12. [Trace Code with Arrays and Loops](#12-trace-code-with-arrays-and-loops)
13. [Declare and Instantiate Object Variables and Objects](#13-declare-and-instantiate-object-variables-and-objects)
14. [Differences Between Value Types and Reference Types](#14-differences-between-value-types-and-reference-types)
15. [Differentiate Common Orders of Runtime Complexity](#15-differentiate-common-orders-of-runtime-complexity)
16. [Identify Common Algorithms by Their Runtime Complexity](#16-identify-common-algorithms-by-their-runtime-complexity)
17. [Read and Interpret UML Class Diagrams](#17-read-and-interpret-uml-class-diagrams)
18. [Trace and Evaluate Code with Reference Types and Classes](#18-trace-and-evaluate-code-with-reference-types-and-classes)
19. [Encapsulation, Data Hiding, Inheritance, and Polymorphism](#19-encapsulation-data-hiding-inheritance-and-polymorphism)
20. [Stacks and Queues (Common Operations)](#20-stacks-and-queues-common-operations)
21. [Linked Lists and Linked List Operations](#21-linked-lists-and-linked-list-operations)
22. [Identify Equivalent Iterative and Recursive Algorithms](#22-identify-equivalent-iterative-and-recursive-algorithms)
23. [Functional Understanding of Quicksort and Merge Sort](#23-functional-understanding-of-quicksort-and-merge-sort)
24. [Functional Understanding of Binary Search Algorithm](#24-functional-understanding-of-binary-search-algorithm)
25. [Binary Trees vs Binary Search Trees (BST) and Tracing Code with Trees](#25-binary-trees-vs-binary-search-trees-bst-and-tracing-code-with-trees)
26. [The App](#the-app)

---

## 1. Trace and Evaluate Assignment Sequences

Understanding how assignments change variable values step-by-step is crucial. In Java, the single equals sign `=` is the assignment operator (not an equality check). To **trace an assignment sequence**, follow the code line by line, updating each variable’s value as you go. For example:

```java
int x = 17;
int y = 5;
int a = y;  // a gets 5, x is 17, y is 5
y = x;      // y gets 17, x is 17, a is 5
x = a;      // x gets 5, (the old y), y is 17
System.out.println(x + ", " + y);  // outputs: 5, 17
