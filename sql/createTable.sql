create table Users_m
( user_id CHAR(8) PRIMARY KEY,
  user_name VARCHAR(20) NOT NULL,
  followers_num SMALLINT,
  fans_num SMALLINT,
  email VARCHAR(50),
  personal_profile VARCHAR(255),
  integral SMALLINT,
  password VARCHAR(20)
);

create table Workers
( worker_id CHAR(8) PRIMARY KEY,
  worker_name VARCHAR(20) NOT NULL,
  worker_age SMALLINT NOT NULL,
  worker_phone_num VARCHAR(11),
  id_numbers VARCHAR(18) NOT NULL,
  email VARCHAR(50)
);

create table Questions
( question_id CHAR(5) PRIMARY KEY,
  user_id CHAR(8) ,
  question_time DATE NOT NULL,
  #question_status VARCHAR(20),#xiugai
  question VARCHAR(255) NOT NULL,
  complement VARCHAR(255),
  suggestion VARCHAR(255),#管理员给的修改建议
  label_m VARCHAR(20),
  integral SMALLINT,
  answer_num SMALLINT,
  question_following_num INT,
  processing_status VARCHAR(20),
  processing_id CHAR(8),
  FOREIGN KEY(processing_id) REFERENCES Workers(worker_id),
  FOREIGN KEY(user_id) REFERENCES Users_m(user_id)
);

create table Answers
( answer_id CHAR(6) PRIMARY KEY,
  answer_user CHAR(8) NOT NULL,
  answer_time DATE NOT NULL,
  support_num SMALLINT,
  objection_num SMALLINT,
  question_id CHAR(5),
  answer VARCHAR(255),
  suggestion VARCHAR(255),#管理员给的修改建议
  processing_status VARCHAR(20),
  processing_id CHAR(8),
  FOREIGN KEY(processing_id) REFERENCES Workers(worker_id),
  FOREIGN KEY(answer_user) REFERENCES Users_m(user_id),
  FOREIGN KEY(question_id) REFERENCES Questions(question_id)
);


# create table Messages
# ( message_id CHAR(9) PRIMARY KEY,
#   processing_time DATE ,
#   publisher_id CHAR(8) ,
#   message_type VARCHAR(20),
#   processing_status VARCHAR(20),
#   processing_id CHAR(8),
#   FOREIGN KEY(publisher_id) REFERENCES Users_m(user_id),
#   FOREIGN KEY(processing_id) REFERENCES Workers(worker_id)
# );

create table Users_following
( follow VARCHAR(8),
  be_followed VARCHAR(8),
  PRIMARY KEY(follow,be_followed)
);

create table Questions_following
( user_n VARCHAR(20),
  question VARCHAR(255),
  PRIMARY KEY(user_n,question)
);

create table Answers_store
( Store_id varchar(20),
  User_id varchar(20),
  ANSWER_ID VARCHAR(20),
  FOREIGN KEY(user_id) REFERENCES Users_m(user_id),
  FOREIGN KEY(answer_id) REFERENCES answers(answer_id)
);

create table Subjects_store_questions
(subject_id varchar(20),
 question_id varchar(20),
 FOREIGN KEY(question_id) REFERENCES questions(question_id)
);

create table comment_answers/*需要修改*/
(
comment_id varchar(20) primary key,
comment varchar (255),
answer_id VARCHAR(20),
User_id varchar(20),
FOREIGN KEY(answer_id) REFERENCES answers(answer_id),
FOREIGN KEY(user_id) REFERENCES Users_m(user_id)
);

create table id_directory/*充当生成唯一性id的累加容器*/
(
    user_id CHAR(8),
    worker_id CHAR(8),
    question_id CHAR(5),
    answer_id CHAR(6),
    comment_id varchar(20),
    store_id varchar(20)
);

create table ban_talk/*管理员发言禁令*/
(
    no_talk_id char(8),
    worker_id char(8)
);

create table ban_login/*管理员的登陆禁令*/
(
    no_login_id char(8),
    worker_id char (8)
);