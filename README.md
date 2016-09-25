# Diagonal Constant Matrix
Simple implementation of a Diagonal Constant Matrix evaluator in Java

## Usage
Type in the following commands in a terminal:
(note: make sure that asterisk * is escaped via quotes)

```java
javac DCM.java
java DCM 1 2 3 / 4 5 6 / 7 8 9 / 
>>> [ 1  2  3 ]
>>> [ 4  5  6 ]
>>> [ 7  8  9 ]
>>> Matrix is not diagonal constant.

java DCM 1 2 3 / 5 1 2 / 9 5 1 /
>>> [ 1  2  3 ]
>>> [ 5  1  2 ]
>>> [ 9  5  1 ]
>>> Matrix is diagonal constant.

java DCM 1 2 3 4 / 5 1 2 3 / 9 5 1 8 / 3 6 1 7 /
>>> [ 1  2  3  4 ]
>>> [ 5  1  2  3 ]
>>> [ 9  5  1  8 ]
>>> [ 3  6  1  7 ]
>>> Matrix is not diagonal constant.

java DCM 1 2 3 4 / 5 1 2 3 / 9 5 1 2 / 8 9 5 1 /
>>> [ 1  2  3  4 ]
>>> [ 5  1  2  3 ]
>>> [ 9  5  1  2 ]
>>> [ 8  9  5  1 ]
>>> Matrix is diagonal constant.

```
