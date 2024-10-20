package org.example.inflearnjavatest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudyTest {

	@Test
	void create(){
		Study study = new Study();
		assertNotNull(study);
		System.out.println("create");
	}

	@Test
	void create1(){
		System.out.println("create1");
	}

	@BeforeAll
	static void beforeAll(){
		System.out.println("before all");
	}

	@AfterAll
	static void afterAll(){
		System.out.println("after all");
	}

	@BeforeEach
	void beforeEach(){
		System.out.println("beforeEach");
	}

	@AfterEach
	void afterEach(){
		System.out.println("afterEach");
	}
}