// module-info.java for the 'core' module
module com.dinesmart.core {
    // Exports packages containing entities, exceptions, and service interfaces
    // These packages will be used by the 'gui' module
    exports com.dinesmart.core.model.entities;
    exports com.dinesmart.core.exceptions;
    exports com.dinesmart.core.service;

    // Requires the 'util' module to use its utility classes
    requires com.dinesmart.util;
}
