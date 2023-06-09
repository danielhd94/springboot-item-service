# Spring boot item service

The item service is a web service that generates details for a shopping cart, consuming the product microservice to obtain related product information.

## Features

- Retrieves related product information by calling the product microservice.
- Allows to retrieve detailed information about a specific item, including the details of the associated product.

## Technologies Used

- Java: Main programming language.
- Spring Boot: Framework for Java application development.
- Spring Cloud: Set of tools for creating microservice architectures.
- Feign: Library for consuming RESTful web services.
- H2 Database: In-memory database used for development and testing.

## Configuration

1. Clone this repository: `git clone https://github.com/danielhd94/springboot-item-service.git`
2. Navigate to the project directory: `cd springboot-item-service`
3. Open the project in your preferred IDE (such as Spring Tools Suite).
4. Run the application. The H2 in-memory database will be automatically created.

## Endpoints

The following endpoints are available in the item service:

- `GET /list`: Retrieves a list of all items, including the details of the associated products.
- `GET /detail/{id}`: Retrieves detailed information about a specific item, including the details of the associated product.

## Consuming the product microservice

The item service consumes the product microservice to obtain related product information. Make sure that the product microservice is up and running and configured correctly.

## Contributions

Contributions are welcome. If you want to improve this item service, you can fork the repository, make your changes, and submit a pull request.

## Author

Daniel Hernandez

## License

This project is licensed under the MIT License. See the LICENSE file for more information.

## Contact

If you have any questions or suggestions regarding the item service, you can contact me at danielhd94@hotmail.com.
