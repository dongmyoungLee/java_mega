package com.Inherit.controller;

import com.Inherit.model.vo.Employee;
import com.Inherit.model.vo.Student;
import com.Inherit.model.vo.Teacher;

public class InheritController {
	
	public void basicInherit() {
		// 기본 상속..
		// 1. java 에서 사용하는 모든 클래스는 Object 클래스를 상속 받고 있다.
		
		// 클래스에 상속관계 설정하기
		// 두개의 클래스간에 부모(super), 자식(sub) 관계를 설정하는 것을 말 한다.
		// 선언방법 : 클래스 선언부에 extends 예약어 사용
		// public class Test(클래스명) extends 상속할 클래스명(부모클래스) { 구현 }
		
		
		Student s1 = new Student();
		Employee e1 = new Employee();
		Teacher t1 = new Teacher(); 
		
		// 상속..
		s1.setName("학생");
		e1.setName("직원");
		t1.setName("선생");
		
		
		
		
	}
}
