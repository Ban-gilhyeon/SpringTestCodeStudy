package study;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import domain.Member;
import java.util.Optional;
import member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StudyServiceTest {

	@Mock MemberService memberService;
	@Mock StudyRepository studyRepository;

	@Test
	void createStudyService(){
		//given
		Member member = new Member();
		member.setId(1L);
		member.setEmail("ddd@ddd.com");
		StudyService studyService = new StudyService(memberService, studyRepository);

		when(memberService.findById(1L)).thenReturn(Optional.of(member)); //1L을 인자로 받았을 때 stubbing
		//when(memberService.findById(any())).thenReturn(Optional.of(member));// any() 받을 때 stubbing
		//when
		assertNotNull(studyService);

		//then
		assertEquals("ddd@ddd.com", memberService.findById(1L).get().getEmail());
		//assertEquals("ddd@ddd.com", memberService.findById(2L).get().getEmail());
	}
}