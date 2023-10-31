# Enterprise-Java-Development-6.02

# Microservices Lab (Enterprise Java Development - 6.02)

This project is part of the Microservices Lab for Enterprise Java Development (Course Code: 6.02). It involves creating a microservices application using Eureka and Rest Templates.
The application consists of multiple services, including a discovery service, student information service, grades data service, and student catalog service.

## Project Structure

The project is organized into multiple microservices, each serving a specific purpose. Here's an overview of the project structure:

### 1. Discovery Service (Eureka Server)

- Responsible for service discovery.
- Acts as the Eureka Discovery Server.

### 2. Student Info Service

- Holds student information.
- Models: Student (id, name, age).
- Controller: StudentController (endpoint to get a student by id).
- Repository: StudentRepository.

### 3. Grades Data Service

- Holds grades of each course.
- Models: Course (course code, course name), Grade (id, grade, studentId).
- DTO: CourseGrade.
- Controllers: GradeController (endpoint to get all grades), CourseController (endpoints to get a course by course code and get grades based on the course code).
- Repositories: CourseRepository, GradeRepository.
- Services: CourseService.

### 4. Student Catalog Service

- Communicates with other services.
- Returns a catalog with grades grouped by course name and student information per grade.
- Models: Catalog (course name, student grades), StudentGrade (student name, age, grade).
- Controller: CatalogController (endpoint to get the student catalog per course based on the course code).

## Usage

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/yourusername/Enterprise-Java-Development-6.02.git
2. reload the depenceies before run the application. 
