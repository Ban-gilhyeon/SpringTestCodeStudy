package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
public class Study {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private StudyStatus status = StudyStatus.DRAFT;
	private int limit;
	private String name;
	private LocalDateTime openedDateTime;
	private Long ownerId;

	public Study(int limit, String name) {
		if (limit < 0) {
			throw new IllegalArgumentException("스터디 최대 참석자는 0보다 커야 합니다.");
		}
		this.limit = limit;
		this.status = StudyStatus.DRAFT;
		this.name = name;
	}

	public void setOwnerId(Long memberId) {
		this.ownerId = memberId;
	}

	public StudyStatus getStatus() {
		return status;
	}

	public int getLimit() {
		return limit;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getOpenedDateTime() {
		return openedDateTime;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void open() {
		this.openedDateTime = LocalDateTime.now();
		this.status = StudyStatus.OPENED;
	}
}