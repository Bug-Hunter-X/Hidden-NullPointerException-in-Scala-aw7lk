# Hidden NullPointerException in Scala

This repository demonstrates a potential, yet subtle, null pointer exception (NPE) in Scala. While the provided example doesn't actually throw an NPE, it highlights a common pattern that can lead to such errors.

**The Issue:**

The misconception is that Scala's type system prevents null values. However, while `null` is disallowed for primitive types like `Int`, it remains possible for reference types to be null if not handled carefully.  The hidden error lies in the potential for a more complex scenario where an `Int` value is derived from a source which may unexpectedly be null, such as a null object's member variable.

**Example:**

The `MyClass` example appears safe because `x` is defined as an `Int`.  However, imagine if `x` was a member variable derived from another object that could be null.  In a larger application, such an error could easily be missed.