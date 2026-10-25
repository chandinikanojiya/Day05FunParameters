# Kotlin Functions Playground 🚀

This repository contains basic Kotlin practice code focusing on how to design and work with functions efficiently. It covers fundamental concepts taught in the Kotlin Basics course, specifically focusing on parameters, arguments, and code reusability.

## 📌 Key Concepts Covered

- **Functions with Parameters:** Customizing function outputs by passing variable values (e.g., dynamic names).
- **Multiple Parameters:** Handling multiple inputs of different data types (e.g., `String` for name and `Int` for age).
- **Function Signature:** Understanding the structure and parameter list of functions.
- **Named Arguments:** Passing arguments using their parameter names, allowing you to change the order of arguments during a function call.
- **Default Arguments:** Setting pre-defined fallback values for parameters so functions can be called with fewer arguments.

## 🛠️ Code Snippets & Evolution

### 1. Basic Function with Multiple Parameters
```kotlin
fun birthdayGreeting(name: String, age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}
```

### 2. Usage with Named & Default Arguments
```kotlin
// Using default name ("Rover") and named argument for age
println(birthdayGreeting(age = 5)) 

// Overriding default values with specific arguments
println(birthdayGreeting(name = "Rex", age = 2))
```

## 💻 Tech Stack
- **Language:** Kotlin
- **Concepts:** Object-Oriented Programming (OOP) Basics, Functional Programming

## 🎯 Output Look
```text
Happy Birthday, Rover! You are now 5 years old!
Happy Birthday, Rex! You are now 2 years old!
```
