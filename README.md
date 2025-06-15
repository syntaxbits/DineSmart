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

Explanation of the Structure:

DineSmart/: 
The root directory of our project.

src/: 
Contains all the source code for our Java modules.

core/: 
This module will encapsulate the core business logic of the restaurant management system. It will contain models like MenuItem, Table, Order, and their associated business rules. It represents the "Model" part of our MVC.

data/: 
This module will be responsible for all data access operations. This is where we'll handle saving and loading data, potentially using JDBC for database connectivity or file I/O for simpler persistence.

gui/: 
This module will contain all the Swing-related code, including frames, panels, and custom components (JTable, JList, JRadioButton, etc.). It will also house the controllers that mediate between the view and the model, effectively being the "View" and "Controller" parts of MVC.

util/: 
This module will contain general utility classes that can be used across different modules, such as date/time formatters, custom exception classes, and other helper functions.

resources/: 
This directory will store non-Java source files.

i18n/: 
This sub-directory is specifically for our localization property files (Messages_en_CA.properties for English and Messages_fr_CA.properties for French), crucial for demonstrating localization.

images/: 
A placeholder for any images like icons or logos that our GUI might use.