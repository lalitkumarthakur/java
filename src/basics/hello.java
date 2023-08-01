// Notes

// Our computer does not understand java code directly so it needs to be converted.
// That why our compiler converts Java code into Byte code so that JVM (Java Virtual Machine)
// can understand and make our OS then hardware understand the code and perform our desired output.
// Refer to this diagram below - 

// We(source code) -> Compiler ->
// Byte Code -> JVM (Java Virtual Machine)
// OS -> Hardware -> Return back.


// JVM executes only one file besides how many files are there in the project.
// and that file needs to specified by the programmer and it needs to contain main method. That main medtod file is executed by JVM.


package basics;

public class hello {
    public static void main(String[] args) {
        System.out.print("\n Hellow World! This is my first Java Program! \n \n");
    }
}
