# Dependency Injection Microlabs


For the below examples allow `A` `B` and `C` be classes from any domain/topic of your choice where A relies on B and sometimes C (but doesn't always need an instance of C). One concrete example would be:

```
A -> Refrigerator
B -> Compartment // A refrigerator has 1 or more compartments
C -> Dispenser // Ice dispenser, Water dispenser; not always present
```

## Instructions

Dependency Injection is an intimidating name for a very simple idea: A class relies on (has dependencies on) other classes, which are provided at runtime instead of being hard-coded in that class's source code. Dependencies are typically injected (provided) via a constructor or setter argument, though other ways are also possible (such as those that require reflection). "Hard" dependencies are those which are mandatory, while "soft" dependencies can usually be worked around if they are not present. 

Create a class `A` which has a hard dependency on one or more instances of class `B`. First create an implementation where the dependency is hard-coded (eg: `B b = new B();`) in the class, then refactor your implementation to require the dependency be injected (provided) as an argument to the constructor.

Create a class `A` which has a soft dependency on an instance of class `C`. Create a setter method that takes an instance of class `C` to satisfy this dependency.