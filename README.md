# Learning MVC Framework 
<h1 align="center">:blush: Note By Me :100:</h1>

<h2 align="center">Pos Coron- Ecommerce Shopping Web With Spring MVC Framework
</h2>

## Table of Contents:
* [Chapter I:Create Maven Project](#intro)
    * [1.1: Step by Step Create Maven Project](#1.1)
    * [1.2:	Problems Statement](#1.2)
    * [1.3: Scope](#1.3)
* [Chapter II: LITERATURE REVIEW](#II)
    * [2.1: Similar Applications / Systems:](#2.1)	
    * [2.2: Platform and Tools Review](#2.2)
* [Chapter III: SYSTEM DESIGN](#III)
    * [3.1.	System Requirement Specification](#3.1)
    * [3.2: Functional Requiremen](#3.2)
    * [3.3: Non-functional Requirements](#3.3)
        * [3.3.1: Product Requirements](#3.3.1)
        * [3.3.2: Organizational Requirements](#3.3.2)
    * [3.4: System Design Specification](#3.4)
        * [3.4.1: Use – Case Diagram](#3.4.1)
        * [3.4.2: Sequence Diagram](#3.4.2)
        * [3.4.3: Activity Diagram](#3.4.3)
        * [3.4.4: Entity – Relationship Diagram](#3.4.4)
        * [3.4.5: Database Relational Schema](#3.4.5)
        * [3.4.6: Class Diagram](#3.4.6)
* [Chapter IV: CHAPTER IV: - SYSTEM IMPLEMENTATION](#Chapter_IV)
    * [4.1: Configure database connection:](#4.1)
    * [4.2: Add run mySQL file to add data](#4.2)
    * [4.3: Run the project:](#4.3)
    * [4.4: Login Page](#4.4)
        * [4.5: Register new account](#4.4.1)
        * [4.6: Login by new account](#4.4.2)
* [Chapter V: References](#References)
    * [5.1: Database Diagram](#5.1)
    * [5.2: User Sequence Diagram](#5.2)
    * [5.3: Admin Sequence Diagram](#5.3)
    * [5.4: Class Diagram](#5.4)

<h2 id="intro">Chapter I: Create Maven Project</h2>
    &emsp;<h3 id="1.1">1.1: Step by Step Create Maven Project</h3>

- Step 1: Choose maven project in New Project of Eclipse EE IDE.
    ![image](https://user-images.githubusercontent.com/94380995/177005508-ff2733e7-78f4-4095-bc71-8c65b61fd10c.png)

- Step 2: Tick into button "Create Single project".
    ![image](https://user-images.githubusercontent.com/94380995/177005545-56278927-c19f-4c91-84a9-03a643341057.png)

- Step 3: Fill name for project.<br>

    ![image](https://user-images.githubusercontent.com/94380995/177005567-31eb661d-ebe6-409e-8d00-85663c486a9e.png)

### Note: After Create Prject, there is error at pom.xml file because system can not find web.xml file
- Step 4: Create web.xml in folder WEB-INF of folder webapp
![image](https://user-images.githubusercontent.com/94380995/177005759-a6d95203-3329-43fb-bae3-41845fb9a717.png)

- Step 5: Add library for pom.xml
    - #### If there is an error with title "Could not initialize class org.apache.maven.plugin.war.util.WebappStructureSerializer"
    - add this code below packaging war 
    - ![image](https://user-images.githubusercontent.com/94380995/177005994-fa3be441-1a61-493f-8bcd-a4b63ff6ba41.png)
    - <a href="https://stackoverflow.com/questions/68397062/could-not-initialize-class-org-apache-maven-plugin-war-util-webappstructureseria">Link StackOverFlow</a>

    - Go to an maven reponsitory add lib for pom.xml
        - spring mvc
        - java servlet api
        - jsp api
        - ...

        ![image](https://user-images.githubusercontent.com/94380995/177006082-ed159d55-0ab3-4d4c-8e4d-22ad7658cc37.png)

- Step 6: Create index.jsp in webapp folder.
- Step 7: Create new folder for Controller and create class HomeController 
    - add @Controller
    - add @RequestMapping("/")
    ![image](https://user-images.githubusercontent.com/94380995/177006473-ab6a36c5-12dd-4cd0-b78f-d14566cbf7eb.png)
- Step 8: Define some work flow for web.xml
    ![image](https://user-images.githubusercontent.com/94380995/177022620-f1c55d47-bb88-4083-bb59-3a4d44563c53.png)
- Step 9: Download Spring tool 3.4 in market of Eclipse EE IDE
- Step 10: Create Index-Show-servlet.xml by bean tool and using this lib.
    ![image](https://user-images.githubusercontent.com/94380995/177022721-9dec69da-63fe-40f2-99fb-2a8bab192e5e.png)
