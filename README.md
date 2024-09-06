
  **Web App - Spring Boot Project**

![Logo](https://camo.githubusercontent.com/9c2894e103b259cd63d457b16b84e8ad53ad44d001c496816c857d750ce6915b/68747470733a2f2f7069636c692e696e666f2f696d616765732f737072696e672d626f6f742e706e67)

### Documentation

**1. Controller:**

A controller in Spring Boot manages incoming HTTP requests, processes them (often interacting with services), and returns responses to the client.<br/>

- **`@RestController`**: Marks the class as a REST controller for handling HTTP requests.<br/>
- **`@RequestMapping`**: Sets a base URL path for all endpoints in the controller when used at the class level. At the method level, it specifies the path for that endpoint.<br/>
- **`@GetMapping`**: Handles HTTP GET requests to retrieve resources.<br/>
- **`@PostMapping`**: Handles HTTP POST requests to create new resources.<br/>
- **`@PutMapping`**: Handles HTTP PUT requests to update existing resources.<br/>
- **`@DeleteMapping`**: Handles HTTP DELETE requests to delete resources.<br/>

A Spring Boot application can have one or more controllers.<br/>

**2. Key Generator:**

To initialize primary keys, the key generator class uses the following annotations:

- **`@Data`**: Generates boilerplate code like getters, setters, `toString()`, `equals()`, and `hashCode()` methods.<br/>
- **`@AllArgsConstructor`**: Creates a constructor with parameters for all fields.<br/>
- **`@NoArgsConstructor`**: Creates a no-argument constructor.<br/>
- **`@Entity`**: Marks the class as a JPA entity to map it to a database table.<br/>
- **`@Id`**: Marks a field as the primary key.<br/>

**3. Repository:**

A repository in Spring Boot provides an abstraction layer for data access, enabling CRUD operations and custom queries. It simplifies interactions with the database through Spring Data JPA.

```java
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
```

Here, `Product` is the entity class, and `Integer` is the data type for the primary key.<br/>

**4. Service Class:**

- **`@Service`**: Indicates that the class contains business logic.<br/>
- **`@Autowired`**: Automatically injects an instance of a class into another class.<br/>

**`ProductRepo repo`**: Connects the service layer to the repository for data storage and retrieval.<br/>

Methods in the service class:

- **`getProducts()`**: Retrieves a list of all products from the repository.<br/>
- **`getProductById(int prodId)`**: Finds a product by its ID; returns a new, empty product if not found.<br/>
- **`addProduct(Product prod)`**: Saves a new product to the repository.<br/>
- **`updateProduct(Product prod)`**: Updates an existing product in the repository.<br/>
- **`deleteProduct(int prodId)`**: Deletes a product from the repository using its ID.<br/>

---
