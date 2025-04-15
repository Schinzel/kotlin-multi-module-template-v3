# Code Standards for Testing

## General Testing Principles
- Extensive unit tests
- A unit test function should test only one thing
- One assert per unit test function
- A unit test should be blazingly fast — maximum 10 milliseconds
  - Some exceptions can be made for tests involving time or similar behavior
- Test methods must be able to run in parallel
- Be careful to test only what you intend to test — in other words, test as little as possible
  - For example: if you want to test an API method, move the logic to a separate function or class, so the logic can be tested without involving the web server

## Naming Conventions

### Classes
- Test classes are named: `[ClassToTest]Test`
- For example, for the class `Crypto`, the test class is named `CryptoTest`
- A utility class used in tests, located in the test package, is named: `[Something]Util`

### Functions
Test method names should follow this pattern:
```
unitOfWork_StateUnderTest_ExpectedBehavior
```

If longer descriptions or non-ASCII characters are needed:
```
`unit of work | state under test | expected behavior`
```

## Nested Test Classes
With JUnit 5, you can use nested classes to organize tests. If you have many tests for one unit-of-work, you can group them in a nested class:

```kotlin
@Nested
inner class UnitOfWork {
    @Test
    fun stateUnderTest1_ExpectedBehavior1{
        [...]
    }
    
    @Test
    fun stateUnderTest2_ExpectedBehavior2{
        [...]
    }
}
```

## Interface Testing
Every public interface or abstract class defining a significant unit of behavior must have a comprehensive contract test suite that rigorously verifies adherence to its documented purpose and constraints, independent of any specific implementation.
