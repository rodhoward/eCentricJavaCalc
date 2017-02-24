# Prototype Calculator

Building a simple Calculator in Java.

## Explanation of approach

Using an interface "Operation" with a hashmap based OperationFactory ensures that its easy to add more operations. 
The main method builds the Calculate class that performs the calculation and prints the result.

## Prerequisites
java 1.6+ and ant

I compiled and tested it using Netbeans.

## Build 

'''shell
ant
'''

### Test
'''shell
ant test
'''

### Run
'''shell
ant
java -jar dist/ecalc.jar 4 x 4
'''
