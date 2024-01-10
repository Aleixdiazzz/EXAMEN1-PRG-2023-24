## First programming exam in Java 

- The following set of tasks is from our first Java exam in the 2023-24 academic year.
---

### Included Concepts:
1. Basic concepts
2. Conditionals
3. Loops
4. Functions

### Indications
- Pseudocode is recommended
- Remember to declare variables with their type
- You can't use classes, arrays or anything that hasn't been explained in class


  ### First Block

  ## Excercise 1 (1 point)

  Make a function named `decimalBinari` which recieves a whole number and have it print on the screen
  the same number converted to a Binary number.
  Print every number on one line, the number can be inverted.
  Assume that the number the function recieves is always a positive number.

  ## Excercise 2 (1 point)

  Make a function named `binariDecimal` which recieves a whole binary number (long) and make it print
  the same number in decimal form.

  ## Excercise 3 (1 point)

  Make a function named `esParell` which recieves a number and returns a boolean true if the number is
  even, if else it will return false.

  ## Excercise 4 (1 point)

  Make a function named `primersNombresParells` which recieves a whole number `n` and prints all the even
  numbers that exist bewteen 0 and `n`. Assume that n is always a positive number.

  ## Excercise 5 (1 point)

  Make a function named `menu` that shows the following menu on the screen and returns the choice
  made by the user in the form of a whole number.

  ```
  Choose one of the following options:
  1. Decimal to binary
  2. Binary to decimal
  3. Is it even?
  4. Calculate even numbers between 0 and n
  0. Exit
  ```

  ## Excercise 6 (1 point)

  Implement the `main` which consists of:
  - Showing the main `menu`, if the user enters a 0, the program ends, if the user enters an invalid
    option he's informed and the menu is showed again.
  - Ask for the needed data to execute the corresponding function using the last excercises.
  - Show the main `menu` again.
 
  ### Sencond Block

  A shipping company has tasked us with the making of a program that helps with some calculations.
  The company usually ships liquids or materials like gravel, soil, sand or similar, Meaning that
  they measure the shipment by its volume.
  They want the program to calculate how many times they'll have to make a trip to fulfill the order.

  ## Excercise 7 (2 points)

  Make two functions to calculate the capacity of the moving trucks. The trucks can be a cistern (cilindrical)
  or a boxtruck (rectangular prism). So:

  - Define the function `volumCilindre` which gets the radius and the length (always positive) of
    the container in centimetres, and it will return the volume in cubic centimetres.
  - Define the function `VolumPrismaRectangular` which gets the lenght of the three sides of the prism
    in centimetres (always positive) and it will return the volume in cubic centimetres.

  ## Excercise 8 (2 points)

  Make a `main` that:

  - Asks the user if the transport will be a solid or a liquid. If the users input is invalid
    the question will be prompted again.
  - Asks the user the volume that has to be shipped, in cubic meters.
  - Calculate the amount of trips will be required to fulfill the order.

  It should execute like so:

  ```
  What will you be shipping? 1. Liquids 2.Solids
  4                         //user input
  Invalid Option
  What will you be shipping? 1. Liquids 2.Solids
  1                         //user input

  How many centimetres of radius does the cistern have?
  72                        //user input
  How many centimetres of length does the cistern have?
  600                       //user input

  The truck has a capacity of 12063715,79 cubic centimetres.
  You can fit 12.06 cubic metres.
  You will need to make 6 trips.
  ```

  --

  You will find the OG scan of the exam [here](https://github.com/Aleixdiazzz/EXAMEN1-PRG-2023-24/blob/main/logicNExam1.pdf)., you will also find the logic followed      through the solving of the exam.
  The source code can be found under the Examen1 PRG 2023-24 BLOC1 and PRG 2023-24 BLOC2 and there's also an available copy [here](https://github.com/Aleixdiazzz/EXAMEN1-PRG-2023-24/blob/main/logicNExam1.pdf)



  
