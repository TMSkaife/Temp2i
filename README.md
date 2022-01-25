# Temp2i
A temporary repository containing the coding challenge for 2i.

This is a simple java file that when run from the command line, prompts the user to enter integers, then printing an ArrayList of the iterated numbers to the command line. The number iterate using the following rules: 

"In a language of your choice, using all best practice principles you’re aware of, could you please provide code that iterates in multiples of A until X, then in multiples of A + 1 until 2X, then multiples of A + 2 until 3X. Please state any assumptions you’ve made." 

While coding this I made several assumptions, which are as follows:

1. The values for A and X are both integers. This framework could work for doubles or floats with relatively few changes though, as the mothodology is essentially the same.
2. Surpassing a 'goal' (X,2X,3X) value counts as reaching that value, meaning that if the goal is 10, and the number iterates straight from 9 to 12, the goal is met. If this were not the case, most combinations would cause the code to iteratre endlessly.
3. Numbers are iterated from the last iterated number, even when a goal threshold is surpassed. For example if the A value was 2, and the X value was 5, the sequence would be: (2,4,6,9,12,16), not: (2,4,6,8,11,14,18) - (this examples iterates from the last goal threshold once it has been reached).
4. We are working with postive integers only. This quickly eliminates the possibility of the program looping endlessly due to goals never beibng reached. The possibility of including negative numbers could be added later, but did not seem like an effective use of time or effort for this task. 


## Usage

Ensure that you have an up to date JDK installed. The version of the one I used on my machine is:
openjdk version "1.8.0_312"

Navigate to the location of the download using the terminal, then compile the code using the following command:

```
javac Iterator.java
```
After compiling the code use the following command to run the program:
```
java Iterator
```
Then follow the instructions on the screen.
