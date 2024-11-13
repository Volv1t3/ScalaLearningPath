
<h1 style=" color: cornflowerblue; text-align: center; font-family: 'Consolas', sans-serif;">
 Scala Studies | Conditionals, Loops, Ranges, Try/Catch Statements,  | eVolvLabs | Santiago Arellano
</h1>


***
<ul style="font-family: 'Consolas', sans-serif;">
<code >Main Information Section</code>
<li><b style="color: cornflowerblue; font-weight: bold">Date:</b>:  November 12, 2024</li>
<li><b style="color: cornflowerblue; font-weight: bold">Unit</b>:  Scala Programming Language</li>
<li><b style="color: cornflowerblue; font-weight: bold">Description</b>: This file pertains the following contents: <code><b>Conditional Statements,
Control Structures, Range Statements, Try/Catch Blocks, Pattern Matching</b></code>.</li>
</ul>

***
<br>
<h3 style=" color: cornflowerblue; text-align: center; font-family: 'Consolas', sans-serif;">
"Conditional Statements", "", 
</h3>
<ul style="font-family: Consolas, sans-serif">
<li><code style="color: cornflowerblue; font-weight: bold">"Introduction"</code>:In Scala, unlike java there are various changes both to syntax, declarations and types
of control structures, loops, ranging, and even switch statements. Those features we took for granted, like those symple do-while
loops, or those simple switch statements have been replaced with, nothing for do-while loops, and match statements for 
switch java-like statements. In this section of our study session we will study these structures and the way the new <code>end (statement)
syntax</code> helps us in writing clearer, simpler code.
<br><br>
<p>Most of the code presented here will include some snippets for examples, however there will be an example application which will 
work with user console input and display different shapes using the console output (think of these as the basic C++ examples 
that are used to teach for-loops but in Scala)</p></li>
<!--! A comment to Separate them all -->
<li><code style="color: cornflowerblue; font-weight: bold">"Conditional Statements"</code>:
<p>In Scala, just like in any other programming language, thankfully, we have the same type of conditionals that we used to have before. That is,
our conditionals start with the keyword if and they are following by either if-else, if-elif or if-elif-else statements. In this sense, then
our coding abilities for this section have not changed at all, however, the syntax that these expressions use has.
<br><br>
In terms of expressions, these have now been adapted to use the <code>Optional Brackets</code> syntax that says that we can basically write either
python-esque code, or java-esque code depending on how we are feeling that day!
<br><br>
Moreover, given that we also have the new <code>end statement</code>syntax we can mix and match our syntax to make it an amazing and simple programming experience.
</p>
<blockquote style="font-style: italic; color: whitesmoke"> <q>Scala Programming Language: If Statements as Expressions</q> 
<p>In Scala, if expressions are statements, meaning they can return a value and therefore can be assigned to variables, this could be 
a good tool in the case we need to handle logic as ternary conditional operations.</p>
</blockquote>
<blockquote style="font-style: italic; color: whitesmoke"> <q>Scala Programming Language: Conditionals With Their Types</q> 
<ul>
<code>Simple If Statements</code>
<li><b style="color: cornflowerblue; font-weight: bold">If Statements</b>: 
<p>The simplest of the methods that are used here to check a single condition and execute some business logic</p>
<body>

```scala 3
package Main;

class Main {

  def main(args: Array[String]): Unit = {

    //! Declaring a single variable to hold the result of a single if statement
    var resultHolder: Boolean = false;

    //! Using the 2.0 syntax with brackets and parenthesis
    if (20 > 5) {
      resultHolder = true;
    }

    //! Using the 3.0 syntax without brackets to analyze a complex example
    val numbers: List[Int] = (0 to 6).toList
    numbers.foreach(n => {
      if (n % 2) == 0 then
        println(s"$n is even")
      else if (n % 3) == 0 then
        println(s"$n is div by three")
      else
        println("Nothing here")
    })

    //! Using the 3.0 syntax without brackets and with the end keyword
    numbers.foreach(n => {
      if (n % 2) == 0 then
        println("Number % 2 == 0")
      else if (n % 3 == 0) then
        println("Number %3 == 0")
      end if
    })

    //! Modyfing resultHolder using an if expresion
    resultHolder = if 20 > 5 then true else false
    println(resultHolder)
    
  }
}

```
</body>
<p>While I was writing this little snippet, I got yelled at a couple of times by the compiler. First, these options that we are using
in terms of keywords, i.e., <code>then and end</code> are features only available to scala 3, so we have to set things up correctly. Also, 
it is generally not allowed (deprecated behavior) to do <code>"string" + variable</code> like we would do in Java, instead it is advisable to use
string interpolation which kind of works like those R strings in java where you could reference variables to be placed in certain reas of it.
<br><br>
Generally, we can use these statements like plain old java statements and worry less about new keywords (for compatibility it might be best),
but we could also just use the new style which approaches simpler languages like Python. On the other hand, I can see that now instead of 
writing a ternary operator, we can simply write <code>if (condition) then (result if true) else (result if false)</code>, something which 
in all fairness is much easier to understand from the developer's perspective than trying to comprehend a ternary operator and its symbols, 
not to mention that concatenation of expressions in this way would also show promises of working easily.</p>
</li>
</ul>
<p>As can be noted in the code before, these statements are not complicated at all, they are basically just adjusted syntactically
to fit their mixture of java and python rules. The real changes begin in terms of for comprehensions</p>
</blockquote>
</li>
<li><code style="color: cornflowerblue; font-weight: bold">"Control Structures"</code>:
<p>Most of the time, whether it is for a printing, mathematical operation, control variable, or even just inside an algorithm we have to develop,
we will inevitably have to use some sense of for loops, while loops, and even mixtures of these to get the job done. For this reason, 
we have to study the first control structure and the most basic one, for loops, commonly known as <code>for comprehensions in Scala</code></p>
<blockquote style="font-style: italic; color: whitesmoke"> <q>Scala Programming: Why For Comprehensions?</q> 
<p>For comprehensions, and their friends in Python, lists comprehensions are ways for us define a set or other collection
by simply listing the members explicit or by specifying the properties that all members satisfy. In general, this means that
our for loops do not have the same <code>for(variable; condition; update)</code> syntax that we are used to, rather these have a 
much in depth and complicated syntax that uses two different sections <code>for and do sections</code>, where in the 
for section we declare the variables that are to be used, and on the do the operations. For now, do not worry about the way
these variables are updated internally, as ranges are also a topic of study for this markdown</p>
</blockquote>
<p>In general, then, what we have is a pair of statements that work in two sections, first defining internal variables, and then do.
I have created the following test file for us to practice these declarations</p>
<body>

```scala 3
package main;

import java.lang.String as jString
import java.util.LinkedList as jLinkedList

class main {

  def main(args: Array[String]): Unit = {

    //! Declaring a simple for loop
    /*
     * This loop makes the program print firs the pair of values for i,j and then prints the message if they are equal as well 
     * as all the possible values for the multiplication of both values 
     */
    for {
      i <- 0 to 10 //[0,10] (range is inclusive)
      j <- 0 to(i, 1)
    }
    do {
      println(s"$i, $j")
      if (i == j) then println(s"i is equal to j [$i == $j]")
      else
        println(i * j)
    }

    //! Declaring a complex nested for loop method
    for
      i <- 1 until 10
    do
      if (i > 1) then
        for
          j <- i to 5
        do
          print(j + i)
      else
        print(i)
  }

  //! Replicating the concept of forEach loops in Java
  var linkedList: jLinkedList[jString] = new jLinkedList[jString]()
  linkedList.addAll(java.util.List.of("Hello","World","Of","Scala"))
  for(element <- linkedList) do {
    println(element)
  }
}
```
</body>
</li>
</ul>