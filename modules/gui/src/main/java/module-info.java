// module-info.java for the 'gui' module
module com.dinesmart.gui {
    // Requires JavaFX for UI components (java.desktop is for Swing)
    // For Swing, we need java.desktop module
    requires java.desktop; // Essential for all Swing applications

    // Requires other application modules
    requires com.dinesmart.core;
    requires com.dinesmart.data; // GUI will interact with data layer through core services or directly for simplicity
    requires com.dinesmart.util;

    // Requires standard Java modules for various functionalities
    requires java.logging; // For logging
    requires java.base; // Implicitly required, but good practice to list if using specific features
                      // like Locale, ResourceBundle more directly.
    requires static java.sql; // Add static dependency on java.sql if we plan to load JDBC driver from GUI
                            // although it's better placed in data module.
                            // For now, we'll assume data module handles this.
    // For localization, we need to open the package where resource bundles reside
    opens com.dinesmart.gui; // Open this package for resource bundle access via reflection
                             // (ResourceBundle uses reflection to load property files)
    // Also open specific view packages if they contain FXML or other resources accessed reflectively
    opens com.dinesmart.gui.view.dialogs;
    opens com.dinesmart.gui.view.panels;
    opens com.dinesmart.gui.view.components; // For the time panel etc.
}
