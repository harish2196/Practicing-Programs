package com.chainsys.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {
		Student student1 = new Student(
				"Harish",22, new Address("1234"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("1234")));

		Student student2 = new Student(
				"Jah",30, new Address("1233"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("3333"), new MobileNumber("1233")));

		List<Student> students = Arrays.asList(student1, student2);

		Optional<Student> stud = students.stream()
				.filter(student -> student.getName().equals("Harish"))
				.findFirst();
		System.out.println(stud.isPresent() ? stud.get().getName() : "No student found");
		System.out.println("--------------------");

		
		Set<Student> studentsInRange = students.stream()
				.filter(student -> student.getAge() >= 18 && student.getAge() <= 23)
				.collect(Collectors.toSet());

		studentsInRange.forEach(student -> System.out.println("Age between from 18 to 23:"+ student.getName()));
		System.out.println("--------------------");

		List<Student> letterRange = students.stream()
				.filter(student -> student.getName().length() < 4)
				.collect(Collectors.toList());

		letterRange.forEach(student -> System.out.println("Name longer than seven characters: " + student.getName()));
		System.out.println("--------------------");


		Optional<Student> stud1 = students.stream()     					        
				.filter(student -> student.getAddress().getZipcode().equals("1234"))
				.findFirst();
		System.out.println(stud1.isPresent() ? stud1.get().getName() : "No student found");
		System.out.println("--------------------");


		Set<Student> stud2 = students.stream()
				.filter(student -> student.getMobileNumbers().stream().anyMatch(x -> Objects.equals(x.getNumber(), "3333")))
				.collect(Collectors.toSet());

		String result1 = stud2.stream()
				.map(std -> std.getName())
				.collect(Collectors.joining(",", "[", "]"));

		System.out.println(result1);
		System.out.println("--------------------");


		List<Student> stud3 = students.stream()
				.filter(student -> student.getMobileNumbers().stream().allMatch(x -> Objects.equals(x.getNumber(), "1233") || Objects.equals(x.getNumber(), "1234")))
				.collect(Collectors.toList());

		String result4 = stud3.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(result4);
		System.out.println("--------------------");


		List<String> nameList =
				Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");

		nameList.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		System.out.println("--------------------");


		List<String> namesList =
				Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
		System.out.println("Sorting:");
		namesList.stream()
		.sorted()
		.forEach(System.out::println);
		System.out.println("--------------------");

		boolean sortConditionFlag = true;

		Stream<Student> conditionalFilterResult = students.stream()
				.filter(std -> std.getName().startsWith("H"));

		List<Student> list = conditionalFilterResult.collect(Collectors.toList());
		System.out.println("After filter and conditional sorting :");
		list.forEach(s -> System.out.println(s.getName()));
		System.out.println("--------------------");
	}
}