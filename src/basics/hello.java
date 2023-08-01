// Notes

// Our computer does not understand java code directly so it needs to be converted.
// That why our compiler converts Java code into Byte code so that JVM (Java Virtual Machine)
// can understand then, JRE (Java Runtime Environment) is present on top of JVM to make our OS then hardware understand the code and perform our desired output.
// Refer to this diagram below - 

// We/Java(source code) -> Compiler ->
// Byte Code -> JVM (Java Virtual Machine) ->
// JRE(Java Runtime Environment) -> OS -> Hardware -> Return back the output.


// JVM executes only one file besides how many files are there in the project.
// and that file needs to specified by the programmer and it needs to contain main method. That main method file is executed by JVM.
// Also main method needs some more words to be ececuted( public static void) amd main() accepts an argument (ex- main(String args[])).
// A class is also required to execute main() method. EX- public class className {}.

package basics;

public class hello {
    public static void main(String[] args) {
        System.out.print("\n Hellow World! This is my first Java Program! \n \n");
    }
}
