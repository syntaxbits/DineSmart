# DineSmart: A Restaurant Management Application

DineSmart is a comprehensive restaurant management application developed in Java Swing, designed to showcase key features and best practices for the Java OCP IZ0-829 exam. The application follows the Model-View-Controller (MVC) architectural pattern and is structured into multiple modules (core, data, gui, util) to enhance maintainability and scalability.

## Table of Contents

- [Features](#features)
- [OCP Exam Objectives Covered](#ocp-exam-objectives-covered)
- [Architecture](#architecture)
- [Directory Structure](#directory-structure)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Installation and Setup](#installation-and-setup)
- [Usage](#usage)
- [Localization](#localization)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Order Management**: Create, view, update, and delete customer orders.
- **Menu Management**: Manage food items, categories, and prices.
- **Table Management**: Assign and track table statuses.
- **User Authentication**: Secure login for different user roles (e.g., administrator, staff).
- **Localization Support**: Available in English and French.
- **Real-time Clock**: Displays the current time reflecting the user's timezone.
- **Rich Swing UI**: Utilizes various Swing components like `JTable`, `JList`, `JRadioButtons`, `JMenus`, `JComboBoxes`, `JCheckBoxes`, etc.
- **Database Integration**: Persistent data storage using an external database (e.g., MySQL or SQLite).

## OCP Exam Objectives Covered

DineSmart is specifically designed to incorporate and demonstrate proficiency in the following OCP IZ0-829 exam objectives:

1.  **Building Blocks of Java**: Variables (primitives, object data types), scoping, garbage collection.
2.  **Operators**: Arithmetic, relational, logical operators.
3.  **Java Class Design**: Inheritance, polymorphism, abstract classes, interfaces, sealed classes.
4.  **Generics and Collections**: Type-safe collections (`ArrayList`, `HashMap`, `HashSet`, `TreeMap`, `TreeSet`, `LinkedList`, `ArrayDeque`, `PriorityQueue`), `Comparator`, `Comparable`.
5.  **Exception Handling**: `try-catch-finally`, custom exceptions, `try-with-resources`.
6.  **Functional Interfaces and Lambda Expressions**: `java.util.function` package, method references, effectively final variables.
7.  **Concurrency**: `Thread`, `Runnable`, `ExecutorService`, `Future`, `Callable`, `synchronized` keyword, `Lock` interface, `CompletableFuture`.
8.  **I/O Operations**: File I/O (`Files` API, `Path`), character and byte streams, `Serialization`.
9.  **New Features in Java 17**: Records, sealed classes, switch expressions, text blocks, `Optional`.
10. **Modules and Modular Applications**: `module-info.java` for each module, inter-module communication.
11. **Database Connectivity**: JDBC for connecting to and interacting with a database, SQL queries, transactions.
12. **Localization**: `Locale`, `ResourceBundle`, `DateFormat`, `NumberFormat`.
13. **Security**: (Basic considerations: e.g., secure password handling, though full enterprise-grade security is beyond project scope).
14. **Performance Tuning and Profiling**: (Conceptual considerations within code design, e.g., efficient collection usage).

## Architecture

The application adheres to the **Model-View-Controller (MVC)** architectural pattern, separating concerns into:

-   **Model**: Represents the application's data and business logic (located in the `core` and `data` modules).
-   **View**: The graphical user interface (GUI) that the user interacts with (located in the `gui` module).
-   **Controller**: Handles user input, updates the model, and modifies the view (located in the `gui` module, interacting with `core` and `data`).

## Directory Structure
```
DineSmart/
├── .git/
├── bin/
│   └── scripts/
│       ├── build.sh
│       └── run.sh
├── lib/
│   └── <database_driver>.jar
├── modules/
│   ├── core/
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/
│   │   │   │   │   └── com/
│   │   │   │   │       └── dinesmart/
│   │   │   │   │           └── core/
│   │   │   │   │               ├── model/
│   │   │   │   │               │   ├── entities/
│   │   │   │   │               │   │   ├── MenuItem.java
│   │   │   │   │               │   │   ├── Order.java
│   │   │   │   │               │   │   ├── Table.java
│   │   │   │   │               │   │   └── User.java
│   │   │   │   │               │   ├── exceptions/
│   │   │   │   │               │   │   └── DineSmartException.java
│   │   │   │   │               │   └── service/
│   │   │   │   │                   ├── OrderService.java
│   │   │   │   │                   └── MenuItemService.java
│   │   │   │   └── module-info.java
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/
│   ├── data/
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/
│   │   │   │   │   └── com/
│   │   │   │   │       └── dinesmart/
│   │   │   │   │           └── data/
│   │   │   │   │               ├── dao/
│   │   │   │   │               │   ├── MenuItemDAO.java
│   │   │   │   │               │   └── OrderDAO.java
│   │   │   │   │               ├── database/
│   │   │   │   │               │   └── DatabaseConnection.java
│   │   │   │   │               └── util/
│   │   │   │   │                   └── DBUtil.java
│   │   │   │   └── module-info.java
│   │   │   └── resources/
│   │   └── test/
│   ├── gui/
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/
│   │   │   │   │   └── com/
│   │   │   │   │       └── dinesmart/
│   │   │   │   │           └── gui/
│   │   │   │   │               ├── controller/
│   │   │   │   │               │   └── MainController.java
│   │   │   │   │               ├── view/
│   │   │   │   │               │   ├── MainFrame.java
│   │   │   │   │               │   ├── panels/
│   │   │   │   │               │   │   ├── OrderPanel.java
│   │   │   │   │               │   │   └── MenuPanel.java
│   │   │   │   │               │   ├── dialogs/
│   │   │   │   │               │   │   └── AboutDialog.java
│   │   │   │   │               │   └── components/
│   │   │   │   │               │       └── CurrentTimePanel.java
│   │   │   │   │               └── App.java
│   │   │   │   └── module-info.java
│   │   │   └── resources/
│   │   │       └── com/
│   │   │           └── dinesmart/
│   │   │               └── gui/
│   │   │                   ├── messages_en.properties
│   │   │                   └── messages_fr.properties
│   │   └── test/
│   └── util/
│       ├── src/
│       │   ├── main/
│       │   │   ├── java/
│   │   │   │   │   └── com/
│   │   │   │   │       └── dinesmart/
│   │   │   │   │           └── util/
│   │   │   │   │               ├── DateUtil.java
│   │   │   │   │               └── Validator.java
│   │   │   │   └── module-info.java
│   │   │   └── resources/
│   │   └── test/
├── .gitignore
├── README.md
└── pom.xml (Placeholder - NOT USED, kept for common project structure recognition)
```
## Technologies Used

-   **Java 17+**: The core programming language.
-   **Swing**: For building the graphical user interface.
-   **JDBC**: For database connectivity.
-   **MySQL/SQLite**: (Choose one) Relational database for data persistence. SQLite is recommended for simplicity in a project like this as it's file-based.

## Prerequisites

Before you begin, ensure you have the following installed:

-   Java Development Kit (JDK) 17 or higher
-   A text editor or Integrated Development Environment (IDE) like VS Code, IntelliJ IDEA Community Edition, or Eclipse.
-   Git (for version control)
-   (Optional, but recommended) MySQL Server or SQLite Browser for database management.

## Installation and Setup

1.  **Clone the Repository**:
    ```bash
    git clone [https://github.com/your-username/DineSmart.git](https://github.com/your-username/DineSmart.git)
    cd DineSmart
    ```

2.  **Database Setup**:
    * **SQLite (Recommended for simplicity)**: No server setup needed. The database file will be created automatically on first run (or you can provide an initial `.db` file).
    * **MySQL**:
        1.  Install MySQL Server.
        2.  Create a database (e.g., `dinesmart_db`).
        3.  Create a user with appropriate permissions for this database.
        4.  Update the database connection details in `modules/data/src/main/resources/application.properties` (this file will be created in a later step) to match your MySQL setup.
        5.  Download the MySQL JDBC driver JAR and place it in the `lib/` directory.

3.  **Build the Project**:
    Navigate to the project root and execute the build script:
    ```bash
    ./bin/scripts/build.sh
    ```
    This script will compile the modules and prepare the application for execution.

4.  **Run the Application**:
    After a successful build, run the application using the execution script:
    ```bash
    ./bin/scripts/run.sh
    ```

## Usage

Upon launching, the DineSmart application will present a login screen. After successful authentication, you will be directed to the main application interface, where you can manage orders, menu items, and tables.

## Localization

The application supports English and French locales. You can switch the language through a menu option within the application (to be implemented). The resource bundles (`messages_en.properties` and `messages_fr.properties`) located in `modules/gui/src/main/resources/com/dinesmart/gui/` manage the localized strings.

## Contributing

Contributions are welcome! Please feel free to fork the repository, make your changes, and submit a pull request.

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.
