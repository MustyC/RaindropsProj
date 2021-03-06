# Raindrops

This is a function that takes an integer as its input and converts it to a string, which depends on many factors.

## Description -

- If the input has a factor of **3**, the returned string will be 'Pling'
- If the input has a factor of **5**, the returned string will be 'Plang'
- If the input has a factor of **7**, the returned string will be 'Plong'
- If the input does not have a factor of **3**, **5** or **7**, it will simply return the value of the digits.

## Examples -

- 28's factors are 1, 2, 4, **7**, 14 and 28: this would return a simple 'Plong'
- 30's factors are 1, 2, **3**, **5**, 6, 10, 15, 30: this would return a 'PlingPlang'
- 70's factors are 1, 2, **5**, **7**, 10, 14, 35, and 70: this would return a 'PlangPlong' 
- 105's factors are 1, **3**, **5**, **7**, 15, 21, 35 and 105: this would return a 'PlingPlangPlong' 
- 34 has four factors: 1, 2, 17, and 34. None of these are wanted, so this would simply return '34'

I added mutation test coverage which produces an index.html file when you run the following command in the terminal
'mvn test-compile org.pitest:pitest-maven:mutationCoverage'

This creates a webpage that displays the programs test coverage report, the latest of which can be viewed below
<img width="385" alt="MutationCoverageTest" src="https://user-images.githubusercontent.com/80487618/169091061-4a214d1b-b182-4ea8-bf50-ece117df5f8c.png">

As you can see, my tests cover almost the whole project, the reason it is not 100% is due to the usage of a static method. 
This thorough testing ensures rigidity in the code. 



Here is further information regarding mutation testing if you wish to learn more  [https://pitest.org/](https://pitest.org/)

