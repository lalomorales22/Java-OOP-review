import java.util.ArrayList; // Needed for ArrayList examples
import java.util.Arrays; // Needed for array utilities like toString, copyOf, binarySearch, sort
import java.util.LinkedList; // Needed for Queue and LinkedList implementations
import java.util.Queue; // Needed for Queue interface
import java.util.Stack; // Needed for Stack class
import java.util.Deque; // Needed for Deque interface (alternative for Stack/Queue)
import java.util.ArrayDeque; // ArrayDeque implementation for Deque
import java.util.Random; // Needed for object instantiation example
import java.util.Scanner; // Needed for object instantiation example
import java.math.BigDecimal; // Needed for precise decimal calculations (Topic 5)
import java.math.BigInteger; // Needed for arbitrarily large integers (Topic 5)


/**
 * Main class designed to demonstrate various Java concepts relevant to an OOP final exam.
 * Each topic from the provided list is covered in a dedicated section or method,
 * with extensive comments explaining the concepts, technical terms, and rationale.
 */
public class Main {

    // --- Helper Classes for Demonstrations ---

    // Helper class for Topic 8 (Multiple Methods with Objects) and Topic 18 (Reference Types)
    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            // Provides a readable string representation of the Point object.
            return "(" + x + ", " + y + ")";
        }
    }

    // Helper class for Topic 13 (Objects), 18 (Reference Types), 19 (OOP Principles)
    static class Counter {
        // Instance variable (field) to hold the counter's state.
        // Made public for direct access in tracing examples, but typically would be private (Encapsulation).
        public int value;

        // Constructor: Initializes the object's state when created with 'new'.
        public Counter(int start) {
            // 'this.value' refers to the instance variable, 'start' is the parameter.
            this.value = start;
        }

        // Instance method: Operates on the object's state.
        public void increment() {
            // Increments the instance variable 'value'.
            this.value++;
        }

        @Override
        public String toString() {
            return "Counter[value=" + value + "]";
        }
    }

    // Helper classes for Topic 19 (Inheritance, Polymorphism)
    static class Animal {
        // Superclass method.
        public void speak() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal { // Dog 'is-a' Animal (Inheritance)
        // Method Overriding: Provides a specific implementation for the speak method.
        @Override // Annotation indicates intent to override, compiler checks signature.
        public void speak() {
            System.out.println("Woof!");
        }

        // Dog-specific method.
        public void fetch() {
            System.out.println("Dog fetches ball");
        }
    }

    static class Cat extends Animal { // Cat 'is-a' Animal
        @Override
        public void speak() {
            System.out.println("Meow!");
        }
    }

    // Helper class for Topic 21 (Linked Lists)
    static class Node {
        int data; // The value stored in the node
        Node next; // Reference (pointer) to the next node in the list

        // Constructor for creating a new node
        Node(int d) {
            data = d;
            next = null; // Initially, the next node is null
        }
    }
    // Static head reference for demonstrating list operations within Main
    static Node linkedListHead = null;
    static Node linkedListTail = null; // Optional tail pointer for efficient append


    // Helper class for Topic 25 (Trees)
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int v) {
            value = v;
            left = null;
            right = null;
        }
    }
    // Static root reference for demonstrating tree operations
    static TreeNode treeRoot = null;


    /**
     * The main entry point of the application. Executes demonstrations for each topic.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        System.out.println("Java OOP Final Exam Concepts Demonstration\n");

        // Execute demonstrations for each topic
        demonstrateTopic1();
        demonstrateTopic2();
        demonstrateTopic3();
        demonstrateTopic4();
        demonstrateTopic5();
        demonstrateTopic6();
        demonstrateTopic7();
        demonstrateTopic8();
        demonstrateTopic9();
        demonstrateTopic10();
        demonstrateTopic11();
        demonstrateTopic12();
        demonstrateTopic13();
        demonstrateTopic14();
        demonstrateTopic15();
        demonstrateTopic16();
        demonstrateTopic17();
        demonstrateTopic18();
        demonstrateTopic19();
        demonstrateTopic20();
        demonstrateTopic21();
        demonstrateTopic22();
        demonstrateTopic23();
        demonstrateTopic24();
        demonstrateTopic25();

        System.out.println("\nDemonstration Complete.");
    }

    // --- Topic 1: Trace and Evaluate Assignment Sequences ---
    public static void demonstrateTopic1() {
        System.out.println("--- Topic 1: Trace and Evaluate Assignment Sequences ---");

        // The '=' operator is the assignment operator. It assigns the value of the
        // right-hand side expression to the variable on the left-hand side.
        // Assignment is an imperative operation: it changes the state (value) of the variable.
        int x = 17; // x memory location now holds the integer value 17
        int y = 5;  // y memory location now holds 5
        int a;      // a is declared but not initialized (local variables must be initialized before use)

        System.out.println("Initial values: x=" + x + ", y=" + y); // Output: 17, 5

        // Trace the swap sequence:
        a = y;      // Step 1: Copy the current value of y (5) into a. State: x=17, y=5, a=5
        System.out.println("After a = y;    a=" + a + ", x=" + x + ", y=" + y); // Output: a=5, x=17, y=5

        y = x;      // Step 2: Copy the current value of x (17) into y. State: x=17, y=17, a=5
        System.out.println("After y = x;    a=" + a + ", x=" + x + ", y=" + y); // Output: a=5, x=17, y=17

        x = a;      // Step 3: Copy the current value of a (5) into x. State: x=5, y=17, a=5
        System.out.println("After x = a;    a=" + a + ", x=" + x + ", y=" + y); // Output: a=5, x=5, y=17

        // Final result: x and y values have been swapped using 'a' as a temporary variable.
        System.out.println("Final values: x=" + x + ", y=" + y); // Output: 5, 17

        // Chained assignment: Evaluated right-to-left.
        int i, j, k;
        i = j = k = 0; // 0 is assigned to k, the result of (k=0) which is 0 is assigned to j, etc.
        System.out.println("Chained assignment: i=" + i + ", j=" + j + ", k=" + k); // Output: 0, 0, 0

        // Pitfall: Using uninitialized local variable
        int uninitializedVar;
        // System.out.println(uninitializedVar); // Compile Error: variable uninitializedVar might not have been initialized
        // int anotherVar = uninitializedVar;    // Compile Error for the same reason.

        // Pitfall: Confusing assignment (=) with equality (==)
        boolean isEqual = (x == y); // Checks if x equals y (false here: 5 == 17)
        System.out.println("Is x == y? " + isEqual); // Output: false
        // if (x = y) { ... } // Compile Error: Type mismatch: cannot convert from int to boolean.
                           // (Assignment `x=y` evaluates to the assigned value (an int), not a boolean).
        System.out.println();
    }

    // --- Topic 2: Identify Valid Java Identifiers ---
    public static void demonstrateTopic2() {
        System.out.println("--- Topic 2: Identify Valid Java Identifiers ---");

        // Identifiers name variables, methods, classes, etc.
        // Rules:
        // 1. Must start with a letter (Unicode), underscore (_), or dollar sign ($).
        // 2. Subsequent characters can be letters, digits, _, or $.
        // 3. Cannot be a Java reserved keyword (like 'int', 'class', 'if').
        // 4. Case-sensitive ('myVar' is different from 'MyVar').
        // 5. No spaces or other special symbols (!, #, -, etc.).

        // Valid examples:
        int myVariable = 10;          // Starts with letter, camelCase convention
        int _count = 20;              // Starts with underscore (legal, but often used for special cases/generated code)
        int $value = 30;              // Starts with dollar sign (legal, but often used for special cases/generated code)
        int MAX_USERS = 100;        // All caps with underscore (convention for constants)
        int счётчик = 5;             // Unicode letters allowed (Cyrillic 'schyotchik' meaning counter)

        System.out.println("Valid identifiers demo: myVariable=" + myVariable + ", _count=" + _count + ", $value=" + $value + ", MAX_USERS=" + MAX_USERS + ", счётчик=" + счётчик);

        // Invalid examples (will cause compile errors if uncommented):
        // int 3rdPlace;        // Error: starts with a digit
        // int user-name;       // Error: contains hyphen '-' (not allowed)
        // int class;           // Error: 'class' is a reserved keyword
        // int my variable;     // Error: contains a space

        // Case sensitivity:
        int totalScore = 95;
        int TotalScore = 100; // Different variable from totalScore
        System.out.println("Case sensitivity: totalScore=" + totalScore + ", TotalScore=" + TotalScore);

        // Conventions (not rules, but good practice):
        // - Class names: Start with uppercase (PascalCase), e.g., `MyClass`.
        // - Variable/Method names: Start with lowercase (camelCase), e.g., `myVariable`, `calculateTotal()`.
        // - Constants (final static): All uppercase with underscores, e.g., `MAX_SPEED`.

        System.out.println();
    }

    // --- Topic 3: Evaluate Java Expressions ---
    public static void demonstrateTopic3() {
        System.out.println("--- Topic 3: Evaluate Java Expressions ---");

        // Expressions combine values, variables, operators, and method calls to produce a result.
        // Operator Precedence: Determines the order of operations.
        // *, /, % have higher precedence than + , -.
        int result1 = 5 + 2 * 3; // Multiplication first: 5 + (2 * 3) = 5 + 6 = 11
        System.out.println("5 + 2 * 3 = " + result1); // Output: 11
        int result2 = (5 + 2) * 3; // Parentheses override precedence: (5 + 2) * 3 = 7 * 3 = 21
        System.out.println("(5 + 2) * 3 = " + result2);

        // Type Promotion: Mixing types promotes smaller types to larger ones.
        // Order: byte/short/char -> int -> long -> float -> double
        double result3 = 5 + 2.5; // int 5 is promoted to double 5.0. Result is double 7.5
        System.out.println("5 + 2.5 = " + result3); // Output: 7.5

        byte b1 = 10, b2 = 20;
        // byte byteSum = b1 + b2; // Compile Error: Result of b1+b2 is 'int' because byte operands are promoted to int for arithmetic.
        int intSum = b1 + b2;     // Correct: Store the resulting int (30).
        byte byteSumCasted = (byte)(b1 + b2); // Correct with explicit cast if result fits in byte.
        System.out.println("byte arithmetic (promoted to int): intSum=" + intSum + ", byteSumCasted=" + byteSumCasted); // Output: 30, 30

        // Integer Division: Discards the fractional part when both operands are integers.
        int intDiv = 7 / 2; // Result is 3 (fractional part .5 is discarded)
        System.out.println("Integer division 7 / 2 = " + intDiv); // Output: 3
        double doubleDiv1 = 7 / 2.0; // One operand is double, result is double 3.5
        double doubleDiv2 = (double) 7 / 2; // Cast int 7 to double, result is double 3.5
        System.out.println("Floating-point division 7 / 2.0 = " + doubleDiv1); // Output: 3.5
        System.out.println("Floating-point division (double)7 / 2 = " + doubleDiv2); // Output: 3.5

        // Modulo Operator (%): Gives the remainder of integer division.
        int remainder = 10 % 3; // 10 = 3 * 3 + 1. Remainder is 1.
        System.out.println("Modulo 10 % 3 = " + remainder); // Output: 1

        // Boolean Expressions and Short-Circuiting:
        // && (AND), || (OR). Lower precedence than comparison ops (==, !=, <, >).
        // Short-circuiting: evaluation stops once the result is certain.
        // true || (expression): second part is not evaluated because result is already true.
        // false && (expression): second part is not evaluated because result is already false.
        boolean boolResult1 = true || (5 / 0 == 1); // Short-circuits, 5/0 is NOT evaluated. Result is true.
        System.out.println("Boolean short-circuit (true || ...): " + boolResult1); // Output: true
        boolean boolResult2 = false && (5 / 0 == 1); // Short-circuits, 5/0 is NOT evaluated. Result is false.
        System.out.println("Boolean short-circuit (false && ...): " + boolResult2); // Output: false

        boolean precedenceExample = true || false && false; // && has higher precedence than ||
        // Evaluates as: true || (false && false) -> true || false -> true
        System.out.println("Boolean precedence (true || false && false): " + precedenceExample); // Output: true

        // Increment/Decrement Operators (++ / --):
        // Prefix (++x): Increments/decrements first, then returns the *new* value.
        // Postfix (x++): Returns the *old* value first, then increments/decrements.
        int a = 5;
        int b = a++ + 2; // Postfix: Use a's old value (5) for calculation. b = 5 + 2 = 7. Then a becomes 6.
        System.out.println("Postfix: a=" + a + ", b=" + b); // Output: a=6, b=7
        int c = ++a + 2; // Prefix: Increment a first (a becomes 7). Use new value for calculation. c = 7 + 2 = 9.
        System.out.println("Prefix: a=" + a + ", c=" + c); // Output: a=7, c=9

        // Pitfall: Using == with Objects (especially Strings)
        String s1 = "hello"; // String literal (often pooled)
        String s2 = "hello";
        String s3 = new String("hello"); // Explicitly create a new String object

        System.out.println("String comparison pitfall:");
        System.out.println("s1 == s2: " + (s1 == s2)); // Often true due to string pooling (but don't rely on it!)
        System.out.println("s1 == s3: " + (s1 == s3)); // False: s1 and s3 refer to different objects in memory.
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // True: .equals() compares content, which is the same. Use .equals() for content comparison.

        System.out.println();
    }

    // --- Topic 4: Identify Java Primitive Types by Name, Literal, and Expression ---
    public static void demonstrateTopic4() {
        System.out.println("--- Topic 4: Java Primitive Types ---");

        // Java has 8 primitive types. They hold values directly.

        // 1. int: 32-bit signed integer. Default for integer literals.
        int myInt = 42;           // Literal 42 is type int
        int negativeInt = -100;
        int resultOfIntExpr = myInt + 10; // Expression results in int
        System.out.println("int: " + myInt + ", " + negativeInt + ", expr=" + resultOfIntExpr);

        // 2. long: 64-bit signed integer. Use L/l suffix for literals.
        long myLong = 9876543210L; // 'L' suffix denotes long literal
        long resultOfLongExpr = myLong * 2; // Expression involving long results in long
        // long tooBigForInt = 10000000000; // Compile Error: Integer number too large (without L, it's treated as int literal)
        System.out.println("long: " + myLong + ", expr=" + resultOfLongExpr);

        // 3. short: 16-bit signed integer. Range: -32,768 to 32,767.
        short myShort = 1000;     // Integer literal 1000 fits in short range
        // short tooBigForShort = 40000; // Compile Error: Type mismatch: cannot convert from int to short (value too large)
        short castedShort = (short) 40000; // Cast needed if value might exceed range (wraps around here)
        System.out.println("short: " + myShort + ", casted=" + castedShort);

        // 4. byte: 8-bit signed integer. Range: -128 to 127.
        byte myByte = 127;        // Integer literal 127 fits in byte range
        // byte tooBigForByte = 128; // Compile Error: Type mismatch: cannot convert from int to byte
        byte castedByte = (byte) 130; // Cast needed (value 130 wraps around to -126)
        System.out.println("byte: " + myByte + ", casted=" + castedByte);

        // 5. double: 64-bit floating-point. Default for decimal literals. IEEE 754 standard.
        double myDouble = 3.14159;    // Decimal literal is double by default
        double scientificDouble = 1.2e3; // Scientific notation (1.2 * 10^3 = 1200.0)
        double resultOfDoubleExpr = myDouble / 2.0; // Expression involving double results in double
        System.out.println("double: " + myDouble + ", sci=" + scientificDouble + ", expr=" + resultOfDoubleExpr);

        // 6. float: 32-bit floating-point. Use F/f suffix for literals. IEEE 754 standard.
        float myFloat = 3.14f;     // 'f' suffix denotes float literal
        // float requiresSuffix = 3.14; // Compile Error: Type mismatch: cannot convert from double to float (3.14 is double by default)
        float castedFloat = (float) 3.14; // Can cast double literal to float
        float resultOfFloatExpr = myFloat * 2.0f; // Expression involving float results in float (or double if mixed)
        System.out.println("float: " + myFloat + ", casted=" + castedFloat + ", expr=" + resultOfFloatExpr);

        // 7. char: 16-bit Unicode character. Single quotes for literals. Underlying numeric type (0-65535).
        char myChar = 'A';         // Character literal
        char newlineChar = '\n';   // Escape sequence for newline
        char unicodeChar = '\u0042'; // Unicode escape for 'B' (Hex 42 = Decimal 66)
        int charAsInt = myChar;    // Implicit conversion to int (ASCII/Unicode value 65)
        char intAsChar = 66;       // Assigning int value 66 results in char 'B'
        int resultOfCharExpr = myChar + 1; // Arithmetic on char promotes to int (65 + 1 = 66)
        System.out.println("char: " + myChar + ", newline='" + newlineChar + "', unicode=" + unicodeChar);
        System.out.println("char conversions: asInt=" + charAsInt + ", intAsChar=" + intAsChar + ", expr=" + resultOfCharExpr);

        // 8. boolean: Truth value. Literals are 'true' and 'false'. Cannot be converted to/from numeric types.
        boolean isJavaFun = true;
        boolean isExamEasy = false;
        boolean resultOfBoolExpr = isJavaFun && !isExamEasy; // Boolean expression
        // int boolAsInt = (int)isJavaFun; // Compile Error: Cannot cast from boolean to int
        // boolean intAsBool = (boolean)1; // Compile Error: Cannot cast from int to boolean
        System.out.println("boolean: " + isJavaFun + ", " + isExamEasy + ", expr=" + resultOfBoolExpr);

        // Pitfall: Confusing char and String
        char singleChar = 'X';
        String stringLiteral = "X"; // String is an object (reference type), not primitive. Double quotes.
        // singleChar = stringLiteral; // Compile Error: Cannot assign String to char
        System.out.println("char vs String: char='" + singleChar + "', String=\"" + stringLiteral + "\"");

        System.out.println();
    }

    // --- Topic 5: Choose the Best Java Data Type ---
    public static void demonstrateTopic5() {
        System.out.println("--- Topic 5: Choose the Best Java Data Type ---");

        // Choosing the right type depends on the data's nature, range, and precision requirements.

        // Integers:
        int numberOfStudents = 150; // Common case for counts, indices. Fits +/- 2 billion. (Use `int`)
        long worldPopulation = 8_000_000_000L; // Value exceeds int range. (Use `long` with 'L')
        short httpStatusCode = 200; // Small range, if memory is critical (e.g., huge arrays). (Use `short`)
        byte ageInYears = 42; // Very small range (-128 to 127). (Use `byte` if range guaranteed and memory matters)

        System.out.println("Integers: students=" + numberOfStudents + " (int), population=" + worldPopulation + " (long), status=" + httpStatusCode + " (short), age=" + ageInYears + " (byte)");

        // Real Numbers (Floating-Point):
        double temperatureCelsius = 25.5; // Default choice for decimals, measurements. (~15 digits precision)
        float gameScorePercentage = 98.5f; // Use 'f' suffix. Less precision (~7 digits), saves memory vs double. (Use `float`)

        System.out.println("Floating-Point: temp=" + temperatureCelsius + " (double), score=" + gameScorePercentage + " (float)");

        // Pitfall: Floating-point inaccuracy for precise calculations (like money).
        double price1 = 0.1;
        double price2 = 0.2;
        double sumDouble = price1 + price2; // Might not be exactly 0.3 due to binary representation
        System.out.println("Floating-point pitfall: 0.1 + 0.2 = " + sumDouble + " (double)"); // Output likely: 0.30000000000000004

        // Use BigDecimal for precise decimal arithmetic (especially finance).
        BigDecimal bdPrice1 = new BigDecimal("0.1");
        BigDecimal bdPrice2 = new BigDecimal("0.2");
        BigDecimal sumBigDecimal = bdPrice1.add(bdPrice2);
        System.out.println("Using BigDecimal: 0.1 + 0.2 = " + sumBigDecimal); // Output: 0.3

        // Or use integer cents:
        int priceInCents1 = 10; // 0.10 USD
        int priceInCents2 = 20; // 0.20 USD
        int sumInCents = priceInCents1 + priceInCents2; // 30 cents = 0.30 USD
        System.out.println("Using integer cents: 10 + 20 = " + sumInCents + " cents");

        // Characters:
        char grade = 'A'; // Single character. (Use `char`)
        char firstInitial = 'L';
        System.out.println("Characters: grade=" + grade + " (char), initial=" + firstInitial + " (char)");

        // Truth Values:
        boolean isLoggedIn = true; // Flags, conditions. (Use `boolean`)
        boolean hasAdminPrivileges = false;
        System.out.println("Booleans: loggedIn=" + isLoggedIn + " (boolean), isAdmin=" + hasAdminPrivileges + " (boolean)");

        // Text:
        String userName = "Lalo"; // Sequence of characters. Not primitive, but a fundamental object type. (Use `String`)
        String message = "Hello, World!";
        System.out.println("Text: user=" + userName + " (String), msg=" + message + " (String)");

        // Very Large Integers (beyond long range):
        BigInteger largeFactorial = new BigInteger("123456789012345678901234567890"); // Arbitrary precision integers
        System.out.println("Large Integer: factorial=" + largeFactorial + " (BigInteger)");

        // General Guidance:
        // - Integers? Use `int` unless range requires `long`. Use `short`/`byte` only for specific memory/protocol reasons.
        // - Decimals? Use `double` unless memory requires `float` or precision requires `BigDecimal`.
        // - Single character? Use `char`.
        // - True/False? Use `boolean`.
        // - Text? Use `String`.

        System.out.println();
    }

    // --- Topic 6: Declare a Variable of a Specified Primitive Type ---
    public static void demonstrateTopic6() {
        System.out.println("--- Topic 6: Declare a Variable ---");

        // Declaration Syntax: <type> <variableName>;
        // Declaration with Initialization: <type> <variableName> = <value or expression>;

        // int declarations
        int counter;          // Declared, not initialized (local vars need initialization before use)
        int initialValue = 10; // Declared and initialized
        int calculatedValue = initialValue * 2; // Initialized with an expression

        // Using the declared variable (after initialization)
        counter = 5; // Now 'counter' is initialized
        System.out.println("int: counter=" + counter + ", initialValue=" + initialValue + ", calculatedValue=" + calculatedValue);

        // double declaration
        double measurement = 98.6;
        System.out.println("double: measurement=" + measurement);

        // boolean declaration
        boolean isActive = false;
        System.out.println("boolean: isActive=" + isActive);

        // char declaration
        char symbol = '$';
        System.out.println("char: symbol=" + symbol);

        // long declaration (requires L)
        long population = 7_900_000_000L;
        System.out.println("long: population=" + population);

        // short declaration
        short index = 1000;
        System.out.println("short: index=" + index);

        // byte declaration
        byte flags = 0b0110; // Binary literal (value is 6)
        System.out.println("byte: flags=" + flags);

        // Multiple declarations of the same type
        int x = 1, y = 2, z; // x and y initialized, z is not
        z = x + y;
        System.out.println("Multiple declaration: x=" + x + ", y=" + y + ", z=" + z);

        // Pitfall: Using uninitialized local variable
        int uninit;
        // if (uninit > 0) { ... } // Compile Error: variable uninit might not have been initialized

        // Pitfall: Type mismatch on initialization
        // int requiresInt = 5.5; // Compile Error: cannot convert from double to int
        int castedInt = (int) 5.5; // Explicit cast required (truncates to 5)
        System.out.println("Type mismatch pitfall: castedInt=" + castedInt);

        // float requires 'f' or cast
        // float temperature = 25.0; // Compile Error: 25.0 is double
        float temperatureF = 25.0f; // Correct with 'f'
        float temperatureCast = (float) 25.0; // Correct with cast
        System.out.println("Float literal pitfall: tempF=" + temperatureF + ", tempCast=" + temperatureCast);

        System.out.println();
    }

    // --- Topic 7: Demonstrate Comprehension of Identifier Semantics ---
    public static void demonstrateTopic7() {
        System.out.println("--- Topic 7: Identifier Semantics ---");

        // Semantics: Understanding what an identifier *represents* and how it behaves.

        // 1. Variables as Labels for Memory Locations:
        // For primitives, the variable holds the value directly.
        int score = 95; // 'score' is a label for a memory location holding the value 95.
        int finalScore = score; // 'finalScore' gets a *copy* of the value from 'score'.
        score = 100; // Changing 'score' does NOT affect 'finalScore'. They are independent after the copy.
        System.out.println("Primitive assignment semantics: score=" + score + ", finalScore=" + finalScore); // Output: 100, 95

        // For objects (reference types), the variable holds a *reference* (address) to the object on the heap.
        StringBuilder nameBuilder1 = new StringBuilder("Lalo"); // 'nameBuilder1' holds a reference to a StringBuilder object.
        StringBuilder nameBuilder2 = nameBuilder1; // 'nameBuilder2' gets a *copy of the reference*. Both now point to the SAME object.

        // Modifying the object through one reference affects the other (aliasing).
        nameBuilder1.append(" Jr.");
        System.out.println("Reference assignment semantics (aliasing):");
        System.out.println("  nameBuilder1: " + nameBuilder1); // Output: Lalo Jr.
        System.out.println("  nameBuilder2: " + nameBuilder2); // Output: Lalo Jr. (Same object)

        nameBuilder2 = new StringBuilder("New Name"); // 'nameBuilder2' now points to a different StringBuilder object.
        System.out.println("After reassigning nameBuilder2:");
        System.out.println("  nameBuilder1: " + nameBuilder1); // Output: Lalo Jr. (Unaffected)
        System.out.println("  nameBuilder2: " + nameBuilder2); // Output: New Name

        // 2. Scope: Region where an identifier is valid.
        int outerVar = 1;
        if (outerVar > 0) {
            int innerVar = 2; // 'innerVar' is only valid inside this if-block.
            System.out.println("Inside block: outerVar=" + outerVar + ", innerVar=" + innerVar);

            // Shadowing: Declaring a variable with the same name as one in an outer scope.
            int outerVarShadow = 10; // This 'outerVarShadow' is different from any outer variable with the same name.
            System.out.println("  Shadowing demo: outerVarShadow (inner) = " + outerVarShadow);
        }
        // System.out.println(innerVar); // Compile Error: cannot find symbol (innerVar out of scope)
        System.out.println("Outside block: outerVar=" + outerVar);

        // 3. Method Parameters vs Arguments:
        int argumentValue = 5;
        int result = multiplyByTwo(argumentValue); // 'argumentValue' (5) is the argument passed.
        System.out.println("Method call semantics: argumentValue=" + argumentValue + ", result=" + result);
        // Note: 'argumentValue' in main remains unchanged (5) because primitives are passed by value.

        // 4. Constants (final): Identifier cannot be reassigned after initialization.
        final double PI = 3.14159; // 'PI' is a constant identifier.
        // PI = 3.14; // Compile Error: cannot assign a value to final variable PI
        System.out.println("Constant identifier: PI=" + PI);

        System.out.println();
    }

    // Helper method for Topic 7 (parameter semantics)
    public static int multiplyByTwo(int parameterName) {
        // 'parameterName' is the parameter (an identifier local to this method).
        // It receives a *copy* of the argument's value (5 in the example call).
        parameterName = parameterName * 2; // Modifying the parameter does NOT affect the original argument in main.
        return parameterName; // Returns the modified value (10).
    }


    // --- Topic 8: Trace and Evaluate Code with Multiple Methods ---
    public static void demonstrateTopic8() {
        System.out.println("--- Topic 8: Tracing Code with Multiple Methods ---");

        // Program execution flows from one method call to the next.
        // Java uses pass-by-value for argument passing.
        // - Primitives: The value itself is copied. Changes inside the method don't affect the caller.
        // - Objects: The reference (address) is copied. Changes to the *object's state* via the reference ARE visible to the caller. Reassigning the reference *inside* the method does NOT affect the caller's reference.

        // Scenario 1: Primitive pass-by-value
        int xMain = 5;
        System.out.println("Before addOne call: xMain = " + xMain); // Output: 5
        int yMain = addOne(xMain); // Call addOne, passing the value of xMain (5)
        // Inside addOne: 'num' parameter gets a copy (5). 'num' is modified to 6 and returned.
        System.out.println("After addOne call: xMain = " + xMain + ", yMain = " + yMain); // Output: xMain=5 (unchanged), yMain=6

        // Scenario 2: Object reference pass-by-value
        Point pMain = new Point(2, 3); // pMain holds reference to a Point object (2,3) on the heap.
        System.out.println("Before modifyPoint call: pMain = " + pMain); // Output: (2, 3)
        modifyPoint(pMain); // Call modifyPoint, passing a copy of the reference stored in pMain.
        // Inside modifyPoint: 'pt' parameter gets a copy of the reference, points to the SAME Point object.
        // Step 1: pt.x = 10; -> Modifies the state of the original Point object via the copied reference. Original object is now (10, 3).
        // Step 2: pt = new Point(0, 0); -> Reassigns the *local parameter* 'pt' to point to a NEW Point(0,0) object. This DOES NOT affect the caller's 'pMain' reference.
        System.out.println("After modifyPoint call: pMain = " + pMain); // Output: (10, 3) (pMain still points to the original object, whose state was modified)

        // Systematic Tracing:
        // 1. Start in 'main'. Track local variables.
        // 2. Method Call: Pause 'main'. Enter called method.
        // 3. Parameters: Initialize parameters with copies of argument values (value for primitive, reference for object).
        // 4. Execute called method line-by-line. Track its local variables.
        // 5. Return: Note the return value. Resume 'caller' at the point after the call. Substitute return value if needed.
        // 6. Discard called method's locals/parameters (they go out of scope).

        System.out.println();
    }

    // Helper for Topic 8: Primitive pass-by-value
    public static int addOne(int num) { // 'num' gets a copy of the argument's value
        System.out.println("  Inside addOne: received num = " + num);
        num = num + 1; // Modifies the local copy 'num'
        System.out.println("  Inside addOne: modified num to " + num);
        return num; // Returns the modified value
    }

    // Helper for Topic 8: Object reference pass-by-value
    public static void modifyPoint(Point pt) { // 'pt' gets a copy of the argument's reference (points to the same object)
        System.out.println("  Inside modifyPoint: received pt pointing to " + pt);
        pt.x = 10; // Modifies the state of the object referenced by 'pt' (and 'pMain')
        System.out.println("  Inside modifyPoint: modified object state via pt to " + pt);
        pt = new Point(0, 0); // Reassigns the LOCAL parameter 'pt' to a NEW object. Caller's reference ('pMain') is unaffected.
        System.out.println("  Inside modifyPoint: reassigned local pt to " + pt);
    }

    // --- Topic 9: Trace Code with Decisions and Loops ---
    public static void demonstrateTopic9() {
        System.out.println("--- Topic 9: Tracing Decisions and Loops ---");

        // Decisions (if/else, switch) control which block of code executes.
        // Loops (for, while, do-while) repeat blocks of code.

        // Example: Summing odd numbers using a for loop and if statement.
        int sum = 0;
        int[] numbersToSum = {1, 2, 3, 4, 5, 6};
        System.out.println("Tracing loop and decision:");
        System.out.println("Initial sum = " + sum + ", array = " + Arrays.toString(numbersToSum));

        // for loop: (initialization; condition; update)
        for (int i = 0; i < numbersToSum.length; i++) { // i = 0, 1, 2, 3, 4, 5
            System.out.print("  Iteration i=" + i + ": number=" + numbersToSum[i]);
            // if statement: evaluate the condition
            if (numbersToSum[i] % 2 != 0) { // Check if the number is odd
                // Condition true: Execute this block
                System.out.print(" (odd) -> Adding to sum. ");
                sum += numbersToSum[i]; // Add the odd number to sum
            } else {
                // Condition false: Execute this block (or skip if no else)
                System.out.print(" (even) -> Skipping sum. ");
            }
            System.out.println("Current sum = " + sum);
            // Loop update (i++) happens after the body finishes.
        }
        // Loop terminates when condition (i < numbersToSum.length) becomes false (when i = 6).
        System.out.println("Final sum of odd numbers = " + sum); // Output: 1 + 3 + 5 = 9

        // Example: while loop searching for a value
        int targetValue = 4;
        int index = 0;
        boolean found = false;
        System.out.println("\nTracing while loop search for " + targetValue + ":");
        // while loop: condition checked *before* each iteration
        while (index < numbersToSum.length) {
            System.out.print("  Index=" + index + ", checking value " + numbersToSum[index]);
            if (numbersToSum[index] == targetValue) {
                found = true;
                System.out.println(" -> Found!");
                break; // Exit the loop immediately when found
            }
            System.out.println(" -> Not found yet.");
            index++; // Must manually update the loop control variable
        }
        if (!found) {
            System.out.println("  Target " + targetValue + " not found in the array.");
        }

        // Example: do-while loop (executes body at least once)
        int countdown = 3;
        System.out.println("\nTracing do-while loop:");
        do {
            System.out.println("  Countdown: " + countdown);
            countdown--;
        } while (countdown > 0); // Condition checked *after* the body executes.
        System.out.println("  Blast off!");

        // Pitfall: Off-by-one error in loop condition
        // for (int k = 0; k <= numbersToSum.length; k++) { // Incorrect: k <= length goes out of bounds
        //     System.out.println(numbersToSum[k]); // Throws ArrayIndexOutOfBoundsException when k == length
        // }
        System.out.println("Correct loop condition uses '< length': for (int k = 0; k < numbersToSum.length; k++)");

        System.out.println();
    }

    // --- Topic 10: Declare and Instantiate Arrays (Including 2-D Arrays) ---
    public static void demonstrateTopic10() {
        System.out.println("--- Topic 10: Declaring and Instantiating Arrays ---");

        // Arrays: Ordered collection of elements of the *same* type. Fixed size once created.

        // --- 1-D Arrays ---

        // Declaration: Specifies the type and that it's an array reference.
        int[] scores; // Declares 'scores' as a reference variable that can hold an int array. Currently null.
        String[] names; // Declares 'names' to hold a String array reference.

        // Instantiation: Creates the actual array object in memory using 'new'.
        // Syntax: new <type>[<size>];
        scores = new int[5]; // Instantiates an array of 5 integers. Elements default to 0.
        names = new String[3]; // Instantiates an array of 3 String references. Elements default to null.

        System.out.println("Instantiated 1-D arrays:");
        // Arrays.toString() provides a readable representation. Direct print gives object ID.
        System.out.println("  scores (default values): " + Arrays.toString(scores)); // Output: [0, 0, 0, 0, 0]
        System.out.println("  names (default values): " + Arrays.toString(names));   // Output: [null, null, null]
        System.out.println("  scores length: " + scores.length); // '.length' is a property (not a method)

        // Declaration and Instantiation combined:
        double[] temperatures = new double[4]; // Creates a double array of size 4, defaults to 0.0
        System.out.println("  temperatures: " + Arrays.toString(temperatures)); // Output: [0.0, 0.0, 0.0, 0.0]

        // Array Initializer Literal: Declare, instantiate, and initialize in one step.
        // Syntax: <type>[] <name> = { value1, value2, ... }; (Only usable at declaration)
        char[] grades = {'A', 'B', 'C', 'F', 'A'}; // Creates and initializes char array of size 5.
        System.out.println("  grades (initialized): " + Arrays.toString(grades)); // Output: [A, B, C, F, A]
        System.out.println("  grades length: " + grades.length); // Output: 5

        // --- 2-D Arrays ---

        // Declaration: <type>[][] <name>;
        int[][] matrix;

        // Instantiation (Rectangular): new <type>[<rows>][<cols>];
        matrix = new int[3][4]; // Creates a 3x4 grid (3 rows, 4 columns). Defaults to 0.
        System.out.println("\nInstantiated 2-D array (matrix):");
        // Printing 2D arrays requires nested loops or Arrays.deepToString().
        System.out.println("  matrix (deepToString): " + Arrays.deepToString(matrix));
        System.out.println("  Number of rows (matrix.length): " + matrix.length); // Output: 3
        System.out.println("  Number of columns in row 0 (matrix[0].length): " + matrix[0].length); // Output: 4

        // Accessing elements: matrix[row][column] (0-based index)
        matrix[0][1] = 5; // Set element at row 0, column 1 to 5
        System.out.println("  matrix after modification: " + Arrays.deepToString(matrix));

        // Instantiation (Ragged/Jagged): Rows allocated independently.
        int[][] raggedArray = new int[3][]; // Allocate rows, but column sizes determined later.
        raggedArray[0] = new int[2]; // Row 0 has 2 columns
        raggedArray[1] = new int[4]; // Row 1 has 4 columns
        raggedArray[2] = new int[1]; // Row 2 has 1 column
        // Elements default to 0.
        System.out.println("Instantiated ragged 2-D array:");
        System.out.println("  raggedArray (deepToString): " + Arrays.deepToString(raggedArray));
        System.out.println("  Length of row 1: " + raggedArray[1].length); // Output: 4

        // 2-D Array Initializer Literal:
        String[][] users = {
            {"Alice", "Admin"},
            {"Bob", "User"},
            {"Charlie", "User"}
        }; // Creates a 3x2 String array.
        System.out.println("Initialized 2-D array (users):");
        System.out.println("  users (deepToString): " + Arrays.deepToString(users));

        // Pitfall: Forgetting instantiation (NullPointerException)
        int[] uninitializedArray = null;
        // System.out.println(uninitializedArray.length); // Throws NullPointerException
        // uninitializedArray[0] = 1; // Throws NullPointerException

        // Pitfall: Off-by-one index error
        int[] data = {10, 20, 30}; // Length 3, valid indices 0, 1, 2
        // System.out.println(data[3]); // Throws ArrayIndexOutOfBoundsException (index 3 is invalid)
        System.out.println("Last element access (correct): data[data.length - 1] = " + data[data.length - 1]); // Output: 30

        System.out.println();
    }

    // --- Topic 11: Manipulate Arrays with Indexes and Loops ---
    public static void demonstrateTopic11() {
        System.out.println("--- Topic 11: Manipulating Arrays with Loops ---");

        int[] values = {10, 20, 30, 40, 50};
        System.out.println("Original array: " + Arrays.toString(values));

        // Accessing elements by index (0-based)
        int firstElement = values[0]; // Access index 0
        int thirdElement = values[2]; // Access index 2
        System.out.println("Accessing: first=" + firstElement + ", third=" + thirdElement);

        // Modifying elements by index
        values[1] = 25; // Change element at index 1 from 20 to 25
        System.out.println("After modifying index 1: " + Arrays.toString(values));

        // Iterating with a standard for loop (using index)
        System.out.println("Iterating with standard for loop:");
        int sum = 0;
        for (int i = 0; i < values.length; i++) { // Loop from index 0 up to (but not including) length
            System.out.println("  Element at index " + i + " is " + values[i]);
            sum += values[i]; // Example: calculate sum
        }
        System.out.println("Sum calculated using index loop: " + sum);

        // Iterating with an enhanced for loop (for-each loop) - simpler syntax when index not needed
        System.out.println("Iterating with enhanced for loop (for-each):");
        int product = 1;
        for (int currentValue : values) { // Iterates through each element, assigning it to 'currentValue'
            System.out.println("  Processing element: " + currentValue);
            product *= currentValue; // Example: calculate product
            // Pitfall: Cannot easily modify the array element using the loop variable 'currentValue'
            // currentValue = 0; // This changes the local 'currentValue', NOT the element in the 'values' array.
        }
        System.out.println("Product calculated using for-each loop: " + product);
        System.out.println("Array after for-each (unchanged by trying to modify loop var): " + Arrays.toString(values));


        // Common Manipulations:

        // Finding the maximum value
        int max = values[0]; // Assume first is max initially
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i]; // Found a new maximum
            }
        }
        System.out.println("Maximum value in array: " + max);

        // Searching for a value
        int target = 30;
        int foundIndex = -1; // Indicate not found initially
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                foundIndex = i;
                break; // Stop searching once found
            }
        }
        if (foundIndex != -1) {
            System.out.println("Target " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Target " + target + " not found.");
        }

        // Modifying all elements (e.g., doubling them) - Requires index-based loop
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * 2; // Modify the element directly using its index
        }
        System.out.println("Array after doubling all elements: " + Arrays.toString(values));

        // Copying an array
        // Method 1: Loop
        int[] valuesCopyLoop = new int[values.length];
        for(int i = 0; i < values.length; i++) {
            valuesCopyLoop[i] = values[i];
        }
        // Method 2: Arrays.copyOf() - Recommended
        int[] valuesCopyUtil = Arrays.copyOf(values, values.length);
        // Method 3: System.arraycopy() - More complex, but efficient for large copies
        int[] valuesCopySystem = new int[values.length];
        System.arraycopy(values, 0, valuesCopySystem, 0, values.length);

        values[0] = 999; // Modify original after copying
        System.out.println("Original modified: " + Arrays.toString(values));
        System.out.println("Copy (loop):     " + Arrays.toString(valuesCopyLoop)); // Unaffected by change to original
        System.out.println("Copy (copyOf):   " + Arrays.toString(valuesCopyUtil)); // Unaffected
        System.out.println("Copy (arraycopy):" + Arrays.toString(valuesCopySystem)); // Unaffected

        // Manipulating 2D arrays with nested loops
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("\nManipulating 2D array:");
        System.out.println("Original matrix: " + Arrays.deepToString(matrix));
        int matrixSum = 0;
        // Outer loop for rows (r)
        for (int r = 0; r < matrix.length; r++) { // matrix.length gives number of rows
            // Inner loop for columns (c) in the current row
            for (int c = 0; c < matrix[r].length; c++) { // matrix[r].length gives columns in this specific row
                System.out.print("  Processing matrix[" + r + "][" + c + "] = " + matrix[r][c]);
                matrixSum += matrix[r][c]; // Example: summing elements
                matrix[r][c] *= 10; // Example: modifying elements
                System.out.println(" -> New value: " + matrix[r][c]);
            }
        }
        System.out.println("Sum of original matrix elements: " + matrixSum);
        System.out.println("Matrix after modification: " + Arrays.deepToString(matrix));

        System.out.println();
    }

    // --- Topic 12: Trace Code with Arrays and Loops ---
    public static void demonstrateTopic12() {
        System.out.println("--- Topic 12: Tracing Code with Arrays and Loops ---");

        // Example to trace: Calculate sum of odd numbers AND double each element.
        int[] data = {3, 1, 4, 1, 5, 9};
        int total = 0;

        System.out.println("Initial state: data = " + Arrays.toString(data) + ", total = " + total);
        System.out.println("Tracing loop execution:");

        for (int i = 0; i < data.length; i++) {
            System.out.print("  Iteration i=" + i + ": current data=" + Arrays.toString(data) + ", current total=" + total);
            System.out.print(" -> Accessing data[" + i + "] = " + data[i]);

            // Decision: Check if element is odd
            if (data[i] % 2 == 1) {
                System.out.print(" (odd) -> Adding " + data[i] + " to total.");
                total += data[i]; // total updates based on the *current* value of data[i]
            } else {
                System.out.print(" (even) -> Skipping total update.");
            }

            // Modification: Double the element *after* the check/sum operation
            int originalValue = data[i];
            data[i] = data[i] * 2;
            System.out.println(" -> Doubled data[" + i + "] from " + originalValue + " to " + data[i] + ". New total=" + total);
        }
        // Loop finishes when i becomes 6 (i < data.length is false)

        System.out.println("\nFinal state after loop:");
        System.out.println("  Final total = " + total); // Should be 3 + 1 + 1 + 5 + 9 = 19
        System.out.println("  Final data array = " + Arrays.toString(data)); // Should be [6, 2, 8, 2, 10, 18]

        // Trace Table (Mental or on Paper):
        // i | data[i] (before check) | Condition (odd?) | total (after check) | data[i] (after modify) | data array state
        //---|------------------------|------------------|---------------------|------------------------|----------------------
        // 0 | 3                      | true             | 3                   | 6                      | [6, 1, 4, 1, 5, 9]
        // 1 | 1                      | true             | 4                   | 2                      | [6, 2, 4, 1, 5, 9]
        // 2 | 4                      | false            | 4                   | 8                      | [6, 2, 8, 1, 5, 9]
        // 3 | 1                      | true             | 5                   | 2                      | [6, 2, 8, 2, 5, 9]
        // 4 | 5                      | true             | 10                  | 10                     | [6, 2, 8, 2, 10, 9]
        // 5 | 9                      | true             | 19                  | 18                     | [6, 2, 8, 2, 10, 18]

        // Pitfall: Forgetting modifications persist between iterations.
        // The change to data[0] in iteration 0 is present when iteration 1 starts.

        // Example 2: Reversing an array into a new array
        int[] original = {10, 20, 30, 40};
        int[] reversed = new int[original.length]; // Must have same size

        System.out.println("\nTracing array reversal:");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Reversed (before): " + Arrays.toString(reversed));

        for (int i = 0; i < original.length; i++) {
            // Calculate the source index in 'original' (from end) and destination index in 'reversed' (from start)
            int sourceIndex = original.length - 1 - i;
            int destIndex = i;
            System.out.println("  Iteration i=" + i + ": Copying original[" + sourceIndex + "] (" + original[sourceIndex] + ") to reversed[" + destIndex + "]");
            reversed[destIndex] = original[sourceIndex];
            System.out.println("  Reversed array state: " + Arrays.toString(reversed));
        }

        System.out.println("Final reversed array: " + Arrays.toString(reversed)); // Output: [40, 30, 20, 10]

        System.out.println();
    }

    // --- Topic 13: Declare and Instantiate Object Variables and Objects ---
    public static void demonstrateTopic13() {
        System.out.println("--- Topic 13: Declaring and Instantiating Objects ---");

        // Objects are instances of classes. Need: Class Definition, Reference Variable, `new` operator.

        // 1. Class Definition: Provided by Java (e.g., String, Scanner) or custom (e.g., Counter).

        // 2. Declaring an Object Variable: Creates a reference variable (initially null or unassigned for locals).
        // Syntax: ClassName variableName;
        String message;      // Declares 'message' reference of type String. Currently unassigned locally.
        Counter count1;      // Declares 'count1' reference of type Counter.
        Scanner inputScanner; // Declares 'inputScanner' reference of type Scanner.

        // System.out.println(count1); // Compile Error: variable count1 might not have been initialized

        // 3. Instantiating an Object: Creates the object on the heap using 'new' and calls the constructor.
        //    The 'new' expression returns a reference (memory address) to the created object.
        // Syntax: variableName = new ClassName(constructorArguments...);
        message = new String("Hello from Object!"); // Instantiates String object, assigns reference to 'message'.
        count1 = new Counter(10); // Instantiates Counter object using constructor Counter(int), assigns reference to 'count1'.
        inputScanner = new Scanner(System.in); // Instantiates Scanner object linked to standard input.

        System.out.println("Instantiated objects:");
        System.out.println("  message: " + message); // Prints the string content
        System.out.println("  count1 (initial value): " + count1.value); // Accessing object's field via reference
        System.out.println("  inputScanner: " + inputScanner); // Prints default object toString representation

        // Declaration and Instantiation combined:
        Random randomGenerator = new Random(); // Declares and instantiates a Random object.
        Counter count2 = new Counter(0);    // Declares and instantiates another Counter object.

        System.out.println("Combined declaration/instantiation:");
        System.out.println("  random number: " + randomGenerator.nextInt(100)); // Calling method on object via reference
        System.out.println("  count2 value: " + count2.value);

        // Instantiation without 'new' (Special Cases):
        String literalString = "This is also an object"; // String literals are instantiated automatically.
        Integer wrapperInt = 5; // Autoboxing: primitive 5 is automatically converted to an Integer object.

        System.out.println("Special instantiation:");
        System.out.println("  literalString: " + literalString);
        System.out.println("  wrapperInt: " + wrapperInt);

        // Pitfall: NullPointerException
        Counter count3 = null; // 'count3' holds a null reference (doesn't point to any object).
        // System.out.println(count3.value); // Throws NullPointerException: trying to access member of null.
        // count3.increment();             // Throws NullPointerException: trying to call method on null.
        System.out.println("Pitfall: count3 reference is " + count3); // Output: null

        // Pitfall: Forgetting to instantiate objects in an array
        Counter[] counterArray = new Counter[3]; // Creates an array to HOLD 3 Counter references. References are initially null.
        System.out.println("Array of references (before object instantiation): " + Arrays.toString(counterArray)); // Output: [null, null, null]
        // counterArray[0].increment(); // Throws NullPointerException

        // Must instantiate each object in the array:
        for (int i = 0; i < counterArray.length; i++) {
            counterArray[i] = new Counter(i * 10); // Instantiate each Counter object
        }
        System.out.println("Array of references (after object instantiation): " + Arrays.toString(counterArray));
        counterArray[0].increment(); // Now this works.
        System.out.println("Array after incrementing first counter: " + Arrays.toString(counterArray));

        // Close scanner to avoid resource leak (good practice)
        inputScanner.close();

        System.out.println();
    }

    // --- Topic 14: Differences Between Value Types and Reference Types ---
    public static void demonstrateTopic14() {
        System.out.println("--- Topic 14: Value Types (Primitives) vs Reference Types (Objects) ---");

        // --- Value Types (Primitives: int, double, boolean, char, byte, short, long, float) ---
        // - Variable holds the actual value directly.
        // - Assignment copies the value. Variables are independent after copy.
        // - Passed by value to methods (method gets a copy). Original unchanged by method.
        // - Cannot be null. Have default values (0, false) as fields if not initialized.
        // - Comparison with == checks for equal values.

        System.out.println("Value Type Demonstration (int):");
        int valA = 10;
        int valB = valA; // valB gets a *copy* of the value 10.
        System.out.println("  Initial: valA=" + valA + ", valB=" + valB); // Output: 10, 10
        valA = 20; // Changing valA does NOT affect valB.
        System.out.println("  After changing valA: valA=" + valA + ", valB=" + valB); // Output: 20, 10
        System.out.println("  Comparison (valA == valB): " + (valA == valB)); // Output: false (20 == 10)

        System.out.println("  Passing primitive to method:");
        modifyPrimitive(valB); // Pass the value of valB (10)
        System.out.println("  After modifyPrimitive call: valB = " + valB); // Output: 10 (valB in main is unchanged)


        // --- Reference Types (Objects: instances of classes, arrays, Strings) ---
        // - Variable holds a reference (memory address) to the object on the heap.
        // - Assignment copies the reference. Both variables point to the SAME object (aliasing).
        // - Passed by (reference) value to methods (method gets a copy of the reference). Method CAN change the object's state via the reference. Method cannot change where the caller's variable points.
        // - Can be null. Default value is null for fields if not initialized.
        // - Comparison with == checks if references point to the SAME object (identity). Use .equals() for content comparison.

        System.out.println("\nReference Type Demonstration (StringBuilder):");
        StringBuilder refA = new StringBuilder("Initial");
        StringBuilder refB = refA; // refB gets a *copy of the reference*. Both point to the SAME StringBuilder object.
        System.out.println("  Initial: refA=" + refA + ", refB=" + refB); // Output: Initial, Initial
        System.out.println("  Comparison (refA == refB): " + (refA == refB)); // Output: true (both point to same object)

        refA.append(" Changed"); // Modifying the object's state via refA.
        System.out.println("  After modifying object via refA: refA=" + refA + ", refB=" + refB); // Output: Initial Changed, Initial Changed (refB sees the change because it points to the same object)

        StringBuilder refC = new StringBuilder("Initial Changed");
        System.out.println("  Created refC with same content: refC=" + refC);
        System.out.println("  Comparison (refA == refC): " + (refA == refC)); // Output: false (different objects, even if content is same)
        System.out.println("  Content Comparison (refA.equals(refC)): " + refA.equals(refC)); // Output: true (StringBuilder.equals checks identity by default - need content comparison logic if required)
                                                                                            // Note: For String, .equals() checks content. For many other classes, default is ==.

        System.out.println("  Passing reference to method:");
        modifyReference(refB); // Pass a copy of the reference in refB
        System.out.println("  After modifyReference call: refB = " + refB); // Output: MODIFIED (state changed by method)

        // Pitfall: Expecting object assignment to copy the object content.
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        ArrayList<String> list2 = list1; // list2 points to the SAME ArrayList object.
        list2.add("B"); // Modifies the single ArrayList object.
        System.out.println("\nList aliasing pitfall: list1=" + list1 + ", list2=" + list2); // Output: [A, B], [A, B]


        // Arrays are reference types too
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // arr2 points to the same array object as arr1
        arr1[0] = 99;
        System.out.println("Array aliasing: arr1=" + Arrays.toString(arr1) + ", arr2=" + Arrays.toString(arr2)); // Output: [99, 2, 3], [99, 2, 3]

        System.out.println();
    }

    // Helper for Topic 14: Primitive pass-by-value
    public static void modifyPrimitive(int primitiveParam) { // Gets a copy of valB's value (10)
        System.out.println("    Inside modifyPrimitive: received " + primitiveParam);
        primitiveParam = 100; // Changes the local copy only
        System.out.println("    Inside modifyPrimitive: changed local copy to " + primitiveParam);
    }

    // Helper for Topic 14: Reference pass-by-value
    public static void modifyReference(StringBuilder referenceParam) { // Gets a copy of refB's reference (points to same object)
         System.out.println("    Inside modifyReference: received reference pointing to " + referenceParam);
         referenceParam.delete(0, referenceParam.length()); // Modify the STATE of the object via the reference
         referenceParam.append("MODIFIED");
         System.out.println("    Inside modifyReference: modified object state to " + referenceParam);
         referenceParam = new StringBuilder("New Object Inside Method"); // Reassigns the LOCAL parameter only. Caller's refB is unaffected by this line.
         System.out.println("    Inside modifyReference: reassigned local referenceParam to " + referenceParam);
    }


    // --- Topic 15: Differentiate Common Orders of Runtime Complexity ---
    public static void demonstrateTopic15() {
        System.out.println("--- Topic 15: Runtime Complexity (Big-O Notation) ---");

        // Big-O describes how runtime grows as input size (n) increases. Focuses on dominant term for large n.

        // O(1) - Constant Time: Runtime is independent of input size n.
        // Example: Accessing an array element by index.
        int[] arrayForO1 = {10, 20, 30, 40, 50};
        int element = arrayForO1[2]; // Takes the same time regardless of array size.
        System.out.println("O(1) Example: Accessing array[2] = " + element);

        // O(log n) - Logarithmic Time: Runtime increases slowly as n grows. Common in divide-and-conquer.
        // Example: Binary search on a sorted array (halves search space each step).
        // If n=1000, log2(n) is approx 10. If n=1,000,000, log2(n) is approx 20.
        System.out.println("O(log n) Example: Binary Search (see Topic 24). Runtime grows very slowly.");

        // O(n) - Linear Time: Runtime grows proportionally to n.
        // Example: Traversing an array once (e.g., sum, find max).
        long sumN = 0;
        int nLinear = 1000; // Example size
        for (int i = 0; i < nLinear; i++) { sumN += i; } // Loop runs n times.
        System.out.println("O(n) Example: Single loop summing 0 to " + (nLinear-1) + ". Runtime proportional to n.");

        // O(n log n) - Linearithmic Time: Common in efficient sorting algorithms. Grows faster than O(n) but much slower than O(n^2).
        // Example: Merge Sort, Quicksort (average case).
        System.out.println("O(n log n) Example: Efficient sorting like Merge Sort (see Topic 23).");

        // O(n^2) - Quadratic Time: Runtime grows with the square of n. Common in nested loops iterating over n items.
        // Example: Simple sorting (Bubble Sort), checking all pairs in a list.
        int nQuadratic = 100; // Example size
        long countQuadratic = 0;
        for (int i = 0; i < nQuadratic; i++) {
            for (int j = 0; j < nQuadratic; j++) {
                countQuadratic++; // Inner loop runs n times for each outer loop iteration (n*n total).
            }
        }
        System.out.println("O(n^2) Example: Nested loops running " + countQuadratic + " times for n=" + nQuadratic + ". Runtime grows quadratically.");

        // O(n^3) - Cubic Time: Runtime grows with the cube of n. Common in triple nested loops.
        System.out.println("O(n^3) Example: Triple nested loops (e.g., naive matrix multiplication). Becomes slow quickly.");

        // O(2^n) - Exponential Time: Runtime doubles with each +1 increase in n. Often in brute-force recursion exploring all possibilities.
        // Example: Naive recursive Fibonacci. Becomes infeasible very quickly.
        // For n=30, 2^30 is over 1 billion.
        System.out.println("O(2^n) Example: Naive recursive Fibonacci. Extremely slow for larger n.");

        // O(n!) - Factorial Time: Grows extremely rapidly. Often in permutations/combinations brute-force.
        // Example: Traveling Salesman Problem brute-force.
        // For n=12, 12! is ~479 million.
        System.out.println("O(n!) Example: Brute-force Traveling Salesman. Infeasible even for small n.");

        // Key Takeaway: Lower order (O(1), O(log n), O(n)) are generally considered efficient/scalable.
        // O(n^2) and higher become slow or impractical for large inputs.

        System.out.println();
    }

    // --- Topic 16: Identify Common Algorithms by Their Runtime Complexity ---
    public static void demonstrateTopic16() {
        System.out.println("--- Topic 16: Common Algorithm Complexities ---");

        System.out.println("Search Algorithms:");
        System.out.println("  - Linear Search (unsorted array): O(n)");
        System.out.println("  - Binary Search (sorted array): O(log n)");
        System.out.println("  - Hash Table Search/Insert/Delete (average): O(1)");
        System.out.println("  - Binary Search Tree Search/Insert/Delete (average, balanced): O(log n)");
        System.out.println("  - Binary Search Tree Search/Insert/Delete (worst, unbalanced): O(n)");

        System.out.println("\nSorting Algorithms:");
        System.out.println("  - Bubble Sort: O(n^2)");
        System.out.println("  - Selection Sort: O(n^2)");
        System.out.println("  - Insertion Sort: O(n^2) worst/average, O(n) best");
        System.out.println("  - Merge Sort: O(n log n) - All cases");
        System.out.println("  - Quicksort: O(n log n) average, O(n^2) worst");
        System.out.println("  - Heapsort: O(n log n) - All cases");
        System.out.println("  - Counting Sort / Radix Sort: O(n+k) or O(nk) - Linear under constraints");

        System.out.println("\nGraph/Tree Traversal:");
        System.out.println("  - Depth-First Search (DFS): O(V + E) for graph (V=vertices, E=edges), O(n) for tree (n=nodes)");
        System.out.println("  - Breadth-First Search (BFS): O(V + E) for graph, O(n) for tree");
        System.out.println("  - Binary Tree Traversals (Inorder, Preorder, Postorder): O(n)");

        System.out.println("\nRecursive Examples:");
        System.out.println("  - Factorial (recursive/iterative): O(n)");
        System.out.println("  - Fibonacci (naive recursive): O(2^n)");
        System.out.println("  - Fibonacci (iterative or memoized recursive): O(n)");
        System.out.println("  - Towers of Hanoi: O(2^n)");

        System.out.println("\nOther Common Operations:");
        System.out.println("  - Matrix Multiplication (naive): O(n^3) for n x n matrices");
        System.out.println("  - Accessing array element by index: O(1)");
        System.out.println("  - Inserting/Deleting from ArrayList start/middle: O(n) (due to shifting)");
        System.out.println("  - Inserting/Deleting from ArrayList end (amortized): O(1)");
        System.out.println("  - Inserting/Deleting from LinkedList start/end (if refs known): O(1)");
        System.out.println("  - Searching LinkedList: O(n)");
        System.out.println("  - Stack Push/Pop: O(1)");
        System.out.println("  - Queue Enqueue/Dequeue: O(1)");

        System.out.println();
    }

    // --- Topic 17: Read and Interpret UML Class Diagrams ---
    public static void demonstrateTopic17() {
        System.out.println("--- Topic 17: Reading UML Class Diagrams ---");

        // UML Class Diagrams visualize class structure and relationships.
        // (Code here demonstrates a structure that *could* be represented by UML).

        // Consider this UML description (textual equivalent):
        /*
        +--------------------+      1        0..* +------------------+
        | Customer           |<>-------------->| Order            |
        |--------------------|                 |------------------|
        | - customerId: int  |                 | - orderId: int   |
        | - name: String     |                 | - orderDate: Date|
        |--------------------|                 | # total: double  | // Protected
        | + getName(): String|                 |------------------|
        | + addOrder(Order)  |                 | + calculateTotal() |
        +--------------------+                 +------------------+
               /\
               | {implements}                (Generalization/Inheritance)
        +--------------------+                        /\
        | AccountHolder      | (Interface)            |
        |--------------------|                 +------------------+
        | + getAccountId():int|                 | PriorityOrder    |
        +--------------------+                 |------------------|
                                               | - priorityLevel: int |
                                               |------------------|
                                               | + expedite()       |
                                               +------------------+
        */

        // Interpretation:
        // - Classes: Customer, Order, PriorityOrder. Interface: AccountHolder.
        // - Customer Attributes: private customerId (int), private name (String).
        // - Customer Methods: public getName (returns String), public addOrder (takes Order).
        // - Order Attributes: private orderId (int), private orderDate (Date), protected total (double).
        // - Order Methods: public calculateTotal.
        // - PriorityOrder: Inherits from Order (is-a Order). Adds private priorityLevel (int) and public expedite().
        // - Customer implements AccountHolder interface. Must provide getAccountId() method.
        // - Relationship: Customer has a Composition/Aggregation (diamond) relationship with Order.
        //   - Multiplicity: 1 Customer can have 0 or more (*) Orders. Each Order belongs to 1 Customer.
        //   - Navigability: Arrow suggests Customer knows about its Orders.

        // Java code reflecting some of this structure (simplified):
        interface AccountHolder { // Representing the interface
             int getAccountId(); // Abstract method (no body)
        }

        class Customer implements AccountHolder { // Implements interface
            private int customerId;
            private String name;
            private ArrayList<Order> orders = new ArrayList<>(); // Composition/Aggregation: Customer 'has-a' list of Orders

            public Customer(int id, String name) { this.customerId = id; this.name = name; }

            public String getName() { return name; }

            public void addOrder(Order order) {
                 this.orders.add(order);
                 // In full implementation, might set order.customer = this;
            }

            @Override // Implementing the interface method
            public int getAccountId() { return this.customerId; }

            @Override public String toString() { return "Customer[id=" + customerId + ", name=" + name + "]"; }
        }

        class Order { // Base class for orders
            private int orderId;
            // private Date orderDate; // Using long for simplicity here
            private long orderTimestamp;
            protected double total; // Protected: accessible by subclasses (like PriorityOrder)

            public Order(int id) { this.orderId = id; this.orderTimestamp = System.currentTimeMillis(); }

            public void calculateTotal() { /* Complex calculation */ this.total = 50.0; } // Placeholder

            @Override public String toString() { return "Order[id=" + orderId + ", total=" + total + "]"; }
        }

        class PriorityOrder extends Order { // Inheritance: PriorityOrder 'is-a' Order
            private int priorityLevel;

            public PriorityOrder(int id, int level) {
                super(id); // Call superclass (Order) constructor
                this.priorityLevel = level;
            }

            public void expedite() { System.out.println("Expediting order " + orderId); } // PriorityOrder specific method
              // Inherits calculateTotal(), orderId, etc. from Order

             @Override public String toString() { return "PriorityOrder[id=" + orderId + ", total=" + total + ", level=" + priorityLevel + "]"; }
        }

        // Example Usage
        Customer c1 = new Customer(101, "Lalo");
        Order o1 = new Order(5001);
        PriorityOrder po1 = new PriorityOrder(5002, 1);

        c1.addOrder(o1);
        c1.addOrder(po1);
        o1.calculateTotal();
        po1.calculateTotal(); // Inherited method
        po1.expedite();       // Subclass specific method

        System.out.println("UML Demo Objects:");
        System.out.println("  " + c1);
        System.out.println("  Customer's orders: ");
        for (Order o : c1.orders) {
            System.out.println("    " + o);
        }
        System.out.println("  Customer Account ID: " + c1.getAccountId());


        // UML concepts visualized: Class boxes, Attributes/Methods with visibility (+,-,#), Inheritance (extends), Interface Realization (implements), Association/Composition (has-a), Multiplicity.

        System.out.println();
    }

    // --- Topic 18: Trace and Evaluate Code with Reference Types and Classes ---
    public static void demonstrateTopic18() {
        System.out.println("--- Topic 18: Tracing Code with Reference Types ---");

        // Focus on how references point to objects and how changes propagate (or don't).

        // Trace Scenario:
        System.out.println("Scenario: Counter objects a, b, c");
        Counter a = new Counter(5); // a -> Object1{value=5}
        Counter b = new Counter(5); // b -> Object2{value=5} (Different object from a)
        Counter c = a;              // c -> Object1{value=5} (c is an alias for a)

        System.out.println("Initial state: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("References: a == b -> " + (a == b) + ", a == c -> " + (a == c)); // false, true

        // Step 1: Modify object via reference 'a'
        a.increment(); // Calls increment() on Object1. Object1's value becomes 6.
        System.out.println("\nAfter a.increment():");
        System.out.println("  a=" + a + ", b=" + b + ", c=" + c); // Output: a=Counter[6], b=Counter[5], c=Counter[6] (c sees the change)

        // Step 2: Reassign reference 'c'
        c = b; // 'c' now points to Object2 (the same object 'b' points to). 'c' no longer points to Object1.
        System.out.println("\nAfter c = b:");
        System.out.println("  a=" + a + ", b=" + b + ", c=" + c); // Output: a=Counter[6], b=Counter[5], c=Counter[5]
        System.out.println("  References: a == b -> " + (a == b) + ", a == c -> " + (a == c) + ", b == c -> " + (b == c)); // false, false, true

        // Step 3: Modify object via reference 'c'
        c.value = 10; // Modifies Object2's value directly (since 'value' is public here). Object2 value becomes 10.
        System.out.println("\nAfter c.value = 10:");
        System.out.println("  a=" + a + ", b=" + b + ", c=" + c); // Output: a=Counter[6], b=Counter[10], c=Counter[10] (b sees the change made via c)

        // Trace Scenario 2: Method call with object reference
        System.out.println("\nScenario: Passing Counter to method");
        Counter p = new Counter(42); // p -> Object3{value=42}
        System.out.println("Before resetCounter call: p = " + p);
        resetCounter(p); // Pass reference p by value
        // Inside resetCounter:
        // 1. Local param 'counterParam' points to Object3.
        // 2. counterParam.value = 0; -> Object3's value is changed to 0.
        // 3. counterParam = new Counter(100); -> Local 'counterParam' is reassigned to a NEW object. This does NOT affect 'p' in main.
        System.out.println("After resetCounter call: p = " + p); // Output: Counter[0] (p still points to Object3, whose value became 0)

        System.out.println();
    }

    // Helper for Topic 18 tracing
    public static void resetCounter(Counter counterParam) { // counterParam gets copy of reference from 'p'
        System.out.println("  Inside resetCounter: received param pointing to " + counterParam);
        counterParam.value = 0; // Modifies the original object's state
        System.out.println("  Inside resetCounter: modified object state to " + counterParam);
        counterParam = new Counter(100); // Reassigns the LOCAL parameter ONLY
        System.out.println("  Inside resetCounter: reassigned local param to " + counterParam);
    }


    // --- Topic 19: Encapsulation, Data Hiding, Inheritance, and Polymorphism ---
    public static void demonstrateTopic19() {
        System.out.println("--- Topic 19: OOP Principles ---");

        // 1. Encapsulation & Data Hiding: Bundling data (fields) and methods, controlling access.
        //    Data hiding = making fields private, providing access via public methods (getters/setters/behaviors).
        class BankAccount {
            private double balance; // Data Hiding: balance is private, cannot be accessed directly from outside.
            private String ownerName;

            public BankAccount(String owner, double initialDeposit) {
                this.ownerName = owner;
                if (initialDeposit >= 0) { // Encapsulation: Constructor enforces rule
                    this.balance = initialDeposit;
                } else {
                    this.balance = 0;
                }
            }

            // Public method providing controlled access/operation
            public void deposit(double amount) {
                if (amount > 0) { // Encapsulation: Method enforces rule
                    this.balance += amount;
                    System.out.println("Deposited " + amount + ". New balance: " + this.balance);
                } else {
                     System.out.println("Deposit amount must be positive.");
                }
            }

            public boolean withdraw(double amount) {
                if (amount > 0 && amount <= this.balance) { // Encapsulation: Method enforces rules
                    this.balance -= amount;
                    System.out.println("Withdrew " + amount + ". New balance: " + this.balance);
                    return true;
                } else {
                    System.out.println("Withdrawal failed (invalid amount or insufficient funds). Balance: " + this.balance);
                    return false;
                }
            }

            // Getter: Provides read access to balance (controlled)
            public double getBalance() {
                return this.balance;
            }

            // No direct setter for balance - prevents arbitrary changes.
        }

        System.out.println("Encapsulation/Data Hiding Example:");
        BankAccount myAccount = new BankAccount("Lalo", 100.0);
        // System.out.println(myAccount.balance); // Compile Error: balance has private access
        System.out.println("Initial Balance (via getter): " + myAccount.getBalance());
        myAccount.deposit(50.0);
        myAccount.withdraw(30.0);
        myAccount.withdraw(200.0); // Fails due to insufficient funds (rule enforced)
        // myAccount.balance = 1000000; // Compile Error: cannot directly set private field


        // 2. Inheritance: Creating new classes (subclasses) based on existing ones (superclasses). "is-a" relationship.
        //    Reuses code and allows specialization. (See Animal, Dog, Cat classes defined earlier)
        System.out.println("\nInheritance Example:");
        Dog myDog = new Dog();       // Dog object
        Cat myCat = new Cat();       // Cat object
        Animal genericAnimal = new Animal(); // Animal object

        myDog.speak(); // Calls Dog's overridden speak() method
        myCat.speak(); // Calls Cat's overridden speak() method
        genericAnimal.speak(); // Calls Animal's speak() method
        myDog.fetch(); // Calls Dog-specific method


        // 3. Polymorphism: "Many forms". Ability of a reference variable to refer to objects of different types (subclasses),
        //    and for the correct method (overridden version) to be invoked at runtime based on the actual object type.
        System.out.println("\nPolymorphism Example:");
        Animal pet1 = new Dog(); // Animal reference pointing to a Dog object
        Animal pet2 = new Cat(); // Animal reference pointing to a Cat object

        System.out.print("pet1 (Dog object via Animal ref) speaks: ");
        pet1.speak(); // Runtime Polymorphism: JVM determines the actual object is Dog, calls Dog's speak() -> Woof!

        System.out.print("pet2 (Cat object via Animal ref) speaks: ");
        pet2.speak(); // Runtime Polymorphism: JVM determines the actual object is Cat, calls Cat's speak() -> Meow!

        // pet1.fetch(); // Compile Error: The reference type 'Animal' does not have a 'fetch' method.
                       // Need to cast the reference if you know the actual type is Dog.
        if (pet1 instanceof Dog) { // Check type before casting
            Dog specificDog = (Dog) pet1; // Downcasting Animal reference to Dog reference
            specificDog.fetch(); // Now fetch() can be called
        }

        // Polymorphism allows writing generic code:
        Animal[] zoo = {new Dog(), new Cat(), new Animal(), new Dog()};
        System.out.println("Making all animals in the zoo speak:");
        for (Animal animal : zoo) {
            System.out.print("  An animal speaks: ");
            animal.speak(); // Correct speak() method is called for each actual object type
        }

        System.out.println();
    }


    // --- Topic 20: Stacks and Queues (Common Operations) ---
    public static void demonstrateTopic20() {
        System.out.println("--- Topic 20: Stacks and Queues ---");

        // --- Stack (LIFO - Last-In, First-Out) ---
        // Think: Stack of plates. Add/Remove from the top.
        System.out.println("Stack (LIFO) Demonstration:");
        Stack<String> bookStack = new Stack<>(); // Using java.util.Stack (legacy, thread-safe but often slower than ArrayDeque)
        // Deque<String> bookStack = new ArrayDeque<>(); // Alternative: Use Deque interface with ArrayDeque (preferred)

        // push(): Add element to the top
        System.out.println("Pushing 'Book A', 'Book B', 'Book C'");
        bookStack.push("Book A"); // Stack: [Book A]
        bookStack.push("Book B"); // Stack: [Book A, Book B]
        bookStack.push("Book C"); // Stack: [Book A, Book B, Book C] <- Top

        // peek(): Look at the top element without removing
        System.out.println("Peek at top: " + bookStack.peek()); // Output: Book C

        // pop(): Remove and return the top element
        System.out.println("Pop: " + bookStack.pop()); // Removes and returns "Book C". Stack: [Book A, Book B] <- Top
        System.out.println("Peek after pop: " + bookStack.peek()); // Output: Book B
        System.out.println("Pop: " + bookStack.pop()); // Removes "Book B". Stack: [Book A] <- Top
        System.out.println("Pop: " + bookStack.pop()); // Removes "Book A". Stack: []

        // isEmpty(): Check if stack is empty
        System.out.println("Is stack empty? " + bookStack.isEmpty()); // Output: true

        // Pitfall: Popping from empty stack
        // System.out.println(bookStack.pop()); // Throws EmptyStackException


        // --- Queue (FIFO - First-In, First-Out) ---
        // Think: Line at a store. Add to back, Remove from front.
        System.out.println("\nQueue (FIFO) Demonstration:");
        Queue<String> customerQueue = new LinkedList<>(); // Using LinkedList implementation of Queue interface (common)
        // Queue<String> customerQueue = new ArrayDeque<>(); // ArrayDeque also implements Queue (often more efficient)

        // offer() / add(): Add element to the back (tail)
        // offer returns false on failure (e.g., capacity); add throws exception.
        System.out.println("Offering 'Alice', 'Bob', 'Charlie'");
        customerQueue.offer("Alice");   // Queue: [Alice] <- Front
        customerQueue.offer("Bob");     // Queue: [Alice, Bob]
        customerQueue.offer("Charlie"); // Queue: [Alice, Bob, Charlie] <- Back

        // peek() / element(): Look at the front element without removing
        // peek returns null if empty; element throws exception.
        System.out.println("Peek at front: " + customerQueue.peek()); // Output: Alice

        // poll() / remove(): Remove and return the element from the front (head)
        // poll returns null if empty; remove throws exception.
        System.out.println("Poll: " + customerQueue.poll()); // Removes and returns "Alice". Queue: [Bob, Charlie] <- Back
        System.out.println("Peek after poll: " + customerQueue.peek()); // Output: Bob
        System.out.println("Poll: " + customerQueue.poll()); // Removes "Bob". Queue: [Charlie] <- Back
        System.out.println("Poll: " + customerQueue.poll()); // Removes "Charlie". Queue: []

        // isEmpty(): Check if queue is empty
        System.out.println("Is queue empty? " + customerQueue.isEmpty()); // Output: true

        // Pitfall: Polling from empty queue
        System.out.println("Poll from empty queue: " + customerQueue.poll()); // Returns null (does not throw exception)
        // System.out.println(customerQueue.remove()); // Throws NoSuchElementException

        System.out.println();
    }


    // --- Topic 21: Linked Lists and Linked List Operations ---
    public static void demonstrateTopic21() {
        System.out.println("--- Topic 21: Linked Lists ---");

        // Linked List: Linear structure where elements (nodes) are linked via references (pointers).
        // Singly Linked List Node: Contains data and a 'next' reference.

        // --- Manual Node Manipulation (using static head/tail for simplicity) ---
        System.out.println("Manual Linked List Operations:");

        // Insertion at Head: O(1)
        System.out.println("Inserting at head: 10, 5");
        insertAtHead(10); // List: 10 -> null
        insertAtHead(5);  // List: 5 -> 10 -> null
        printLinkedList();

        // Insertion at Tail: O(1) if tail pointer maintained, O(n) otherwise.
        System.out.println("Inserting at tail: 20, 30");
        insertAtTail(20); // List: 5 -> 10 -> 20 -> null
        insertAtTail(30); // List: 5 -> 10 -> 20 -> 30 -> null
        printLinkedList();

        // Deletion by Value: O(n) to find the node.
        System.out.println("Deleting value 10:");
        deleteNode(10); // List: 5 -> 20 -> 30 -> null
        printLinkedList();

        System.out.println("Deleting value 5 (head):");
        deleteNode(5); // List: 20 -> 30 -> null
        printLinkedList();

        System.out.println("Deleting value 30 (tail):");
        deleteNode(30); // List: 20 -> null
        printLinkedList();

        System.out.println("Deleting value 99 (not found):");
        deleteNode(99); // List remains 20 -> null
        printLinkedList();

        // Search: O(n)
        System.out.println("Searching for 20: " + searchList(20)); // true
        System.out.println("Searching for 99: " + searchList(99)); // false


        // --- Using java.util.LinkedList ---
        // Provides Doubly-Linked List implementation with many convenient methods.
        System.out.println("\nUsing java.util.LinkedList:");
        LinkedList<String> namesList = new LinkedList<>();
        namesList.addFirst("Alice"); // O(1)
        namesList.addLast("Bob");   // O(1)
        namesList.add("Charlie"); // Adds to end (addLast) O(1)
        namesList.add(1, "Mallory"); // Insert at index 1: O(n) to find position
        System.out.println("LinkedList: " + namesList);

        namesList.removeFirst(); // O(1)
        namesList.removeLast();  // O(1)
        namesList.remove("Mallory"); // Remove by value: O(n) to find
        System.out.println("After removals: " + namesList);
        System.out.println("Get element at index 0: " + namesList.get(0)); // O(n) access

        // Benefits: Dynamic size, efficient insertion/deletion at ends.
        // Drawbacks: O(n) search/access by index, memory overhead for pointers.

        // Pitfall: NullPointerException when traversing/deleting if not careful about null checks.
        // Pitfall: Losing head reference if not updated correctly during head insertion/deletion.

        System.out.println();
    }

    // Helper methods for manual linked list operations (Topic 21)
    public static void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = linkedListHead; // New node points to the old head
        linkedListHead = newNode;     // Head reference updated to the new node
        if (linkedListTail == null) { // If list was empty, new node is also the tail
            linkedListTail = newNode;
        }
    }

    public static void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (linkedListHead == null) { // If list is empty, new node is head and tail
            linkedListHead = newNode;
            linkedListTail = newNode;
        } else {
            linkedListTail.next = newNode; // Old tail points to the new node
            linkedListTail = newNode;     // Tail reference updated to the new node
        }
    }

    public static void deleteNode(int key) {
        if (linkedListHead == null) return; // Empty list

        // Case 1: Delete head node
        if (linkedListHead.data == key) {
            linkedListHead = linkedListHead.next; // Move head pointer
            if (linkedListHead == null) { // If list became empty
                linkedListTail = null;
            }
            return;
        }

        // Case 2: Delete node other than head
        Node current = linkedListHead;
        // Traverse until current.next is the node to delete, or end of list
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        // If node was found (current.next is the target)
        if (current.next != null) {
            Node nodeToDelete = current.next;
            current.next = nodeToDelete.next; // Unlink the node
            if (nodeToDelete == linkedListTail) { // If tail was deleted
                 linkedListTail = current; // Update tail pointer
            }
        }
        // If key not found, loop finishes, nothing happens.
    }

    public static boolean searchList(int key) {
        Node current = linkedListHead;
        while (current != null) {
            if (current.data == key) {
                return true; // Found
            }
            current = current.next;
        }
        return false; // Not found
    }

    public static void printLinkedList() {
        System.out.print("  List: ");
        Node current = linkedListHead;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null" + (linkedListTail != null ? " (Tail: " + linkedListTail.data + ")" : " (Tail: null)"));
    }


    // --- Topic 22: Identify Equivalent Iterative and Recursive Algorithms ---
    public static void demonstrateTopic22() {
        System.out.println("--- Topic 22: Iterative vs Recursive Algorithms ---");

        // Many algorithms can be expressed both iteratively (using loops) and recursively (function calls itself).
        // They achieve the same result but via different control flow mechanisms.

        // Example 1: Factorial (n!)
        int nFactorial = 5;
        System.out.println("Factorial of " + nFactorial + ":");
        System.out.println("  Recursive: " + factorialRecursive(nFactorial));
        System.out.println("  Iterative: " + factorialIterative(nFactorial));

        // Example 2: Sum of array elements
        int[] arrayToSum = {1, 2, 3, 4, 5};
        System.out.println("\nSum of array " + Arrays.toString(arrayToSum) + ":");
        System.out.println("  Recursive: " + sumArrayRecursive(arrayToSum, arrayToSum.length));
        System.out.println("  Iterative: " + sumArrayIterative(arrayToSum));

        // Example 3: Fibonacci sequence (demonstrates efficiency difference)
        int nFib = 10; // Keep small for naive recursion
        System.out.println("\nFibonacci number F(" + nFib + "):");
        // System.out.println("  Recursive (Naive): " + fibonacciRecursiveNaive(nFib)); // Very slow for n > ~40 due to O(2^n)
        System.out.println("  Recursive (Memoized): " + fibonacciRecursiveMemoized(nFib, new long[nFib + 1])); // Efficient O(n)
        System.out.println("  Iterative: " + fibonacciIterative(nFib)); // Efficient O(n)

        // Key Differences:
        // - Recursion: Often more elegant/natural for problems defined recursively (trees, divide-and-conquer). Uses implicit call stack for state. Risk of StackOverflowError for deep recursion.
        // - Iteration: Uses explicit loops and variables for state. Generally more memory-efficient (no deep call stack). Can sometimes be harder to write/read for complex recursive structures.

        // Equivalence: Verify they produce the same output for the same input. Understand how the loop state maps to recursive call parameters/base cases.

        System.out.println();
    }

    // Factorial - Recursive
    public static long factorialRecursive(int n) {
        // Base Case: Stop condition for recursion
        if (n < 0) return -1; // Error case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive Step: Call itself with a smaller problem size (n-1)
        return n * factorialRecursive(n - 1);
    }

    // Factorial - Iterative
    public static long factorialIterative(int n) {
        if (n < 0) return -1; // Error case
        long result = 1;
        // Loop simulates the multiplication steps
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Sum Array - Recursive
    public static int sumArrayRecursive(int[] arr, int n) { // n is the number of elements to sum (from end)
        // Base Case: Empty array (or no elements left to sum)
        if (n <= 0) {
            return 0;
        }
        // Recursive Step: Sum the last element + sum of the rest
        return arr[n - 1] + sumArrayRecursive(arr, n - 1);
    }

    // Sum Array - Iterative
    public static int sumArrayIterative(int[] arr) {
        int sum = 0;
        // Loop iterates through all elements
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    // Fibonacci - Recursive (Naive, Exponential Time O(2^n))
    public static long fibonacciRecursiveNaive(int n) {
        if (n < 0) return -1;
        if (n <= 1) return n;
        return fibonacciRecursiveNaive(n - 1) + fibonacciRecursiveNaive(n - 2); // Recalculates same values many times
    }

    // Fibonacci - Recursive with Memoization (Dynamic Programming, Linear Time O(n))
    public static long fibonacciRecursiveMemoized(int n, long[] memo) {
        if (n < 0) return -1;
        if (n <= 1) return n;
        // Check if already computed
        if (memo[n] != 0) {
            return memo[n];
        }
        // Compute and store in memo table before returning
        memo[n] = fibonacciRecursiveMemoized(n - 1, memo) + fibonacciRecursiveMemoized(n - 2, memo);
        return memo[n];
    }


    // Fibonacci - Iterative (Linear Time O(n))
    public static long fibonacciIterative(int n) {
        if (n < 0) return -1;
        if (n <= 1) return n;
        long prev = 0; // F(0)
        long current = 1; // F(1)
        // Loop calculates F(i) based on F(i-1) and F(i-2)
        for (int i = 2; i <= n; i++) {
            long next = prev + current;
            prev = current;
            current = next;
        }
        return current; // Contains F(n)
    }


    // --- Topic 23: Functional Understanding of Quicksort and Merge Sort ---
    public static void demonstrateTopic23() {
        System.out.println("--- Topic 23: Quicksort and Merge Sort ---");

        // Both are efficient, divide-and-conquer sorting algorithms, typically O(n log n) average time.

        // --- Quicksort ---
        // - Idea: Pick a pivot, partition array around pivot (smaller left, larger right), recursively sort halves.
        // - In-place (typically): Modifies the original array directly (low memory overhead, O(log n) stack space avg).
        // - Average Time: O(n log n).
        // - Worst Time: O(n^2) - if pivots are consistently bad (e.g., already sorted array, pick first/last element). Random or median-of-three pivot selection helps mitigate this.
        // - Not Stable: Does not preserve relative order of equal elements.
        int[] arrayForQuickSort = {7, 2, 1, 6, 8, 5, 3, 4};
        System.out.println("Quicksort Demo:");
        System.out.println("  Original Array: " + Arrays.toString(arrayForQuickSort));
        quickSort(arrayForQuickSort, 0, arrayForQuickSort.length - 1); // Call the recursive quicksort
        System.out.println("  Sorted Array:   " + Arrays.toString(arrayForQuickSort));


        // --- Merge Sort ---
        // - Idea: Divide array into halves, recursively sort halves, merge sorted halves.
        // - Not In-place (typically): Requires auxiliary array (O(n) extra space) for merging.
        // - Time Complexity: O(n log n) - Guaranteed for all cases (worst, average, best).
        // - Stable: Preserves relative order of equal elements (if implemented carefully).
        // - Good for external sorting (data on disk) or linked lists.
        int[] arrayForMergeSort = {7, 2, 1, 6, 8, 5, 3, 4}; // Use a fresh copy
        System.out.println("\nMerge Sort Demo:");
        System.out.println("  Original Array: " + Arrays.toString(arrayForMergeSort));
        mergeSort(arrayForMergeSort, 0, arrayForMergeSort.length - 1); // Call the recursive merge sort
        System.out.println("  Sorted Array:   " + Arrays.toString(arrayForMergeSort));

        // Comparison Summary:
        // - Quicksort: Generally faster in practice (lower constant factors, better cache usage), in-place, but O(n^2) worst case and not stable.
        // - Merge Sort: Guaranteed O(n log n), stable, but requires O(n) extra space.

        // Java's Arrays.sort(): Uses tuned Quicksort (Dual-Pivot) for primitives, TimSort (Merge+Insertion hybrid, stable) for objects.

        System.out.println();
    }

    // Quicksort Implementation Helpers
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition logic for Quicksort (Lomuto scheme, using last element as pivot)
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        swap(arr, i + 1, high);

        return i + 1; // Return the partition index
    }

    // Helper to swap two elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    // Merge Sort Implementation Helpers
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = left + (right - left) / 2; // Avoids potential overflow for large left/right

            // Sort first and second halves recursively
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[left..middle]
    // Second subarray is arr[middle+1..right]
    private static void merge(int[] arr, int left, int middle, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays L[] and R[]
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, middle + 1, R, 0, n2);

        // Merge the temp arrays back into arr[left..right]
        int i = 0, j = 0; // Initial indexes of first and second subarrays
        int k = left; // Initial index of merged subarray array

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { // Use <= to maintain stability
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    // --- Topic 24: Functional Understanding of Binary Search Algorithm ---
    public static void demonstrateTopic24() {
        System.out.println("--- Topic 24: Binary Search ---");

        // Efficient algorithm to find an element in a *sorted* array. O(log n) time.
        // Precondition: Array MUST be sorted.

        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int targetFound = 23;
        int targetNotFound = 40;

        System.out.println("Searching in sorted array: " + Arrays.toString(sortedArray));

        // How it works:
        // 1. Look at the middle element.
        // 2. If it's the target, done.
        // 3. If target is smaller, repeat search in the left half.
        // 4. If target is larger, repeat search in the right half.
        // 5. Stop when found or the search range is empty.

        // Iterative Binary Search
        int indexFound = binarySearchIterative(sortedArray, targetFound);
        System.out.println("Iterative search for " + targetFound + ": Found at index " + indexFound); // Output: 5

        int indexNotFound = binarySearchIterative(sortedArray, targetNotFound);
        System.out.println("Iterative search for " + targetNotFound + ": Found at index " + indexNotFound); // Output: -1 (or negative insertion point)

        // Using Java's built-in binary search
        int builtinIndexFound = Arrays.binarySearch(sortedArray, targetFound);
        System.out.println("Arrays.binarySearch for " + targetFound + ": Found at index " + builtinIndexFound); // Output: 5

        int builtinIndexNotFound = Arrays.binarySearch(sortedArray, targetNotFound);
        // If not found, returns -(insertion point) - 1.
        // Insertion point for 40 is 7 (between 38 and 56). -(7) - 1 = -8.
        System.out.println("Arrays.binarySearch for " + targetNotFound + ": Returns " + builtinIndexNotFound + " (indicates not found, insertion point calculation)");

        // Pitfalls:
        // - Forgetting to sort the array first. Binary search gives incorrect results on unsorted data.
        // - Off-by-one errors in low/high updates or loop condition (e.g., low <= high vs low < high).
        // - Integer overflow in mid calculation for extremely large arrays (use `mid = low + (high - low) / 2`).

        System.out.println();
    }

    // Iterative Binary Search Implementation
    public static int binarySearchIterative(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) { // Loop while the search range is valid
            int mid = low + (high - low) / 2; // Calculate middle index safely
            System.out.println("  Searching: low=" + low + ", high=" + high + ", mid=" + mid + ", arr[mid]=" + arr[mid]);

            if (arr[mid] == target) {
                System.out.println("    Found target!");
                return mid; // Target found at index mid
            } else if (arr[mid] < target) {
                System.out.println("    Target is larger, search right half.");
                low = mid + 1; // Target must be in the right half
            } else { // arr[mid] > target
                System.out.println("    Target is smaller, search left half.");
                high = mid - 1; // Target must be in the left half
            }
        }

        System.out.println("  Target not found (low > high).");
        return -1; // Target not found in the array
        // Alternatively, could return -(low) - 1 based on Java's convention
    }


    // --- Topic 25: Binary Trees vs Binary Search Trees (BST) and Tracing Code ---
    public static void demonstrateTopic25() {
        System.out.println("--- Topic 25: Binary Trees (BT) vs Binary Search Trees (BST) ---");

        // Binary Tree (BT): Each node has at most two children (left, right). No ordering constraint.
        // Binary Search Tree (BST): A BT with an ordering property:
        //   - All values in left subtree < node's value.
        //   - All values in right subtree > node's value.
        //   - Allows efficient search/insert/delete (O(log n) average if balanced, O(n) worst if skewed).

        // Building a BST using insert method (see helper below)
        treeRoot = null; // Start with an empty tree
        System.out.println("Building BST by inserting: 8, 3, 10, 1, 6, 14, 4, 7, 13");
        int[] valuesToInsert = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        for (int val : valuesToInsert) {
            treeRoot = insertBST(treeRoot, val);
        }

        // Visual representation of the created BST:
        //         8
        //       /   \
        //      3     10
        //     / \      \
        //    1   6      14
        //       / \    /
        //      4   7  13

        System.out.println("\nTree Traversals (demonstrates structure/order):");
        // Inorder Traversal (Left, Node, Right) - yields sorted order for BST
        System.out.print("  Inorder (sorted for BST): ");
        inorderTraversal(treeRoot);
        System.out.println();

        // Preorder Traversal (Node, Left, Right) - useful for copying
        System.out.print("  Preorder: ");
        preorderTraversal(treeRoot);
        System.out.println();

        // Postorder Traversal (Left, Right, Node) - useful for deleting
        System.out.print("  Postorder: ");
        postorderTraversal(treeRoot);
        System.out.println();

        // Searching in BST (efficient due to ordering property)
        int searchKeyFound = 6;
        int searchKeyNotFound = 5;
        System.out.println("\nSearching in BST:");
        System.out.println("  Search for " + searchKeyFound + ": " + searchBST(treeRoot, searchKeyFound)); // true
        System.out.println("  Search for " + searchKeyNotFound + ": " + searchBST(treeRoot, searchKeyNotFound)); // false

        // Key Differences BT vs BST:
        // - Ordering: BST has it, BT doesn't.
        // - Operations: Search/Insert/Delete are optimized for BSTs (logarithmic avg). Generic BT requires full traversal (linear).
        // - Inorder Traversal: Sorted for BST, not necessarily for general BT.

        // Tracing code with trees involves following recursive calls down left/right branches based on comparisons (for BST) or structure (for BT).

        // Pitfalls:
        // - Assuming any BT is a BST.
        // - Incorrect implementation of insert/delete/search violating BST property.
        // - Null pointer exceptions when traversing branches that don't exist.
        // - Unbalanced BSTs degrading performance to O(n).

        System.out.println();
    }

    // --- Helper methods for BST Operations (Topic 25) ---

    // Recursive BST Insertion
    public static TreeNode insertBST(TreeNode root, int value) {
        // Base case: If the tree/subtree is empty, create new node here
        if (root == null) {
            // System.out.println("    Inserting " + value + " as new node."); // Trace insert location
            return new TreeNode(value);
        }

        // Recursive step: Decide whether to go left or right
        if (value < root.value) {
            // System.out.println("    Value " + value + " < " + root.value + ", going left."); // Trace path
            root.left = insertBST(root.left, value); // Insert in the left subtree
        } else if (value > root.value) {
            // System.out.println("    Value " + value + " > " + root.value + ", going right."); // Trace path
            root.right = insertBST(root.right, value); // Insert in the right subtree
        } else {
            // Value already exists - handle duplicates if necessary (e.g., ignore, store count)
             // System.out.println("    Value " + value + " already exists, ignoring."); // Trace duplicate
        }

        return root; // Return the (potentially updated) root of the subtree
    }

    // Recursive BST Search
    public static boolean searchBST(TreeNode root, int key) {
        // Base case 1: Reached empty spot, key not found
        if (root == null) {
            // System.out.println("    Search reached null, key " + key + " not found."); // Trace end
            return false;
        }
        // Base case 2: Key found at current node
        if (root.value == key) {
            // System.out.println("    Found key " + key + " at node " + root.value); // Trace found
            return true;
        }

        // Recursive step: Decide left or right
        if (key < root.value) {
            // System.out.println("    Search key " + key + " < " + root.value + ", searching left."); // Trace path
            return searchBST(root.left, key);
        } else { // key > root.value
            // System.out.println("    Search key " + key + " > " + root.value + ", searching right."); // Trace path
            return searchBST(root.right, key);
        }
    }

    // Inorder Traversal (Left, Node, Right)
    public static void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);     // Visit left subtree
        System.out.print(node.value + " "); // Visit node
        inorderTraversal(node.right);    // Visit right subtree
    }

    // Preorder Traversal (Node, Left, Right)
    public static void preorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " "); // Visit node
        preorderTraversal(node.left);    // Visit left subtree
        preorderTraversal(node.right);   // Visit right subtree
    }

    // Postorder Traversal (Left, Right, Node)
    public static void postorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left);   // Visit left subtree
        postorderTraversal(node.right);  // Visit right subtree
        System.out.print(node.value + " "); // Visit node
    }

} // End of Main class
