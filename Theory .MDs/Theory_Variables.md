<br>
<h1 style=" color: cornflowerblue; text-align: center; font-family: 'Consolas', sans-serif;">
Scala Studies | Variables, Types, Initializers and Access Mofidiers | eVolvLabs | Santiago Arellano
</h1>


***
<ul style="font-family: 'Consolas', sans-serif;">
<code >Main Information Section</code>
<li><b style="color: cornflowerblue; font-weight: bold">Date:</b>: November 6th, 2024.</li>
<li><b style="color: cornflowerblue; font-weight: bold">Study Topic</b>: Scala Programming Language</li>
<li><b style="color: cornflowerblue; font-weight: bold">Description</b>: This file pertains the following contents: <code><b>
Variable Declaration, Types, Access Modifiers, Initializers</b></code>.</li>
</ul>

***
<br>
<h3 style=" color: cornflowerblue; text-align: center; font-family: 'Consolas', sans-serif;">
"Variables in Scala", "Types in Scala", "Access 
</h3>
<ul style="font-family: Consolas, sans-serif">
<li><code style="color: cornflowerblue; font-weight: bold">"Variables in Scala"</code>:
<p>One of the most important aspects of scala is the way in which we declare variables. In this sense, we have to make
a note that its declaration style changes drastically from langauges like Java or C++ that I have studied earlier, rather
it follows a syntax that is similar to those of JavaScript or TypeScript. This means, then, that there are mainly two ways
to declare a variable in Scala, either final-esque or mutable.</p>
<blockquote style="font-style: italic; color: whitesmoke"> <Q>Scala Programming: Variable Declaration</q> 
<p>The first type of variable that we can declare is a <b><code>effectively final, immutable variable</code></b>, to do this we use
the keyword <code>val</code>. We can think of this as declaring a value in our code, a value could be thought as a registry
that should not change in our code (useful for constants).</p>
<br><br>
<p>On the other hand, there are variable declarations for those values that should be mutable in our code, for example this
coudl be variables within conditionals or general use counter, etc., for these we have a <b><code>non final, mutable variables</code></b>
that can be declared through the keyword <code>var</code>. This is similar to the way TypeScript works by having let and var keywords, where
let forces variables to be immutable, and var does not.</p>
<body>
<code>Example of Variable Declarations in an actual code snippet</code>

```scala
package Main;
//! Everything in Scala must be declared underneath a class, just like Java, only that now we have two more keywords for
//! this: Object, Trait, and Class
class Main {
  //! To declare both the main and other methods we use the def keyword, similar to python
  final val  /*! Declaration similar to a Let in JS*/ temperatureConstantKelvin: Integer = 275;
  def main(args: Array[String]): Unit = {
    var /*! Similar declaration to a var in JS*/ temperatureInCelsius: Integer = 15; //! Any "var" variable has to 
    //! be initialized at declaration, independently of change.
    System.out.println("Converted Temperature = " + conversionToKelvin(temperatureInCelsius).toString );
  }
  
  private def conversionToKelvin(celcius: Integer): Integer = {
    var doSomethingElse: Integer = celcius + 25000;
    celcius + this.temperatureConstantKelvin; 
  }
}
```
</body>
<p>In the previous block of code we can see three different things which I thought would be goot know about Scala quickly.<br>
We should talk about each of them in addition to the variable declaration style</p>
<ul style="list-style-type: -moz-japanese-formal;">
<li><b style="color: cornflowerblue; font-weight: bold">Declaring Constant Immutable Fields</b>: Inside our snippet, we declared 
a singular value that follows this rule in the form of our <code>temperatureConstantKelvin variable</code>, this factor, while 
I don't think completely accurate, severed to show two things. <code>(1) we can declare variables like this constant in our 
class file with a final keyword making its non-mutability aspect more explicit, and (2) we can either declare the type or not
and the variables will still work (kind of like python)</code></li>
<li><b style="color: cornflowerblue; font-weight: bold">Mutable Declaration</b>: Anywhere else that we used a variable, like 
for our calculations and our function calls we used different mutable variables either for storage or value passing.</li>
<li><b style="color: cornflowerblue; font-weight: bold">File Declarations && Methods</b>: In Scala, in contrast with Java
we have three different keywords designed to allow us to create code snippets or files, these are <code>trait, object, 
and class</code>, these are keywords that mus tbe followed by the name of the class, usually the same name of the file, 
and inside it our methods can go. Of course, we can also create different classes.
<br><br>
<p>Despite this, however, like in Java, the only main method that will be called is the one inside the main-file-class. Anywhere
else you can redeclare a main, but it will not be runnable directly through the IDE.Aside from this, we can note the way in which 
methods are declared within classes or regular methods</p>
<body>

```text
[Access Modifier: {protected|private|}|Implicitly public by default] def [Method Name][Argument List: {keyword: type...}] : [Return Type: [Type]| Unit] = {
   [Method Body]
}
```
</body>
<p>
One interesting fact about scala is the way that it defines everything as public by default (it doesn't even have public as a keyword!), and 
hence forces the programmer to think more about what should be private and protected and less about boilerplate code like that. Moreover
 it is interesting to note the need to have the keyword <code>def</code> to signify a method declaration. It gradually approaches python's
syntax, as for method names and argument lists these look exactly like those in TypeScript, however it is interesting to note that we use 
<code> : return type</code> to define a return type for our methods. Lastly the <code>= </code> shows the programmer (and most likely compiler too)
where the code for the method body starts.</p>
</li>
<li><b style="color: cornflowerblue; font-weight: bold">Implicit Return Statements</b>: As far as I have seen through my 
work in this code and others, there seems to be a rule of implicit return added onto the last line of any method, seeing as 
it suggested I removed the <q>unnecessary</q> return statement used in my code. While this is useful for single line methods 
or those where the return happens exactly in the end, it might be cumbersome later with complex methods.</li>
</ul>
</blockquote>
<p>It is important to note however, that like in Java, <b>Scala tries to maintain every object being a reference to a heap-allocated
object rather than stack variables like in C++</b>, this then forces programmers to think that most references internally cannot be changed
for those variables that are declared as <code>val</code>, for example. This can be better seen in terms of heap-arrays, where
memory values of distinct values in the array can be changed, but the reference <b>any val variable holds to the array</b>, cannot 
be changed.</p>
</li>
<!--! A comment to Separate them all -->
<li><code style="color: cornflowerblue; font-weight: bold">"Types in Scala"</code>:
<br>
<p>Here is a little note about primitives in Scala</p>
<blockquote style="font-style: italic; color: whitesmoke"> <q>Scala Programming: Thinking About Primitives</q> 
<br>
<p style="font-style: normal">In Scala, in contrast to Java, there are no distinctions between reference types (like those we 
usually handled in Java (String, Integer, BigInteger ...), and primitive types (like int, double, float, char). Instead, <b><code>Scala
consistently tries to be more object-oriented, such that all of the primitive types are considered classes with their methods.</code></b></p>
</blockquote>
<p>Another thing to note is the existence of reference types and value types, which we will discuss now</p>
<blockquote style="font-style: italic; color: whitesmoke"> <q>Scala Programming: Reference Types And Value Types</q> 
<p>In Scala, the root of the inheritance tree is defined to be <code>Any</code>, this interface is 
then expanded upon by two distinct sub-interfaces known as <code>AnyVal and AnyRef</code>, from where the entierty of the 
types that we can create and that come as part of the Scala programming language expand. It is through this lense that 
we should see how Scala differs in terms of implementation and executions for variable types</p>
<ul>
<li><b style="color: cornflowerblue; font-weight: bold">Reference Types</b>: 
<p>
Reference types are those that are subtypes of <code>AnyRef</code>, this means that in general these values
are all those <b>that are not stored in the stack or on CPU registers</b>. Of course, his means taht we lose a certain
edge in performance when compared to other stack-based variables.
<br><br>
When we're working with these variables, we can still use the <code>new </code>keyword to declare them, 
and also drop the parenthesis for those calls to no-args constructors (I will not do this because I am used
to passing the parentheses).
<br><br>
In general, we often like to use factory methods to create these kinds of reference values (this is a 
design pattern implementation by default in Scala).
</p>
<body>
<code>Example of Reference Types</code>

```scala
package Main;

import java.util.ArrayList;
import java.util.List;
class Main {

  def main(args: Array[String]): Unit = {
    //! Declaring a Reference type 
    var collection: java.util.ArrayList[Integer] = new java.util.ArrayList[Integer](10)
    collection.addAll(List.of(1,2,3,4));
    println(collection.get(1));
    
  }
}
```
</body>
<p>An intresting detail about the previous code is that <b>all Java classes can be thought as reference types
in terms of Scala programming, therefore all of our classes and imported ones could be considered reference types</b></p>
</li>
<li><b style="color: cornflowerblue; font-weight: bold">Value Types</b>: 
<p>Value types are those that extend from <code>AnyVal</code> the second and last specifications of the <code>Any</code>
keyword in Scala. The idea of AnyVal variables is that these are internal representations of what the JVM would consider primitive
values. Therefore, the JVM classics of <code>short, int, long, float, double, boolean, char, byte, and void</code>, are
in Scala converted to <code>Short, Int, Long, Float, Double, Boolean, Char, Byte, and Unit</code>.
<br><br>
It becomes worthwhile then, mentioning that the Unit keyword we have been so openly using before, was actually
the way we defined a void statement in Scala, then in contrast to Java, we do not have the Void wrapper for
the keyword void, simply the Unit value type.
</p>
<br><br>
<p>"Instances" of these classes are not, however, <b>created on the heap</b>, rather these are stored in memory (either
stack or Registers) once converted to JVM primitive values.<br>This then allows for Scala to remove the need to boxing variables
from primitive to reference, and the unboxing needed in Java. Rather it abstracts away this layer of complexity
and gives us the best of the performing primitives whilst removing the boxing semantics.</p>
<body>
<code>Example of Value Types</code>

```scala
package Main;
import java.lang.Boolean;
class Main{
  def main(args: Array[String]): Unit = {
    //! Declaring a simple set of variables for testing
    var integerAmount: Int  = 12l
    var shortAmount: Short = 14
    var byteAmount: Byte = 1011
    var charAmount: Char = 'c'
    var floatAmount: Float  = 1.235
    var doubleAmount: Double  = 12.45
    var booleanAmount: scala.Boolean = Boolean.TRUE //! Implicit castings
  }
}
```
</body>
<p>It is interesting to note that we now have a way to effectively mix and match variables
from Scala with those from the JVM given that they work, under the hood, with the same primitives just without the 
boxing that we are used to.</p>
</li>
</ul>
</blockquote>
</li>
<li><code style="color: cornflowerblue; font-weight: bold">"Access Modifiers"</code>:
<p>In terms of access modifiers it appears clear now that there is no keyword reserved for <code>public</code>, rather it 
appears that every class, method, or variable is assumed to be public unless specified with another keyword like
<code>protected or private</code>.
<br><br>
Moreover, you can restrict access to methods, variables, classes, or traits, by defining stricter protected or private
access modifiers. Specifically, you can do this by defining them as <code>private[scope] or protected[scope]</code>, this 
way of declaring access modifiers is shown in further detail in the following piece of code.
</p>
<body>
<code>Access Modifiers</code>

```scala
package Main;

/*! Assumed to be public*/
class Main{
  /*! Assume dto be public*/
  def main(args: Array[String]): Unit = {
    System.out.println("Hello World from a public Main.main() call")
    this.protectedMethod()
    System.out.println("Private privateMethod() call returned = " + this.privateMethod())
    //! This is how you use a static inner class
    var innerObjectContent: String = innerClass.getClassName()
    System.out.println("Inner Class name = " + innerObjectContent)
  }
  //! This is the way we declare a protected method
  protected def protectedMethod(): Unit = {
    System.out.println("Hello from protected Main.protectedMethod() call")
  }
  //! This is teh way we declare a private method
  private def privateMethod(): Integer = {
    return 14
  }
  //! This is the way we declare a package-private method
  private[Main] def packagePrivateMethod(): Int = {
    return 25
  }
  protected[Main] def packageProtectedMethod(): Int = {
    return 26
  }
  //! This is how you define a static inner class and a non-extendable class
  final object innerClass{
    private val name: String = "InnerClass HelperOne"
    def getClassName(): String = {
      return this.name
    }
  }
  //! This is how you define a method that should not be overriden by any other class
  final def nonChangeableMethod(): Unit = {
    System.out.println("Non-changeable method")
  }
}
```
</body>
<p>Additionally, to the keywords that I presented for access modifiers, I thought it would be useful to present a new
way of looking at those keywords we have seen in previous examples. The keyword <code>object</code>, for instance, that I 
have used for defining a general class can also be used to define a singleton with static-like parameters and methods
as shown by the previous code snippet.
<br><br>
Moreover, the keyword final, thankfully, has found its way over to the Scala programming language and it allows you to 
end the chain of inheritance as we could do in C++ and Java with const and final respectively. This then means that
by default we have to think about public access and rethink private and protected access.</p>
</li>
<li><code style="color: cornflowerblue; font-weight: bold">"Initializers"</code>:
<p>Probably one of the weirdest names for a section I have ever selected, but with good reason. When we are working in general
applications, it always comes a point when our data cannot be simply stored through ten thousand variables, rather then, 
it requires a storage solution that is structured for easier access and reduced code footprint. For this reason, I have 
decided to take a look at some of the most common variable types, for example, arrays, maps, lists, and enums and check how 
they can be used and defined for their use similar to those in Java.</p>
<blockquote style="font-style: italic; color: whitesmoke"> <q>Scala Programming: Basic Initialization</q>
<p>In our applications, there is really not a lot of changes from what we used to do in Java (for now, just wait until
we get to conditionals, loops, etc. etc. etc.!), normal variables must be initialized directly and those values 
must be of the type that is defined after the variable name.
<br><br>
On the other hand, for those variables that are declared with Java data types then there really isn't a change there either
(of course the syntax for those variables that require parameter types changes from &angle; E> to a [E] type declaration, 
and the new keyword is still used to instantiate them), however for those variables that are basic and part of Scala, like 
Arrays, Lists, Maps, etc, there are other ways for declaring them we have to think about.
</p>
<ul>
<code>Initializing Arrays</code>
<li><b style="color: cornflowerblue; font-weight: bold">How to Declare Them</b>: Arrays, unlike Java are not declared with 
an interface-implementor relationship, rather they are pure objects in Scala. Take the following code as an example
<body>

```scala
package Main

object main {
  def main(args: Array[String]): Unit = {
    //! Declaring a variable to hold an Array of String
    var arrayOfString: Array[String] = new Array[String](2)
    arrayOfString.update(0, "Hello")
    arrayOfString.update(1, "World")
    /*
     * This declaration, however, is cumbersome and regrettably adds two more extra lines of code
     * that are not needed to handle this case.
     */
    //! Correct way of declaring a variable to hold an array of known size
    arrayOfString = Array("Hello", "World") // Updating the reference to a more concise version
    arrayOfString = Array.ofDim("a", "b", "c", "d") //! Multi-element declaration
    println(arrayOfString.mkString("Array(", ", ", ")"))
    //! Another way of initializing, predefining the values held inside
    arrayOfString = Array.fill(5)("") //! Array of five elements initialized to ""
    //! Using tabulation to produce calculation results
    arrayOfString = Array.tabulate(5)(string => {string += "--!"})
  }
}
```
</body>
<p>The previous block of code showcased two ways, one longer and one shorter and concise of declaring an Array of known size 
in Scala. The first one is a straight-up copy of the Java syntax, but it adds two lines with operations that 
are dissimilar to those studied in normal Java arrays. Meanwhile, the second declaration is simpler and easier
to read and just<i>guess at what the program is doing</i>, this reduces visual complexity too.</p>
<p>Another way of declaring arrays in Scala is the third way shown; this uses a multi-value constructor which simply gives 
you an array of as many elements as you pass into it.
<br><br>
Full disclaimer, though, if these are not your type of arrays, you can always import ArrayList from Java and use that instead!</p>
</li>
<code>Initializing Lists</code>
<li><b style="color: cornflowerblue; font-weight: bold">How to Declare Them</b>: in order to declare
lists, we need to first take a look at the following code
<body>

```scala
package main
import java.util.List as JavaList
import java.util.ArrayList as JavaArrayList

object main {
  def main(args: Array[String]): Unit = {
    //! Declaring a variable to hold a list of Integers
    var integerList: List = List(1,2,3,4,5)
    //! Redefeining the variable to hold an empty list
    integerList = Nil //! Nil represents an empty list
    //! Using the local :: cons operator
    integerList = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
    //! Using List.fill and tabulate to rewrite the list
    integerList = List.fill(5)(24) // Filling table with 5 times element 24
    integerList = List.tabulate(5)(number => {number + 24})
  }
}
```
</body>
<p>As one can notice, the previous code is much more concise and easier to read and interpret than the original
Array implementations of before, also, we can import Lists directly from Java and use those as well</p>
</li>
<code>Initializing Maps</code>
<li><b style="color: cornflowerblue; font-weight: bold">How to Declare Them</b>: 
<p>For a clear view of the ways in which we could do this, take a look at the following code</p>
<body>

```scala
package main

object Main {
  def main(args: Array[String]): Unit = {
    //! Declaring a variable to hold a Map of Strings to Integers
    var mapOfIntegers: Map[String, Int] = Map("one" -> 1, "two" -> 2, "three" -> 3)
    
    //! Redefining the variable to hold an empty map
    mapOfIntegers = Map() //! Using Map() to represent an empty map
    
    //! Adding entries to the map using the + operator
    mapOfIntegers += ("four" -> 4)
    mapOfIntegers += ("five" -> 5)
    
    //! Using map construction with tuples
    mapOfIntegers = Map(("six", 6), ("seven", 7), ("eight", 8))
    
    //! Using a mutable map
    import scala.collection.mutable
    val mutableMapOfIntegers: mutable.Map[String, Int] = mutable.Map("nine" -> 9, "ten" -> 10)
    mutableMapOfIntegers += ("eleven" -> 11)
    
    //! Printing the contents of the maps
    println(s"Immutable Map: $mapOfIntegers")
    println(s"Mutable Map: $mutableMapOfIntegers")
  }
}
```
</body>
<p>As can be seen here, there are many ways of declaring maps, both with tuple values which cannot be changed internally, or with
mutable versions of their collections. Of course, it is much more advisable to reuse the maps present in Java and other 
standard libraries as they offer many convenience methods and safeguards that basic implementations might not have.</p>
</li>
</ul>
</blockquote>
</li>
</ul>