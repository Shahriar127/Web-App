      **Web App - Spring Boot Project**

![Logo](https://camo.githubusercontent.com/9c2894e103b259cd63d457b16b84e8ad53ad44d001c496816c857d750ce6915b/68747470733a2f2f7069636f636c692e696e666f2f696d616765732f737072696e672d626f6f742e706e67)


Documentation
1. Controller:

A controller in Spring Boot handles incoming HTTP requests, processes them (often interacting with services), and returns the appropriate response to the client.<br/>

@RestController: Defines the class as a REST controller that handles HTTP requests.<br/>

@RequestMapping: Used at the class level to set a base URL path for all endpoints in the controller. At the method level, it specifies the path for that particular endpoint.

@GetMapping: Handles HTTP GET requests, typically used to retrieve resources.<br/>

@PostMapping: Handles HTTP POST requests, typically used to create new resources.<br/>

@PutMapping: Handles HTTP PUT requests, typically used to update existing resources.<br/>

@DeleteMapping: Handles HTTP DELETE requests, typically used to delete resources.<br/>

There can be one or more controllers in a Spring Boot application.<br/>

2. Key Generator:

To initialize primary keys, I use annotations in the key generator class:

@Data: Generates boilerplate code such as getters, setters, toString(), equals(), and hashCode() methods.<br/>
@AllArgsConstructor: Creates a constructor with parameters for all fields.<br/>
@NoArgsConstructor: Creates a no-argument constructor.<br/>
@Entity: Marks the class as a JPA entity to map it to a database table.<br/>
@Id: Marks a field as the primary key.<br/>
3. Repository:

A repository in Spring Boot provides an abstraction layer for data access, allowing CRUD operations and custom queries on the database. It simplifies database interactions by leveraging Spring Data JPA.

java
Copy code
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
Here, Product is the entity class, and Integer is the data type for the primary key.<br/>

4. Service Class:

@Service: Indicates that the class is a service, which holds business logic.<br/>
@Autowired: Automatically provides an instance of a class to another class, so you don’t have to create it manually.<br/>
ProductRepo repo: Connects the service layer to the repository for data storage and retrieval.<br/>

Methods in the service class:

getProducts(): Retrieves a list of all products from the repository.<br/>
getProductById(int prodId): Finds a product by its ID; if not found, returns a new, empty product.<br/>
addProduct(Product prod): Saves a new product to the repository.<br/>
updateProduct(Product prod): Updates an existing product in the repository.<br/>
deleteProduct(int prodId): Deletes a product from the repository using its ID.<br/>
