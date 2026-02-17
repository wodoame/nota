# 📝 Nota - A Distraction-Free Digital Notepad

Nota is a simple, lightweight digital notepad application designed for capturing quick thoughts and reminders. It ensures that your important ideas are securely stored and easily retrievable.

## 🚀 Key Features

*   **Create Notes**: Quickly jot down titles and content.
*   **Update Notes**: Modify existing notes to correct errors or add details.
*   **Search**: Find notes instantly by searching for keywords in the title.
*   **Retrieve**: View all your saved notes, sorted by newest first.
*   **Monitoring**: Built-in health check endpoint and application logging.
*   **Robust Error Handling**: Standardized error responses for a consistent API experience.

## 🛠️ Tech Stack

*   **Language**: Java 25
*   **Framework**: Spring Boot 3.5.10
*   **Database**:
    *   **Development/Production**: PostgreSQL
    *   **Testing**: H2 (In-Memory)
*   **Build Tool**: Maven
*   **CI/CD**: GitHub Actions

## 🏁 Getting Started

### Prerequisites

*   Java 25 (SDK)
*   Maven
*   PostgreSQL (Local instance for development)

### Installation

1.  Clone the repository:
    ```bash
    git clone https://github.com/wodoame/nota.git
    cd nota
    ```

2.  Configure Database:
    *   Ensure PostgreSQL is running locally.
    *   Create a database (e.g., `nota_db`).
    *   Update `src/main/resources/application.properties` with your credentials.

3.  Build the project:
    ```bash
    mvn clean install
    ```

4.  Run the application:
    ```bash
    mvn spring-boot:run
    ```

## 📖 API Documentation

### Notes

*   **Create Note**
    *   `POST /api/notes`
    *   Body: `{"title": "My Note", "content": "This is content"}`

*   **Get All Notes**
    *   `GET /api/notes`
    *   Returns list of all notes.

*   **Search Notes**
    *   `GET /api/notes?q={keyword}`
    *   Returns notes where title contains the keyword.

*   **Update Note**
    *   `PUT /api/notes/{id}`
    *   Body: `{"title": "Updated Title", "content": "Updated Content"}`

### Monitoring

*   **Health Check**
    *   `GET /api/health`
    *   Returns system and database status: `{"status": "UP", "database": "UP"}`

## ✅ Testing

This project uses JUnit 5 and Mockito for testing. An in-memory H2 database is configured for the `test` profile to ensure isolated and reliable test execution.

To run tests:
```bash
mvn test
```

## 🤝 Contributing

1.  Fork the repository
2.  Create your feature branch (`git checkout -b feature/AmazingFeature`)
3.  Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4.  Push to the branch (`git push origin feature/AmazingFeature`)
5.  Open a Pull Request
