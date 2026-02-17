# Sprint 1 Retrospective

## Reflection

### What Went Well
*   **Core Feature Delivery**: Successfully implemented the "Create Note" and "Read All Notes" user stories, meeting the primary acceptance criteria.
*   **Project Setup**: The Spring Boot application structure and database connection (PostgreSQL) were correctly configured.
*   **Testing Foundation**: Established a testing pattern with `NoteControllerTest` which successfully mocks repository interactions.

### What Could Be Improved
*   **Test Environment Config**: We encountered issues with `NotaApplicationTests` failing due to database connection problems (missing credentials for the local Postgres instance). This blocked full integration testing.
*   **CI/CD Refinement**: While the CI workflow file exists, we need to ensure it correctly handles the database dependency for testing in the cloud environment.

## Process Improvements for Sprint 2

1.  **Switch to H2 for Testing**:
    *   *Action*: Configure the test profile (`application-test.properties`) to use an in-memory H2 database.
    *   *Benefit*: This will resolve the database connection issues during testing and make the CI pipeline more robust and self-contained.

2.  **Enhance Error Handling**:
    *   *Action*: Implement a global exception handler to provide more meaningful error responses for API failures (e.g., validation errors).
    *   *Benefit*: Improves the developer experience and makes frontend integration smoother.
