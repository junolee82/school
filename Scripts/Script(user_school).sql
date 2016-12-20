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

insert into student values(1,'김사부','ksb@test.co.kr','1970-1-1');
insert into student values(2,'도깨비','dkb@test.co.kr','2000-12-12');
insert into student values(3,'김고은','kky@test.co.kr','1999-12-06');

select * from student;

select stud_id as studid,name,email,dob 
from student
where stud_id=2;

update student
set name='공유', email='ky@test.co.kr',dob='1977-09-07'
where stud_id=2;

delete from student where stud_id=3;