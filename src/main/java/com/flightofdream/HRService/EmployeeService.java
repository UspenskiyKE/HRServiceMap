package com.flightofdream.HRService;

import java.util.HashMap;
import java.util.List;

public interface EmployeeService {
    Employee addEmployee( String firstName, String lastName);
    Employee removeEmployee( String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
    HashMap<String,Employee> showEmployeeList();
}
