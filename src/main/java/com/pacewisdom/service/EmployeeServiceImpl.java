package com.pacewisdom.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pacewisdom.dao.EmployeeDao;
import com.pacewisdom.dao.EmployeeDaoImpl;
import com.pacewisdom.dto.EmployeeDto;
import com.pacewisdom.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired(required = true)
	private EmployeeDao employeeDao;

	@Override
	public Employee saveEmployee(EmployeeDto registerDTO) {
		// TODO Auto-generated method stub

		ModelMapper modelMapper = new ModelMapper();

		Employee employee = modelMapper.map(registerDTO, Employee.class);

		return employeeDao.saveEmployee(employee);
	}

	@Override
	public Employee updateEmployee(EmployeeDto registerDTO) {
		ModelMapper modelMapper = new ModelMapper();

		Employee employee = modelMapper.map(registerDTO, Employee.class);
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public String deleteEmployee(int id) {
		/*
		 * ModelMapper modelMapper = new ModelMapper();
		 * 
		 * Employee employee = modelMapper.map(registerDTO, Employee.class);
		 */
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployees();
	}

	@Override
	public Optional<Employee> getEmployeeById(int Id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(Id);
	}

}
