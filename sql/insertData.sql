#�û�����
INSERT INTO Users_m VALUES('00000001','������',1,1,'123@qq.com','��Ƹ�����','123456');
INSERT INTO Users_m VALUES('00000002','����',1,1,'173@qq.com','������๤','123456');
INSERT INTO Users_m VALUES('00000003','������',1,1,'523@qq.com','�����ʵ�','123456');
#��������
INSERT INTO Questions VALUES('00001','00000001','2018-01-17','�ѷ���','�߿��ж���?','������߿���������','�߿�',3,1,1);
INSERT INTO Questions VALUES('00002','00000001','2019-06-09','�ѷ���','�߿���������ô��?','�ǲ���ûϣ���ˡ�������','�߿�',2,1,1);
INSERT INTO Questions VALUES('00003','00000002','2019-06-25','�ѷ���','׬Ǯ����ô����?','�����Լ��ľ�����˵����������','׬Ǯ',1,1,1);
#�ش�����
INSERT INTO Answers VALUES('000001','00000003','2018-01-17',15,1,'00001','�ѡ�����������');
INSERT INTO Answers VALUES('000002','00000002','2019-06-09',17,1,'00002','û�þ��ˡ�����');
INSERT INTO Answers VALUES('000003','00000001','2019-06-25',13,1,'00003','���ѡ�����������');
#���Ա����
INSERT INTO Workers VALUES('00000001','С��',18,'13967641852','00003@qq.com','360430196407121112');
INSERT INTO Workers VALUES('00000002','С÷',18,'18870215779','00005@qq.com','360430196402121111');
INSERT INTO Workers VALUES('00000003','Сѧ',18,'13870245679','00006@qq.com','360430196412121412');
#��Ϣ����
INSERT INTO Messages VALUES('0000001','2018-01-17','00000001','����','�Ѵ���','00000001');
INSERT INTO Messages VALUES('0000002','2019-06-09','00000001','����','�Ѵ���','00000001');
INSERT INTO Messages VALUES('0000003','2019-06-25','00000002','����','�Ѵ���','00000002');
INSERT INTO Messages VALUES('0000004','2018-01-17','00000003','�ش�','�Ѵ���','00000002');
INSERT INTO Messages VALUES('0000005','2019-06-09','00000002','�ش�','�Ѵ���','00000003');
INSERT INTO Messages VALUES('0000006','2019-06-25','00000001','�ش�','�Ѵ���','00000003');
#�û���ע���û�
INSERT INTO Users_following VALUES('00000001','00000002');
INSERT INTO Users_following VALUES('00000002','00000001');
INSERT INTO Users_following VALUES('00000003','00000001');
#�û���ע����
INSERT INTO Questions_following VALUES('00000001','00001');
INSERT INTO Questions_following VALUES('00000001','00002');
INSERT INTO Questions_following VALUES('00000002','00003');
#�û��ղ�����
INSERT INTO Answers_store VALUES('0001','00000001','000001');
INSERT INTO Answers_store VALUES('0002','00000002','000001');
INSERT INTO Answers_store VALUES('0003','00000003','000002');
#�����µ�����
INSERT INTO Subjects_store_questions VALUES('00001','00001');
INSERT INTO Subjects_store_questions VALUES('00002','00002');
INSERT INTO Subjects_store_questions VALUES('00003','00002');
#�����µ�����
INSERT INTO comment_questions VALUES('0000003','�ش𲻴�','00001');
INSERT INTO comment_questions VALUES('0000004','����ţ��','00002');
INSERT INTO comment_questions VALUES('0000005','�ղ���','00003');