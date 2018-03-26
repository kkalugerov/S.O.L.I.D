Liskov Substitution Principle states the following: “in a computer program, if S is a subtype of T, then objects of type 
T may be replaced with objects of type S (i.e., objects of type S may substitute objects of type T) without altering any
of the desirable properties of that program (correctness, task performed, etc.)”. Simply said, any object of some class
in an object-oriented program can be replaced by an object of a child class. In order to understand this principle
better, we’ll make a small digression to briefly remind ourselves about the concept of inheritance and its 
properties, as well as subtyping, a form of polymorphism.
The Liskov substitution principle, written by Barbara Liskov in 1988, states that functions that reference base classes 
must be able to use objects of derived (child) classes without knowing it. It’s important for a programmer to notice 
that, unlike some other Gang of Four principles, whose breaking might result in bad, but working code, the violation of 
this principle will most likely lead to buggy or difficult to maintain code.