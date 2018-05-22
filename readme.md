# PRG1203 Java Object Oriented Samples

## Samples
Basics:
- [Bank](https://github.com/wf-lee/OOP-samples/tree/master/bankObject)
- [Car](https://github.com/wf-lee/OOP-samples/tree/master/carObject)
- [House](https://github.com/wf-lee/OOP-samples/tree/master/carObject)
- [Student](https://github.com/wf-lee/OOP-samples/tree/master/carObject)

Static methods:
- [Invoice](https://github.com/wf-lee/OOP-samples/tree/master/carObject)
- [Employee](https://github.com/wf-lee/OOP-samples/tree/master/carObject)

## Classes
There are always 2 types of classes. We'll use [employeeObject](https://github.com/wf-lee/OOP-samples/tree/master/employeeObject) for this example. There are two files in the folder:
```
Employee.java
EmployeeTest.java
```

### `Employee.java`
- Blueprint for **creating** objects, also for **modifying** and **retrieving** object data.
- Contains 2 elements:
    - **Attributes**
    - **Methods**
        - Constructor *(create)*
        - Setter *(modify)*
        - Getter *(retrieve)*        

### `EmployeeTest.java`
- Create new objects by calling **constructor method** from `Employee.java`
    ```java
    Employee e1 = new Employee("Jim", 9999);
    Employee e2 = new Employee("Pam", 9999);
    ``` 

