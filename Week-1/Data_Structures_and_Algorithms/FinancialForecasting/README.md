# Financial Forecasting - Recursive Algorithms

## 1. Understanding Recursion
Recursion is a programming technique where a function calls itself to solve smaller instances of a problem. It is particularly useful for problems that can be broken down into similar subproblems, such as traversing data structures, computing factorials, or, as in this case, forecasting values over time.

**How Recursion Works:**
- A recursive function solves a problem by calling itself with a simpler or smaller input.
- Each recursive call reduces the problem size, eventually reaching a base case (a condition where the function does not call itself).
- The results from each call are combined to solve the original problem.

**Advantages:**
- Simplifies code for problems with repetitive substructure.
- Makes code easier to read and maintain for certain problems.

**Disadvantages:**
- Can lead to stack overflow if not properly controlled (e.g., too many recursive calls).
- May be less efficient than iterative solutions due to function call overhead and memory usage.

---

## 2. Recursive Financial Forecasting
Financial forecasting often involves predicting future values (such as revenue, profit, or investment) based on past data and a consistent growth rate. The recursive approach models this by repeatedly applying the growth rate to the previous value.

**Example:**
If you have an initial value of $10,000 and a growth rate of 7% per year, the value after 1 year is $10,700. After 2 years, it is $10,700 * 1.07, and so on. Recursion can express this process naturally.

---

## 3. Implementation
The implementation is provided in `src/FinancialForecasting.java` and includes:
- **Recursive Method:**
  - `forecastRecursive(initialValue, growthRate, periods)`
  - This method calls itself, reducing the number of periods by 1 each time, and multiplies the value by (1 + growthRate) at each step.
  - The base case is when periods == 0, returning the initial value.
- **Iterative Method:**
  - `forecastIterative(initialValue, growthRate, periods)`
  - This method uses a loop to apply the growth rate for the given number of periods, which is more efficient for large inputs.
- **Main Method:**
  - Demonstrates both approaches with sample values and prints the results.

---

## 4. Analysis
- **Time Complexity:**
  - **Recursive:** O(n), where n is the number of periods. Each call processes one period. However, each recursive call adds overhead due to function calls and stack usage.
  - **Iterative:** O(n), but with less overhead (no function call stack), making it more efficient for large n.
- **Optimization:**
  - For large periods, prefer the iterative approach to avoid stack overflow and reduce function call overhead.
  - For best performance, use the closed-form formula (no recursion or loop):
    - `futureValue = initialValue * (1 + growthRate)^periods` (O(1) time complexity)
- **Space Complexity:**
  - Recursive: O(n) due to call stack.
  - Iterative: O(1).

---

## 5. How to Run the Code
1. Open a terminal in the `src` directory.
2. Compile the Java file:
   ```
   javac FinancialForecasting.java
   ```
3. Run the program:
   ```
   java FinancialForecasting
   ```
4. You will see output similar to:
   ```
   Recursive Forecast after 5 periods: 14025.52
   Iterative Forecast after 5 periods: 14025.52
   ```

---

## 6. Summary
- Recursion is a powerful tool for expressing repetitive calculations, such as financial forecasting.
- For small input sizes, recursion is elegant and easy to understand.
- For large input sizes, prefer iteration or a closed-form solution for efficiency and to avoid stack overflow.
- The provided code demonstrates both approaches and can be adapted for different forecasting scenarios.
