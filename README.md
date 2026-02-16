## Calculator App

A modern web calculator built with Spring Boot, featuring clean architecture and responsive design.

- **Arithmetic Operations**: Addition, Subtraction, Multiplication, Division
- **Smart Validation**: Real-time input validation with error handling
- **Responsive UI**: Seamless experience across all devices
- **MVC Architecture**: Clean separation of concerns

### 🛠️ Technology Stack

- **Backend**: Spring Boot 4.0.1, Java 17
- **Frontend**: HTML5, CSS3, Thymeleaf
- **Build Tool**: Maven

### 🚀 Quick Start

```bash
git clone https://github.com/your-username/CalculatorApp.git
cd CalculatorApp/CalculatorApp
mvn spring-boot:run
```

🌐 **Access**: `http://localhost:8080/api/home`

### 💻 Usage

1. Enter two numeric values
2. Select your operation (+, -, ×, ÷)
3. Click "Calculate" for instant results

### 📁 Architecture

```
src/main/java/com/kodnest/app/
├── CalculatorController.java    # Request handling
├── CalculatorService.java      # Business logic
└── CalculatorAppApplication.java # Application entry

src/main/resources/templates/
├── home.html                   # Input interface
└── result.html                 # Results display
```

### 🔌 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/home` | Calculator interface |
| POST | `/api/calculate` | Process calculations |

### 🧪 Testing

```bash
mvn test
```

⭐ If you find this project helpful, please give it a star!
