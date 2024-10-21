package org.example.inflearnjavatest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudyTest {
	int value = 1;
	@Test
	@Order(1)
	void create_new_Study() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Study(-10));
		assertEquals("스터디 최대 참석자는 0보다 커야 합니다.",exception.getMessage());
		Study study = new Study(value++);
		/*assertNotNull(study);
		assertEquals(StudyStatus.DRAFT, study.getStatus(), "스터디를 처음 만들면 상태 값이 DRAFT여야 함");
		assertTrue(study.getLimit() > 0, "스터디 최대 참석 인원은 0보다 커야 함");*/
		assertAll(
				() -> assertNotNull(study),
				() -> assertEquals(StudyStatus.DRAFT, study.getStatus(),"스터디 처음 만들면 상태 값은 DRAFT"),
				() -> assertTrue(study.getLimit() > 0, "스터디 참석 인원은 0보다 커야 함")
		);
	}

	@DisplayName("반복 스터디 만들기")
	@Order(2)
	@RepeatedTest(value = 10, name = "{displayName}, {currentRepetition}/{totalRepetitions}")
	void create_new_Study2(RepetitionInfo repetitionInfoinfo) {
		System.out.println(value++);
		System.out.println("test" + repetitionInfoinfo.getCurrentRepetition() + "/" + repetitionInfoinfo.getTotalRepetitions());
	}

	@DisplayName("여자친구 만들기")
	@Order(3)
	@ParameterizedTest(name = "{index} {displayName} message = {0}")
	@ValueSource(strings = {"여자친구", "사귀고","싶다"})
	@EmptySource
	@NullSource
	void parameterizedTest(String message) {
		System.out.println(message);
		System.out.println("반복 테스트" + value++);
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