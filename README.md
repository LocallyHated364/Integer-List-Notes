# Integer-List
Create a class named IntegerList that has a single instance variable, an ArrayList that holds objects of type Integer.
The class should have a single constructor that takes no parameters and initializes the ArrayList.
The class does not need any get/set methods.
Create an add() method that takes an int parameter and adds it to the list.

Write a method named isAscending() that returns a boolean.
The method should return true if every integer in the list is larger than the one before it and false otherwise.

Write a method named largest() that returns an int. It should return the largest integer on the list.

Write a method named numOdds() that returns an int. It should return the number of odd integers on the list.

Write a method named removeEvens() that has no return value. It should remove all even numbers on the list.

Write a method named indexOfSeven() that returns an int.
It should return the **index** of the first integer on the list that is divisible by 7.
If none of the numbers are divisible by 7 it should return -1.

Write a toString method that returns a String and uses the @Override annotation. 
It should return a string that lists all of the elements of the list separated by a comma and surrounded by curly braces like this:
{5, 7, 12, 74, 13, 63, 25, 6, 27, 25 }

Write a runner that demonstrates all of the methods.
