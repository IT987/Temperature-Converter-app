# Temperature-Converter
This Spring MVC application provides a simple temperature conversion tool allowing users to convert temperatures between Celsius and Fahrenheit. The application is built using Java and utilizes the Spring framework for web development.

## Feautures
* Converts temperatures from Celsius to Fahrenheit and vice versa.
* Utilizes JavaServer Pages (JSP) for front-end presentation.
* Implements Spring MVC architecture for handling web requests.
* Validates user input using Hibernate Validator.

## Project Structure
* configuration: Contains configuration classes for Spring MVC setup.
  * TempConverterInitializer.java: Initializes the Spring DispatcherServlet.
  * TempConverterConfig.java: Configuration class for defining Spring beans and MVC setup.
* controllers: Contains the controller class responsible for handling web requests.
  * TemperatureConverterController.java: Controller class for displaying conversion forms and handling conversions.
* model: Contains the model class representing temperature conversion data.
  * TemperatureConverterModel.java: POJO class representing temperature conversion data.
* services: Contains the service interface and implementation for temperature conversion.
  * TemperatureConverterService.java: Interface defining methods for temperature conversion.
  * TemperatureConverterServiceImpl.java: Implementation of the temperature conversion service.
* webapp/WEB-INF/view: Contains JavaServer Pages (JSP) files for user interface.
  * convert.jsp: JSP file for displaying the conversion form and results.  
* pom.xml: Maven project configuration file specifying project dependencies.

## Dependencies
* Spring Web MVC: Used for building web applications in the Spring Framework.
* Hibernate Validator: Provides flexible and context-aware validation mechanisms for Java applications.
* JSTL: Standard tag library for JSP pages.
* Java Servlet API: Implement servlets to handle HTTP requests and responses in Java web applications, 

## Usage
1. Clone the repository to your local machine.
2. Build the project using Maven: mvn clean install.
3. Deploy the generated WAR file to a servlet container such as Apache Tomcat 9.
4. Access the application through a web browser.

## Contributing
Contributions are welcome! If you have any suggestions, improvements, or feature requests, feel free to open an issue or submit a pull request.
