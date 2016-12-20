-- 학교
DROP SCHEMA IF EXISTS school;

-- 학교
CREATE SCHEMA school;

-- 학생
CREATE TABLE school.student (
	stud_id INTEGER     NOT NULL COMMENT '학번', -- 학번
	name    VARCHAR(50) NOT NULL COMMENT '성명', -- 성명
	email   VARCHAR(50) NOT NULL COMMENT '메일', -- 메일
	dob     DATE        NULL     COMMENT '생일' -- 생일
)
COMMENT '학생';

-- 학생
ALTER TABLE school.student
	ADD CONSTRAINT PK_student -- 학생 기본키
		PRIMARY KEY (
			stud_id -- 학번
		);
		
desc student;