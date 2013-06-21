This is a word search solver, written in Java. The program is executed using "java -jar WordSearchSolver.jar exampleFile.txt"

It will take an input file where the first text lines are the puzzle itself, followed by a blank line, then the words that the solver is searching for. This file should be in the same directory as the solver. An example is shown, the text from which is taken from exampleFile.txt, which is also contained within this repository.

NMOAMAZONI
UINLLEKFNI
SCGAEWOEIN
QREOPNTMDZ
QONPOPOTED
PSNVKGLVLW
WORNLJLEOA
XFVNOELENV
QTELCAROEA
MLSVEBODAJ

GOOGLE
ORACLE
JAVA
SUN
MICROSOFT
ADOBE
APPLE
LENOVO
HEWLETT
DELL
AMAZON

Example output from this file is:

GOOGLE found at start: 2, 2 end: 7, 7
ORACLE found at start: 8, 7 end: 8, 2
JAVA found at start: 9, 9 end: 6, 9
SUN found at start: 2, 0 end: 0, 0
MICROSOFT found at start: 0, 1 end: 8, 1
ADOBE found at start: 9, 8 end: 9, 4
APPLE found at start: 2, 3 end: 6, 7
LENOVO found at start: 1, 3 end: 6, 8
HEWLETT not found
DELL not found
AMAZON found at start: 0, 3 end: 0, 8