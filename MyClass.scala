```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y // This line will cause a NullPointerException if x is null, but it's an Int, so it won't be
  }
}
```