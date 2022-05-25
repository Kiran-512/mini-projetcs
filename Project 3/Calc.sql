/*
PROCEEDURE
delimiter //
create proce
-- INSERT USER DETAILS
-- INSERT SKILL DATA

begin
end; //
delimiter ;
*/

-- =======================================================

#to create new user each time we will call this procedure
#drop procedure new_user;

DELIMITER //
create procedure new_user(FNAME varchar(10), LNAME varchar(10), mobile_no char(13), email_ID char(25), DOB date, CITY char(20), DISTRICT char(15), STATE char(15), ABOUT varchar(100),STATUS char(10))
BEGIN
		insert into user_Details(FNAME,LNAME,mobile_no,email_ID,DOB,CITY,DISTRICT,STATE,ABOUT,STATUS) values(FNAME,LNAME,mobile_no,email_ID,DOB,CITY,DISTRICT,STATE,ABOUT,STATUS);
END; //
DELIMITER ;

call new_user('Rohan','Shinde','9823665345','Rohan@gmail.com','96-06-22','Kalamboli','Raigad','Maharashtra','Im painter','online');

select * from User_Details;

-- =======================================================

#to add skill each time we can call this procedure, privde we must know the skillid from the skill stable which will be displayed to the user

drop procedure addSkillId;

delimiter //
create procedure addSkillId(USER_ID int,ID int)
begin
	insert into skill_data values(user_id, ID);  
end; //
delimiter ;

call addSkillId(11,12);

select * from skill_data;

-- ======================
/*
TRIGGER


AFTER INSERT

INSERT INTO USER_dETAILS (AGE, JOININ DATA)

*/

#Upon creating new user and insertion  his details age would get calculated and the site joining date which is current date willbe added to the user_Details in proper columns
drop trigger age_joining_date;

show create procedure age_joining_date;

delimiter //
create trigger age_joining_date
before insert
on user_Details for each row
begin
		set new.age  = year(CURRENT_DATE()) - year(new.DOB);
        set new.SITE_JOINING_DATE  = CURRENT_DATE();
end; // 
delimiter ;

-- ======================
/*
PROCEDURE
UPDATE REQUIREMENT
	SET STATUS = CLOSED IF WORK DATE EXPIRED
*/

-- ======================
/*
FUNCTION FOR TOTAL JOBS DONE AND RATINGS IN SKILL DATA when work history gets updated

increment total job for that user

set rating = function (totoal rating / total wok)

*/

delimiter //
create function add_work(x int,y int,z int)
returns int
deterministic
begin
set x=(x+y)/z;
return x;
end; //
delimiter ;

delimiter //
create procedure skill_data1()
begin
declare x int;
declare y int;
declare z int;
declare a int;
declare b int;
set x= (select user_id from work_history where work_id= max( work_id));
set y= (select skill_id from work_history where work_id= max( work_id));
set z= (select rating from work_history where work_id= max( work_id));

update skill_data set total_work= total_work+1 where user_id=x and skill_id=y;

set a= (select total_rating from skill_data where user_id=x and skill_id=y);
set b= (select total_work from skill_data where user_id=x and skill_id=y);
set a= add_work(a,z,b);

update skill_data set total_rating=a where user_id=x and skill_id=y;
end; //
delimiter ;




/*
ERROR :

0	246	00:59:28	call new_user('Rohan','Shinde','9823665345','Rohan@gmail.com','96-06-22','Kalamboli','Raigad','Maharashtra','Im painter','online')	Error Code: 1442. 
Can't update table 'user_details' in stored function/trigger 
because it is already used by statement which invoked this stored function/trigger.	1.343 sec

*/

-- ========================================
show procedure status where db = "job_for_a_day";

