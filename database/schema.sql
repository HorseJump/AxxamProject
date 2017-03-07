Drop table tutorial;
Drop table topic_subtopic;
Drop table subtopics;
Drop table topics;
Drop table admin_users;

Create table admin_users (
    adminUser_id serial PRIMARY KEY,
    adminUsername varchar(20) not null,
    adminPassword varchar(20) not null
    );
   
Insert Into admin_users (adminUsername, adminPassword) Values ('admin', 'admin');

Create table Topics (
	topic_id serial PRIMARY KEY,
	topic_name varchar(20) not null,
	topic_description varchar(100)
);

Create table Subtopics (
	subtopic_id serial PRIMARY KEY,
	subtopic_name varchar(20) not null,
	subtopic_description varchar(40)
);

Create table Topic_Subtopic (
	topic_id integer not null,
	subtopic_id integer not null,
    CONSTRAINT pk_topic_subtopic_topic_id_subtopic_id PRIMARY KEY (topic_id, subtopic_id)
);

ALTER TABLE topic_subtopic 
ADD FOREIGN KEY (topic_id)
REFERENCES topics(topic_id);

ALTER TABLE topic_subtopic 
ADD FOREIGN KEY (subtopic_id)
REFERENCES subtopics(subtopic_id);

Create table Tutorial (
    tutorial_id serial PRIMARY KEY,
    subtopic_id integer not null,
    tutorial_name varchar(30) not null,
    tutorial_info text not null
);

ALTER TABLE tutorial
ADD FOREIGN KEY (subtopic_id)
REFERENCES subtopics(subtopic_id);

Insert into topics (topic_name, topic_description) Values ('Languages', 'Learn all the world''s languages');
Insert into topics (topic_name, topic_description) Values ('Health and Fitness', 'Stay healthy and fit');
Insert into subtopics (subtopic_name, subtopic_description) Values ('Spanish', 'The Spanish Language');
Insert into subtopics (subtopic_name, subtopic_description) Values ('German', 'The German Language');
Insert into subtopics (subtopic_name, subtopic_description) Values ('Exercise', 'Multiple ways to exercise');
Insert into subtopics (subtopic_name, subtopic_description) Values ('Eating Well', 'Eating the right foods');
Insert into topic_subtopic (topic_id, subtopic_id) Values (1, 1);
Insert into topic_subtopic (topic_id, subtopic_id) Values (1, 2);
Insert into topic_subtopic (topic_id, subtopic_id) Values (2, 3);
Insert into topic_subtopic (topic_id, subtopic_id) Values (2, 4);

-- Insert into tutorial (subtopic_id, tutorial_name, tutorial_info) Values (1, 'test', 'test');
Select * From tutorial;