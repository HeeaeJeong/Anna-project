-- TABLE을 작성하라.
-- TEAM : 팀 아이디, 지역, 팀명, 개설 날짜, 전화번호, 홈페이지
CREATE TABLE TEAM(
    TEAMID NUMBER(8) CONSTRAINT PK_TEAM_ID PRIMARY KEY,
    RESIONNAME VARCHAR2(10),
    TEAMNAME VARCHAR2(30) NOT NULL,
    STARTDATE DATE,
    TEL VARCHAR2(20),
    HOMEPAGE VARCHAR2(30)
);

-- PLAYER : 선수번호, 선수명, 등록일, 포지션, 키, 팀 아이디
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

-- TEAM 두개만 등록한다.
INSERT INTO TEAM(TEAMID, RESIONNAME, TEAMNAME, STARTDATE, TEL, HOMEPAGE)
VALUES(10, '서울', '베어즈', '81/03/12', '02-123-4567', 'http:\\www.bears.com'); 

INSERT INTO TEAM(TEAMID, RESIONNAME, TEAMNAME, STARTDATE, TEL, HOMEPAGE)
VALUES(20, '대구', '라이온즈', SYSDATE, '031-3456-9785', 'http:\\www.lions.co.kr');

SELECT * FROM team;

-- 두개의 TEAM에 선수를 각각 3명씩 등록해 본다. 
INSERT INTO PLAYER(PLAYERID, PLAYERNAME, JOINDATE, POSITION, HEIGHT, TEAMID)
VALUES(100, '홍길동', '02/03/14', '투수', 181.1, 20);

INSERT INTO PLAYER(PLAYERID, PLAYERNAME, JOINDATE, POSITION, HEIGHT, TEAMID)
VALUES(101, '정수동', SYSDATE, '타자', 178.3, 20);

INSERT INTO PLAYER(PLAYERID, PLAYERNAME, JOINDATE, POSITION, HEIGHT, TEAMID)
VALUES(102, '성춘향', TO_DATE('20030425', 'YYYYMMDD'), '타자', 162.9, 10);

INSERT INTO PLAYER(PLAYERID, PLAYERNAME, JOINDATE, POSITION, HEIGHT, TEAMID)
VALUES(103, '홍두께', TO_DATE('20120630', 'YYYYMMDD'), '투수', 172.3, 10);

INSERT INTO PLAYER(PLAYERID, PLAYERNAME, JOINDATE, POSITION, HEIGHT, TEAMID)
VALUES(104, '임꺽정', '', '투수', 188.3, '');

SELECT * FROM player;

-- LIONS소속 선수들만을 출력
SELECT *
FROM player
WHERE TEAMID = 20;

SELECT t.teamid, t.teamname, p.playername, p.position
FROM team t, player p
WHERE t.teamid = p.teamid
    AND t.teamname = '라이온즈';

-- 선수를 입력하면 그 선수의 팀 명과 전화번호, 홈페이지가 출력되도록 합니다.
SELECT t.teamname, t.tel, t.homepage, p.playername
FROM player p, team t
WHERE p.teamid = t.teamid
    AND p.playername = '성춘향';









