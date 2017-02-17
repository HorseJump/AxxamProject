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
	topic_description varchar(20)
);

Create table Subtopics (
	subtopic_id serial PRIMARY KEY,
	subtopic_name varchar(20) not null,
	subtopic_description varchar(20)
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

Insert into topics (topic_name, topic_description) Values ('Spanish', 'The spanish language');