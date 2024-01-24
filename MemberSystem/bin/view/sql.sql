INSERT INTO MEMBER VALUES('SOOJONG' , '0000', '김수종' , 20);
INSERT INTO MEMBER VALUES('pbk' , '0000', '박병관' , 20);
INSERT INTO MEMBER VALUES('syp' , '0000', '선영표' , 20);

select * from member order by id;
select * from member where id='admin' and pw='1234';
delete from member where id='sujjong3' 

UPDATE MEMBER SET AGE = 21, NAME = 'SUJONG',  PW = '1234' WHERE ID = 'SOOJONG';