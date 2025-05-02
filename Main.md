# **Java Object Oriented Programming \- The Best Damn Review In The World** {#java-object-oriented-programming---the-best-damn-review-in-the-world}

[Java OOP Final Exam Best Damn Review In The World](#java-object-oriented-programming---the-best-damn-review-in-the-world)

[1\. Trace and Evaluate Assignment Sequences](#1.-trace-and-evaluate-assignment-sequences)

[2\. Identify Valid Java Identifiers](#2.-identify-valid-java-identifiers)

[3\. Evaluate Java Expressions](#3.-evaluate-java-expressions)

[4\. Identify Java Primitive Types by Name, Literal, and Expression](#4.-identify-java-primitive-types-by-name,-literal,-and-expression)

[5\. Choose the Best Java Data Type](#5.-choose-the-best-java-data-type)

[6\. Declare a Variable of a Specified Primitive Type](#6.-declare-a-variable-of-a-specified-primitive-type)

[7\. Demonstrate Comprehension of Identifier Semantics](#7.-demonstrate-comprehension-of-identifier-semantics)

[8\. Trace and Evaluate Code with Multiple Methods](#8.-trace-and-evaluate-code-with-multiple-methods)

[9\. Trace Code with Decisions and Loops](#9.-trace-code-with-decisions-and-loops)

[10\. Declare and Instantiate Arrays (Including 2-D Arrays)](#10.-declare-and-instantiate-arrays-\(including-2-d-arrays\))

[11\. Manipulate Arrays with Indexes and Loops](#11.-manipulate-arrays-with-indexes-and-loops)

[12\. Trace Code with Arrays and Loops](#12.-trace-code-with-arrays-and-loops)

[13\. Declare and Instantiate Object Variables and Objects](#13.-declare-and-instantiate-object-variables-and-objects)

[14\. Differences Between Value Types and Reference Types](#14.-differences-between-value-types-and-reference-types)

[15\. Differentiate Common Orders of Runtime Complexity](#15.-differentiate-common-orders-of-runtime-complexity)

[16\. Identify Common Algorithms by Their Runtime Complexity](#16.-identify-common-algorithms-by-their-runtime-complexity)

[17\. Read and Interpret UML Class Diagrams](#17.-read-and-interpret-uml-class-diagrams)

[18\. Trace and Evaluate Code with Reference Types and Classes](#18.-trace-and-evaluate-code-with-reference-types-and-classes)

[19\. Encapsulation, Data Hiding, Inheritance, and Polymorphism](#19.-encapsulation,-data-hiding,-inheritance,-and-polymorphism)

[20\. Stacks and Queues (Common Operations)](#20.-stacks-and-queues-\(common-operations\))

[21\. Linked Lists and Linked List Operations](#21.-linked-lists-and-linked-list-operations)

[22\. Identify Equivalent Iterative and Recursive Algorithms](#22.-identify-equivalent-iterative-and-recursive-algorithms)

[23\. Functional Understanding of Quicksort and Merge Sort](#23.-functional-understanding-of-quicksort-and-merge-sort)

[24\. Functional Understanding of Binary Search Algorithm](#24.-functional-understanding-of-binary-search-algorithm)

[25\. Binary Trees vs Binary Search Trees (BST) and Tracing Code with Trees](#25.-binary-trees-vs-binary-search-trees-\(bst\)-and-tracing-code-with-trees)

[The App](#the-app)

## **1\. Trace and Evaluate Assignment Sequences** {#1.-trace-and-evaluate-assignment-sequences}

Understanding how assignments change variable values step-by-step is crucial. In Java, the single equals sign \= is the assignment operator (not an equality check). To **trace an assignment sequence**, follow the code line by line, updating each variable’s value as you go. For example:

* int x \= 17;  
* int y \= 5;  
* int a \= y;  // a gets 5, x is 17, y is 5  
* y \= x;      // y gets 17, x is 17, a is 5  
* x \= a;      // x gets 5, (the old y), y is 17  
* System.out.println(x \+ ", " \+ y);  // outputs: 5, 17


In this sequence, we swapped x and y using a temporary a. Each assignment takes the **current** right-hand value and stores it in the left-hand variable. Remember that assignment is **imperative**: it changes the left variable’s content.

* **Chained assignment:** Java allows chaining like int i, j, k; i \= j \= k \= 0; which sets all to 0\. Such chains are evaluated right-to-left (the value 0 is assigned to k, then that result is assigned to j, etc.).

**Common Pitfalls:**

* Don’t confuse \= (assignment) with \== (equality comparison). x \= 5 sets x to 5, whereas x \== 5 checks if x is 5\.

* Each assignment happens in sequence. If you reuse a variable on the right side after changing it, remember the new value. For example, in a \= b; b \= 10; a \= a \+ b; the last line uses the updated b.

* Attempting to use an uninitialized local variable on the right side will cause a compile error (e.g., int a; int b \= a; is invalid because a has no value yet).

  ## **2\. Identify Valid Java Identifiers** {#2.-identify-valid-java-identifiers}

Java identifiers are names for variables, methods, classes, etc. A **valid identifier** must follow these rules:

* Can contain letters (Unicode characters), digits, \_ underscores, and $ dollar signs.

* **Must not start with a digit.** It should start with a letter, underscore, or dollar sign.

* No spaces or special symbols (like @, \#, \-, \!) are allowed.

* **Cannot be a reserved keyword** (class, int, if, etc. are off-limits as names).

* Identifiers are case-sensitive (e.g., MyVar vs myVar are different).

Examples of valid identifiers:

* myVar (starts with a letter)

* \_temp (starts with underscore)

* $value1 (starts with $)

* MAX\_SPEED (all caps and underscore, often used for constants)

Examples of invalid identifiers:

* 3rdPlace – starts with a digit (invalid start character)

* user-name – contains a hyphen (only letters, digits, \_ , $ allowed)

* class – reserved word in Java

* my var – contains a space (not allowed)

It’s good practice (not a rule, but a convention) for variable and method names to start with a lowercase letter and use camelCase (e.g., totalScore), and class names to start with uppercase (PascalCase). Avoid starting identifiers with $ or \_ unless necessary (though legal, they are by convention used in special contexts).

**Common Pitfalls:**

* Using Java keywords as identifiers – this will cause a syntax error (e.g., int float \= 5; is invalid because float is a keyword).

* Starting an identifier with a number or using illegal characters – the code won’t compile (e.g., int 2cool \= 3; ✗).

* Remember that Java is case-sensitive: result and Result are different; referring to the wrong case will cause “cannot find symbol” errors.

  ## **3\. Evaluate Java Expressions** {#3.-evaluate-java-expressions}

Java expressions combine values and operators to produce a result. Understanding **operator precedence** and evaluation rules is key:

* **Arithmetic operators:** \* / % have higher precedence than \+ \-. For example, 5 \+ 2 \* 3 is evaluated as 5 \+ (2\*3) \= 11. Use parentheses (...) to explicitly specify order if needed.

* **Assignment in expressions:** In Java, an assignment like x \= 5 is also an expression that evaluates to the assigned value (5), but in practice it’s used for side effects (setting variables) rather than its result. Be careful not to confuse it with equality.

* **Type and promotion:** If an expression mixes types, Java will *promote* smaller types to larger ones. For example, in 5 \+ 2.5, the int 5 is promoted to double 5.0 and result is 7.5 (a double). Also, arithmetic on byte or short values promotes them to int before calculation.

* **Integer division:** When both operands are integers, division / discards any fractional part. e.g., 7 / 2 yields 3 (floor division). Use a double or cast to get a decimal result, e.g. 7 / 2.0 or (double)7/2 yields 3.5.

* **Modulo operator %:** gives the remainder of division. Example: 10 % 3 is 1 (since 10 \= 3\*3 \+ 1).

* **Boolean expressions:** && (AND), || (OR) operators short-circuit (they stop evaluating as soon as the result is determined). && and || have lower precedence than comparison operators like \==, \<, \>. For instance, true || false && false evaluates as true || (false && false) – the && happens first, so it becomes true || false, resulting in true.

* **Relational and equality ops:** \== and \!= for equality/inequality, \<, \>, \<=, \>= for comparisons. They yield boolean results. Be mindful: a \== b checks value equality for primitives (and reference equality for objects).

* **Increment/decrement:** \++ and \-- can be used as prefix or postfix. Prefix (\++x) increments then returns the new value; postfix (x++) returns the old value then increments. For example:

   int a \= 5;  
* int b \= a++ \+ 2;  // b gets 5+2 \= 7, then a becomes 6  
* int c \= \++a \+ 2;  // a becomes 7, then c gets 7+2 \= 9  
*  Be careful with these in complex expressions; it can be confusing to trace.

**Common Pitfalls:**

* Misunderstanding precedence: e.g. writing x \+ y \* z and expecting addition first. Always use parentheses if unsure: (x \+ y) \* z vs x \+ (y \* z).

* Ignoring integer division behavior: 1/2 \== 0 in int math (not 0.5\!). This can lead to bugs if you expected a fraction. If you need a float result, ensure one operand is a double or float.

* Overflows: integer arithmetic can overflow without error (e.g. a large int sum wrapping around). This might not be heavily tested in an intro course, but be aware of ranges.

* Using \== to compare strings or objects instead of .equals() – \== checks if two object references are the same object, not if their content is equal. For example, "hello" \== "hello" might be true due to string pooling, but generally use "hello".equals(otherString) for string content comparison.

* Complex expressions with side effects (like i \+ \++i) yield undefined behavior in C/C++, but in Java it’s well-defined (left-to-right evaluation for operands). Still, avoid writing such confusing code in the first place.

  ## **4\. Identify Java Primitive Types by Name, Literal, and Expression** {#4.-identify-java-primitive-types-by-name,-literal,-and-expression}

Java has **8 primitive data types**:

* **int** – 32-bit integer. Literal examples: 42, 0, \-5. (By default an integer literal like 42 is of type int.) In expressions, operations on ints stay int (unless combined with a larger type).

* **long** – 64-bit long integer. Literal must have an L or l suffix to denote long (e.g., 42L). Use for very large integers (beyond ±2 billion). Example: long big \= 10000000000L;.

* **short** – 16-bit integer (rarely used for small range integers, –32,768 to 32,767). No special literal format; must be within range or cast. e.g., short s \= 100;.

* **byte** – 8-bit integer (–128 to 127). Also no special literal (just cast or assign a small int constant). e.g., byte b \= 127;.

* **double** – 64-bit floating-point (decimal) number. Default type for real number literals. Literal examples: 3.14, 0.0, 1e6 (scientific notation). Expression results default to double if any double is involved. e.g., double x \= 5.0 \* 2; // 10.0.

* **float** – 32-bit floating-point. Literal requires an F or f suffix (e.g., 3.14f) unless you cast. Used when you need less precision or memory than double. Example: float f \= 3.14F;.

* **char** – 16-bit Unicode character. Literal is a single character in single quotes, e.g., 'A', '7', '\\n' (newline), or a Unicode code like '\\u0041'. Numerically, a char is an integer type (0 to 65535\) – you can do char c \= 65; (which is 'A'), and c \+ 1 results in an int.

* **boolean** – truth value, can only be true or false. Literal values are exactly true and false. There are no numeric representations for boolean (unlike C's 0/1).

**Type by literal or expression:**

* An integer literal without suffix is int by default. A large literal (beyond int range) requires L to be a long.

* A decimal literal (with a dot or exponent) is double by default, unless suffixed with f for float.

* A character literal in quotes is char. A string literal in double quotes (e.g. "hello") is not a primitive – it’s a String object.

* Combining types: if you mix types in an expression, the result is promoted to the widest type among the operands. Order of promotion: byte, short, char \-\> int \-\> long \-\> float \-\> double. E.g., int \+ long \-\> long, int \+ double \-\> double. Also, char \+ int \-\> int (char becomes its int code point).

* Beware that arithmetic on smaller types (byte, short, char) is done as int. For example:

   byte b1 \= 40, b2 \= 50;  
* // byte b3 \= b1 \+ b2; // ERROR: b1+b2 is int, won't fit into byte without cast  
* byte b3 \= (byte)(b1 \+ b2); // need cast, result 90 fits in a byte in this case  
* 

**Common Pitfalls:**

* Trying to assign a large integer literal to an int without L (e.g., int big \= 10000000000; is a compile error – literal too large for int).

* Forgetting the f for float literals (e.g., float f \= 3.14; causes a compile error because 3.14 is double by default, you need 3.14f or a cast).

* Confusing char and String: 'A' is a char (numeric value 65), "A" is a String object. They are not interchangeable.

* Assuming boolean is numeric – you cannot assign 0/1 or use true/false as 1/0 in Java. boolean flag \= 1; is invalid.

* Overflowing smaller types: e.g., byte b \= 128; is illegal (128 out of byte range). Also, arithmetic wrap-around: if an int exceeds 2^31-1, it wraps to negative due to overflow (Java does not throw overflow errors for primitives).

* Be mindful of default types: e.g., var x \= 5; infers int, var y \= 5.0; infers double. (The var keyword does type inference at compile time based on these rules.)

  ## **5\. Choose the Best Java Data Type** {#5.-choose-the-best-java-data-type}

Choosing the appropriate data type depends on the nature and range of the data:

* **int**: Use for integers in general. It’s the go-to for counting, loop indices, and values that comfortably fit in ±2 billion range. Example: number of students in a class (int).

* **long**: Use for larger integers that might exceed int range. For example, population of a country, timestamps in milliseconds, unique IDs. (Range about ±9.22e18). If unsure and dealing with potentially huge counts, long is safer.

* **short / byte**: These are integers with smaller range. Seldom needed explicitly unless memory is critical (e.g., large arrays of millions of tiny numbers) or for specific protocols. byte is often used for raw binary data or streams. Use them only when you know the range is limited and saving memory matters.

* **double**: Default for real numbers (floating-point). Use for measurements, calculations with fractions, or when decimals are needed (e.g., 3.14, monetary values in non-critical scenarios). It has \~15 decimal digits of precision.

* **float**: Use if you explicitly want single-precision float (about \~6-7 decimal digits) – perhaps in graphics or large arrays where double precision is not needed to save memory. Otherwise, double is usually preferred for accuracy.

* **boolean**: Use for flags and conditions (true/false values). Example: boolean isGameOver \= false;. Ideal for tracking binary states.

* **char**: Use for single characters or ASCII/Unicode codes. Example: storing a letter grade 'A', or a single character from user input.

* **String** (not primitive but common data type): Use for text data. If a value includes multiple characters or is human-readable text (names, messages), String is appropriate.

* **BigInteger / BigDecimal**: (from java.math library, not primitive) – use these if you need arbitrarily large integers or exact decimal precision (e.g., for financial calculations requiring high precision without binary rounding errors).

**Typical scenarios:**

* Counting things (lengths, array indices, loop counters) \-\> int (unless extreme range, then long).

* Monetary values \-\> Often double, but be cautious with rounding. For exact cents, some use int (cents) or long (cents for large sums) or better, BigDecimal for high precision.

* Precise fractional values (like scientific calculations) \-\> double.

* Tiny integers (0-100 or \-128 to 127\) in huge arrays \-\> byte could be space-efficient.

* True/False conditions \-\> boolean.

* Single letters or characters (like gender 'M'/'F', or a character in a document) \-\> char.

* Text like names, sentences \-\> String (object).

* When in doubt for integers, use int; for decimals, use double.

**Common Pitfalls:**

* Using an unnecessarily large type: e.g., using long for a loop index that never exceeds a few thousand (int would suffice). Not usually harmful, but int is simpler and faster on some operations.

* Using floating-point (float/double) for precise financial calculations – can introduce rounding issues (e.g., 0.1 \+ 0.2 may not exactly equal 0.3 due to binary representation). In those cases, use BigDecimal or integer cents.

* Using a type too small: e.g., storing year of birth in a byte (which can only go up to 127\) will overflow. Always ensure the type’s range covers all possible values.

* Forgetting that char is numeric under the hood – if you do math on chars, you may get numbers (e.g., 'A' \+ 1 results in 66, which is 'B' in Unicode).

* Not considering memory: In most cases, readability and sufficient range are more important than saving a few bytes, especially in high-level coding. Use primitives appropriately, but also know that e.g., an int uses 4 bytes, a long 8 bytes, which usually isn’t a big deal unless in large arrays or systems programming context.

  ## **6\. Declare a Variable of a Specified Primitive Type** {#6.-declare-a-variable-of-a-specified-primitive-type}

Declaring a variable in Java means specifying the type and giving the variable a name. The syntax is:

* \<type\> \<variableName\>;


You can also initialize it (assign an initial value) in the same statement:

* \<type\> \<variableName\> \= \<literal or expression\>;


Examples of declarations for each primitive type:

* int count; – declares an int variable named count (initially it has no value until assigned).

* int sum \= 0; – declares and initializes sum to 0\.

* double price \= 19.99;

* boolean isValid \= true;

* char grade \= 'A';

* long distance \= 123456789L;

* short index \= 100;

* byte b \= 12;

You can declare multiple variables of the same type in one line, but it’s often clearer to separate them:

* int a \= 1, b \= 2, c;  // c is declared but not initialized


A variable must be **declared** before use. The declaration associates a type with the name, so the compiler knows what kind of data it holds and what operations are allowed.

* For example, after double price;, you can’t do price \= "hello"; because "hello" is a string, not a double.

* Until you assign a value, a local variable has no default value (using it is a compile error). So always initialize or assign before reading. (Fields in classes do get default 0/false/null, but it's good practice to initialize them too.)

**Common Pitfalls:**

* Forgetting to initialize local variables before use. E.g.,

   int x;  
* System.out.println(x); // ERROR \- x is not initialized  
*   
* Type mismatch on initialization. The value on right must be compatible with the declared type. e.g., int n \= 5.5; is illegal because 5.5 is a double, not automatically an int.

* Losing precision on initialization without cast: e.g. float f \= 3.14; doesn’t compile because 3.14 is double literal. Needs 3.14f or (float)3.14.

* Using an incompatible type in assignment: Java won’t implicitly convert most types. For instance, int a \= 5; long b \= a; is okay (int \-\> long promotion), but int c \= b; needs a cast because long to int could lose information.

* Shadowing variable names: Declaring a variable with the same name as another in an inner scope will *shadow* the outer one, which can be confusing. It’s legal to do int x \= 5; { int x \= 10; ... } inside a block, but inside that block the second x hides the first. Best to avoid reusing names in nested scopes.

  ## **7\. Demonstrate Comprehension of Identifier Semantics** {#7.-demonstrate-comprehension-of-identifier-semantics}

Identifiers (variable names, method names, class names, etc.) in Java are simply **labels** for things (data or code). **Semantics of identifiers** refers to understanding what the name represents and how it’s used:

* A variable name refers to a memory location holding a value (for primitives) or a reference to an object (for reference types). The name itself is *not* the value or object; it’s a way to get to it.

* Assignment like x \= y; *copies the value* from one variable to another. After int a \= 5; int b \= a;, b has a copy of 5\. They are independent; changing a later won’t affect b.

* For object references, A \= B; makes both references point to the same object (aliasing). Changing the object through one reference will be visible through the other.

* Each identifier has a **scope** (region of code where it’s valid). For example, a local variable’s name is only valid inside its method/block. Two different methods can use the same variable name without conflict (they exist in different scopes).

* Identifier naming doesn’t affect performance or behavior beyond readability and scoping. For instance:

   int cats \= 5;  
* int dogs \= cats;  
* cats \= 7;  
* System.out.println(dogs); // still 5, since dogs had its own copy  
*  Here cats and dogs are just names; the values they hold can differ.

**Key points:**

* A variable’s identifier is bound to a type at compile time. That determines what operations you can do (you can call string methods on a String variable, but not on an int).

* Identifiers for classes, methods: e.g., String is an identifier for the String class provided by Java, System is the class name for system utilities, println is the method name. Knowing what they refer to is important (class vs variable vs method).

* **Parameter vs argument:** In a method definition void foo(int x), x is a parameter name (an identifier local to that method). When you call foo(5), the value 5 is passed; inside foo, x will refer to a copy of that value.

* **Shadowing/hiding:** If a local variable has the same name as a field, the local “hides” the field within its scope. For example:

   int value \= 10;  
* void test() {  
*     int value \= 20;  
*     System.out.println(value); // prints 20 (local shadows field)  
*     System.out.println(this.value); // prints 10 (explicitly referring to field)  
* }  
*  Understanding which value is in context is part of identifier semantics.

* **Constants:** If an identifier is declared final, it means it can’t be reassigned after initialization. By convention constants are named in ALL\_CAPS, e.g. final int MAX\_SIZE \= 100;.

**Common Pitfalls:**

* Believing that assigning one variable to another links them permanently. For primitives, it’s a one-time copy; for references, it makes them aliases to the same object (which *does* link their fate regarding that object’s state, but reassigning one reference doesn’t reassign the other).

* Confusion between an identifier and the data it holds. For example, after int a \= 3; int b \= a;, thinking a is somehow attached to b. In reality, b just got a copy of 3\. If we then do a \= 4;, b remains 3\.

* Not realizing scope limitations: trying to use a variable outside its scope (e.g., using a loop variable outside the loop where it was declared) will cause an error because the name doesn’t exist there.

* Using the same name for different things in overlapping scopes can cause mistakes. E.g., having a class field int index; and a method parameter int index – inside that method, index refers to the parameter, hiding the field.

* Assuming default values for local variables: unlike fields, local variables don’t have a default; you must assign them before use.

* Remember that identifier names have no runtime effect on performance – naming is purely for human reading and scoping. The JVM doesn’t care if you called your variable x or elephant.

  ## **8\. Trace and Evaluate Code with Multiple Methods** {#8.-trace-and-evaluate-code-with-multiple-methods}

When tracing code that involves **multiple method calls**, keep track of each method’s execution, parameters, and return values. Each method has its own local variables and parameters which exist only during that method’s execution. Key points:

* **Method call flow:** When a method is called, the program “jumps” into that method, executes its code, then returns back to the call site (optionally with a return value).

* **Parameters passing:** Java is *always pass-by-value*. This means when you call a method, the *value* of each argument is copied into the method’s parameter variables. For primitives, the numeric value is copied; for objects, the reference (address) is copied (so both caller and callee refer to the same object).

* **Return values:** If the method returns a value, that becomes the result of the call expression and can be used or stored by the caller.

Consider this example:

* public class Example {  
*     public static void main(String\[\] args) {  
*         int x \= 5;  
*         int y \= addOne(x);  
*         System.out.println("x=" \+ x \+ ", y=" \+ y);  
*           
*         Point p \= new Point(2, 3);  
*         modifyPoint(p);  
*         System.out.println("Point after modify: (" \+ p.x \+ ", " \+ p.y \+ ")");  
*     }  
*     public static int addOne(int num) {  
*         num \= num \+ 1;  
*         return num;  
*     }  
*     public static void modifyPoint(Point pt) {  
*         pt.x \= 10;  
*         pt \= new Point(0, 0);  
*     }  
* }


Tracing this:

* main starts, declares x (5).

* Calls addOne(x). The value 5 is passed into addOne’s parameter num. Inside addOne, num becomes 6 (num \= num \+ 1;), then returns 6\. Back in main, that return 6 is assigned to y. Now x is still 5 in main (it was passed by value, so unchanged), y is 6\.

* Next, Point p is created with coordinates (2,3). modifyPoint(p) is called. The reference p (address of that Point object) is passed by value, so modifyPoint’s parameter pt refers to the **same** Point object as p did.

* Inside modifyPoint: pt.x \= 10; changes the Point’s x to 10\. So the object that p points to now has x=10, y=3.

* Then pt \= new Point(0, 0); reassigns the local parameter pt to a new Point object (0,0). **This does not affect** the caller’s p – p still points to the original (10,3). After modifyPoint ends, that new Point is lost (no reference to it).

* Back in main, p still refers to the original Point, which was modified to (10,3). So the print displays Point after modify: (10, 3\).

**How to trace systematically:**

1. **Start in main (or the top method)** and list its local variables and their values.

2. When a method is called, pause the current method, and move to the called method:

   * Set up the called method’s parameters with copies of the argument values.

   * Execute the called method line by line, managing its local variables.

   * If it calls another method, repeat the process (stacking calls).

   * When a method returns, take note of the return value (if any), and resume the caller:

     * The call expression becomes that returned value.

     * The called method’s locals are discarded (out of scope after return).

3. Continue in the caller method after the call.

Remember that each method call has its own "stack frame" (an isolated set of parameters and locals). Variables of one method do not interfere with variables of another (except via returns or by modifying shared objects).

**Common Pitfalls:**

* Expecting a method to modify a primitive argument in the caller. Since primitives are passed by value, modifications in the callee don’t reflect outside. (In the example, addOne(x) didn’t change x in main.)

* Conversely, not realizing that object arguments can be modified via their reference. If a method alters the state of an object passed in, the caller sees that change because they refer to the same object.

* Forgetting to use the return value. If a method computes something and returns it, but the caller ignores it (doesn’t assign or use it), that result is lost. For example, calling addOne(x); without assigning it to anything does nothing useful.

* Thinking that returning from a method will also exit the program or other methods – it only exits the current method and goes back to the caller.

* When tracing, confusing the same variable name in different methods. A common example: many methods might use a local variable named i for loops or result for a calculation. Each of these is separate; you have to track them per method.

* If recursion is involved (a method calling itself), tracing needs careful attention to each recursive call’s parameters and return. Each recursive call is a new independent instance of the method on the call stack.

  ## **9\. Trace Code with Decisions and Loops** {#9.-trace-code-with-decisions-and-loops}

When code involves **decision structures** (if/else statements) and **loops** (for, while, do-while), tracing means following the flow of control as it branches and repeats. Key points for tracing:

* For an if or if-else: evaluate the condition. If true, execute the if-block; if false, skip it or execute the else-block. Only one branch runs.

* For a switch statement: find the matching case (or default) and execute from there (remember break will exit the switch).

* For loops:

  * **for loop**: Typically for (init; condition; update) { ... }. Start by doing the init once, then before each iteration check the condition; if true, execute loop body, then do the update step and repeat. Stop when condition is false.

  * **while loop**: while(condition) { ... } checks the condition first; if true, do the body, then repeat. If condition is false initially, the body may not execute at all.

  * **do-while loop**: do { ... } while(condition); executes the body at least once, then checks condition to decide whether to loop again.

* **Tracing approach**: Often it helps to draw a table of variable values per iteration or write out the sequence of operations and changes.

Example:

* int sum \= 0;  
* for (int i \= 1; i \<= 5; i++) {  
*     if (i % 2 \== 0\) {  
*         System.out.println(i \+ " is even");  
*     } else {  
*         System.out.println(i \+ " is odd");  
*     }  
*     sum \+= i;  
* }  
* System.out.println("Sum \= " \+ sum);


Trace this:

* Loop initialization: i \= 1, sum \= 0.

* Check i \<= 5: 1 \<= 5 true \-\> enter loop.

  * i % 2 \== 0? 1 % 2 \= 1, not 0, so false \-\> go to else \-\> prints "1 is odd".

  * sum \+= i; now sum \= 0 \+ 1 \= 1\.

  * Loop update: i++ makes i \= 2\.

* Next iteration: check 2 \<= 5 true.

  * 2 % 2 \== 0 true \-\> prints "2 is even".

  * sum \= 1 \+ 2 \= 3\.

  * i++ \-\> i \= 3\.

* Next: 3 \<= 5 true.

  * 3 is odd \-\> print.

  * sum \= 3 \+ 3 \= 6\.

  * i \= 4\.

* Next: 4 \<= 5 true.

  * 4 is even \-\> print.

  * sum \= 6 \+ 4 \= 10\.

  * i \= 5\.

* Next: 5 \<= 5 true.

  * 5 is odd \-\> print.

  * sum \= 10 \+ 5 \= 15\.

  * i \= 6\.

* Next: 6 \<= 5 false \-\> exit loop.

* Print "Sum \= 15".

The output sequence would be:

* 1 is odd  
* 2 is even  
* 3 is odd  
* 4 is even  
* 5 is odd  
* Sum \= 15


The trace shows how i changed each time and how sum accumulated.

**Tracing decisions:** Just ensure you follow which branch executes. If an if has nested if/else, be mindful of matching else to the nearest if (use braces to clarify). If you see if(condition) statement; (without braces), only that one statement is conditional.

**Tracing loops:** It can be useful to write the iteration number and the key variable values at start and end of each iteration. For nested loops, you might do a table with multiple indices (e.g., i and j values).

**Common Pitfalls:**

* Off-by-one errors: e.g., using \< instead of \<= in a loop condition or vice versa, which can cause one too few or one too many iterations. When tracing, check the exact loop bounds.

* Forgetting that a break inside loop will jump out of the loop entirely, and continue will jump to the next iteration. If these are present, adjust trace flow accordingly.

* Infinite loops: if a loop’s condition never becomes false or you accidentally always true it. If tracing and you find the condition doesn’t change or remains true forever, you’ve hit an infinite loop scenario.

* Assuming an if-else both will run – only one branch runs. If the condition is true, the else is skipped entirely.

* Pay attention to loop index updates especially in for loops. The update happens after the loop body each time. In a while, you must ensure something in the loop eventually makes the condition false, or you’ll loop indefinitely.

* Compound conditions: e.g., if (a \> 0 && b \> 0\) { ... }. Both conditions must be true to enter. If a is false, b \> 0 won’t even be checked (short-circuit). This might matter if b \> 0 has side effects (though one should avoid side effects in condition checks).

* Nesting: in nested loops, ensure you know which loop a break or continue affects (it applies to the innermost loop by default).

  ## **10\. Declare and Instantiate Arrays (Including 2-D Arrays)** {#10.-declare-and-instantiate-arrays-(including-2-d-arrays)}

An array in Java is an ordered collection of elements of the same type, stored in a contiguous block and accessed by index. **Declaration** and **instantiation** are distinct steps:

* **Declare** an array variable: specify the type of elements with \[\]. Example: int\[\] numbers; (declares a variable that will hold a reference to an int array).

* **Instantiate** (create) the array: use new type\[size\]. Example: numbers \= new int\[5\]; allocates an array of 5 ints (indexed 0 to 4). Each element is initialized to the default value (0 for numeric, false for boolean, \\0 for char, null for object references).

* You can also combine declaration and instantiation in one line: int\[\] numbers \= new int\[5\];.

* Alternatively, use an **array initializer literal** (for convenience when you know the values): int\[\] primes \= {2, 3, 5, 7, 11}; creates an array of length 5 with those values. (This syntax can only be used at declaration.)

**1-D Array example:**

* // Declaration  
* double\[\] temperatures;  
* // Instantiation  
* temperatures \= new double\[7\];  
* // Now temperatures\[0\] through temperatures\[6\] exist, all initialized to 0.0.  
* temperatures\[0\] \= 98.6;  
* System.out.println(temperatures.length);  // prints 7, the size of the array


**2-D Array (matrix) declaration and instantiation:**  
 A 2D array in Java is an “array of arrays”. Declaration: type\[\]\[\] name;. Instantiation: you need to specify at least the first dimension:

* int\[\]\[\] matrix \= new int\[3\]\[4\]; creates a 3x4 grid of int (3 rows, 4 columns). All values default to 0\. You can access, say, matrix\[1\]\[3\] (2nd row, 4th column).

* **Ragged arrays:** You can create non-rectangular arrays. For example:

   int\[\]\[\] triangle \= new int\[3\]\[\];        // 3 rows, unknown cols yet  
* triangle\[0\] \= new int\[1\];  
* triangle\[1\] \= new int\[2\];  
* triangle\[2\] \= new int\[3\];              // Now we have a triangular ragged array  
*  Each row is allocated independently.

* You can also initialize 2D arrays with literal values:

   int\[\]\[\] identity \= {  
*     {1, 0, 0},  
*     {0, 1, 0},  
*     {0, 0, 1}  
* };  
*  This is a 3x3 matrix with those values.

**Key array facts:**

* Array indices start at 0\. An array of length N has valid indices 0 through N-1.

* Accessing an index outside this range throws ArrayIndexOutOfBoundsException.

* array.length gives the size of the array (note: it's a property, not a method, so no parentheses).

* Arrays are objects in Java, even for primitive element types. The variable holds a reference to the array object.

* A newly instantiated array of primitives is filled with zeros (or false for boolean). An array of objects (e.g., String\[\]) is filled with nulls by default (since no actual objects yet).

* You can have arrays of any type, including an array of an array (multidimensional), or an array of objects of a class.

**Common Pitfalls:**

* Forgetting to allocate the array with new. Declaring int\[\] arr; alone just creates a reference, not an actual array. Using arr\[0\] before arr \= new int\[someSize\]; results in a NullPointerException.

* Using the wrong syntax for declaration: e.g., int numbers\[5\]; is **not** valid in Java (that syntax works in C/C++). You must do int\[\] numbers \= new int\[5\];.

* Off-by-one errors in indexing: trying to access arr\[arr.length\] (which is out of bounds since last index is length-1), or using 1-based indexing by mistake. Remember, if length is 5, indices are 0–4.

* Confusion between length and last index: Last index \= length \- 1.

* For 2D arrays, mixing up dimensions: Java uses row-major order by convention. matrix.length is the number of rows; matrix\[i\].length is the number of columns in row i. If it’s ragged, each row can have different length.

* When copying arrays, note that the array variable is a reference. If you do int\[\] a \= {1,2}; int\[\] b \= a;, you’re not copying contents, a and b refer to the same array object. Altering b\[0\] will also reflect in a.

* Trying to directly print an array reference (e.g., System.out.println(arr)) will print a cryptic type hash (like \[I@1db9742), not the contents. Use Arrays.toString(arr) or loop to print elements.

  ## **11\. Manipulate Arrays with Indexes and Loops** {#11.-manipulate-arrays-with-indexes-and-loops}

Arrays are often processed using loops to iterate through each element by index:

* To **access** an element: use array\[index\]. Example: int first \= arr\[0\];.

* To **modify** an element: assign to an index: arr\[2\] \= 50; (sets the third element to 50).

* The typical loop to traverse an array uses an index from 0 to length-1:

   for (int i \= 0; i \< arr.length; i++) {  
*     System.out.println("Element " \+ i \+ " is " \+ arr\[i\]);  
* }  
*  This visits each element in order.

* Alternatively, Java’s *enhanced for-loop* (for-each) simplifies iteration when you don’t need the index:

   for (int value : arr) {  
*     System.out.println(value);  
* }  
*  This loop automatically goes through each element in arr (read-only access to the value; you can’t get the index directly in this form, and assigning to value doesn’t change the array).

**Common array manipulations:**

* **Summing elements:**

   int total \= 0;  
* for (int i \= 0; i \< arr.length; i++) {  
*     total \+= arr\[i\];  
* }  
*   
* **Finding max/min:**

   int max \= arr\[0\];  
* for (int i \= 1; i \< arr.length; i++) {  
*     if (arr\[i\] \> max) {  
*         max \= arr\[i\];  
*     }  
* }  
*   
* **Searching for a value:**  
  **ds**  
   int target \= 10;  
* boolean found \= false;  
* for (int i \= 0; i \< arr.length; i++) {  
*     if (arr\[i\] \== target) {  
*         found \= true;  
*         break;  
*     }  
* }  
*   
* **Modifying each element:** (e.g., scaling numbers)

   for (int i \= 0; i \< arr.length; i++) {  
*     arr\[i\] \= arr\[i\] \* 2;  
* }  
*   
* **Copying arrays:** You can loop to copy each element from one array to another of equal size. (Or use Arrays.copyOf or System.arraycopy for efficiency.)

For 2D arrays, you often use nested loops:

* int rows \= matrix.length;  
* int cols \= matrix\[0\].length;  
* for (int r \= 0; r \< rows; r++) {  
*     for (int c \= 0; c \< cols; c++) {  
*         System.out.print(matrix\[r\]\[c\] \+ " ");  
*     }  
*     System.out.println();  
* }


This prints a matrix row by row.

**Index basics:**

* Always ensure your index is within 0 to length-1. If using a loop index i, a common pattern is for (int i \= 0; i \< arr.length; i++) (use \< arr.length, not \<=, to avoid out-of-bounds at end).

* When manipulating, if you need to refer to adjacent elements, be careful at boundaries (e.g., when i is last index, i+1 would be out of bounds).

* If you modify the array while looping (other than just updating that index), consider if that affects loop conditions or future elements.

**Common Pitfalls:**

* Off-by-one in loops: Using i \<= arr.length \- 1 in the loop condition works but is easy to mess up; prefer i \< arr.length. Or starting at 1 by mistake instead of 0\.

* Forgetting that array indices start at 0\. New programmers sometimes start at 1 and miss the first element or go out of range at the end.

* Using the wrong array length in a loop (e.g., looping one array length but indexing another array inside loop).

* Modifying an array with a for-each loop incorrectly: The enhanced for loop gives you a copy of the element in the loop variable, so doing for(int val : arr) { val \*= 2; } will *not* change the actual array. Use index-based loop to modify elements.

* Accessing an index based on a value without checking (e.g., arr\[arr\[i\]\] patterns) could go out of bounds if values aren’t in range. Always validate if deriving indices from data.

* When using 2D arrays, forgetting that matrix.length is rows count, matrix\[r\].length is columns count for that row. If the array is not rectangular, different rows can have different lengths.

* If removing elements (for dynamic arrays like ArrayList, not static arrays), you can’t just shrink a built-in array easily; you must manage indices carefully or use an ArrayList.

  ## **12\. Trace Code with Arrays and Loops** {#12.-trace-code-with-arrays-and-loops}

Tracing code that uses arrays and loops involves tracking index changes, array contents, and loop iterations. Let’s do an example and trace it:

* int\[\] data \= {3, 1, 4, 1, 5};  
* int total \= 0;  
* for (int i \= 0; i \< data.length; i++) {  
*     if (data\[i\] % 2 \== 1\) {        // if element is odd  
*         total \+= data\[i\];  
*     }  
*     data\[i\] \= data\[i\] \* 2;  
* }  
* System.out.println("total \= " \+ total);  
* System.out.println("data\[2\] \= " \+ data\[2\]);


Initial state: data \= \[3,1,4,1,5\], total \= 0.

Trace each iteration of the loop (i from 0 to 4):

* i \= 0: data\[0\] is 3, condition 3 % 2 \== 1 true (3 is odd). So total \= total \+ 3 \-\> total becomes 3\. Then data\[0\] \= data\[0\] \* 2, so data\[0\] becomes 6\. Array now \[6,1,4,1,5\].

* i \= 1: data\[1\] is 1 (odd), so add to total: total \= 3 \+ 1 \= 4\. Double it: data\[1\] becomes 2\. Array \[6,2,4,1,5\].

* i \= 2: data\[2\] is 4 (even), condition false, so skip adding. Still double it: data\[2\] becomes 8\. Array \[6,2,8,1,5\].

* i \= 3: data\[3\] is 1 (odd), add: total \= 4 \+ 1 \= 5\. Double it: data\[3\] becomes 2\. Array \[6,2,8,2,5\].

* i \= 4: data\[4\] is 5 (odd), add: total \= 5 \+ 5 \= 10\. Double it: data\[4\] becomes 10\. Array \[6,2,8,2,10\].

* Loop ends (i \= 5 fails i \< data.length).

After loop: total \= 10, and the array has been modified to \[6, 2, 8, 2, 10\]. The print statements will output:

* total \= 10  
* data\[2\] \= 8


(data\[2\] was originally 4, doubled to 8).

When tracing:

* Write down the array contents initially.

* Each iteration, note the index i and the array element accessed/modified.

* Update any variables (like total) as they change.

* By the end, you should have the final values of variables and array content to answer any questions about the outcome.

If the loop uses a while:

* int idx \= 0;  
* while (idx \< data.length && data\[idx\] \!= 0\) {  
*     idx++;  
* }  
* System.out.println("Stopped at index " \+ idx);


You’d increment idx until you find a zero or run out of array. Tracing means checking the condition each time and possibly breaking out.

**Nested loops with arrays:** For example, summing a matrix:

* int sumAll \= 0;  
* for(int r \= 0; r \< matrix.length; r++) {  
*     for(int c \= 0; c \< matrix\[r\].length; c++) {  
*         sumAll \+= matrix\[r\]\[c\];  
*     }  
* }


You would trace row by row, and within each row iterate through columns, updating sumAll.

**Common Pitfalls in tracing:**

* Losing track of which index corresponds to which element after modifications. It helps to re-list the array after each change or at least mark changes.

* Forgetting that array modifications persist between iterations. In the above example, by i=2, data\[0\] and data\[1\] were already changed.

* Not noticing loop exit conditions: e.g., a break inside an if could end the loop early. Mark if the loop ended normally or via break.

* If the loop iterates a large number of times, look for patterns rather than writing every single iteration. For exam tracing, typically examples are manageable in size, but if not, describe the pattern after a few iterations.

* When multiple arrays are involved, ensure you track each separately. For example:

   int\[\] a \= {1,2,3};  
* int\[\] b \= new int\[a.length\];  
* for(int i=0;i\<a.length;i++){ b\[i\] \= a\[a.length-1 \- i\]; }  
*  This reverses array a into b. You’d trace i=0 (b\[0\]=a\[2\]), i=1 (b\[1\]=a\[1\]), i=2 (b\[2\]=a\[0\]) and see b become {3,2,1}. Keep track of both a and b arrays during the loop.

  ## **13\. Declare and Instantiate Object Variables and Objects** {#13.-declare-and-instantiate-object-variables-and-objects}

In Java, **objects** are instances of classes. To use an object, you need:

1. A **class definition** (blueprint).

2. A variable to hold the object reference.

3. The new operator to actually create the object (allocate memory and call constructor).

**Declaring an object variable:**

* ClassName identifier;


This doesn’t create an object; it just declares a reference variable that can point to an object of type ClassName. Initially it will be null if not assigned.

**Instantiating an object:**

* identifier \= new ClassName(arguments...);


new ClassName(...) calls the constructor of ClassName, creating a new object and returning its reference.

You typically combine these:

* ClassName obj \= new ClassName(arg1, arg2);


For example, given a class Person:

* Person p \= new Person("Alice", 30);


Here Person("Alice", 30\) calls the constructor to initialize the new Person object with name Alice and age 30, and p holds a reference to that object.

Another example using standard library classes:

* String str \= new String("hello");     // generally you'd just use "hello" literal  
* Random rand \= new Random();           // creates a Random number generator  
* Scanner sc \= new Scanner(System.in);  // creates a Scanner for input  
    
* The left side String str declares str as a String reference.

* The right side new String("hello") creates a new String object (though unnecessary here because "hello" literal already is a String).

* After execution, str refers to the "hello" object.

**Object references and memory:**

* When you declare Person p;, no Person exists yet, and p is just a reference that currently points nowhere (defaults to null if a field or must be assigned before use if local).

* After p \= new Person(...);, a Person object is allocated on the heap, and p stores the address of that object.

* If you assign Person q \= p;, now q and p both refer to the same Person object (there is still just one object).

* You can have an array of objects, e.g. Person\[\] people \= new Person\[5\]; (this creates an array that can hold 5 Person references, each element initially null) and then fill it with actual Person instances via new.

**Instantiation without new:** A few cases:

* String literals create String objects without explicit new (e.g., String s \= "hi";).

* Wrapper types can use literals via autoboxing (e.g., Integer x \= 5; behind the scenes does Integer.valueOf(5)).

* However, for most custom classes, you’ll use new.

**Common Pitfalls:**

* Forgetting to instantiate: declaring an object reference but never using new. If you try to call methods on it without assigning an object, you get a NullPointerException. Example: Person p; p.getName(); will throw an error if p wasn’t set to a new Person(...) first.

* Confusing the variable and the object: The variable holds a reference. Doing Person p \= new Person(...); Person q \= p; does not copy the Person, it just creates another reference to the same object.

* Not matching constructor parameters: If new ClassName() expects certain arguments (or none), you must provide exactly those types in order. E.g., if Person’s constructor is Person(String name, int age), you must call new Person("Bob", 25\), not omit or swap types.

* Losing references: If you assign a new object to a reference that was holding another object, the previous object might become unreferenced (eligible for garbage collection if no other references). Example:

   Person p \= new Person("A", 20);  
* p \= new Person("B", 25); // "A" Person is now lost (no reference points to it)  
*   
* Creating an object inside a loop repeatedly without storing them (maybe intended to collect them in an array or list).

* For arrays of objects, remember new ClassName\[n\] only creates the array, not the n objects. You must loop to assign each element:

   Person\[\] team \= new Person\[3\];  
* for(int i=0;i\<3;i++){  
*     team\[i\] \= new Person(...); // instantiate each Person  
* }  
*   
* Static vs instance: To instantiate a class, it cannot be an abstract class or interface. And you usually call instance methods on an object. Don’t try to call instance methods on a class name without an object (that’s what static methods are for).

* Reusing object variables: You can reuse a reference to point to another object, but then you lose the connection to the first object unless another reference kept it. Plan accordingly if you need to keep multiple objects.

  ## **14\. Differences Between Value Types and Reference Types** {#14.-differences-between-value-types-and-reference-types}

In Java, **primitive types** (int, double, boolean, etc.) are value types, and **all objects** (instances of classes, including arrays and Strings) are reference types. This distinction is crucial for understanding assignment and method behavior.

* **Value type (primitives):** The variable holds the actual value. For example, int a \= 10; means the memory for a contains the bit pattern for 10\. When you assign int b \= a;, it copies the value 10 into b. After that, a and b are independent. Changing one does not affect the other.

  * When a primitive is passed to a method, the method gets a copy of that value. The original cannot be altered by the method (changes to the parameter are local).

  * Primitives have no methods (though Java provides wrapper classes like Integer, Double if object behavior is needed).

  * Primitives are stored generally on the stack (for local variables) or inlined in objects for fields.

* **Reference type (objects):** The variable holds a reference (pointer/address) to an object stored in the heap. E.g., Person p \= new Person(); – p itself contains an address where the Person object resides. If you do Person q \= p;, you copy the reference (address) to q. Now both p and q point to the **same** Person object.

  * If you modify the object via p (say p.setName("Alice")), and then access q.getName(), you will see "Alice" because p and q refer to the same object.

  * If you reassign p to another object (p \= new Person("Bob")), q still points to the old object; they no longer alias the same object.

  * Passing an object reference to a method copies the reference (address) value, so the method parameter refers to the same object. The method can mutate the object’s state, and the caller will see those changes. However, if the method reassigns its parameter to a new object, the caller’s reference won’t change.

  * Reference types can be null, meaning “no object”. Primitives cannot be null (they always have some value, or for fields a default like 0).

  * Comparing references with \== checks if they point to the same object (same address), not if their contents are equal (use .equals() for content equality if defined).

**Memory model:**

* Value types (primitives) are stored directly in the variable slot.

* Reference type variable stores a pointer; the actual object is on the heap.

* Example:

   int x \= 5;  
* int y \= x;  
* x \= 7;  
* // now x is 7, y is still 5\.  
*   
* Point p1 \= new Point(2,3);  
* Point p2 \= p1;  
* p1.x \= 10;  
* // now p2.x is also 10, since p1 and p2 refer to the same Point object.  
* 

**More differences:**

* **Default values:** If you have an instance variable (field) that’s a primitive and you don’t initialize it, it gets a default (0, false, etc.). If it’s a reference type, the default is null (meaning no object).

* **Size:** Primitives have fixed sizes (e.g., int 32-bit). References are typically the size of an address (32-bit or 64-bit depending on JVM).

* **Performance:** Accessing a primitive is direct and fast. Accessing an object involves an extra indirection (following the reference to the object).

* **Identity vs value semantics:** Two distinct primitive variables with the same value (5 and 5\) are just equal values. Two object references can point to two different objects that happen to be “equal” by content; \== will report false (different identities) unless they reference exactly the same object.

**Common Pitfalls:**

* Expecting object assignment to copy the object. It doesn’t; it copies the reference. For example:

   int a \= 10;  
* int b \= a;    // b gets a copy of 10  
* a \= 20;       // b is still 10  
* \---  
* ArrayList\<String\> list1 \= new ArrayList\<\>();  
* list1.add("Hi");  
* ArrayList\<String\> list2 \= list1;  // list2 points to the same ArrayList  
* list2.add("There");  
* // Now list1 also has 2 elements ("Hi","There") because it's the same object.  
*   
* Misunderstanding method behavior:

  * If a method does param \= new Something();, the caller’s reference doesn’t change.

  * But if method does param.setFoo(99);, the caller’s object is modified.

* Comparing objects incorrectly: using \== for strings or other objects when you mean to compare content. E.g.,

   String s1 \= new String("hello");  
* String s2 \= new String("hello");  
* if(s1 \== s2) // false, different objects  
* if(s1.equals(s2)) // true, same content  
*   
* Autoboxing confusion: Java will sometimes auto-convert between primitives and their wrapper classes (Integer, Boolean, etc.). The wrapper classes are objects (reference types). Example: Integer a \= 127; Integer b \= 127; may be \== true due to caching of small integers, but Integer a \= 128; Integer b \= 128; if(a==b) is false because 128 is not cached and two different Integer objects are created. In general, use .equals for comparing boxed numbers too.

* Null pointer issues: Only reference types can be null. If you have something like Integer obj \= null; int x \= obj; this will throw NullPointerException due to auto-unboxing a null. Primitives never have this issue (they can’t be null).

* Be aware that arrays are reference types (even an int\[\]). If you assign one array variable to another, they refer to the same array.

  ## **15\. Differentiate Common Orders of Runtime Complexity** {#15.-differentiate-common-orders-of-runtime-complexity}

Runtime complexity (time complexity) describes how an algorithm’s running time grows with the size of input (usually noted as *n*). Common orders (Big-O notation) from fastest to slowest are:

* **O(1) – Constant time:** The algorithm’s runtime does not depend on input size (it’s constant). Example: accessing an array element by index or performing a simple arithmetic operation. No matter if the array has 10 or 10,000 elements, arr\[5\] takes the same amount of time.

* **O(log n) – Logarithmic time:** The runtime grows logarithmically as n increases. This typically happens in divide-and-conquer or binary search-like algorithms where the work reduces the problem size by a factor each step. Example: Binary search on a sorted array of n elements takes about log₂(n) steps. If n \= 1000, log₂(1000) \~ 10 steps – adding more elements increases steps slowly.

* **O(n) – Linear time:** Running time grows in direct proportion to n. Typically a single loop over n items. Example: traversing an array of n elements to find a max or compute a sum.

* **O(n log n):** This is slightly worse than linear, often from algorithms that perform log n work for each of n elements. Many efficient sorting algorithms (merge sort, quicksort average case) run in O(n log n). For n \= 1000, n log n \~ 1000 \* 10 \= 10,000 (roughly).

* **O(n^2) – Quadratic time:** Runtime grows with the square of n. Often comes from double nested loops over roughly n items each. Example: a simple bubble sort or checking all pairs in a list. If n doubles, time quadruples. For 1000 elements, n^2 \= 1,000,000 steps (which is large).

* **O(n^3) – Cubic time:** Three nested loops, etc. Time grows as the cube of n. Becomes infeasible even for moderately large n (e.g., n=1000 \-\> 1e9 operations).

* **O(2^n) – Exponential time:** Runtime doubles with each additional input element. Often from brute-force recursive solutions that try all possibilities (like naive Fibonacci recursion or traveling salesman brute force). n=20 might already be over a million steps, n=30 over a billion.

* **O(n\!) – Factorial time:** Even worse, grows factorially. Trying all permutations of n items, for example. n=10 \-\> \~3.6M, n=11 \-\> \~39M, n=12 \-\> 479M, grows extremely fast.

There are other classes (O(sqrt(n)), O(n^c) etc.), but the above are most common categories.

**How to differentiate:**

* Look at how the algorithm scales. If you loop through input once \-\> O(n). If you have nested loops (double loop) \-\> O(n^2). If you halve the input each time (like binary search) \-\> O(log n).

* Sometimes algorithms have multiple phases; you might add complexities (e.g., do one O(n) pass then an O(n log n) sort \-\> overall O(n log n) as the dominant term).

* Big-O focuses on the dominant term for large n (ignore constants and lower-order terms). So 5n \+ 20 \~ O(n), n \+ n log n \~ O(n log n) for large n.

* **O(log n)** commonly arises in divide & conquer (binary search, tree operations).

* **O(n log n)** in sorting and sophisticated divide & conquer (like merge sort).

* **O(n^2)** in naive double-loop comparisons (like comparing every pair of array elements, or selection sort).

* **O(1)** in direct lookups or arithmetic (regardless of n).

* Also note **O(n \+ m)** forms if two inputs (like combining two lists); that’s linear in the total input size.

**Common Pitfalls:**

* Confusing O(n) vs O(n log n): O(n log n) grows faster than O(n) for large n, but for small n the log factor might not seem significant. However, asymptotically, n log n will outpace n.

* Thinking O(2n) or O(n \+ 5\) are different from O(n) – they are both O(n) (constant factors and constants are dropped).

* Not recognizing worst-case vs average-case: some algorithms (like quicksort) have different complexities depending on input. Usually O(n log n) average, O(n^2) worst-case. Big-O often implies worst-case unless stated average-case.

* Believing that a higher-order complexity is always worse regardless of n – e.g., for very small n, an O(n^2) might outperform O(n log n) if overhead is high, but as n grows, eventually the asymptotic behavior matters. Complexity is about scale.

* Forgetting space complexity vs time complexity: Big-O can describe both. Above we focused on time. Some algorithms use extra memory – e.g., merge sort is O(n log n) time, O(n) space.

* Mistaking O(log n) for O(n) – e.g., scanning an array vs binary search. Or thinking doubling input doubles time for binary search (it doesn’t, it adds a fixed small number of steps).

* In Big-O notation, base of log doesn’t matter (log base 2 vs base 10 differ by constant factor). So we usually just write O(log n).

* Some algorithms have complexity like O(n log m) or others based on multiple parameters (for example, matrix operations might be O(r\*c) if r rows and c columns). Here, consider each dimension.

  ## **16\. Identify Common Algorithms by Their Runtime Complexity** {#16.-identify-common-algorithms-by-their-runtime-complexity}

It’s useful to know typical complexities of well-known algorithms:

* **Linear Search** (unsorted list/array search one by one) – O(n) time. You potentially check each element until found or end.

* **Binary Search** (in a sorted array) – O(log n) time. By halving the search range each time.

* **Sorting Algorithms:**

  * **Bubble Sort, Selection Sort, Insertion Sort** – O(n^2) average and worst-case. (Insertion sort is O(n^2) worst but O(n) best if array is nearly sorted).

  * **Merge Sort** – O(n log n) in all cases (it always divides and merges). Space O(n) for merge.

  * **Quicksort** – O(n log n) average, **O(n^2)** worst-case (rare if pivot chosen well or randomized). Space O(log n) on average (for recursion stack if in-place).

  * **Heap Sort** – O(n log n) always. (Building heap O(n), then n times remove max O(log n) each).

  * **Counting Sort/Radix Sort** – O(n \+ k) or O(n) depending on context (linear time given certain constraints).

  * **Bucket Sort** – O(n \+ m) typically (n items, m buckets) – can approach O(n) if data uniformly distributed.

* **Searching a graph or tree:**

  * **Depth-First Search (DFS)** and **Breadth-First Search (BFS)** – O(V \+ E) for graphs (visiting all vertices and edges linearly). For a tree, O(n) where n is number of nodes.

  * **Binary Tree traversals** (inorder, preorder, postorder) – O(n) for n nodes (visit each node once).

  * **Binary Search Tree (unbalanced)** search/insertion – O(h) where h is height; worst-case h \= n (degrades to O(n) if tree is like a chain). Balanced BST (AVL, Red-Black) maintain h \~ O(log n), so operations O(log n).

* **Hash table operations:** Average O(1) for insert/search/delete (constant time on average, though worst-case can be O(n) if many collisions).

* **Matrix algorithms:**

  * **Matrix multiplication** – naive is O(n^3) for n x n matrices. (There are faster algorithms like Strassen \~O(n^2.8), but not commonly needed in basic course).

  * **Matrix traversal** – O(r\*c) if r rows and c cols (effectively O(n) relative to total elements).

* **Recursion examples:**

  * **Factorial (n\!) using recursion** – O(n) as it multiplies n down to 1 (though the result grows as n\!, the algorithm does n multiplications).

  * **Fibonacci naive recursion** – O(2^n) exponential, because it recalculates a lot (fibo(n) calls fibo(n-1) and fibo(n-2) and so on).

  * **Fibonacci with dynamic programming** – O(n) if you store results.

* **Common algorithms runtime:**

  * **Quickselect** (find k-th smallest) – O(n) average.

  * **Dijkstra’s shortest path** (using a min-heap) – O((V+E) log V).

  * **Merge two sorted lists** – O(n \+ m) where n, m are lengths of the two lists (linear in total elements).

  * **Check if array is sorted** – O(n) (must potentially check each element once).

  * **Find duplicate by brute force** – O(n^2) (checking each pair).

  * **Find duplicate with hashing** – O(n) time (on average) and O(n) space.

**Big-O pairs to memorize:**

* Binary search \-\> O(log n).

* Iterating a simple loop \-\> O(n).

* Nested double loop (i and j) \-\> O(n^2).

* Triple nested \-\> O(n^3).

* Merge sort / Heapsort \-\> O(n log n).

* Quicksort \-\> O(n log n) avg, (know worst-case O(n^2) too).

* BFS/DFS \-\> O(n) or O(V+E) for graph.

* Hash lookups \-\> O(1) average.

* Fibonacci (recursive naive) \-\> O(2^n).

* Towers of Hanoi (recursive) \-\> O(2^n) (for n disks, \~2^n moves).

* Traveling Salesman brute force \-\> O(n\!).

* Binary tree operations average \-\> O(log n).

**Common Pitfalls:**

* Assuming “faster sorting” means better than O(n log n). It’s proven that comparison-based sorting can’t be faster than O(n log n) on average. Algorithms claiming O(n) sort are either using special assumptions or not using comparisons (like counting sort).

* Misidentifying loop complexities: e.g., a loop that halves the index each time (while loop i \= i/2) is O(log n), not O(n).

* Not recognizing multi-variable complexities: e.g., if you have two nested loops, one iterating m times and inner n times, complexity is O(m \* n). If m and n are the same order, that’s O(n^2), but if one is different, keep it as product.

* Thinking that an algorithm that does a fixed number of passes over array is something like O(2n) or O(3n) – that’s still O(n).

* Underestimating exponential: For even moderately large n (like 30 or 40), 2^n or n\! become huge. Recognize those patterns (like recursion branching into two calls \-\> likely O(2^n)).

* Confusing space vs time: e.g., merge sort is O(n) space, quicksort O(log n) space on average, but both O(n log n) time.

  ## **17\. Read and Interpret UML Class Diagrams** {#17.-read-and-interpret-uml-class-diagrams}

UML (Unified Modeling Language) class diagrams provide a visual representation of classes and relationships in object-oriented design. Key elements to interpret:

* **Class notation:** A class is drawn as a rectangle with up to three sections:

  * **Top**: Class name (often in bold or centered). An abstract class name may be italicized; an interface name may have «interface» above it.

  * **Middle**: Attributes (fields) with types.

  * **Bottom**: Methods with their parameters and return types.

* Example: A class diagram box might show:

   Person  
* \- name: String  
* \- age: int  
* \+ getName(): String  
* \+ setName(String): void  
*  This means class Person has private fields name and age, and public methods getName (returns a String) and setName (takes a String, returns nothing).

* **Visibility markers:**

  * \+ public

  * \- private

  * \# protected

  * \~ package (default)  
     These precede attribute and method names.

* **Static members:** Sometimes shown underlined in UML. (If you see an attribute or method underlined, it’s static, meaning belongs to class, not instance.)

* **Abstract members:** May be shown in *italic*. An abstract class name is italic or with {abstract} near name. Abstract methods might be italic or have {abstract} stereotype.

* **Relationships between classes:**

  * **Inheritance (Generalization):** Solid line with a hollow triangle arrowhead pointing to the superclass. This means "extends" (for classes) or "implements" (for interface to class). Example: Dog ──▷ Animal (triangle at Animal) means Dog is a subclass of Animal.

  * **Realization:** Dashed line with a hollow triangle, usually from a class to an interface it implements.

  * **Association:** A plain line connecting classes, possibly with a label and multiplicity. It denotes a usage relationship (like "has-a"). For example, Library \---- Book with a line indicates a Library has some relation to Book. Often you’ll see multiplicity at the ends:

    * Multiplicity examples: 1 (exactly one), 0..1 (zero or one), \* or 0..\* (many), 1..\* (one or more).  
       If a Library can have many Books, near the Library end it might have 1 and near Book end 0..\* (meaning one library associated with many books).

  * **Aggregation:** A specialized association indicating a “whole-part” relationship. Drawn as a line with a hollow diamond at the whole (container) side. Example: Team ◇── Player (diamond at Team) means a team consists of players, but players can exist independently of a team (aggregation is a weak whole-part).

  * **Composition:** A stronger form of aggregation. Line with a filled black diamond at the whole side. Example: House ◆── Room (filled diamond at House) indicates rooms belong exclusively to a house and have no independent life (if house is destroyed, rooms are too). Composition implies ownership and the part cannot exist without the whole.

  * **Dependency:** A dashed line with an arrow (usually pointing to the class depended on). Means one class uses another (perhaps as a parameter or local variable) but not a long-term association. It’s a weaker relationship usually indicating a transient use.

* **Interpreting a diagram:**

  * Identify each class and its members (fields, methods, and their visibilities).

  * Understand inheritance: if ClassB points to ClassA with a triangle, ClassB inherits from ClassA. So ClassB will have all fields/methods of A (except private ones) plus its own.

  * If an interface is shown (maybe with \<\>), and a class has a dashed line to it with triangle, the class implements that interface (so it provides implementations for the interface’s methods).

  * Look at associations: If Class X has a line to Class Y labeled with a role or multiplicity, it indicates a relationship. For example, Order \---- Customer with \* near Order and 1 near Customer means a Customer can have many Orders, and each Order is for one Customer. This implies Order likely has a field like customer or Customer has a list of orders, depending on arrow direction or context.

  * Sometimes arrow on association indicates navigability (which class knows about the other). A filled arrow on one end means the association is navigable from that end only.

* **Example interpretation:**

   \+--------------------+          \+------------------+  
* | Account            |\<\>------\> | Customer         |  
* |--------------------|          |------------------|  
* | \- id: int          |          | \- name: String   |  
* | \- balance: double  |          | \- address: String|  
* |--------------------|          |------------------|  
* | \+ deposit(amount)  |          | \+ getName()      |  
* | \+ withdraw(amount) |          | \+ getAddress()   |  
* \+--------------------+          \+------------------+  
*  Interpretation: Account class has private id and balance, and public methods deposit and withdraw. Customer class has private name and address, and getters. The line with a diamond at Account and arrow to Customer indicates composition (filled diamond) or aggregation (hollow diamond) depending on fill. If filled (composition), it suggests Account cannot exist without Customer – perhaps each Account is owned by a Customer. The multiplicity might show 1 at Customer and maybe \* at Account side, meaning one Customer can have many Accounts, and each Account is associated with exactly one Customer.

* **General reading tips:**

  * Focus on understanding "is-a" (inheritance) vs "has-a" (associations).

  * Use the diagram to see relationships: e.g., if multiple classes point to one base class, that base likely defines common behavior (polymorphism opportunity).

  * The fields and methods in each class tell you what data and functions it encapsulates. If a field type is another class, that implies an association as well (though not always drawn if obvious).

**Common Pitfalls:**

* Mixing up direction of inheritance: The arrow points to the parent (base class or interface). So if you see A → B (triangle at B), B is the parent of A. Some confuse it initially (thinking arrow goes from base to subclass – it’s the opposite).

* Assuming association direction incorrectly: If navigability isn’t explicitly shown, know that an association simply indicates a relationship. If one end has a multiplicity of \* and the other 1, often the \* side has a collection of the 1 side. E.g., Library 1 to Book \* suggests Library has many Books (likely a field like List in Library).

* Ignoring abstract/interface markers: If a method is italic or class is italic, it’s abstract – meaning you cannot instantiate that class, and subclasses must implement abstract methods.

* Not noticing static: Underlined members are static – in interpretation, that means that attribute or operation belongs to the class as a whole.

* Reading UML syntax too rigidly: In practice, UML diagrams might omit some parts for simplicity. For example, they might not show all methods, or skip trivial getters/setters. Focus on key info the diagram is meant to convey (like relationships and important fields/methods).

* Confusing aggregation vs composition in meaning: In practical terms, both show a whole-part. Composition (filled diamond) indicates strong ownership (part’s lifecycle bound to whole). Aggregation (hollow) is weaker. In many class diagrams for simpler designs, this distinction might not be crucial unless specified by the modeler.

  ## **18\. Trace and Evaluate Code with Reference Types and Classes** {#18.-trace-and-evaluate-code-with-reference-types-and-classes}

When tracing code that uses objects (reference types), you need to track not only variable values but also objects on the heap and which variables/reference points to which object. Consider aliasing and object state changes.

Example scenario:

* class Counter {  
*     public int value;  
*     public Counter(int start) { value \= start; }  
*     public void increment() { value++; }  
* }  
* public class RefExample {  
*     public static void main(String\[\] args) {  
*         Counter a \= new Counter(5);  
*         Counter b \= new Counter(5);  
*         Counter c \= a;  
*         a.increment();  
*         System.out.println(a.value \+ ", " \+ b.value \+ ", " \+ c.value);  
*         c \= b;  
*         c.value \= 10;  
*         System.out.println(a.value \+ ", " \+ b.value \+ ", " \+ c.value);  
*     }  
* }


Trace this step-by-step:

* Two Counter objects are created via new Counter(5). Let's call them Object1 (with value=5) assigned to a, and Object2 (value=5) assigned to b.

* So a \-\> Object1(value=5), b \-\> Object2(value=5).

* Counter c \= a; Now c is another reference to the same object as a (Object1). So c \-\> Object1 too.

* a.increment(); calls increment on Object1, which increases its value from 5 to 6\. Now Object1.value \= 6, Object2.value \= 5\.

* After this, a.value is 6, b.value is 5, c.value is also 6 (since c and a point to the same Object1). The print will output: 6, 5, 6.

* Next, c \= b; now we reassign c to refer to Object2 (the one b refers to). Now a \-\> Object1, b \-\> Object2, c \-\> Object2. Object1.value \= 6, Object2.value \= 5\.

* c.value \= 10; This modifies Object2’s value to 10 (through c reference, but b sees the same object). Now Object1.value=6, Object2.value=10.

* Now a.value is still 6, b.value is 10 (because b points to Object2 which was changed), c.value is 10\. The second print outputs: 6, 10, 10.

During tracing, draw a diagram or table:

* Keep track of objects (maybe label them O1, O2, etc., with their internal fields).

* Keep track of reference variables and which object (or null) they point to at each step.

* When a method is called on an object (like a.increment()), figure out which object’s method is invoked via which reference.

* If code passes objects to methods, remember it passes references by value:

  * The method can modify the object’s fields (affecting the original object).

  * If the method reassigns the parameter to a new object, it doesn’t change the caller’s reference.

Another example with methods:

* void resetCounter(Counter X) {  
*     X.value \= 0;  
*     X \= new Counter(100);  
* }  
* ...  
* Counter p \= new Counter(42);  
* resetCounter(p);  
* System.out.println(p.value);


Trace:

* Before call: p \-\> CounterObj(value=42).

* Call resetCounter with X as parameter. X initially points to the same object as p (CounterObj value=42).

* Inside resetCounter: X.value \= 0; sets CounterObj.value to 0\. Now p’s object’s value is 0\.

* Then X \= new Counter(100); makes X point to a new Counter object with value 100\. This does not affect p, which still points to the old object.

* Method returns. p still points to the CounterObj which is now value 0\.

* p.value prints 0\.

Important concept: **difference between modifying an object vs reassigning a reference**:

* Modifying through a reference (like X.value \= ... or calling methods that change state) affects the object that other references might also see.

* Reassigning the reference (like X \= ...) only changes that local/reference, not the original reference outside.

**Polymorphism scenario**: If you have a class hierarchy:

* Animal animal \= new Dog();  
* animal.makeSound();


At runtime, this calls Dog’s makeSound() due to polymorphism, even though the reference type is Animal. While tracing, note the actual object type to know which overridden method runs. If animal was referencing a Cat object, animal.makeSound() would call Cat’s version.

**Common Pitfalls when tracing reference-type code:**

* Forgetting that multiple references can refer to one object. If so, a change via one reference affects what the others see.

* Confusing reference reassignment with object mutation. E.g., X \= Y; vs X.field \= Y;. The first changes what X points to; the second changes data inside the object X points to.

* Null references: if a reference is null and you call a method or access a field, it throws NullPointerException. In trace, if you ever set something to null, be careful not to “use” it.

* Object equality vs reference equality: two different objects with same state are not \==, but might be .equals if defined. In tracing, usually we care about actual references.

* Shallow vs deep copy: assignment of object references is shallow (just another ref). A deep copy would require copying object fields. If code intends to copy an object but just does A \= B;, it’s not a real copy.

* Lifetime: local object references disappear after method call, but the object may remain if another reference points to it or it’s returned. If no references remain, object becomes eligible for garbage collection (which usually isn’t traced explicitly in such problems, but just conceptually).

* Consider also arrays of references: e.g., Thing\[\] arr \= new Thing\[3\]; and then filling arr\[0\] etc. arr itself is a reference to the array object, arr\[0\] etc are references to Things (initially null until set).

  ## **19\. Encapsulation, Data Hiding, Inheritance, and Polymorphism** {#19.-encapsulation,-data-hiding,-inheritance,-and-polymorphism}

These are core principles of object-oriented programming:

* **Encapsulation:** The idea of bundling data (fields) and methods that operate on that data into one unit (a class), and controlling access to that data. It means an object manages its own state via methods. Encapsulation often implies using access modifiers to restrict direct access.

  * Example: A class BankAccount encapsulates balance (a field) and provides methods deposit() and withdraw(). The balance field might be private, so outside code can’t directly change it (ensuring validity). Instead, they must call the methods which enforce rules (like no negative withdrawals).

  * This leads to more maintainable code, because the internal representation can change without affecting external code, as long as the public interface (methods) remains the same.

* **Data Hiding:** This is a facet of encapsulation. It refers to hiding the internal state of an object from the outside world, typically by making fields private and providing controlled access via public methods (getters/setters or other behaviors).

  * By hiding data, you prevent external components from depending on or messing with internal implementation details. For instance, if BankAccount.balance is private, external code cannot set it arbitrarily; they must call deposit or withdraw.

  * Data hiding helps maintain invariants (e.g., balance can never go negative because the methods prevent it).

  * In UML/class definition: using private for fields is data hiding. Often combined with public getters/setters if needed, or better, methods that perform operations so that raw data doesn’t need to be exposed at all.

* **Inheritance:** A mechanism where a new class (subclass or derived class) is based on an existing class (superclass or base class), inheriting its fields and methods. The subclass can use and modify (override) the behavior of the superclass.

  * Purpose: reuse code and model an “is-a” relationship. E.g., Car and Bike could inherit from Vehicle class which has common attributes like speed, methods like move().

  * Syntax in Java: class Car extends Vehicle { ... }.

  * The subclass automatically has all non-private members of the superclass. It can add new fields/methods or override methods to change behavior.

  * **Super keyword:** Within subclass, super() calls the superclass constructor; super.methodName() can call a superclass version of an overridden method.

  * Only single inheritance for classes in Java (one direct superclass), but a class can implement multiple interfaces.

  * Inheritance allows polymorphism (see below) and code reuse, but should represent a logical hierarchy (Liskov Substitution Principle: a subclass should be usable wherever its parent is expected, without surprise).

* **Polymorphism:** Literally "many forms". In OOP it typically means the ability for a reference to take on different types and for the correct method to be executed based on the actual object type at runtime.

  * The most common manifestation is **runtime polymorphism via method overriding**: A subclass overrides a method of the superclass. If you have a Vehicle reference that actually references a Car object, calling vehicle.startEngine() will execute Car’s override of startEngine if one exists.

  * So, one interface, multiple implementations: e.g., Shape class with a method draw(). Subclasses Circle, Square override draw differently. You can do Shape s \= new Circle(); s.draw(); and get circle’s draw, or s \= new Square(); s.draw(); gets square’s draw. The call resolves to the appropriate subclass’s method.

  * Polymorphism allows writing code that works with superclasses or interfaces, and automatically uses the specific behavior of the actual subclass. Example: a method printShape(Shape sh) { sh.draw(); } will work with any shape and call the right draw().

  * Another aspect is **interface polymorphism**: if classes implement a common interface, you can treat them as that interface type.

  * **Compile-time vs runtime:** Polymorphism usually refers to the runtime (dynamic dispatch of overridden methods). There is also compile-time polymorphism (method overloading, where the method signature chosen depends on parameter types at compile time, not typically what we mean in OOP principles discussion).

  * Polymorphic collections: You can have an array or list of superclass type and store various subclass objects in it, and when iterating, each behaves as its actual type.

**Encapsulation & data hiding example:**

* class Person {  
*     private String name;            // data hiding: private field  
*     public Person(String name) {  
*         this.name \= name;  
*     }  
*     public String getName() {       // controlled access  
*         return name;  
*     }  
*     public void setName(String name) {  
*         if(name \!= null && \!name.isEmpty()) {  
*             this.name \= name;  
*         }  
*     }  
* }


Here name is hidden; outside code must use getName/setName.

**Inheritance & Polymorphism example:**

* class Animal {  
*     public void speak() {  
*         System.out.println("Animal makes a sound");  
*     }  
* }  
* class Dog extends Animal {  
*     @Override  
*     public void speak() {  
*         System.out.println("Woof\!");  
*     }  
*     public void fetch() { System.out.println("Dog fetches ball"); }  
* }  
* class Cat extends Animal {  
*     @Override  
*     public void speak() {  
*         System.out.println("Meow\!");  
*     }  
* }  
* ...  
* Animal a1 \= new Dog();  
* Animal a2 \= new Cat();  
* a1.speak();  // prints "Woof\!" because actual object is Dog  
* a2.speak();  // prints "Meow\!" because actual object is Cat  
*   
* Dog d \= (Dog)a1;  
* d.fetch();   // valid after casting, calls Dog-specific method  
    
* Dog and Cat inherit from Animal. They override speak().

* We use an Animal reference to hold a Dog or Cat. This is polymorphism: the call a1.speak() triggers Dog’s speak.

* Note we could not call a1.fetch() directly, because Animal type doesn’t have fetch method. We’d need to downcast to Dog (after ensuring it’s actually a Dog object) to call fetch.

**Common Pitfalls:**

* Encapsulation: thinking that making everything public is fine. That breaks encapsulation, as internals are exposed. It can lead to misuse or difficulty in maintenance. Always restrict access as much as possible (e.g., use private fields).

* Data hiding vs getters/setters: Overuse of getters/setters can sometimes break the spirit of encapsulation if you simply expose all fields via them. True encapsulation might involve providing operations rather than raw data. However, getters/setters are a controlled way if direct field access is needed.

* Inheritance pitfalls:

  * Not using it correctly (e.g., inheriting just to reuse code even if “is-a” relationship doesn’t hold – can lead to awkward designs).

  * Forgetting that constructors are not inherited; a subclass must call a superclass constructor (implicitly or explicitly).

  * Overriding vs overloading: overriding is same method signature in subclass; overloading is defining a method with different parameters. Only overriding relates to polymorphism.

  * If a subclass defines a method with same name but different signature, it’s not overriding, it’s hiding or overloading.

  * Access in inheritance: a subclass cannot directly access private members of parent; it can access protected (and public).

  * The super reference: use it to access parent methods/constructors. If not called explicitly, Java will call the no-arg super() automatically if available.

* Polymorphism pitfalls:

  * Slicing: not an issue in Java as in C++ (where object assignments could slice), because Java always handles objects via references.

  * Casting: If you cast to the wrong type, you get ClassCastException at runtime. Ensure the actual object is of that type. (Using instanceof to check before casting).

  * Not realizing that only overridden methods are polymorphic. Fields are not polymorphic (hiding fields doesn’t have the same behavior). Also static methods are not polymorphic (they belong to class, not instance, and don’t override).

  * Trying to override a method that is declared final in parent – not allowed.

  * Confusing method overloading with overriding in how they’re called: overloaded method calls are decided at compile time based on reference type and parameter types, whereas overridden method calls are decided at runtime based on object type.

  ## **20\. Stacks and Queues (Common Operations)** {#20.-stacks-and-queues-(common-operations)}

**Stacks:**  
 A stack is a LIFO (Last-In, First-Out) data structure. Think of a stack of plates: you add (push) to the top and remove (pop) from the top.

* **Common operations:**

  * push(x): Add an element x to the top of the stack.

  * pop(): Remove and return the top element from the stack. (This operation typically fails or throws exception if the stack is empty.)

  * peek() or top(): Return the top element without removing it.

  * isEmpty(): Check if the stack has no elements.

  * Sometimes size() to get current number of elements.

* Behavior: The last element pushed is the first one popped. If you push A, then B, then C (A at bottom, C at top), a pop() will return C (the last pushed). Another pop returns B, etc.

* Use cases:

  * **Function call stack** (manages method calls and local variables).

  * Undo mechanisms in applications.

  * Depth-first search (algorithm uses stack).

  * Balancing symbols (parentheses matching uses a stack).

* Implementation in Java:

  * Can use java.util.Stack\<E\> class (has push, pop, peek).

  * Or use Deque\<E\> (double-ended queue) as a stack by using only offerLast() (push) and pollLast() (pop).

  * Or implement via an ArrayList or array (push at end, pop from end).

* Example:

   Stack\<Integer\> stack \= new Stack\<\>();  
* stack.push(10);  
* stack.push(20);  
* System.out.println(stack.peek()); // 20  
* int x \= stack.pop();             // x \= 20, stack now has just 10  
* System.out.println(stack.pop()); // 10 (stack empty now)  
* 

**Queues:**  
 A queue is FIFO (First-In, First-Out). Like a line of people: first person in line is first served.

* **Common operations:**

  * enqueue(x) (also offer(x) in Java): Add an element to the back (tail) of the queue.

  * dequeue() (also poll()): Remove and return the element at the front (head) of the queue.

  * peek() or front(): Look at the front element without removing.

  * isEmpty(): check if queue has no elements.

  * size(): number of elements.

* Behavior: The order of removal is the same as insertion order. If you enqueue A, then B, then C (A is front), a dequeue will remove A, then next dequeue removes B, etc.

* Variants: A *Deque* (double-ended queue) allows adding/removing at both ends (so it can function as queue or stack).

* Use cases:

  * **Task scheduling** (print queue, CPU task scheduling).

  * Breadth-first search uses a queue.

  * Order processing, buffering data (like IO buffers).

* Implementation in Java:

  * Use java.util.Queue interface with implementations like LinkedList\<E\> or ArrayDeque\<E\>.

* Example:

   Queue\<String\> queue \= new LinkedList\<\>();  
* queue.offer("Alice");  
* queue.offer("Bob");  
* System.out.println(queue.peek()); // "Alice"  
* System.out.println(queue.poll()); // "Alice" removed  
* System.out.println(queue.poll()); // "Bob" removed (queue empty now)  
  *   
  * Note: offer returns boolean if success, add throws exception on failure; poll returns null if empty, remove throws exception if empty.

* Real-world: Think of queue at a ticket counter – first come first served.

**Common operations summary:**

| Operation | Stack (LIFO) | Queue (FIFO) |
| ----- | ----- | ----- |
| Add | push (top) | enqueue/offer (back) |
| Remove | pop (top) | dequeue/poll (front) |
| Inspect | peek (top) | peek (front) |
| Order | Last in, first out | First in, first out |

**Common Pitfalls:**

* Removing from an empty structure: popping or dequeuing from empty should be handled (Stack/Queue classes in Java will throw EmptyStackException or return null depending on method).

* Assuming random access: Stacks and queues typically don’t allow arbitrary indexing like an array. You work from the ends.

* Confusing the ends: e.g., in a queue, make sure you add at tail and remove at head. If you accidentally remove from tail, that’s not a proper queue operation (unless using deque intentionally).

* Iterating while modifying: If using an iterator on a queue/stack, modifying structure concurrently might cause issues (ConcurrentModificationException). Usually, just use loop with poll for processing all elements in queue.

* For stack, be mindful of growth: if using recursion, you’re implicitly using the call stack; deep recursion can overflow the stack (StackOverflowError). For explicit stacks, if using array implementation, watch for capacity (though Java’s Stack or ArrayDeque dynamically grow).

* Off-by-one in usage: e.g., when checking matching parentheses, ensure to push when seeing opening, and pop when seeing closing, and check stack emptiness appropriately.

* Deque confusion: Java’s Deque can be used as stack or queue. addLast/removeLast emulate stack push/pop. addLast/removeFirst emulate normal queue. Make sure to use consistent ends for a given usage scenario.

* Multi-threaded use: The Stack class is thread-safe (synchronized) but often not used due to legacy. ArrayDeque and LinkedList are not thread-safe for concurrent use without external synchronization.

  ## **21\. Linked Lists and Linked List Operations** {#21.-linked-lists-and-linked-list-operations}

A **linked list** is a linear data structure where each element (node) contains a value and a reference (pointer) to the next node (and possibly to the previous for doubly-linked lists). Unlike arrays, linked lists store elements in nodes scattered in memory, and are connected via pointers.

**Singly Linked List Node structure:**

* class Node {  
*     int data;  
*     Node next;  
*     Node(int d) { data \= d; next \= null; }  
* }


Here next points to the next node or null if it’s the end.

**Common operations:**

* **Traversal:** Start from the head node and follow next pointers to visit each node until null.

   Node curr \= head;  
* while(curr \!= null) {  
*     // process curr.data  
*     curr \= curr.next;  
* }  
*   
* **Insertion:**

  * **At head:** To insert new node at beginning, do newNode.next \= head; head \= newNode;. (Adjust tail if list was empty).

  * **At tail:** If you keep a tail pointer, you can append quickly: tail.next \= newNode; tail \= newNode;. Otherwise, traverse to end then link.

  * **In middle (after a given node):** newNode.next \= prevNode.next; prevNode.next \= newNode;.

  * Careful with inserting at head or tail (update head/tail pointers accordingly).

* **Deletion:**

  * **At head:** head \= head.next; (drop the first node). If list becomes empty, also update tail if you have one.

  * **After a node:** prevNode.next \= prevNode.next.next; effectively removes the node after prevNode. (Ensure prevNode.next isn’t null).

  * **By value:** find the node (and its prev), then relink to skip it.

  * For doubly-linked, also handle prev pointers.

  * Garbage collection: in Java, if no reference points to a removed node, it will be freed. But be mindful if you have a loop in logic, to break links explicitly if needed.

* **Search:** Traverse until you find a node with target value or reach end.

* **Length calculation:** Traverse and count.

* **Reverse a linked list:** Iterate and rearrange pointers:

   Node prev \= null;  
* Node curr \= head;  
* while(curr \!= null) {  
*     Node nextNode \= curr.next;  
*     curr.next \= prev;  
*     prev \= curr;  
*     curr \= nextNode;  
* }  
* head \= prev;  
*   
* **Doubly linked list:** Each node has prev and next. Operations need to update both pointers. Easier to remove a known node because you have backward link too.

* **Dummy head technique:** Sometimes a dummy node at start simplifies edge cases (so that even empty list has a dummy head).

**Benefits of linked lists:**

* Dynamic size (no need to declare upfront size).

* Easy insertion/deletion at head or when node reference is known (O(1) operations) without shifting elements (as in array).

* Good for implementing stacks, queues (where you primarily insert/remove at ends).

**Drawbacks:**

* No constant time random access (to get to index i, you must traverse i steps – O(n)).

* Overhead of pointers (extra memory and potential cache unfriendly).

* More complex operations to handle pointers vs array indexing.

**Common Pitfalls:**

* Losing the head: If you traverse or modify, ensure you maintain a pointer to the head if needed.

* Handling edge cases:

  * Insertion/deletion when list is empty (head is null).

  * Removing the last element (update tail or handle null next).

  * In deletion, forgetting to set prevNode.next properly or update tail if last element removed.

  * For doubly-linked, forgetting to update prev pointers leads to inconsistencies.

* Null pointer exceptions: Always check next for null when traversing. E.g., when deleting node after prev, ensure prev.next isn’t null.

* Infinite loop possibility: If you accidentally create a cycle (like linking last node to some earlier node), traversal without checks can loop forever. After modifications, ensure the last node’s next is null (for a proper list end).

* Misusing head vs current:

  * If inserting at head, make sure new node’s next is old head *before* reassigning head.

  * If removing head, move head pointer.

* Off-by-one in finding positions: When inserting at a specific index, you often stop one node before the desired index to insert. Getting that logic right is important.

* Not updating tail pointer when necessary:

  * If you have a tail pointer for efficiency, update it on insertion at end, and update it if the tail is removed.

* Using recursion for operations (like reversing or printing) can be elegant but might hit recursion depth issues if list is very long.

**Example operations:**

* Creating a simple list manually:

   Node head \= new Node(10);  
* head.next \= new Node(20);  
* head.next.next \= new Node(30);  
* // List: 10 \-\> 20 \-\> 30 \-\> null  
*   
* Inserting 5 at head:

   Node newHead \= new Node(5);  
* newHead.next \= head;  
* head \= newHead;  
*  Now list: 5 \-\> 10 \-\> 20 \-\> 30\.

* Deleting 20:

  * Find node with 20 (say target), keep track of previous (prev). Prev would be node with 10\.

  * Do prev.next \= target.next; (link 10 to 30, dropping 20).

  * target.next \= null (optional clear).

* Searching for 30:

  * Traverse: 5? no; 10? no; 20? no; 30? yes, return that node or true.

* Check empty: if(head \== null) ...

**Complexities:**

* Insert at head/tail (with tail pointer) – O(1).

* Remove at head – O(1).

* Search or access by value/index – O(n) in worst case.

* Insert at arbitrary position – O(n) because you must find that position.

* Removing specific element by value – O(n) to find it.

* Memory overhead per element for pointer(s).

  ## **22\. Identify Equivalent Iterative and Recursive Algorithms** {#22.-identify-equivalent-iterative-and-recursive-algorithms}

Many problems can be solved with either an iterative approach (using loops) or a recursive approach (a function calling itself). An **equivalent iterative and recursive algorithm** means they produce the same result or effect, even if the process differs.

**Recognizing equivalence:**

* Both approaches should have the same input-output behavior.

* The recursive solution typically breaks the problem into smaller subproblem(s) and calls itself, while the iterative uses loops to achieve the same repeated breakdown.

**Examples:**

* **Factorial** n\! \= n \* (n-1) \* ... \* 1  
   Recursive:

   int factorialRec(int n) {  
*     if (n \<= 1\) return 1;  
*     else return n \* factorialRec(n-1);  
* }  
*  Iterative:

   int factorialItr(int n) {  
*     int result \= 1;  
*     for(int i=1; i\<=n; i++) {  
*         result \*= i;  
*     }  
*     return result;  
* }  
*  Both compute factorial. The recursive version calls itself with n-1 until base case, the iterative accumulates in a loop.

* **Fibonacci**: fib(n) \= fib(n-1) \+ fib(n-2), with fib(0)=0, fib(1)=1.  
   Recursive (naive):

   int fibRec(int n) {  
*     if(n \<= 1\) return n;  
*     return fibRec(n-1) \+ fibRec(n-2);  
* }  
*  Iterative:

   int fibItr(int n) {  
*     if(n \<= 1\) return n;  
*     int a \= 0, b \= 1;  
*     for(int i \= 2; i \<= n; i++) {  
*         int next \= a \+ b;  
*         a \= b;  
*         b \= next;  
*     }  
*     return b;  
* }  
*  Both yield the n-th Fibonacci number. (The recursive has exponential time without memoization, the iterative is linear.)

* **Sum of array elements**:  
   Recursive:

   int sumRec(int\[\] arr, int n) {  
*     if(n \== 0\) return 0;  
*     return arr\[n-1\] \+ sumRec(arr, n-1);  
* }  
* // call with sumRec(arr, arr.length);  
*  Iterative:

   int sumItr(int\[\] arr) {  
*     int sum \= 0;  
*     for(int val : arr) sum \+= val;  
*     return sum;  
* }  
*  Both add up all elements.

* **Reverse a string**:  
   Recursive:

   String reverseRec(String s) {  
*     if(s.isEmpty()) return "";  
*     return reverseRec(s.substring(1)) \+ s.charAt(0);  
* }  
*  Iterative:

   String reverseItr(String s) {  
*     StringBuilder sb \= new StringBuilder();  
*     for(int i \= s.length()-1; i \>= 0; i--) {  
*         sb.append(s.charAt(i));  
*     }  
*     return sb.toString();  
* }  
* 

When identifying equivalents:

* Map the recursive structure to a loop. Recursion usually involves a base case (stop condition) and a recursive step reducing the problem size. The iterative version will use a loop that runs until the same condition is met.

* E.g., recursion counting down f(n) calls f(n-1) ... until n==0, corresponds to a for/while loop counting down from n to 0\.

**Pros and Cons:**

* Recursive solutions can be more elegant or closer to mathematical definitions (like Fibonacci, tree traversals).

* Iterative solutions often use less memory (no call stack buildup) and may be more efficient for large inputs (no risk of stack overflow if recursion is too deep).

* Some problems (like traversing complex structures: tree, graph) are naturally recursive, but can still be done iteratively usually by using an explicit stack or queue.

* Tail recursion can sometimes be optimized by compilers to avoid deep call stacks (Java doesn’t guarantee tail-call optimization, so large recursion can overflow).

**Common Pitfalls:**

* When writing recursive solutions, ensure a correct base case to avoid infinite recursion.

* Ensure the recursive step progresses towards base case (for example, always call with a smaller n, or a reduced data structure).

* For iteration, ensure loop will terminate (update loop variables correctly).

* Off-by-one issues: often recursion is easier to reason about correctness for some, but either approach can have off-by-one if not careful (like including/excluding endpoints).

* Converting one to the other:

  * A recursive function that calls itself multiple times (like Fibonacci or tree traversal) may need a stack or queue to mimic that in iteration.

  * A tail-recursive function (where the last operation is the recursive call) converts to a simple loop more directly.

* Memory: recursion uses call stack. If each recursive call uses small stack and depth is moderate, fine; but if depth is large (like computing factorial(10000) recursively) it will crash due to stack overflow. Iteration handles that easily with a simple loop.

* Understanding that both approaches achieve same result helps verify correctness (you might cross-check small cases output of one vs the other).

**Another example: Binary Search:**

* Recursive binary search:

   int binarySearchRec(int\[\] arr, int low, int high, int key) {  
*     if(low \> high) return \-1;  
*     int mid \= (low+high)/2;  
*     if(arr\[mid\] \== key) return mid;  
*     else if(arr\[mid\] \> key)  
*         return binarySearchRec(arr, low, mid-1, key);  
*     else  
*         return binarySearchRec(arr, mid+1, high, key);  
* }  
*   
* Iterative binary search:

   int binarySearchItr(int\[\] arr, int key) {  
*     int low \= 0, high \= arr.length-1;  
*     while(low \<= high) {  
*         int mid \= (low+high)/2;  
*         if(arr\[mid\] \== key) return mid;  
*         else if(arr\[mid\] \> key) high \= mid-1;  
*         else low \= mid+1;  
*     }  
*     return \-1;  
* }  
*  Same logic, one uses recursion, one loop.

  ## **23\. Functional Understanding of Quicksort and Merge Sort** {#23.-functional-understanding-of-quicksort-and-merge-sort}

**Quicksort** and **Merge Sort** are efficient sorting algorithms with average-case complexity O(n log n).

**Quicksort:**

* **Idea:** Pick a "pivot" element from the array. Partition the array into two halves: elements less than pivot, and elements greater than pivot (with pivot ideally in correct sorted position after partition). Then recursively sort the two halves.

* **Steps:**

  * If the array (or sub-array) has 0 or 1 elements, it’s already sorted (base case).

  * Choose a pivot. (Commonly last element, first element, or median-of-three to optimize).

  * Partition step: rearrange elements so that all elements \< pivot are on the left side, all \> pivot are on the right side. The pivot is placed in its final sorted position (index p).

  * Recursively apply quicksort to left sub-array (before index p) and right sub-array (after index p).

* **Partition algorithm:** (Lomuto partition, for example)

  * Keep an index i for place to put next smaller element.

  * Iterate j through array (except pivot index if pivot chosen as end).

  * If arr\[j\] \<= pivot, swap arr\[i\] and arr\[j\], increment i.

  * At end, swap pivot into position i.

  * Return index i as pivot’s final position.

* **In-place:** Quicksort sorts the array in place (no need for additional large storage, just call stack for recursion).

* **Average case:** O(n log n). **Worst case:** O(n^2) (if pivot choices are poor, e.g. always picking smallest or largest element in a sorted array scenario, each partition is unbalanced).

* **Typically quick in practice** due to good cache performance and low constant factors, especially if pivot selection is good (median-of-three or random pivot to avoid worst-case).

* **Not stable:** Quicksort doesn’t guarantee to preserve the order of equal elements (unless partition is done carefully).

* **Example:** Sorting \[3, 7, 2, 5, 1\]:

  * Pick pivot 1 (last). Partition: \[1 | 7,2,5,3\] \-\> after partition \[1, 7,2,5,3\] pivot index 0\.

  * Left side empty, right side \[7,2,5,3\] pivot might be 3 \-\> partition to \[2,1,5,7\]? Actually details: pivot 3 \-\> \[2,1\] \[3\] \[5,7\] after that step etc. Ultimately it sorts to \[1,2,3,5,7\].  
     (Detailed steps omitted for brevity, but that’s the process.)

**Merge Sort:**

* **Idea:** Divide the array into two roughly equal halves, sort each half recursively, then **merge** the sorted halves into one sorted array.

* **Steps:**

  * If array size is 0 or 1, it’s sorted (base case).

  * Split the array into two halves (middle index).

  * Recursively sort the left half and the right half.

  * Merge the two sorted halves into a single sorted list.

* **Merge step:** (key part)

  * Take two sorted subarrays (left and right).

  * Use two indices (i for left, j for right). Compare left\[i\] and right\[j\]. Whichever is smaller goes next in the merged output array, and increment that index.

  * Continue until one subarray is exhausted, then copy the remainder of the other subarray.

  * This merging is O(n) for two subarrays of total length n.

* **Not in-place (in typical implementation):** Requires auxiliary array for merging step to hold the merged result (or allocate new arrays in recursion). So space complexity O(n) additional.

* **Time complexity:** O(n log n) always (because it always divides in half and merges).

* **Stable:** Merge sort is stable if the merging is done carefully (when equal elements, take from left subarray first, for example).

* **Worst-case and best-case are both O(n log n)** (no particular bad case input).

* **Cons:** Uses extra memory, and if implemented recursively, uses stack space too. But guaranteed performance.

* **Example:**

  * Sort \[3, 7, 2, 5, 1, 4\]:

    * Split into \[3,7,2\] and \[5,1,4\].

    * Sort \[3,7,2\] \-\> split \[3\] and \[7,2\] \-\> \[3\] sorted, \[7,2\] \-\> split \[7\] \[2\] \-\> merge to \[2,7\] \-\> merge with \[3\] \-\> \[2,3,7\].

    * Sort \[5,1,4\] similar \-\> \[1,4,5\].

    * Merge \[2,3,7\] and \[1,4,5\]:

      * Compare 2 vs 1 \-\> take 1

      * then 2 vs 4 \-\> take 2

      * 3 vs 4 \-\> take 3

      * 7 vs 4 \-\> take 4

      * 7 vs 5 \-\> take 5

      * left with 7 \-\> take 7

      * Result \[1,2,3,4,5,7\].

* There is an in-place merge sort variant (harder), but typical merge sort uses extra space.

**Summary:**

* Both are divide-and-conquer sorts with average O(n log n).

* Quicksort: divide by partitioning (no merge needed), but uneven partitions possible, in-place, not stable, usually faster in practice on average.

* Merge sort: divide evenly, always O(n log n) steps, needs merging with extra space, stable, good for linked lists or extremely large data on disk (where sequential access is beneficial).

* Java’s Arrays.sort for primitives uses a tuned quicksort variant (dual-pivot quicksort), and for objects uses TimSort (which is like merge sort \+ insertion sort hybrid and stable).

* For interview or exam, know the mechanism: Quicksort picks pivot and partitions; Merge sort splits and merges.

**Common Pitfalls:**

* Quicksort:

  * Implementing partition incorrectly (fencepost errors leading to infinite recursion or not fully partitioned lists).

  * Not choosing a good pivot in practice can degrade performance.

  * Forgetting to actually place pivot in correct spot (some partition schemes do it at end).

  * Stack overflow if recursion depth is large (for pathological cases).

  * Not handling equal elements well can cause unnecessary swaps or worst-case behavior if all elements equal.

* Merge sort:

  * Using too much extra space or copying arrays too often (each merge needs some copying).

  * Merging incorrectly (e.g., losing elements, or not correctly handling one array finishing first).

  * In recursion, forgetting to copy back merged array to original if sorting in place.

  * Recursion overhead for large n (can be mitigated by switching to insertion sort for small subarrays to reduce overhead).

* Both:

  * Base case conditions must be correct to stop recursion.

  * Combining results correctly.

  * In analysis, mixing up their complexities with less efficient sorts (like thinking quicksort worst-case is always n log n – it’s not, worst is n^2).

  * Stability: If stable sort needed, quicksort is out (unless using some trick).

  * Note on linked lists: Quicksort on linked list is not ideal (hard to jump around), merge sort is preferred because splitting and merging is easier with links.

  ## **24\. Functional Understanding of Binary Search Algorithm** {#24.-functional-understanding-of-binary-search-algorithm}

**Binary Search** is an efficient algorithm to find an element in a sorted array (or determine it’s not present). It operates by repeatedly dividing the search interval in half.

**Precondition:** The array (or list) must be sorted (e.g., ascending order).

**How it works:**

* Keep track of a search range within the array via two indices: low (start of range) and high (end of range).

* Initially, low \= 0 and high \= n-1 (for array of length n).

* Compute mid \= (low \+ high) / 2 (integer division).

* Compare the target value X with arr\[mid\]:

  * If arr\[mid\] \== X, you found the element (return mid index, or true).

  * If arr\[mid\] \< X, then target X must be in the right half (if present) because array is sorted and X is larger than mid element. So set low \= mid \+ 1 to search right half.

  * If arr\[mid\] \> X, then target X must be in the left half. So set high \= mid \- 1.

* Repeat: recalc mid, compare, narrow range.

* Loop ends when low \> high, meaning the range is empty – target not found (return \-1 or false).

**Complexity:** O(log n) comparisons in worst-case (the search range halves each time). For example, in 128 elements, at most 7 comparisons (since 2^7 \= 128).

**Behavior:**

* It eliminates half of the elements from consideration at each step, which is much faster than linear search O(n).

* It requires random access (so it's straightforward in arrays; in linked lists, binary search is not efficient because random access is not constant time).

* If multiple occurrences of X exist, standard binary search typically finds one occurrence (not guaranteed which one if duplicates present). Variants exist to find first or last occurrence.

**Edge cases:**

* If array is empty (low \> high initially), you conclude not found immediately.

* If the target is smaller than the first element or larger than the last, it will conclude not found after a few checks.

* Need to ensure mid calculation avoids overflow: in some languages, (low+high)/2 could overflow if low and high are large. Safer formula: mid \= low \+ (high \- low)/2. In Java, int overflow on sum is possible if dealing with extremely large indices (rare for typical scenarios, but good practice).

* If using recursion: base case when low \> high (not found), or found at mid.

**Example trace:**  
 Array \[2, 5, 8, 12, 16, 23, 38, 56\], find 23\.

* low=0, high=7, mid=3 \-\> arr\[3\]=12, 12 \< 23, so low \= 4\.

* low=4, high=7, mid=5 \-\> arr\[5\]=23, match found at index 5\. Done.  
   To find something not present, say 10:

* low=0, high=7, mid=3 (12), 12 \> 10, high=2.

* low=0, high=2, mid=1 (5), 5 \< 10, low=2.

* low=2, high=2, mid=2 (8), 8 \< 10, low=3.

* now low=3, high=2, low \> high \-\> not found.

**Binary search can also be used to find insertion point** (if not found, where should it be inserted to keep array sorted, e.g., many library functions like Arrays.binarySearch in Java return negative insertion point \- 1).

**Recursive version:**

* int binarySearchRec(int\[\] arr, int low, int high, int X) {  
*     if(low \> high) return \-1;  
*     int mid \= low \+ (high \- low)/2;  
*     if(arr\[mid\] \== X) return mid;  
*     else if(arr\[mid\] \< X)  
*         return binarySearchRec(arr, mid+1, high, X);  
*     else  
*         return binarySearchRec(arr, low, mid-1, X);  
* }


**Iterative version:**

* int binarySearch(int\[\] arr, int X) {  
*     int low \= 0, high \= arr.length-1;  
*     while(low \<= high) {  
*         int mid \= low \+ (high \- low)/2;  
*         if(arr\[mid\] \== X)   
*             return mid;  
*         else if(arr\[mid\] \< X)  
*             low \= mid \+ 1;  
*         else  
*             high \= mid \- 1;  
*     }  
*     return \-1;  
* }


**Common Pitfalls:**

* Forgetting to update low or high properly, causing infinite loop. Make sure one of them moves each iteration.

* Using low \< high as loop condition instead of \<= might fail to check the last possible element.

* Off-by-one: e.g., mid calculation or updating bounds incorrectly (some use high \= mid or low \= mid which can lead to stuck loop if mid doesn't change).

* Handling duplicates: basic binary search finds one occurrence; if needing first/last, you have to adjust after find or modify condition.

* Not confirming array is sorted: if array isn’t sorted, binary search will give wrong results.

* Overflow in low \+ high (in Java, if indices are up to near Integer.MAX\_VALUE, though scenario is rare).

* Recursion depth: a sorted array of 1 billion elements would require \~30 recursive calls, which is fine; recursion not a big problem here typically.

* For extremely small arrays or trivial cases, the loop handles gracefully but ensure base case covers properly.

* Indices types: if using languages like C, careful with integer type if array length can exceed max int (in Java, array length is int, so no bigger than \~2 billion).

* Understanding that log2(n) grows slowly: doubling array size adds one more step. So binary search is very scalable.

  ## **25\. Binary Trees vs Binary Search Trees (BST) and Tracing Code with Trees** {#25.-binary-trees-vs-binary-search-trees-(bst)-and-tracing-code-with-trees}

A **binary tree** is a tree data structure where each node has at most two children (typically referred to as left and right child). A **binary search tree (BST)** is a special kind of binary tree that is ordered: for any node, all values in its left subtree are less than the node’s value, and all values in its right subtree are greater than the node’s value (assuming no duplicates for simplicity).

**Binary Tree (BT):**

* No specific ordering of nodes is required. It could be just any structure of nodes with up to 2 children.

* Could be used to represent hierarchical data, parse trees, etc.

* Traversals:

  * **Inorder** (Left, Node, Right): visits nodes in sorted order **if** it's a BST; for a generic BT, it's just a systematic way.

  * **Preorder** (Node, Left, Right): useful for copying tree, prefix expression.

  * **Postorder** (Left, Right, Node): useful for deleting tree, postfix expression.

  * **Level-order** (Breadth-first): uses a queue to go level by level.

* Height of tree \= longest root-to-leaf path (depth).

* Full/complete/perfect are categories of BT shape (not directly relevant to BST property but structural).

* No guarantee that inorder traversal yields sorted sequence unless it's a BST.

**Binary Search Tree (BST):**

* Satisfies BST property: left \< node \< right (for every node).

* This allows efficient searching: you can at each node compare target with node’s value and go left or right accordingly (like binary search in array, but on a tree).

  * Search: Start at root. If target \== node’s value, found; if less, go left; if greater, go right; repeat until found or reach null. O(h) time, where h is tree height. Balanced BST \=\> h \~ log n.

* Inorder traversal of a BST gives sorted order of elements.

* Insert: Similar to search, find where the null spot where the new value should go (going left or right based on comparisons) and insert a new node there.

* Delete: More complex:

  * If node is leaf, just remove it.

  * If node has one child, replace node with that child.

  * If node has two children, find inorder successor (smallest in right subtree) or predecessor (largest in left subtree) to replace node’s value, then remove that successor node (which will have at most one child).

* BST typically defined for unique keys; duplicates can be handled by varying conventions (e.g., allow equal either always go left or right, or store count).

* Balance: A BST can become skewed (like a linked list) if insert in sorted order. Balanced BST (AVL, Red-Black, etc) maintain height \~ log n.

* Searching in a skewed BST is O(n) worst-case, in a balanced BST O(log n).

* Examples:

* Balanced BST example: insert 8,3,10,1,6,14,4,7,13 will form a BST:

         8  
*      /   \\  
*     3    10  
*    / \\     \\  
*   1   6     14  
*      / \\    /  
*     4   7  13  
  *  Inorder: 1,3,4,6,7,8,10,13,14 (sorted).

* Non-BST binary tree example:

       5  
*     / \\  
*    2   9  
*       / \\  
*      1   10  
  *  This is a binary tree but not a BST (because the node with value 1 is in the right subtree of 5, which violates BST rule since 1 \< 5 but is in right subtree).

**Tracing code with binary trees:**

* Represent a node as something like:

   class Node {  
*     int value;  
*     Node left, right;  
*     Node(int v) { value \= v; }  
* }  
*   
* Traversal code example (inorder):

   void inorder(Node root) {  
*     if(root \== null) return;  
*     inorder(root.left);  
*     System.out.print(root.value \+ " ");  
*     inorder(root.right);  
* }  
*  If called on root of BST, will print values sorted. On any BT, it prints left-subtree, node, right-subtree sequence.

* If given a code for insert in BST:

   Node insert(Node root, int val) {  
*     if(root \== null) return new Node(val);  
*     if(val \< root.value) root.left \= insert(root.left, val);  
*     else if(val \> root.value) root.right \= insert(root.right, val);  
*     // if equal, maybe insert to one side or handle duplicates  
*     return root;  
* }  
*  Tracing an insert, you'd follow the comparisons:

  * e.g., insert 7 into example BST above: compare 7 with 8 (less, go left to node 3), compare 7 with 3 (greater, go right to node 6), compare 7 with 6 (greater, go right, which is node 7? Actually in that tree example, 7 is right child of 6, so it's already there in that tree. If it weren't, it would attach as 6.right).

* Search code:

   boolean search(Node root, int key) {  
*     if(root \== null) return false;  
*     if(root.value \== key) return true;  
*     else if(key \< root.value) return search(root.left, key);  
*     else return search(root.right, key);  
* }  
*  Tracing: just compare and branch accordingly down the tree.

* Trace tree algorithms with state: e.g., summing values:

   int sumTree(Node root) {  
*     if(root \== null) return 0;  
*     return root.value \+ sumTree(root.left) \+ sumTree(root.right);  
* }  
*  That simply adds up all nodes.

**Key differences BT vs BST:**

* BST has ordering constraint, BT doesn’t.

* BST enables binary-search-like operations (fast search, insert, delete on average), BT is just a structure (like a generic tree, could even represent something like a heap which has different constraints).

* Not every binary tree is a BST. If a question gives a tree and asks if it’s a BST, check the ordering property.

* Operations like search/insert assume BST property to go left/right. If you tried those on a non-BST, you’d miss the target potentially because the value might be in a place that the algorithm prunes away.

**When tracing code involving BST specifically:**

* Always check if code relies on sorted property (like how it chooses left/right).

* If they provide a BST and do an inorder traversal, expect sorted output.

* If they perform a sequence of inserts and then ask for tree shape or traversal output, you must simulate insert preserving BST property at each step.

* If they remove a node, track how the tree re-arranges (especially if node has two children).

* If code checks if(node.left \!= null && node.left.value \> node.value) ... it's validating BST property or something.

**Common Pitfalls:**

* Confusing the two: thinking a binary tree automatically means BST – it doesn’t unless explicitly stated.

* Misapplying BST algorithms on a non-BST: e.g., doing binary search on a general binary tree will not work (you’d have to traverse whole tree).

* During insert or search, forgetting to return the node or update links, resulting in lost subtrees.

* Off-by-one or wrong comparisons in BST insert/search (like using \<= one way or another if duplicates should consistently go one side).

* Forgetting null checks when traversing.

* For delete in BST, forgetting to handle all cases (especially the two-child case).

* Assuming a balanced shape; BST can be skewed. If code provided builds a BST by inserting sorted data without self-balancing, the tree becomes like a linked list (height n). But complexity remains O(n) in worst-case. Balanced BST (like AVL) would rotate to keep shape, but that’s beyond basic BST.

If tracing recursion on a tree, use a mental or drawn tree:

* Mark current node, and follow the code logic down left or right as needed.

* Possibly draw the call stack if needed: each recursive call on a subtree.

* For traversal, note the order nodes are visited (e.g., for inorder, left-most node gets visited first, etc.).

  


