# Sites Module

## Purpose
The purpose of this module is to provide web interfaces for the application, handling HTTP requests, user interface rendering, and API endpoints.

## Responsibilities
- Implements REST API endpoints
- Manages web server configuration and startup
- Handles HTTP request routing and parameter validation
- Provides user interface components and templates
- Implements authentication and authorization at the web layer
- Translates between HTTP/JSON formats and internal domain models

## Dependencies
- Depends on the Logic module for core business operations
- May depend on DB module for data access (through interfaces)
- May depend on File-Storage module for file operations (through interfaces)

## Public API
This module primarily provides HTTP endpoints:
- REST API endpoints for programmatic access
- Web pages for human interaction
- WebSocket endpoints for real-time communication (if applicable)

## Example Usage
Starting the web server:
```kotlin
fun main() {
    val webServer = WebServer(
        port = 8080,
        userService = UserServiceImpl(userRepository),
        fileService = FileServiceImpl(fileStorage)
    )
    webServer.start()
}
```

Example endpoint implementation:
```kotlin
/**
 * The purpose of this class is to handle user registration requests.
 */
class UserRegistrationController(private val userService: UserService) {
    
    fun registerUser(ctx: Context) {
        val request = ctx.bodyAsClass(UserRegistrationRequestDto::class.java)
        
        val result = userService.registerUser(request.toDomainModel())
        
        when (result) {
            is Success -> ctx.status(201).json(UserCreatedResponseDto(result.value))
            is Failure -> ctx.status(400).json(ErrorResponseDto(result.error))
        }
    }
}
```

## Notes for AI Assistance
- Keep controllers thin - they should only handle HTTP concerns
- Business logic should be delegated to the Logic module
- Use DTOs for request/response objects with proper validation
- Follow the HTTP standards for response codes and REST principles
