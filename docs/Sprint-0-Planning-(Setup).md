# ---

**Sprint 0: Planning (Setup)**

**Name:** Bernard Mawulorm Kofi Wodoame

**Date:** February 16, 2026

## **1\. Product Vision**

The vision is to provide a distraction-free digital notepad for capturing quick thoughts and reminders, ensuring that important ideas are securely stored and easily retrievable for personal organization.

## ---

**2\. Product Backlog**

| Priority | User Story | Acceptance Criteria | Est (SP) |
| :---- | :---- | :---- | :---- |
| **High** | **As a** user, **I want to** create a new note with a title and content, **so that** I can save my thoughts immediately. | 1\. System accepts POST request with title and body. 2\. Note is saved with a unique ID and timestamp. 3\. Returns 201 Created status. | 3 |
| **High** | **As a** user, **I want to** view a list of all my saved notes, **so that** I can review everything I have recorded. | 1\. System accepts GET request. 2\. Returns a JSON list of all notes. 3\. Notes are sorted by creation date (newest first). | 2 |
| **Medium** | **As a** developer, **I want to** check the health of the service, **so that** I can ensure the database and API are running correctly. | 1\. System accepts GET request at /api/health. 2\. Returns {"status": "UP"} if the DB connection is active. | 1 |
| **Medium** | **As a** user, **I want to** update the content of an existing note, **so that** I can correct errors or add more details. | 1\. System accepts PUT request with a note ID. 2\. Updates the "Last Modified" timestamp. 3\. Returns the updated note object. | 3 |
| **Low** | **As a** user, **I want to** search for notes by keyword, **so that** I can quickly find specific information without scrolling. | 1\. System accepts GET request with a ?q= parameter. 2\. Returns only notes where the title contains the keyword. | 5 |

## ---

**3\. Definition of Done (DoD)**

To ensure high "Prototype Quality" and "Delivery Discipline":

* **Code Review:** Code follows Spring Boot best practices and naming conventions

* **Testing:** Unit tests are written for the service layer and pass successfully

* **CI/CD:** The code is merged into the main branch only after the CI pipeline (GitHub Actions) passes.

* **Documentation:** The API endpoint is documented in the project README.

* **Version Control:** Commit history reflects incremental progress rather than one "big-bang" commit.

## ---

**4\. Sprint 1 Plan (Planning Setup)**

For the first execution cycle:

* **Selected Stories:** Create Note, Read All Notes, and Service Health.

---

