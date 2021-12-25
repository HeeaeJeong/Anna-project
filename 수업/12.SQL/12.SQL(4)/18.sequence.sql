/*
    SEQUENCE : ������ ���� ������ �ִ� ����Ŭ ������Ʈ
                NUMBER++;
*/

-- SEQUENCE ����
CREATE SEQUENCE TEST_SEQ
INCREMENT BY 1      -- 1�� ����
START WITH 10       -- ���� ����
MAXVALUE 100
MINVALUE 1;

-- CURRVAL = ������ SEQ
SELECT TEST_SEQ.CURRVAL 
FROM DUAL;

-- NEXTVAL = ���� ��
SELECT TEST_SEQ.NEXTVAL 
FROM DUAL;

-- ����
ALTER SEQUENCE TEST_SEQ
INCREMENT BY 3;

DROP SEQUENCE TEST_SEQ;

