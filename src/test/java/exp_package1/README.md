# exp_package1 Documentation

## Overview
This package contains Java classes demonstrating object creation and string representation.

## Classes

### cons
A simple data class that holds information about a named result with a percentage.

**Fields:**
- `String name` - Name identifier
- `Boolean result` - Boolean result flag
- `int percentage` - Percentage value (default: 0)

**Constructor:**
```java
cons(String name, Boolean result)
```
Initializes a cons object with the given name and result. Percentage is initialized to 0.

**Methods:**
- `toString()` - Returns a formatted string representation of the object

**Example Usage:**
```java
cons cons1 = new cons("Test", true);
System.out.println(cons1); // Output: cons{name='Test', result=true, percentage=0}
```

---

### practice1
Main class that demonstrates the usage of the cons class.

**Purpose:**
Creates instances of the cons class and prints their string representation to verify proper object initialization and display.

**Main Method:**
- Creates two cons objects with sample data
- Prints the first object to demonstrate toString() output

**Output:**
```
cons{name='Test', result=true, percentage=0}
```

---

## Key Features
✅ Proper constructor initialization of all fields  
✅ Override toString() for meaningful object representation  
✅ Demonstrates object creation and usage in main method

## Notes
- The unused import `javax.xml.namespace.QName` can be removed if not needed
- Consider making fields private and adding getters/setters for better encapsulation
- Class name `cons` should follow Java naming conventions (PascalCase): `Cons`
