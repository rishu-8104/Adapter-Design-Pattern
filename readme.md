# Adapter Design Pattern in Java

This project demonstrates the use of the Adapter Design Pattern, a structural design pattern that allows incompatible interfaces to work together. In this case, we are using a variety of duck and turkey classes to show how this pattern can be applied.

## Introduction

The Adapter Design Pattern allows objects with incompatible interfaces to collaborate. This project specifically models a scenario where ducks and turkeys are interacting using the Adapter pattern. The goal is to make the `Turkey` class compatible with the `Duck` class by adapting it to the `FlyBehavior` interface.

### Key Features:
- **Duck and Turkey Classes**: Real-world examples of ducks and turkeys with different behaviors.
- **Adapter**: The `TurkeyAdapter` class adapts turkey objects to work like duck objects.
- **FlyBehavior**: Different flying behaviors are implemented as strategies, showing how behaviors can be swapped at runtime.

![alt text](Adapter_Desgin.png)

## Table of Contents

1. [Installation](#installation)
2. [Usage](#usage)
3. [Features](#features)
4. [Contributing](#contributing)
5. [License](#license)
6. [Contact Information](#contact-information)
7. [Acknowledgements](#acknowledgements)

## Installation

To set up this project, follow these steps:

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/adapter-design-pattern-java.git
    cd adapter-design-pattern-java-main
    ```

2. **Install dependencies**:
   - This project uses Maven to handle dependencies. Ensure that Maven is installed on your system.

   - If Maven is not installed, download and install it from the official [Maven website](https://maven.apache.org/download.cgi).

3. **Build the project**:
    ```bash
    mvn clean install
    ```

4. **Run the project**:
    To run the application:
    ```bash
    mvn exec:java -Dexec.mainClass="my.ducks.and.turkey.project.Main"
    ```

## Usage

Here is an example of how to use the `TurkeyAdapter` in your project:

```java
public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();

        // Turkey is adapted to behave like a Duck
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Duck says:");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("\nThe Turkey says (using Adapter):");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
```

### Expected Output:

```
The Duck says:
Quack
I'm flying with wings!

The Turkey says (using Adapter):
Gobble gobble
I'm flying with wings!
```

## Features

- **FlyBehavior Interface**: Implements different flying behaviors, such as flying with wings or flying without wings.
- **Duck Class**: Models different types of ducks, each with unique behaviors.
- **Turkey Class**: Models a turkey with behaviors incompatible with ducks.
- **Adapter**: The `TurkeyAdapter` class allows turkeys to behave like ducks by adapting their interfaces.

## Contributing

We welcome contributions to improve this project. Here are some ways you can help:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to your branch (`git push origin feature-branch`).
6. Create a pull request.

### Guidelines:
- Follow the coding style of the existing code.
- Write tests for new features and bug fixes.
- Ensure the project builds successfully with `mvn clean install`.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact Information

For any questions or feedback, feel free to reach out:

- **Email**: your.email@example.com
- **GitHub**: [https://github.com/yourusername](https://github.com/yourusername)
- **LinkedIn**: [https://www.linkedin.com/in/yourusername](https://www.linkedin.com/in/yourusername)

## Acknowledgements

- **The Adapter Design Pattern**: Concept adapted from classic design patterns.
- **Maven**: For managing dependencies and building the project.
- **Junit**: Used for writing unit tests in the `MainTest.java` file.
