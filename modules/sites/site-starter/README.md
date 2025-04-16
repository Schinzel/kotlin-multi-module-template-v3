# Site Starter Module

## Purpose
The purpose of this module is to initialize and start the appropriate site based on configuration, providing a unified entry point for deploying different site modules.

## Responsibilities
- Reads environment configuration to determine which site to start
- Configures and initializes the selected site
- Sets up common middleware and services
- Handles startup logging
- Manages graceful shutdown procedures
- Configures server ports and SSL settings

## Dependencies
- Depends on all site modules (admin, public)
- Depends on the Logic module for service initialization

## Configuration
The module reads configuration from environment variables or .env files:
- `SITE`: Determines which site to start (e.g., "admin", "public")
- `PORT`: The port number to run on
- `ENVIRONMENT`: Runtime environment (e.g., "development", "production")
- Other site-specific configuration variables

## Example Usage
Starting the application:
```bash
# Start the admin site
SITE=admin PORT=8080 java -jar myJar.jar

# Start the public site
SITE=public PORT=8000 java -jar myJar.jar
```

## Notes for AI Assistance
- The starter should handle configuration validation
- Implement proper error handling for startup failures
- Log detailed information during startup for troubleshooting
- Handle graceful shutdown for all resources
- Consider containerization requirements in the design
