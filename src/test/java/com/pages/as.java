package com.pages;
Advantages of Page Object Model Framework:
Code reusability – We could achieve code reusability by writing the code once and use it in different tests.
Code maintainability – There is a clean separation between test code and page specific code such as locators and layout which becomes very easy to maintain code. Code changes only on Page Object Classes when a UI change occurs. It enhances test maintenance and reduces code duplication.
Object Repository – Each page will be defined as a java class. All the fields in the page will be defined in an interface as members. The class will then implement the interface.
Readability – Improves readability due to clean separation between test code and page specific code