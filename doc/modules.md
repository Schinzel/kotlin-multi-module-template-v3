# Module Structure

## Overview
This project uses a modular architecture to separate concerns, promote code reuse, and facilitate AI-assisted development. The module structure is designed to clearly define boundaries between different parts of the system and establish explicit dependencies.

## Module Hierarchy

```mermaid
graph TD
    %% Root module
    RootPom["Root POM"]
    
    %% Main modules level
    Modules["modules"]
    
    %% Second level modules
    Logic["logic"]
    Sites["sites"]
    
    %% Logic submodules
    DB["db"]
    FileStorage["file-storage"]
    
    %% Sites submodules
    Admin["admin"]
    Public["public"]
    Shared["shared"]
    SiteStarter["site-starter"]
    
    %% Module structure hierarchy
    RootPom --> Modules
    Modules --> Logic
    Modules --> Sites
    
    Logic --> DB
    Logic --> FileStorage
    
    Sites --> Admin
    Sites --> Public
    Sites --> Shared
    Sites --> SiteStarter
    
    %% Define styles
    classDef rootModule fill:#e8f5e9,stroke:#2e7d32,stroke-width:3px;
    classDef moduleLevel fill:#fce4ec,stroke:#c2185b,stroke-width:2px;
    classDef logicModule fill:#e1f5fe,stroke:#01579b,stroke-width:2px;
    classDef sitesModule fill:#f3e5f5,stroke:#6a1b9a,stroke-width:2px;
    
    %% Apply styles
    class RootPom rootModule;
    class Modules moduleLevel;
    class Logic,DB,FileStorage logicModule;
    class Sites,Admin,Public,Shared,SiteStarter sitesModule;
```

## Modules Module
This is an aggregator module that contains the modules `logic` and `site` 

### Logic Module
This is an aggregator module. The purpose is to contain modules for for example DB access, file storage and more. 

#### Logic/DB Module
This is sample module with no real code

#### Logic/File-Storage Module
This is sample module with no real code

## Sites Module
This is an aggregator module. The module contains modules for web interfaces and REST APIs for interacting with the system.
Currently there are two sites `Admin` and `Public`, but there could be only one or there code be more.

### Sites/Admin Module
This is sample code for an admin site

### Sites/Public Module
This is sample code for a public site

### Sites/Shared Module
- Common code used across the sites

### Sites/Site-Starter Module
- Determines which site to run based on configuration
- Initializes the appropriate site
- Handles startup and shutdown procedures
- Configures server parameters

