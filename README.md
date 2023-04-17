E-commerce API
This is a RESTful API for an E-commerce application, built using Java Spring technologies. It provides endpoints for managing products and uses MongoDB as the database for data storage.

Technologies Used
Java
Spring Boot
Hibernate
MongoDB
Getting Started
To get started with this project, follow the steps below:

Prerequisites
Java Development Kit (JDK) 8 or higher
MongoDB database
Installation
Clone this repository to your local machine.
Set up a MongoDB database and update the application.properties file with the database connection details.
Access the API endpoints using a REST client such as Postman or any web browser.
API Documentation
The API is documented using Swagger, which provides a user-friendly interface for exploring and testing the endpoints. Once the API is running, you can access the Swagger UI documentation by navigating to http://localhost:8080/swagger-ui.html in your web browser.

Fixtures for Base Data
This project includes a Fixtures class that provides initial data for testing the API. You can run this class to populate the database with sample data for products, users, and orders.

API Endpoints
GET /api/products: Retrieve a list of all products.
GET /api/products/{id}: Retrieve details of a specific product by ID.
POST /api/products: Create a new product.
PUT /api/products/{id}: Update details of a specific product by ID.
DELETE /api/products/{id}: Delete a specific product by ID.
GET /api/users: Retrieve a list of all users.
GET /api/users/{id}: Retrieve details of a specific user by ID.
POST /api/users: Create a new user.
PUT /api/users/{id}: Update details of a specific user by ID.
DELETE /api/users/{id}: Delete a specific user by ID.
GET /api/orders: Retrieve a list of all orders.
GET /api/orders/{id}: Retrieve details of a specific order by ID.
POST /api/orders: Create a new order.
PUT /api/orders/{id}: Update details of a specific order by ID.
DELETE /api/orders/{id}: Delete a specific order by ID.
License
This project is licensed under the MIT License.

Contributing
Contributions are welcome! If you would like to contribute to this project, please submit a pull request with your changes or open an issue for discussion.

Contact
If you have any questions or feedback, please contact amitjangrabbt@gmail.com



