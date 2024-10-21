package org.example.inflearnjavatest;

import java.time.LocalDateTime;

public class Study {
	private  StudyStatus status;
	private int limit;
	private String name;
	private LocalDateTime openedDateTime;

	public Study(int limit, String name) {
		if(limit < 0){
			throw new IllegalArgumentException("스터디 최대 참석자는 0보다 커야 합니다.");
		}
		this.limit = limit;
		this.status = StudyStatus.DRAFT;
		this.name = name;
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
}
