# exercise testing zoo

Let's program a small zoo.  
We want to be able to add animals to the zoo.   
But the zoo has a limit of how many animals can live there.  
We want to be able to get a list of all animals.  
And we need a way to check how much free space our zoo has.

**For each Task write a test first.**

## 1. Add Animal Class
Add an Animal Class which holds just the name of the animal. The name is required.  
| Animal  
| name: String  

## 2. Add a Zoo Class
Create a new Class for the Zoo. The zoo should have a space limit and a list of animals.
The constructor should take a positive number for the space limit. The animal list should be empty.  
We need a way to read space and animal list.  
| Zoo  
| space: Integer  
| animals: Array<Animal>  

## 3. Adding animals to the zoo
Write a method to add animals to the zoo. How can you test this?

## 4. List all animals
Write a method that return a string with all animals, sorted alphabetically.
Example: "Bear, Monkey, Tiger, Zebra"

## 4. When the zoo is full, stop adding animals
Add the tests and logic to use the space limit.
For example: When the zoo was started with a space of 3, you should only be able to add three animals.

## 5. Check free space
Add a method that return a message about free space:
If there is no free space: "The zoo is full!"
IF there is free space: "The zoo has X free spaces!" where X is the number of open spaces.