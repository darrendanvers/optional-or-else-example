# Optional.orElse() vs Optional.orElseGet() Example

Put this into the category of *Things I should have recognized, but it took finding a bug before I did*. When you use a function
to provide the value returned by `Optional.orElse()`, that function will be called whether or not the Optional is empty. 
That's why the `Optional.orElseGet()` function exists. The lesson iskk, when you will use a function to
provide the value when an Optional is empty, you want to call `Optional.orElseGet()` and not `Optional.orElse()`.

## Building 

From the command line in the project root directory, type in  `./gradlew build`.

## Running

From the command line in the project root directory, type in `java -jar ./build/libs/optional-or-else-example-1.0.0.jar`