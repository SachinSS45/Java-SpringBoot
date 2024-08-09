
# Employee Management Application

In this project I am performing CRUD Opperation By Using Rest API's and Testing Application By Using JUnit5 and Mockito.

Attributes : Employee Id, Employee Name , Employee Email,Employee Grade,Employee          JoiningYear, Employee Departement
## Features

- Create New Employee
- Update Existing Employee
- Get All Employees
- Get Specific Employee By using Employee Id
- Delete Employee By Using Employee Id

## Key Highlights 
- Appa kade credit cha card ahe


## Installation

 - [JDK - Download ](https://www.oracle.com/java/technologies/downloads/)
 - [Eclipse IDE - Download](https://www.eclipse.org/downloads/)
 


## Tech Stack

Java 17,SpringBoot 3.2.1, SQL , JUnit-5 , Mockito , H2 DB.


## API Reference

#### Get all Employees

```http
  GET http://localhost:8080/api/employees
```



#### Get Single Employee

```http
  GET /api/employees/${empId}
  Ex : http://localhost:8080/api/employees/2
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `empId`      | `string` | **Required**. Id of item to fetch |



#### Post (Create New Employee)

```http
  POST http://localhost:8080/api/employees
  
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Employee`      | `JSON` | **Required**. Pass the JSON of Employee to Create |


#### Put (Update Employee)

```http
  PUT http://localhost:8080/api/employees
  
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Employee`      | `JSON` | **Required**. Pass the JSON of Employee to Update |


```http
  DELETE /api/employees/${empId}
  Ex : http://localhost:8080/api/employees/2
  
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `empId`      | `String` | **Required**. Pass the Employee Id for Deleting Specific Employee |
## Technologies Learned

Rest API, Spring API,Spring Data JPA,Hibernate , DB Connection,SQL, MVC Architecture,Unit Testing ,Integration Testing, JUnit5, Mockito, H2 DB.


## Feedback

If you have any feedback, please reach out to me at ssshetkar2001@gmail.com


