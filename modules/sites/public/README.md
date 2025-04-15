# Public Site Module

## Purpose
The purpose of this module is to provide the public-facing web interface for end users to interact with the application.

## Responsibilities
- Implements public web controllers and views
- Handles user registration and authentication
- Provides responsive UI for different device types
- Implements public-facing APIs
- Manages user sessions and state
- Implements internationalization and localization

## Dependencies
- Depends on the Logic module for core business operations
- Depends on the Sites/Shared module for common UI components
- May use Logic/DB module for data access (through interfaces)
- May use Logic/File-Storage module for file operations (through interfaces)

## Public API
This module primarily provides HTTP endpoints for public use:
- Public-facing REST API endpoints
- Public web interface pages
- User authentication endpoints

## Example Usage
The public site is typically accessed through a web browser at the main domain:
```
https://example.com
```

Configuration in site-starter:
```kotlin
fun startPublicSite(port: Int) {
    val publicSite = PublicSite(
        port = port,
        userService = UserServiceImpl(userRepository),
        contentService = ContentServiceImpl(contentRepository),
        fileService = FileServiceImpl(fileStorage)
    )
    publicSite.start()
}
```

## Notes for AI Assistance
- Focus on user experience and responsive design
- Implement proper input validation for all user inputs
- Consider accessibility standards in UI implementation
- Keep business logic in the Logic module, not in the public site
- Implement rate limiting and other security measures for public endpoints
