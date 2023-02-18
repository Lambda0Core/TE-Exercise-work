-- Database: MeetUpsDB

-- DROP DATABASE "MeetUpsDB";

DROP TABLE IF EXISTS person, interest_group, event, event_members CASCADE;


CREATE TABLE person
(
    person_id int not null,
    name varchar(35) not null,
    date_of_birth date NOT NULL,
	email_address varchar(100) NOT NULL,
	email_reminder_flag boolean NOT NULL,
    group_id int,
   constraint pk_person_id PRIMARY KEY (person_id)
);

CREATE table interest_group (
    group_id serial NOT NULL,
	group_name varchar(100) NOT NULL,
	member_count int,
	CONSTRAINT pk_interest_group_id PRIMARY KEY (group_id)
	
);

ALTER TABLE person ADD CONSTRAINT fk_interest_group_ID FOREIGN KEY (group_id) REFERENCES interest_group (group_id);

CREATE TABLE event (
	event_id int NOT NULL,
	event_name varchar(100) NOT NULL,
	description varchar(200),
	start_date timestamp NOT NULL,
	duration interval NOT NULL,
    member_count int,

	CONSTRAINT pk_event PRIMARY KEY (event_id)
);

CREATE TABLE event_members (
      person_id int not null,
      event_id int not null,
      
      CONSTRAINT fk_person_id FOREIGN KEY (person_id) REFERENCES person(person_id),
      CONSTRAINT fk_event_id FOREIGN KEY (event_id) REFERENCES event(event_id)     
);

INSERT INTO interest_group (group_id, group_name, member_count)
VALUES (1, 'Gardening Group', 4), (2, 'Study Group', 4), (3, 'Cooking Group', 4);

INSERT INTO person (person_id, name, email_address, date_of_birth, email_reminder_flag, group_id)
VALUES (100, 'Emily LeFebvre', 'emily@lefebvre.us', '2003-03-29', true, 1),
       (101, 'Bob Smith', 'bob.smith@notapseudonym.com', '1970-08-10', false, 1),
       (102, 'Ethan LeFebvre', 'ethan@lefebvre.us', '2000-07-22', false, 1),
       (103, 'Merissa Simones', 'merissa@gmail.com', '2003-04-02', true, 1),
	   (104, 'Barney Calhoun', 'calhoun@yahoo.com', '1970-05-21', false, 3),
	   (105, 'Melody Jones', 'melody@outlook.com', '2001-01-29', true, 3),
       (106, 'Long Johnson', 'longjohn@gmail.com', '1975-08-10', false, 3),
       (107, 'Lianne Smith', 'lianne@gmail.com', '2002-07-22', false, 3),
       (108, 'Marisa Kirisame', 'magicspark@gmail.com', '1997-08-15', false, 2),
	   (109, 'Alice Margatroid', 'merissa@gmail.com', '1998-11-21', true, 2),
	   (110, 'Patchouli Knowledge', 'multidirectionallaser@hotmail.com', '2002-06-10', false, 2),
       (111, 'Walter Bennett', 'ussdarkstar@gmail.com', '1946-12-15', false, 2);
	   
	   
	   

	   INSERT INTO event (event_id, event_name, description, start_date, duration, member_count)
VALUES (10, 'Gardening - 101', 'Learn the basics to gardening!', '2023-03-29 09:00 AM', '3 Hours', 4),
       (11, 'Library Sorting', 'We re using this class as free labor!', '2024-04-02 09:05 AM', '4 Hours', 4),    
	   (12, 'Gardening - Planting Human Eyes', 'We re planting human eyeballs to grow a new specimen due to dwindling attendance.', '2024-03-29 09:00 AM', '3 Hours', 3),
	   (13, 'Sustainable Cooking', 'Learn how to cook passable meals with insects to prepare for the incoming apocalypse.', '2012-12-21 05:30 PM', '4 Hours', 3);

INSERT INTO event_members (person_id, event_id) VALUES (100, 10);
INSERT INTO event_members(person_id, event_id) VALUES (101, 10);
INSERT INTO event_members (person_id, event_id) VALUES (102, 10);
INSERT INTO event_members (person_id, event_id) VALUES (103, 10);
INSERT INTO event_members (person_id, event_id) VALUES (104, 11);
INSERT INTO event_members (person_id, event_id) VALUES (105, 11);
INSERT INTO event_members (person_id, event_id) VALUES (106, 11);
INSERT INTO event_members (person_id, event_id) VALUES (107, 11);
INSERT INTO event_members (person_id, event_id) VALUES (108, 12);
INSERT INTO event_members (person_id, event_id) VALUES (109, 12);
INSERT INTO event_members (person_id, event_id) VALUES (110, 12);
INSERT INTO event_members (person_id, event_id) VALUES (111, 12);