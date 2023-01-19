package com.oneStopSolutions.admin.service;


import com.oneStopSolutions.admin.exception.AdminException;
import com.oneStopSolutions.admin.exception.DepartmentException;
import com.oneStopSolutions.admin.model.Admin;
import com.oneStopSolutions.admin.model.Department;
import com.oneStopSolutions.customer.Beans.Login;
import com.oneStopSolutions.customer.Beans.Output;
import com.oneStopSolutions.operator.Beans.Operator;
import org.hibernate.usertype.LoggableUserType;

import java.util.List;

public interface AdminServices {

public Output registerAdmin(Admin admin) throws AdminException;
    public Admin adminLogin(Login login)throws AdminException;

    public Output createDepartment(Department department)throws DepartmentException;

    public Output deleteDepartmentById(Integer id) throws DepartmentException;

    public Output updateDepartmentNameById(Integer id, String name) throws DepartmentException;

    public List<Department> getAllDepartment() throws DepartmentException;

    public Department getDepartmentById(Integer id) throws DepartmentException;


    public Output addOperator(Operator operator)throws AdminException;
    public Output removeOperatorById(Integer id)throws AdminException;
    public Output updateOperator(Operator operator)throws AdminException;
    public Operator getOperatorById(Integer id)throws AdminException;
    public List<Operator> getAllOperator()throws AdminException;


}
