# Module Standards for Humans and AIs

## Purpose
The purpose of this document is to establish clear guidelines for creating and maintaining modules in an AI-assisted development environment.

## Module Definition
A module is a self-contained, independently buildable unit of code that:
- Implements a clearly defined domain concept or technical capability
- Has explicit dependencies and a well-defined public API
- Can be tested in isolation from other modules

## Module Structure

### Naming
- Module names must be descriptive, reflecting their core purpose
- Use kebab-case for module directory names (e.g., `user-authentication`)
- Use PascalCase for module root package names (e.g., `UserAuthentication`)

### Size Guidelines
- Aim for modules between 500-5000 lines of code
- If a module exceeds 5000 lines, consider splitting it into smaller modules
- If multiple modules are under 300 lines each and tightly coupled, consider merging them

### Required Components
Each module MUST contain:
1. Clear README.md describing:
   - The module's primary purpose (one sentence)
   - Core responsibilities (3-5 bullet points maximum)
   - Dependencies on other modules
   - Example usage
2. Explicit public API via interfaces in a dedicated `api` package
3. Independent test suite
4. Build configuration that declares all dependencies

## Module Dependency Rules

### General Rules
- Modules must declare ALL dependencies explicitly
- Circular dependencies between modules are PROHIBITED
- Prefer narrow dependencies (import only what you need)
- Maximum allowed direct dependencies: 5 other modules

### Dependency Directions
- Core domain modules should have NO dependencies on infrastructure or UI modules
- Infrastructure modules can depend on domain modules but not UI
- Cross-cutting concerns (logging, security) should be in separate modules

## AI-Specific Module Guidelines

### Documentation for AI
- Each module must have an `ai-notes.md` file that explains:
  - Module boundaries and responsibilities in plain language
  - Implementation details that might not be obvious from the code
  - Architectural decisions that constrain implementation choices

### Interface Contracts
- All module public interfaces MUST have:
  - Explicit parameter validation requirements
  - Clear return value specifications
  - Documented exceptions and error states
  - Example usages in comments

### Implementation Standards
- Limit implementation inheritance (prefer composition)
- Prefer immutable data structures
- Explicitly separate commands and queries
- Each implementation class must state which interface it implements

### Module Isolation
- No shared mutable state between modules
- Communication between modules only through defined interfaces
- No reflection or bytecode manipulation to access internals of other modules

## Versioning
- Each module has its own semantic version
- Breaking changes to module API must increase major version
- Internal changes must not affect module consumers

## Documentation
```kotlin
/**
 * The purpose of this module is to provide secure user authentication services.
 *
 * Written by [Human/AI] with Code Standard 1.2
 */
```

## Final Note
These standards apply to both human and AI-written code. AIs should be instructed to follow these standards when generating or modifying modules.

Written by Claude 3.7 with Code Standard 1.2
