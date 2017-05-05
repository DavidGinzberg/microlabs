listbuilder

Create a ListBuilder interface with one method: `buildList(Array a):List`

Implement the interface and its method with the following classes:

- `ArrayListBuilder` -- Creates an ArrayList from the given array
- `LinkedListBuilder` -- Creates a LinkedList from the given array

Part 2: Override `buildList` with `buildList(Collection c):List` to take any collection type and produce the corresponding List type to the implementing class (just like part one). You may want to look at the `Collection.toArray()` method for this.

