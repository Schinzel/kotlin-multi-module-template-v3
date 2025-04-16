# kotlin-aidev-template
The purpose of this project is to serve as a starting point for new Kotlin projects that leverage AI-assisted development.

## Features

- Comprehensive coding standards for both humans and AI assistants
- Multi-module Kotlin project structure which is beneficial for AIs.
- Maven configuration with shade plugin for executable JARs
- Sample infrastructure (web server, database integration)
- Testing framework setup

## AI-Friendly Code Structure
The code organization and standards are specifically designed to:
- Small independent modules makes it easier for AI to understand and generate code
- Make it easier for AI tools to understand context and constraints
- Provide clear boundaries and responsibilities
- Establish consistent patterns for code generation
- Set explicit standards for both human and AI-written code


## Documentation

All project documentation is located in the `doc/` directory:

[Modules](doc/modules.md)

- Code Standards:
  - [General Code Standards](doc/code_standards/code_standards.md)
  - [Module Standards](doc/code_standards/module_standards.md)
  - [AI Standards](doc/code_standards/ai_standards.md)
  - [Testing Standards](doc/code_standards/testing_standards.md)

## Getting Started

1. Clone this repository
2. Rename packages and Maven coordinates to match your project
3. In the POM for site-starter set the name of the JAR file that will be built. Currently myJar.jar
4. Review the coding standards documentation
5. Start building your modules following the established patterns

## AI-Assisted Development

This template is specifically designed to work well with AI coding assistants like Claude, Claude Code, and ChatGPT. When using AI tools with this codebase:

1. Refer the AI to the documentation in `doc/`
2. Ask the AI to follow the established coding standards
3. Validate generated code against the project standards

