package mul.camp.a.dto;

import java.io.Serializable;

/*
CREATE TABLE MEMBER(
	ID VARCHAR2(50) PRIMARY KEY,
	PWD VARCHAR2(50) NOT NULL,
	NAME VARCHAR2(50) NOT NULL,
	EMAIL VARCHAR2(50) UNIQUE,
	AUTH NUMBER(1)
);

INSERT INTO MEMBER(ID, PWD, NAME, EMAIL, AUTH)
VALUES('aaa', '111', '홍길동', 'aaa', 3);

INSERT INTO MEMBER(ID, PWD, NAME, EMAIL, AUTH)
VALUES('bbb', '222', '성춘향', 'bbb', 3);

INSERT INTO MEMBER(ID, PWD, NAME, EMAIL, AUTH)
VALUES('ccc', '333', '일지매', 'ccc', 3);

select * from MEMBER;

INSERT INTO MEMBER(ID, PWD, NAME, EMAIL, AUTH)
VALUES('ddd', '444', '홍두께', 'ddd', 3);
*/

public class MemberDto implements Serializable{	// = 직렬화
	private String id;
	private String pwd;
	private String name;
	private String email;
	private int auth;
	
	public MemberDto() {
	}
	public MemberDto(String id, String pwd, String name, String email, int auth) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.auth = auth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAuth() {
		return auth;
	}
	public void setAuth(int auth) {
		this.auth = auth;
	}
	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", auth=" + auth + "]";
	}
	
}
