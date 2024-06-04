# Exercise 4: First JUnit Tests

### Overview

In this exercise, we implemented JUnit tests for the calculator functionality. The goal was to ensure that the calculator methods (`add`, `minus`, `divide`, and `multiply`) produce correct results.

### Setup Phase

- We used the `@BeforeEach` annotation to initialize the necessary class objects before each test method.
- In the `setUp()` method, we created a new instance of the `Calculator` class.

### Test Methods

For each calculator method, we created at least three JUnit test methods, covering various scenarios including special cases.

#### Addition (`testAdd`)

- **Positive Numbers:**
  ```java

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-2, calculator.add(-5, 3));
    }

    @Test
    void testMinus() {
        assertEquals(2, calculator.minus(5, 3));
        assertEquals(0, calculator.minus(0, 0));
        assertEquals(-8, calculator.minus(-5, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(0, calculator.divide(0, 5));
        assertEquals(-1, calculator.divide(5, 0));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-15, calculator.multiply(-5, 3));
    }


### Assertions

- We used the `assertEquals` method to compare the expected result with the actual result.
- The expected result was determined by manual calculation.
- The actual result was obtained by calling the corresponding calculator method with the specified parameters.



![](/resources/images/ex4_1.png)

_Screenshot 1:_ Passed tests

![](/resources/images/ex4_2.png)

_Screenshot 2:_ Failed tests

![](/resources/images/ex4_3.png)

_Screenshot 3:_ Passed tests after implementing factorial

![](/resources/images/ex4_4.png)

_Screenshot 4:_ mvn test