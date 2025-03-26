# Spring Boot Security with JWT

## 🚀 Overview
This project demonstrates how to implement authentication and authorization using **Spring Boot, Spring Security, and JSON Web Token (JWT)**. It provides secure endpoints with **role-based access control** and user authentication via JWT tokens.

---

## ✨ Features
✅ User registration and authentication  
✅ JWT-based authentication and authorization  
✅ Role-based access control  
✅ Secure API endpoints  
✅ Refresh token mechanism  
✅ Spring Security integration  

---

## 🛠 Technologies Used
- **Spring Boot**
- **Spring Security**
- **JWT (JSON Web Token)**
- **Spring Data JPA**
- **MySQL** (or H2 for in-memory database)
- **Lombok**
- **Maven**

---

## ⚙️ Installation and Setup
### 📌 Prerequisites
Ensure you have the following installed:
- **Java 17+**
- **Maven**
- **MySQL** (optional, if not using H2)

### 📥 Steps to Run the Application
1️⃣ Clone the repository:
   ```sh
   git clone https://github.com/yourusername/spring-security-jwt.git
   cd spring-security-jwt
   ```
2️⃣ Configure the database in **application.properties** (for MySQL):
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/yourdb
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```
3️⃣ Build and run the application:
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

---

## 📡 API Endpoints
### 🔐 Authentication
- **POST** `/api/auth/register` - Register a new user
- **POST** `/api/auth/login` - Authenticate and get a JWT token

### 👤 User Endpoints (Requires Authentication)
- **GET** `/api/user/profile` - Get user profile (**Authenticated users**)
- **GET** `/api/user/admin` - **Admin-only access**

---

## 🔥 Usage
1️⃣ Register a new user using `/api/auth/register`.  
2️⃣ Log in using `/api/auth/login` to get a JWT token.  
3️⃣ Use the token to access secure endpoints by including it in the `Authorization` header as:
   ```sh
   Bearer <token>
   ```

---

## 🔒 Security Implementation
🔹 **JWT filter** for token validation  
🔹 **UserDetailsService** for authentication  
🔹 **Password encryption** using BCrypt  
🔹 **Role-based access control**  

---

## 🤝 Contributing
Feel free to **fork** this repository and submit **pull requests**. Contributions are always welcome! 🎉

---

## 📜 License
This project is licensed under the **MIT License**.

---

## 👨‍💻 Author
- Developed by **Vikas Kumar Gupta** 🚀

---

## 📞 Contact
For any queries or contributions, please reach out:
- 📧 Email: vikasgup074@gmail.com  
- 🔗 LinkedIn: [Vikas Kumar Gupta](https://www.linkedin.com/in/work-with-vikas/)  
- 💻 GitHub: [Vikas9kumargupta](https://github.com/Vikas9kumargupta)  

---
