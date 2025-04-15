# Shared Site Components Module

## Purpose
The purpose of this module is to provide common UI components, utilities, and services shared across multiple site modules.

## Responsibilities
- Implements reusable UI components
- Provides common styling and layout templates
- Implements shared JavaScript utilities
- Offers common HTTP filters and middleware
- Handles cross-cutting concerns like logging and monitoring
- Provides shared authentication and authorization components

## Dependencies
- May depend on the Logic module for core business interfaces
- Should not depend on specific site implementations (admin, public)

## Public API
This module provides reusable components:
- UI component libraries
- Shared templates and layouts
- Authentication utilities
- Common request/response handling utilities

## Example Usage
Using a shared component in a site module:
```kotlin
// In a controller within the public or admin site
class UserProfileController(private val userService: UserService) {
    fun renderProfile(ctx: Context) {
        val user = userService.getCurrentUser(ctx.sessionAttribute("userId"))
        ctx.render(
            "profile.html",
            mapOf(
                "user" to user,
                "navbar" to SharedComponents.navbar(
                    currentUser = user,
                    currentPath = ctx.path()
                ),
                "footer" to SharedComponents.footer()
            )
        )
    }
}
```

Shared JavaScript utility:
```javascript
// Import a shared utility in a site-specific JavaScript file
import { formValidator } from 'shared/js/validators.js';

const form = document.getElementById('user-form');
formValidator.initialize(form, {
    username: {
        required: true,
        minLength: 3
    },
    email: {
        required: true,
        email: true
    }
});
```

## Notes for AI Assistance
- Components should be designed for reusability and configurability
- Avoid site-specific logic in shared components
- Follow a consistent design language across components
- Document component APIs thoroughly
- Consider implementing a component-based architecture (like React or Vue)
