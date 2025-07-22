# Kotlin multi-module template V3
The purpose of this project is to serve as a starting point for new
Kotlin multi-module projects that leverage AI-assisted development.

AIs must read and adhere to the code standards.
Read the document below and follow the links in the document.
- [Code Standards](doc/code_standards/_index.md)

AIs must read and understand the project description.
Read the document below and follow the links in the document.
- [Tech](doc/tech/_index.md)

## 🚀 Getting Started

### Configuration

Create a `.env` file in the `config` directory with the following content:

```bash
# Which site to start
#SITE=public
SITE=admin

# Which port to run the app on
PORT=5555
```

### Code Formatting with ktlint

```bash
# Check code style
mvn ktlint:check

# Auto-format code
mvn ktlint:format
```

### Building the JAR

```bash
# Build with tests
mvn clean package

# Build without tests (faster)
mvn clean package -DskipTests
```

This creates `myJar.jar` in the project root directory.

### Running the JAR

```bash
java -jar myJar.jar
```

The application will start on the port specified in your `.env` file (default: 5555).

### Customizing the JAR Name

To change the JAR name from `myJar.jar` to something else:

1. Edit the parent `pom.xml` and update the property:
   ```xml
   <properties>
       <jar.name>myJar</jar.name>  <!-- Change this value -->
   </properties>
   ```

2. Edit `modules/sites/site-starter/pom.xml` and update the finalName:
   ```xml
   <finalName>../../../../${jar.name}</finalName>
   ```

After changing, rebuild with `mvn clean package`.


