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

### GradeCalculator.java
Averages a set of test scores and gives a letter grade.

**What it does**
- Asks how many scores to enter, re-asking until it's at least 1
- Collects each score, re-asking if it isn't between 0 and 100
- Averages the scores and prints the letter grade (A = 90+, B = 80+, C = 70+, D = 60+, F = below 60)

**How to run it** (Java 11 or newer)
```
java GradeCalculator.java
```

**Example**
```
How many scores? 0
Must be one or more scores. How many scores? 3
Enter score 1: -5
Score must be 0-100. Enter a new score 1: 90
Enter score 2: 150
Score must be 0-100. Enter a new score 2: 80
Enter score 3: 70
Your student's average grade across 3 scores is: 80%
Your student's grade is: B
```

**What I learned**
- Counting with a `for` loop, and avoiding off-by-one errors
- Keeping a running total with `+=`
- Nesting a `while` loop inside a `for` loop to validate each input
- Combining conditions with `||`
- Choosing a letter grade with an `if / else if` chain
