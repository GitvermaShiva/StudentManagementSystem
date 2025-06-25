Student Management System

A simple console-based application built using Java and MySQL to perform CRUD operations (Create, Read, Update, Delete) on student records.

Features-

1. Add new student details
2. View all students
3. Update existing student data
4. Delete student by ID
5. Data stored securely in MySQL database
6. User-friendly console interface

Technologies Used-

| Technology     | Purpose                             |
|----------------|--------------------------------------|
| Java           | Core application logic               |
| JDBC           | Database connectivity                |
| MySQL          | Data storage and retrieval           |
| Cursor AI IDE  | AI-assisted code writing and review  |

Project Structure-

StudentManagementSystem/
├── db/
│ └── schema.sql # MySQL table creation script
├── lib/
│ └── mysql-connector-j-x.x.x.jar # JDBC Driver
├── src/
│ ├── Main.java # Entry point for console interface
│ ├── DBConnection.java # Database connection logic
│ ├── Student.java # Student data model
│ └── StudentDAO.java # CRUD operations using JDBC
└── README.md # Project documentation

Database Setup-

1. Start MySQL server
2. Run the following SQL (or use `db/schema.sql`):

```sql
CREATE DATABASE IF NOT EXISTS student_db;
USE student_db;

CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(100) NOT NULL
);

🚀 How to Run
Download MySQL JDBC Driver

Place the .jar file in a /lib folder

Compile: javac -cp "../lib/mysql-connector-j-x.x.x.jar" *.java
Run: java -cp ".;../lib/mysql-connector-j-x.x.x.jar" Main

How This Project Runs Locally-
1. Java code is compiled into `.class` files using `javac`
2. JVM runs the code with the MySQL Connector JAR
3. JDBC establishes a connection to MySQL
4. MySQL stores/retrieves student data from disk
5. Windows OS manages all system-level operations

Future Enhancements-
GUI version with JavaFX or Swing
Admin login authentication
Search/filter functionality
Export data to CSV or PDF
REST API version using Spring Boot

License- This project is open-source and available for use and learning.

Author- Shivam Verma
Email: shivamverma63970@gmail.com
BCA Graduate
Aspiring Java Developer
LinkedIn- www.linkedin.com/in/shivam-verma-bb8a64338

