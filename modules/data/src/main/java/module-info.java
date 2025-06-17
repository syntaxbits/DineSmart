// module-info.java for the 'data' module
module com.dinesmart.data {
    // Exports packages containing DAO interfaces and implementations
    // These will be used by the 'core' service implementations (if services are in core)
    // or directly by GUI if Data Access Objects are exposed.
    // For MVC, DAOs are typically internal to 'data' and exposed via services in 'core'.
    // However, for OCP demonstration, we might directly use DAOs in GUI for simplicity,
    // or have 'core' require 'data' for service implementations.
    // For this project, 'core' will depend on 'data' for service implementations.
    exports com.dinesmart.data.dao; // Exporting DAO interfaces for core module to implement/use
    exports com.dinesmart.data.database; // Exporting DB connection utilities if needed externally

    // Requires the 'core' module to access entity classes (e.g., MenuItem, Order)
    requires com.dinesmart.core;

    // Requires the 'java.sql' module for JDBC database connectivity
    requires java.sql;
}
