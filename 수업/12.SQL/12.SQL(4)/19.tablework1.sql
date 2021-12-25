-- TABLE�� �ۼ��϶�.
-- TEAM : �� ���̵�, ����, ����, ���� ��¥, ��ȭ��ȣ, Ȩ������
CREATE TABLE TEAM(
    TEAMID NUMBER(8) CONSTRAINT PK_TEAM_ID PRIMARY KEY,
    RESIONNAME VARCHAR2(10),
    TEAMNAME VARCHAR2(30) NOT NULL,
    STARTDATE DATE,
    TEL VARCHAR2(20),
    HOMEPAGE VARCHAR2(30)
);

-- PLAYER : ������ȣ, ������, �����, ������, Ű, �� ���̵�
CREATE TABLE PLAYER(
    PLAYERID NUMBER CONSTRAINT PK_PLAYER PRIMARY KEY,
    PLAYERNAME VARCHAR2(20) NOT NULL,
    JOINDATE DATE,
    POSITION VARCHAR2(20),
    HEIGHT NUMBER(5, 1),
    TEAMID NUMBER(8)
);

ALTER TABLE PLAYER
ADD 
CONSTRAINT FK_TEAM_ID FOREIGN KEY(TEAMID)
REFERENCES TEAM(TEAMID);

-- TEAM �ΰ��� ����Ѵ�.
INSERT INTO TEAM(TEAMID, RESIONNAME, TEAMNAME, STARTDATE, TEL, HOMEPAGE)
VALUES(10, '����', '������', '81/03/12', '02-123-4567', 'http:\\www.bears.com'); 

INSERT INTO TEAM(TEAMID, RESIONNAME, TEAMNAME, STARTDATE, TEL, HOMEPAGE)
VALUES(20, '�뱸', '���̿���', SYSDATE, '031-3456-9785', 'http:\\www.lions.co.kr');

SELECT * FROM team;

-- �ΰ��� TEAM�� ������ ���� 3�� ����� ����. 
INSERT INTO PLAYER(PLAYERID, PLAYERNAME, JOINDATE, POSITION, HEIGHT, TEAMID)
VALUES(100, 'ȫ�浿', '02/03/14', '����', 181.1, 20);

INSERT INTO PLAYER(PLAYERID, PLAYERNAME, JOINDATE, POSITION, HEIGHT, TEAMID)
VALUES(101, '������', SYSDATE, 'Ÿ��', 178.3, 20);

INSERT INTO PLAYER(PLAYERID, PLAYERNAME, JOINDATE, POSITION, HEIGHT, TEAMID)
VALUES(102, '������', TO_DATE('20030425', 'YYYYMMDD'), 'Ÿ��', 162.9, 10);

INSERT INTO PLAYER(PLAYERID, PLAYERNAME, JOINDATE, POSITION, HEIGHT, TEAMID)
VALUES(103, 'ȫ�β�', TO_DATE('20120630', 'YYYYMMDD'), '����', 172.3, 10);

INSERT INTO PLAYER(PLAYERID, PLAYERNAME, JOINDATE, POSITION, HEIGHT, TEAMID)
VALUES(104, '�Ӳ���', '', '����', 188.3, '');

SELECT * FROM player;

-- LIONS�Ҽ� �����鸸�� ���
SELECT *
FROM player
WHERE TEAMID = 20;

SELECT t.teamid, t.teamname, p.playername, p.position
FROM team t, player p
WHERE t.teamid = p.teamid
    AND t.teamname = '���̿���';

-- ������ �Է��ϸ� �� ������ �� ��� ��ȭ��ȣ, Ȩ�������� ��µǵ��� �մϴ�.
SELECT t.teamname, t.tel, t.homepage, p.playername
FROM player p, team t
WHERE p.teamid = t.teamid
    AND p.playername = '������';









