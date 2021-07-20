# SpringBootWebAppWithH2

This project is a tutorial for building an Application using Spring Boot.

### The components
1. SpringBootWebAppWithH2Application - the main Spring application with example Get API Method with URL "/hello".
2. Adding JPA entity (Customer) that will be stored in the H2 database.
3. Create a repository interface - CustomerRepository which extends CrudRepository that Spring Data JPA will create a repository implementation from this interface at runtime.
   Spring not only implement the existing methods at the CrudRepository class, but Spring also provide dynamic implementation of custom methods using naming standards defined by Spring (such as the findAllByFirstName method).
4. Create a web controller - CustomerController.
   A controller handles HTTP requests for your Spring application. The application will use the /add endpoint to add Customer objects to the database, the /list endpoint to fetch all Customer objects from the database, and the /find/{id} endpoint to find the customer with the specified ID.
5. This tutorial is from - https://www.jetbrains.com/help/idea/your-first-spring-application.html & https://www.jetbrains.com/help/idea/spring-support-tutorial.html




This is how the Home page should look like:


![home_page](/images/home_page.png?raw=true)




This is how the page should look like after adding a customer:


![added_customer](/images/added_customer.png?raw=true)




This is how the page should look like if you choose to list the customers:


![list_customers](/images/list_customers.png?raw=true)
