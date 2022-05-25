#Project

/*
Tables:
===========
USER_DETAILS
REQUIREMENT
SKILLS_TABLE
EMP_SKILLS_DETAILS
WORK_HISTORY
*/

use job_for_a_day;

drop table User_Details;

create table User_Details(
USER_ID int auto_increment PRIMARY KEY,
FNAME varchar(10) not null,
LNAME varchar(10),
mobile_no char(13),
email_id char(25),
DOB date,
AGE FLOAT,
SITE_JOINING_DATE date,
CITY char(20),
DISTRICT char(15),
STATE char(15),
ABOUT varchar(100),
STATUS char(10) CHECK (STATUS IN('online','offline'))
);

delete from User_Details;

#DETAILS ENTERED BY THE USER
insert into User_Details(FNAME,LNAME,mobile_no,email_ID,DOB,CITY,DISTRICT,STATE,ABOUT,STATUS)
values('Karan','Shelke','9024564345','Karan@gmail.com','98-07-12','Kalamboli','Raigad','Maharashtra','Im plumber and also driver','online'),
('Vishal','Yadav','9023456435','vISHAL@gmail.com','90-02-16','Panvel','Raigad','Maharashtra','Im a painter','online'),
('Rahul','Yadav','9023456434','Rahul@gmail.com','88-07-02','Vashi','Navi Mumbai','Maharashtra','Im a driver','online'),
('Narayan','Deshmukh','8023464345','Narayan@gmail.com','85-02-4','Nerul','Navi Mumbai','Maharashtra','Im a cook','online'),
('Shubham','Jaiswal','7803454345','Shubham@gmail.com','87-4-12','Vashi','Navi Mumbai','Maharashtra','Im a mason','online'),
('Karan','Singh','8023456434','KaranS@gmail.com','94-4-23','Kalamboli','Raigad','Maharashtra','Im a welder','online'),
('Rahul','Bhosale','8023564345','Rahul@gmail.com','96-07-16','Kharghar','Navi Mumbai','Maharashtra','Im a carpenter','online'),
('Dinesh','Rathod','9023454645','Dinesh@gmail.com','89-06-24','Uran','Navi Mumbai','Maharashtra','Im a barber','online'),
('Sachin','Pathak','9923456434','Sachin@gmail.com','84-03-12','Uran','Navi Mumbai','Maharashtra','Im a dog walker','online'),
('Pranit','Jagtap','9823564345','pranit@gmail.com','94-08-04','Kalamboli','Raigad','Maharashtra','Im a pandit','online');

select * from User_Details;

-- ===================================================================
#EMP Skill details

DROP TABLE SKILL_DATA;

create table SKILL_DATA
(
USER_ID  int,
SID int,
TOTALJOBSDONE INT default 0,
RATINGS float default 0 check (RATINGS <= 5),
PRIMARY KEY(USER_ID,SID),
constraint fk_userid_skill_data foreign key(user_id) references user_Details(user_id)
);

#delete from EMP_SKILL_DETAILS;

#DETAILED ENTERED BY THE USER we willinsert this create user function
insert into SKILL_DATA(USER_ID,SID) values
(1,1),
(1,2),
(2,12),
(3,12),
(4,9),
(5,4),
(6,10),
(7,11),
(8,6),
(9,13),
(10,17);
  
#We must use auto-increment with primary key ONLY

select * from SKILL_DATA;


-- ==================================================================

#SKILL TABLE
drop table SKILL;

create table SKILL
(
SID int primary key,
SKILL Varchar(20)
);

insert into SKILL values
(0,'client'),
(1,'plumber'),
(2,'driver'),
(3,'electrician'),
(4,'mason'),
(5,'helper'),
(6,'barber'),
(7,'make_up_artist'),
(8,'cleaner'),
(9,'cook'),
(10,'welder'),
(11,'carpenter'),
(12,'painter'),
(13,'dog walker'),
(14,'pet care taker'),
(15,'tv repaid'),
(16,'mob repair'),
(17,'pandit'),
(18,'gardner'),
(19,'security guard'),
(20,'waiter'),
(21,'tailor'),
(22,'photographer'),
(23,'mechanic'),
(24,'Drilling'),
(25,'maid');
    
-- =====================================================================

drop table REQUIREMENT;

create table REQUIREMENT
(
WID int auto_increment primary key,
USER_ID int, -- this is clients user_id, who will post the job opening
SKILLS_REQ varchar(20),
JOB_DESC varchar(200),
POST_DATE date,
WORK_DATE date,
REWARD char(10),
CITY char(20),
DISTRICT char(15),
STATE char(15),
STATUS CHAR(10) check(STATUS IN ('Active','Closed','Complete')),
CONSTRAINT FK_USER_ID_REQUIREMENT foreign key(USER_ID) REFERENCES user_details(user_id)
);

DELETE FROM REQUIREMENT;

#When user post requirement at that time
insert into REQUIREMENT(USER_ID,SKILLS_REQ,JOB_DESC,POST_DATE,WORK_DATE,REWARD,CITY,DISTRICT,STATE,STATUS) values
('2','Plumber','Have to do pipe fitting and tap adjustment work',CURDATE(),adddate(CURDATE(),1),'500','Panvel','Raigad','Maharashtra','ACTIVE'),
('3','Mason','wall construction',date(CURDATE()),adddate(CURDATE(),1),'600','Vashi','Navi Mumbai','Maharashtra','ACTIVE'),
('4','pandit','New Home Pooja',CURDATE() ,CURDATE() ,null,'Nerul','Raigad','Maharashtra','CLOSED'),
('5','carpenter','Wood cutting process for 2 hrs',CURDATE(),CURDATE(),'600','Vashi','Navi Mumbai','Maharashtra','CLOSED'),
('6','Painter','Painting work of my room',CURDATE() ,adddate(CURDATE(),3),'400','Kalamboli','Navi Mumbai','Maharashtra','ACTIVE');


-- =====================================================================

#drop table WORK_HISTORY;

create table WORK_HISTORY
(
WID int,
USER_ID int, -- this is freelancers user_id
RATINGS FLOAT,
REWARD_STATUS char(10) check(REWARD_STATUS IN ('PAID','UNPAID')),
primary key(WID,USER_ID),
constraint FK_WORK_HISTORY_WID foreign key(WID) references SKILL_REQUIRED(WID)
); 

insert into WORK_HISTORY values
('3','10','5','PAID'),
('4','7','4.5','PAID');

select * from WORK_HISTORY;

-- ===================================================================
show full tables;

/*
emp_skill_details	BASE TABLE
requirement	BASE TABLE
skill_required	BASE TABLE
skill_table	BASE TABLE
user_details	BASE TABLE
work_history	BASE TABLE
*/

-- ==================================================

#count the total no of columns in the table

SELECT COUNT(*) AS NUMBEROFCOLUMNS FROM INFORMATION_SCHEMA. COLUMNS 
 WHERE table_schema = 'job_for_a_day' AND table_name = 'emp_skill_details'; -- 4,12,2,8,4
-- ==================================================
#INSERT statements

insert into user_Details(FNAME,LNAME,mobile_no,email_ID,DOB,CITY,DISTRICT,STATE,ABOUT,STATUS) values('Rohan','Shinde','9823665345','Rohan@gmail.com','96-06-22','Kalamboli','Raigad','Maharashtra','Im Photographer','online');

insert into skiill_data(user_id,sid) values(11,22);

-- ==================================================
#QERIES ON ABOVE TABLES


#to find the user from particular location with his skill
select concat(fname,' ',lname) as 'ename',mobile_no 'Contact',City, skill from user_Details,SKILL_DATA,SKILL
	where CITY = 'Kalamboli'
    and SKILL.sid = skill_data.sid
    and user_details.user_id = skill_data.user_id
    order by 1;

/*
Karan Shelke	9024564345	Kalamboli	plumber
Karan Shelke	9024564345	Kalamboli	driver
Karan Singh		8023456434	Kalamboli	barber
Pranit Jagtap	9823564345	Kalamboli	welder
*/

-- ==================================================

#find the user with the max rating for particular skill




-- ==================================================
#To check the skill's of particular user
select concat(fname,' ',lname) as "Freelancer", skill from user_Details,skill_data,skill
where user_Details.user_id = skill_data.user_id and skill_data.sid = skill.sid;
/*
Karan Shelke		plumber
Karan Shelke		driver
Vishal Yadav		painter
Rahul Yadav			painter
Narayan Deshmukh	cook
Shubham Jaiswal		mason
Karan Singh			welder
Rahul Bhosale		carpenter
Dinesh Rathod		barber
Sachin Pathak		dog walker
Pranit Jagtap		pandit
*/

#DISPLAY ENTIRE SKILL TABLE
select sid,skill from SKILL
	order by sid;

-- ==================================================

#QUERY TO FIND OUT THE ACTIVE JOBS
select * from REQUIREMENT
		WHERE STATUS = 'ACTIVE';

-- ==================================================
       
#AREA WISE ACTIVE JOB
SELECT SKILLS_REQ,CITY FROM REQUIREMENT
	WHERE CITY = 'Vashi';
/*
Mason	Vashi
carpenter	Vashi
*/
-- ==================================================

