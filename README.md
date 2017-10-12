# Factory Pattern Assignment (100 Total Points)

## 20 Points

* Project name: workspace-leon-huang-o2-java1
* include only one project `Project1`
* include only one main method in the class `Driver`
* You will zip this entire workspace (file named FOR EXAMPLE: workspace-dan-peters-o2-java1.zip and submit BEFORE DUE DATE (uploaded to BlackBoard.)

## 5 Points

* create superclass `Person`
* create derive class `Student` and `Employee`

## 15 Points

- Students sort by `last name` or `age` or `GPA`
- Object.toString():

```
Student Dan Peters, age 16, GPA 4.0
```

## 15 Points

- Employees sort by `wage`
- Object.toString():

```
Employee Dan Peters, age 16, hourly wage $15.75
```

## 20 Points

* use `Simple Factory Design` to create 3 `Student` and 3 `Employee`

i.e. one factory class creates all target objects.

### Note:

In future, you will use `advanced Factory Design Pattern`, i.e. one derived factory class for each target object (or you may elect to use Factory Design Pattern immediately).

## 10 Points

Create one or more `Control Classes`.

Your main method would look like:

    Company.demo();
    School.demo();

## 10 Points

You `control class` demo would look like:

```java
Company obj = new Company();
obj.addEmployee(“Dan”, “Peters”, 16, 15.75);
obj.sortEmployees();
```

## 5 Points

Copy ALL console output and paste AS A COMMENT into the main method (at the end).