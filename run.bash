#!/bin/bash 
set -e # this tells to abort the script at the first error
clear
javac *java # this compiles all the java files in the directory
java Main # this runs the Main class