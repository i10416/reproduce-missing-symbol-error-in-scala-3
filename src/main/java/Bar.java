package example;

import example.Foo$;

public class Bar {
	// this compiles in Scala 2.x, but won't compile in Scala 3
	private static final Foo$ MOD = Foo$.MODULE$;
}
