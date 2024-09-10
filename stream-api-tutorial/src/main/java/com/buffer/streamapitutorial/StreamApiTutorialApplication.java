package com.buffer.streamapitutorial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamApiTutorialApplication {

	static List<Employee> employees= new ArrayList<Employee>();
	static {
        employees.add(
                new Employee("Shabbir", "Dawoodi", 5000.0, List.of("Project 1","Project 2"))
        );

        employees.add(
                new Employee("Nikhil", "Gupta", 6000.0, List.of("Project 1","Project 3"))
        );

        employees.add(
                new Employee("Shivam", "Kumar", 5500.0, List.of("Project 3","Project 4"))
        );

    }
	public static void main(String[] args) {
		//SpringApplication.run(StreamApiTutorialApplication.class, args);
	    //for each
		//employees.stream()
		//.forEach(employee-> System.out.println(employee));
		employees.stream()
		.forEach((p)->{ 
			System.out.println(p.toString());
		});
		Stream.of(employees).
		forEach(employee-> System.out.println("object:"+employee.toString()+"cccc\n"));
	    int i=0;
		Stream.of(employees).
		forEach((p)->{ 
			
			System.out.println(i+"object:"+p.toString()+"cccc\n");
			});
	    
		List<Employee> lst= employees.stream().map(employee -> new Employee(
				employee.getFirstName(),
				employee.getLastName(),
				employee.getSalary()*2.3,
				employee.getProjects())).collect(Collectors.toList());
		
		System.out.println(lst);
		List<Employee> lst2= employees.stream()
				.filter(employee->employee.getSalary()>5000)
				.map(employee -> new Employee(
				employee.getFirstName(),
				employee.getLastName(),
				employee.getSalary()*2.3,
				employee.getProjects())).collect(Collectors.toList());
		System.out.println(lst2);
		
		Employee lst3= employees.stream()
				.filter(employee->employee.getSalary()>5000)
				.map(employee -> new Employee(
				employee.getFirstName(),
				employee.getLastName(),
				employee.getSalary()*2.3,
				employee.getProjects())).findFirst().orElse(null);
		System.out.println(lst3);
		
		String projects = employees.stream()
		.map(employee->employee.getProjects())
		.flatMap(strings -> strings.stream())
		.collect(Collectors.joining(","));
		System.out.println(projects);
		
		List<Employee> lst4= employees.stream().skip(1).limit(1)
		.collect(Collectors.toList());	
		System.out.println(lst4);
		
		Stream.generate(Math::random).limit(5)
		.forEach(value-> System.out.println(value));
		
		List<Employee> sortedEmployees=employees.stream()
				.sorted((o1,o2)->o1.getFirstName()
						.compareToIgnoreCase(o2.getFirstName()))
				.collect(Collectors.toList());
		System.out.println(sortedEmployees);
		
		Employee e=employees.stream()
		.max(Comparator.comparing(Employee::getSalary))
		.orElseThrow(NoSuchElementException::new);
		System.out.println(e);
		
		Double total=employees.stream().map(employee->employee.getSalary())
		.reduce(0.0,Double::sum);
		System.out.println(total);
	}

}
