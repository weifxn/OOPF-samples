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

# 1.0 Classes
There are always 2 types of classes. We'll use [employeeObject](https://github.com/wf-lee/OOP-samples/tree/master/employeeObject) for this example. 
```
Employee.java
EmployeeTest.java
```

# 2.0 Class: `Employee.java`
- Stores object data in attributes.
- Blueprint for **creating** objects, **retrieving** and **modifying** object data.
- Contains 2 elements:
    - **Attributes**
    - **Methods**
        - Constructor (*create*)
        - Getter (*retrieve*) 
        - Setter (*modify*)

## 2.1 Attributes
- Normally, attributes are encapsulated (*cannot be accessed by other files*) to prevent modifying without using setter method.
    ```java
    // private = encapsulation
    private String name;
    private double salary;
    ```
    
## 2.2 Methods
- ### 2.1.1 Constructor
    - To **create** new object and store data into attributes.
        ```java
        public Employee(String n, double s) {
            name = n;
            salary = s;
        }

        ``` 

- ### 2.1.2 Getter
    - To **retrieve** existing object data.
        ```java
        // Retrieved data will return as String
        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
        ```
        
- ### 2.1.3 Setter
    - To **modify** existing object data.
        ```java
        // void means there's no return value.
        public void setName(String n) {
            name = n;
        }

        public void setSalary(double n) {
            salary = s;
        }
        ```


# 3.0 Class: `EmployeeTest.java`
- Create multiple objects. 
- Display and modify object data retrieved using methods from `Employee.java`.
- Everything should be inside the main method.
    ```java
    public static void main(String[] args) {
        ...
    }
    ```

## 3.1 Methods
- ### 3.1.1 Constructor
    - **Create** new objects by calling **constructor** method `Employee()` from `Employee.java`.
        ```java
        // Class Name = new Constructor(Data, Data);
        Employee e1 = new Employee("Jim", 1000);
        Employee e2 = new Employee("Pam", 1000);
        ``` 

- ### 3.1.2 Getter
    - **Retrieve** object data by calling **getter** method `getName()` and `getSalary` from `Employee.java`.
    ```java
    System.out.println(e2.getName() + " & " + e1.getName());
    // This produces the following output:
    // Pam & Jim
    ```

- ### 3.1.3 Setter
    - **Modify** object data by calling **setter** method `setName()` and `setSalary()` from `Employee.java`. 
    ```java
    e2.setName("Dwight");
    e2.setSalary(2000);
    // This changes the name of object e2 from Pam to Dwight
    // and increases salary from 1000 to 2000
    ```



That's it, these are the basics of Object Oriented Programming.
Now, let's look at **static** methods and attributes.

# 4.0 Static
- Only can be seen in `Employee.java`
- The data stored inside a static attribute applies to *all* objects.
- It is used when you want to retrieve the total of object data.
- Note that static attributes can only be used in static methods.

## 4.1 Calculate total salary
1. In `Employee.java`, create a **static** attribute `totalSalary`  
    ```java
    private static double totalSalary;
    ```
2. Create a *getter* static method `getTotal()` 
    ```java
    public static double getTotal() {
        return totalSalary;
    }
    ```
3. Create a *setter* static method `setTotal()` 
    ```java
    public static void setTotal(double t) {
        totalSalary = totalSalary + t;
    }
    ```
