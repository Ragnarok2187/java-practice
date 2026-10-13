# java-practice

Beginner Java programs I'm writing to practice the fundamentals.

## Projects

### ReceiptGenerator.java
A command-line tip and bill-splitting calculator.

**What it does**
- Asks for the bill total, the number of people splitting it, and the tip percentage
- Keeps asking until the number of people is at least 1
- Prints the tip amount, the total with tip, and how much each person owes

**How to run it** (Java 11 or newer)
```
java ReceiptGenerator.java
```

**Example**
```
What is the bill total? 60
How many people are splitting the bill? 0
How many people are splitting the bill? 3
What percent do you want to tip? 20
Tip amount:   $12.00
Total amount: $72.00
Each person owes: $24.00
```

**What I learned**
- Reading user input with `Scanner`
- Working with `double` and `int`, and why dividing by `100.0` instead of `100` matters
- Formatting money with `printf` and `%.2f`
- Validating input with a `while` loop
- Variable scope, and ordering a program as validate, calculate, then print
