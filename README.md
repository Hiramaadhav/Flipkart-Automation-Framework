Overview

This project is a Test-Driven Development (TDD) automation framework for testing the Flipkart website. The framework automates key user workflows such as searching for products, adding them to the cart, and verifying cart contents. It uses Java, Selenium WebDriver, Cucumber BDD, Log4j2 for logging, and Extent Reports for reporting. The framework supports cross-browser testing on Chrome, Firefox, and Edge.

Features

Test-Driven Development (TDD) approach

Page Object Model (POM) for better code maintainability

Selenium WebDriver for browser automation

Explicit Waits for better synchronization

Log4j2 for logging test execution details

Extent Reports for detailed test reporting

Maven Project for dependency management and build execution

Tools & Technologies Used

Programming Language: Java

Automation Tool: Selenium WebDriver

Logging: Log4j2

Reporting: Extent Reports

Build Tool: Maven

Version Control: Git

IDE: IntelliJ IDEA / Eclipse

Project Structure

FlipkartAutomationFramework/
│-- src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/          # Page Object Model classes
│   │   │   ├── utils/          # Utility classes (waits, logging, etc.)
│   ├── test/
│   │   ├── java/
│-- pom.xml                     # Maven dependencies
│-- config.properties            # Configuration file (URLs, browser settings, etc.)
│-- log4j2.xml                   # Log4j2 configuration
│-- extent-config.xml            # Extent Report configuration

Setup & Installation

Clone the Repository:

git clone https://github.com/your-repository/FlipkartAutomationFramework.git

Open the Project in an IDE (IntelliJ/Eclipse).

Install Dependencies:

mvn clean install

Configure config.properties file with Flipkart URL and browser settings.

Run the Tests:

mvn test

Running Tests

Run all tests:

mvn test


Logging & Reporting

Logs are stored in the logs/ directory.

Extent Reports are generated in the reports/ directory after execution.

Contributing

Fork the repository

Create a feature branch (git checkout -b feature-branch)

Commit changes (git commit -m "Add new feature")

Push to the branch (git push origin feature-branch)

Open a pull request
