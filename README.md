# DineSmart
A Restaurant Management Application to review and showcase acquired  knowledge for the OCP IZ0-829 exam.

The development will include Swing components, modern Java features like enums, records, sealed classes, modules, streams, concurrency, and essential topics like localization and I/O.

We will build "DineSmart" following the Model-View-Controller (MVC) architectural pattern, with a modular structure comprising core, data, gui, and util modules to ensure good separation of concerns and maintainability.

Project Setup and Directory Structure

```
DineSmart/
├── core/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   └── resources/
│   └── (module-info.java will go here)
├── data/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   └── resources/
│   └── (module-info.java will go here)
├── gui/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   └── resources/
│   └── (module-info.java will go here)
├── util/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   └── resources/
│   └── (module-info.java will go here)
└── (Optional: build.sh, run.sh, etc. for compilation/execution scripts)
```

We will organize the project into four distinct modules, each with a specific responsibility, following the MVC principles:

core/: 
This module will contain the core business logic, models (M in MVC), and fundamental application components that don't directly interact with the GUI or data persistence. This includes entities like MenuItem, Order, Table, Employee, etc.

data/: 
This module will handle all data access operations (DAO layer), including persistence to a database (JDBC, covering "Database Connectivity" and "I/O Operations") or file-based storage. It will interact with the core module's model objects.

gui/: 
This module will contain the user interface components (V in MVC) and controllers (C in MVC). It will depend on the core module for business logic and data models, and potentially on the data module for direct data retrieval or updates if the controller logic dictates. This is where all our Swing components (JTable, JList, etc.) will reside.

util/: 
This module will house common utility classes that can be reused across other modules. This includes things like logging utilities, date/time formatters, localization helpers, and potentially custom exception types, covering "Localization" and "Exception Handling".

For each module, we'll follow a standard Maven/Gradle-like directory structure: src/main/java for source code and src/main/resources for non-code assets (like localization property files).
