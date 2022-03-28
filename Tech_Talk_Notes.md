{% include navigation.html %}
## Week 2 Tech Talk

## Key Learnings
- Learned detailed information regarding reverse polish notation
>- Understood how the algorithm worked
>- Vizualised the actual RPN through the live demonstration
- Tokenizers was another key takeaway
>- Used an automated method with PBL
>- Now understood how to implement it individually, check for spaces and appending to array list accordingly

## Calculator Theory
- In mathematics, an expression or mathematical expression is a finite combination of symbols that is well-formed according to rules that depend on the context.
- In computers, expression can be hard to calculate with precedence rules. 
- In computer math we often convert strings into Reverse Polish Notation (RPN, 3 + 4 becomes 3 4 +) using the Shunting-yard algorithm. Review Wikipedia diagram and the code and you will see the need for a Stack.
- RPN History:
>- Was originally used in around the 1950s as a way of calculating
>- Most optimal way for mathmaticians to calculate at the time
>- Nowadays we use a much easier, readable method of calculating with calculators
## Key Calculator Aspects
- Calculator needs a driver that can consider multiple conditions
- Mort example of ideal driver:
```  Calculator simpleMath = new Calculator("100 + 200  * 3");
 System.out.println("Simple Math\n" + simpleMath);

 Calculator parenthesisMath = new Calculator("(100 + 200)  * 3");
 System.out.println("Parenthesis Math\n" + parenthesisMath);

 Calculator allMath = new Calculator("200 % 300 + 5 + 300 / 200 + 1 * 100");
 System.out.println("All Math\n" + allMath);

 Calculator allMath2 = new Calculator("200 % (300 + 5 + 300) / 200 + 1 * 100");
 System.out.println("All Math2\n" + allMath2);
```
- Since you are creating calculator from scratch, operators also need to be defined
```     private final Map<String, Integer> OPERATORS = new HashMap<>();
    {
        // Map<"token", precedence>
        OPERATORS.put("*", 3);
        OPERATORS.put("/", 3);
        OPERATORS.put("%", 3);
        OPERATORS.put("+", 4);
        OPERATORS.put("-", 4);
    }
```
- Tokenizer acts as a "split" and converts list into individual elements
``` private void termTokenizer() {
        // contains final list of tokens
        this.tokens = new ArrayList<>();

        int start = 0;  // term split starting index
        StringBuilder multiCharTerm = new StringBuilder();    // term holder
        for (int i = 0; i < this.expression.length(); i++) {
            Character c = this.expression.charAt(i);
            if ( isOperator(c.toString() ) || isSeperator(c.toString())  ) {
                // 1st check for working term and add if it exists
                if (multiCharTerm.length() > 0) {
                    tokens.add(this.expression.substring(start, i));
                }
                // Add operator or parenthesis term to list
                if (c != ' ') {
                    tokens.add(c.toString());
                }
                // Get ready for next term
                start = i + 1;
                multiCharTerm = new StringBuilder();
            } else {
                // multi character terms: numbers, functions, perhaps non-supported elements
                // Add next character to working term
                multiCharTerm.append(c);
            }

        }
        // Add last term
        if (multiCharTerm.length() > 0) {
            tokens.add(this.expression.substring(start));```

## Week 1 Tech Talk 

## Linked Lists

- As stated, most "Data Structures" conversations usually begin with Arrays
>- Is built into most Computer Programming Languages 
- College Board has Units 6-8 which discuss Arrays, ArrayLists, and 2-Dimensional Arrays
- Most Data Structures conversations continue with the discussions of Linked Lists which are the foundation for Stacks and Queues

## Generic T
- Generic type, can include both strings and integers
- Used for when you don't want to be limited to soley strings or integers
>- As opposed to declaring an array list for Strings and Integers individually, you can use the same class to make both integer and string lists
## Queue Add and Delete
- Adding and deleting in queues can be done with .pull() and .add()
>- Built in version, but alternatives can also be used to achieve same result

## Week 0 Tech Talk

## Data Structures

- A data structure is a method of organizing data
- Think of a variable holding a single integer value(ex: int n=4;) or sequences of numbers(ex: int[] numbers=new int[]{ 1,2,3 };) or tables of data, or databases: these are all well-defined data structures. 
- Data Structures and organizing data will require students to become more algorithmic in coding.

## Data Structure Algorithms
- There are many algorithms for different purposes and they interact with different data structures. 
- Think of algorithms as dynamic underlying pieces that interact with data structures. 
- EX:
```
public void swapToLowHighOrder(IntByReference i) {
        if (this.value > i.value) {
            int temp = this.value;
            this.value = i.value;
            i.value = temp;
        }
    }
```
- Together, data structures and algorithms combine and allow programmers to build whatever computer programs they’d like. 
- Good managed data structures and algorithms ensures well-optimized and efficient code.
## Paradigms
#### Imperative Paradigms
- An imperative program consists of commands for the computer to perform to achieve a result. Imperative programming focuses on describing "how" a program code works.
#### OO Paradigm
- OOP models complex things as reproducible, simple structures. 
- Reusable, OOP classes can be used across programs by simply making an object. 
- We have learned about many key aspects of OOP.
- OO based matrix alteration
```
public String reverse() {
        // outer loop starting at end row
        StringBuilder output = new StringBuilder();
        for (int i = matrix.length;  0 < i; i--) {
            // inner loop for column
            for (int j =  matrix[i-1].length; 0 < j; j--) {
                output.append((matrix[i-1][j-1]==-1) ? " " : String.format("%x",matrix[i-1][j-1])).append(" ");
            }
            output.append("\n"); // new line
        }
        return output.toString();
    }
```
