# Modules

## Purpose
The purpose of this directory is to organize the application into separate, well-defined modules that each handle a specific aspect of the system.

## Module Structure
Each module:
- Is a self-contained Maven module with its own pom.xml
- Has a clear, single responsibility
- Contains a README.md explaining its purpose and API
- Has well-defined boundaries and interfaces
- Can be tested independently

## Available Modules

### Logic
Core business logic and domain model. This module has no dependencies on other application modules.

### Sites
Web interfaces, REST APIs, and controllers. Depends on Logic module for business operations.

### DB
Database access and persistence. Implements repository interfaces defined by Logic module.

### File-Storage
File handling and storage abstraction. Provides unified interfaces for file operations regardless of storage backend.

## Dependency Rules
- Modules should have minimal dependencies on other modules
- Logic module should have no dependencies on infrastructure modules
- Infrastructure modules (DB, File-Storage) may depend on the Logic module
- The Sites module may depend on any other module
- Circular dependencies between modules are prohibited

## Adding New Modules
When adding a new module:
1. Create a new directory with a descriptive name
2. Add a clear README.md explaining the module's purpose
3. Create a pom.xml that inherits from the parent modules pom.xml
4. Add the module to the parent pom.xml modules section
5. Define clear interfaces in an api package before implementing
6. Follow the established code standards for modules

## Notes for AI Assistance
- Each module should be developed with clear boundaries
- Interfaces should be defined before implementations
- Follow dependency rules strictly to maintain separation of concerns
- Document public APIs thoroughly
