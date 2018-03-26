A. High-level modules should not depend on low-level modules. Both should depend on abstractions.
B. Abstractions should not depend on details. Details should depend on abstractions.
Robert Martin equated the Dependency Inversion Principle, as a first-class combination of the Open Closed Principle and 
the Liskov Substitution Principle, and found it important enough to give its own name. While using the Dependency 
Inversion Principle comes with the overhead of writing additional code, the advantages that it provides outweigh the 
extra effort. Therefore, from now whenever you start writing code, consider the possibility of dependencies breaking 
your code, and if so, add abstractions to make your code resilient to changes.