
**Assignment 1:**  
Pick up an existing project yours and make a list of  concepts integral to the project. List them as object, context and information important as per the context. Provide a link of the markdown file. (Preferable if you create it in the same project in docs folder)

Deadline: 27th of July, 2025

Student name: **SHASHANK KUMAR**
Student id: **202412103**
Existing Project name: **Nexus: A Digital and Secure Library Management System**

### **Objects**

- **User:** Represents the individuals interacting with the system. This is a general object that can be specialized into different roles.
    
- **Admin:** A type of user with the highest level of permissions, responsible for managing the entire system.
    
- **Student, Faculty, Researcher:** Specific user roles with defined permissions and functionalities.
    
- **Library Item:** Represents the borrowable items in the library, such as books.
    
- **Transaction:** An object that encapsulates the borrowing and returning of library items.
    
- **Fine:** An object to manage penalties for overdue library items.


### **Context**

- **Digital Library Management:** The overall purpose and domain of the Nexus project.
    
- **Role-Based Access Control:** The security model that governs user permissions based on their roles.
    
- **System Architecture:** The project's structure, which is built upon design patterns like **Singleton, Factory, DAO, Facade, Strategy,** and **MVC**.
    
- **Database Management:** The backend is powered by a **PostgreSQL** database.
    
- **Dependency Management:** The project uses **Maven** to manage its dependencies.
    
- **SOLID Principles:** A set of object oriented design principles that guide the development of the system.

### **Information Important as per the Context**

- **Java:** The primary programming language used to build the application.
    
- **Input Validation and Exception Handling:** Implemented to ensure secure and robust operations.
    
- **Transaction and Borrowing History:** The system maintains a record of all user activities.
    
- **Dynamic Search:** A key feature that allows users to find library items using various criteria.
    
- **Due Date Tracking:** An essential piece of information for managing borrowings and calculating fines.


**Class: User**

| Responsibilities                             | Collaborators |
| -------------------------------------------- | ------------- |
| Manage user profile (name, ID, contact info) | LibrarySystem |
| Handle authentication (login, password)      | Transaction   |
| Serve as a base for specific user roles      |               |

**Class: Student, Faculty, Researcher**

| Responsibilities                         | Collaborators |
| ---------------------------------------- | ------------- |
| Inherit properties from the User class   | User          |
| Adhere to role-specific borrowing limits | LibrarySystem |
| May have unique privileges               |               |

**Class: Admin**

| Responsibilities                                   | Collaborators |
| -------------------------------------------------- | ------------- |
| Manage the library's collection (add/remove items) | LibrarySystem |
| Manage all user accounts                           | Book          |
| Override fines and borrowing rules                 | User          |
| View system-wide transaction history               | Fine          |
**Class: Book**

| Responsibilities                                      | Collaborators |
| ----------------------------------------------------- | ------------- |
| Store item details (title, author, ISBN)              | LibrarySystem |
| Track availability status (e.g., available, borrowed) | Transaction   |

**Class: LibrarySystem**

| Responsibilities                               | Collaborators |
| ---------------------------------------------- | ------------- |
| Act as the central facade for all operations   | User          |
| Process user requests (search, borrow, return) | Book          |
| Orchestrate interactions between components    | Transaction   |
| Enforce business logic and rules               | Fine          |
**Class: Transaction**

| Responsibilities                                     | Collaborators |
| ---------------------------------------------------- | ------------- |
| Record borrowing and return details                  | User          |
| Track key dates (borrow date, due date, return date) | Book          |
|                                                      | LibrarySystem |
|                                                      | Fine          |
**Class: Fine**

| Responsibilities                      | Collaborators |
| ------------------------------------- | ------------- |
| Calculate penalties for overdue items | Transaction   |
| Manage the payment status of a fine   | User          |
|                                       | LibrarySystem |
