package member;

import domain.Member;
import domain.Study;
import java.util.Optional;

public interface MemberService {
	Optional<Member> findById(Long memberId);
	void valide(Long memberId);
	void notify(Study newStduy);
	void notify(Member newMember);
}
