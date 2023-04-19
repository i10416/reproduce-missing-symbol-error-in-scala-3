https://github.com/lampepfl/dotty/issues/17255

Bar.java

```java
package example;

import example.Foo$;

public class Bar {
	// this compiles in Scala 2.x, but won't compile in Scala 3
	private static final Foo$ MOD = Foo$.MODULE$;
}

```

```scala
package example

case class Foo(i: Int)

object Foo

```

run `+compile` and it compiles in Scala 2.x, but won't compile in Scala 3.
