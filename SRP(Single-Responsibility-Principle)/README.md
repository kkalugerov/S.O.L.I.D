The single responsibility principle revolves around the claim that a certain code module (most often, a class) should only have responsibility 
over one part of the functionality provided by the software. In software engineering books, this is sometimes also defined like this: 
the module should only have one reason to change. This means that a division of concerns is performed in the program, and the methods for every 
concern should be completely encapsulated by a single class. Now it is obvious that this approach contributes to the high cohesion – since 
methods related to the same concern (same part of the functionality) will be members of the same class, and robustness – since this reduces the 
possibility of error. Furthermore, if an error does occur, the programmer will be more likely to find the cause, and finally, solve the problem.

The single responsibility principle is founded on one of the basic, general ideas of object-oriented programming – the so-called divide and 
conquer principle – solving a problem by solving its multiple sub-problems. This approach prevents the creation of “God objects” – objects that
“know too much or do too much“.

The classes you write, should not be a swiss army knife. They should do one thing, and to that one thing well.
