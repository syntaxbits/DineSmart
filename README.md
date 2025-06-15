# DineSmart
A Restaurant Management Application to review and showcase acquired  knowledge for the OCP IZ0-829 exam.

The development will include Swing components, modern Java features like enums, records, sealed classes, modules, streams, concurrency, and essential topics like localization and I/O.

We will build "DineSmart" following the Model-View-Controller (MVC) architectural pattern, with a modular structure comprising core, data, gui, and util modules to ensure good separation of concerns and maintainability.

Project Setup and Directory Structure

```
DineSmart/
├── src/
│   ├── core/                     # Contains core business logic and shared models
│   │   ├── main/java/com/dinesmart/core/
│   │   └── module-info.java
│   ├── data/                     # Handles data persistence and retrieval (e.g., JDBC, file I/O)
│   │   ├── main/java/com/dinesmart/data/
│   │   └── module-info.java
│   ├── gui/                      # Contains all Swing UI components and controllers (the View and Controller in MVC)
│   │   ├── main/java/com/dinesmart/gui/
│   │   └── module-info.java
│   └── util/                     # Provides utility classes (e.g., date formatting, logging, common helpers)
│       ├── main/java/com/dinesmart/util/
│       └── module-info.java
└── resources/
    ├── i18n/                     # Internationalization files
    │   ├── Messages_en_CA.properties
    │   └── Messages_fr_CA.properties
    └── images/                   # Placeholder for any images (e.g., icons, logos)
```

