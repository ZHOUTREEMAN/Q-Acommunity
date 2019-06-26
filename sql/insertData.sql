#用户数据
INSERT INTO Users_m VALUES('00000001','经陈旭',1,1,'123@qq.com','苦逼高中生','123456');
INSERT INTO Users_m VALUES('00000002','马云',1,1,'173@qq.com','阿里清洁工','123456');
INSERT INTO Users_m VALUES('00000003','李世民',1,1,'523@qq.com','过气皇帝','123456');
#问题数据
INSERT INTO Questions VALUES('00001','00000001','2018-01-17','已发布','高考有多难?','我明年高考。。。。','高考',3,1,1);
INSERT INTO Questions VALUES('00002','00000001','2019-06-09','已发布','高考考砸了怎么办?','是不是没希望了。。。。','高考',2,1,1);
INSERT INTO Questions VALUES('00003','00000002','2019-06-25','已发布','赚钱有那么难吗?','我以自己的经历来说并不。。。','赚钱',1,1,1);
#回答数据
INSERT INTO Answers VALUES('000001','00000003','2018-01-17',15,1,'00001','难。。。。。。');
INSERT INTO Answers VALUES('000002','00000002','2019-06-09',17,1,'00002','没得救了。。。');
INSERT INTO Answers VALUES('000003','00000001','2019-06-25',13,1,'00003','很难。。。。。。');
#审核员数据
INSERT INTO Workers VALUES('00000001','小明',18,'13967641852','00003@qq.com','360430196407121112');
INSERT INTO Workers VALUES('00000002','小梅',18,'18870215779','00005@qq.com','360430196402121111');
INSERT INTO Workers VALUES('00000003','小学',18,'13870245679','00006@qq.com','360430196412121412');
#消息数据
INSERT INTO Messages VALUES('0000001','2018-01-17','00000001','问题','已处理','00000001');
INSERT INTO Messages VALUES('0000002','2019-06-09','00000001','问题','已处理','00000001');
INSERT INTO Messages VALUES('0000003','2019-06-25','00000002','问题','已处理','00000002');
INSERT INTO Messages VALUES('0000004','2018-01-17','00000003','回答','已处理','00000002');
INSERT INTO Messages VALUES('0000005','2019-06-09','00000002','回答','已处理','00000003');
INSERT INTO Messages VALUES('0000006','2019-06-25','00000001','回答','已处理','00000003');
#用户关注的用户
INSERT INTO Users_following VALUES('00000001','00000002');
INSERT INTO Users_following VALUES('00000002','00000001');
INSERT INTO Users_following VALUES('00000003','00000001');
#用户关注问题
INSERT INTO Questions_following VALUES('00000001','00001');
INSERT INTO Questions_following VALUES('00000001','00002');
INSERT INTO Questions_following VALUES('00000002','00003');
#用户收藏问题
INSERT INTO Answers_store VALUES('0001','00000001','000001');
INSERT INTO Answers_store VALUES('0002','00000002','000001');
INSERT INTO Answers_store VALUES('0003','00000003','000002');
#话题下的问题
INSERT INTO Subjects_store_questions VALUES('00001','00001');
INSERT INTO Subjects_store_questions VALUES('00002','00002');
INSERT INTO Subjects_store_questions VALUES('00003','00002');
#问题下的评论
INSERT INTO comment_questions VALUES('0000003','回答不错','00001');
INSERT INTO comment_questions VALUES('0000004','答主牛逼','00002');
INSERT INTO comment_questions VALUES('0000005','收藏了','00003');