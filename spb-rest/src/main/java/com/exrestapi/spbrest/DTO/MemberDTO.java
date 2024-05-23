package com.exrestapi.spbrest.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString

/*
    CREATE TABLE MEMBER_TBL(
        MEM_ID					VARCHAR2(15)					CONSTRAINT PK_MEMBER_ID PRIMARY KEY,
        MEM_NAME             	VARCHAR2(30)					NOT NULL,
        MEM_PW                 	VARCHAR2(60)					NOT NULL,
        MEM_EMAIL            	VARCHAR2(50)					NOT NULL,
        MEM_ZIPCODE         	CHAR(5) 						NOT NULL,
        MEM_ADDR              	VARCHAR2(100)					NOT NULL,
        MEM_ADDR_D			    VARCHAR2(100)					NOT NULL,
        MEM_PHONE          	    VARCHAR2(15)					NOT NULL,
        MEM_NICK             	VARCHAR2(20)					NOT NULL UNIQUE,
        MEM_ACCEPT_E      	    CHAR(1)  DEFAULT 'Y'			NOT NULL,
        MEM_POINT				NUMBER DEFAULT 0          	 	NOT NULL,
        MEM_DATE_SUB      	    DATE  DEFAULT SYSDATE   		NOT NULL,
        MEM_DATE_UP        	    DATE  DEFAULT SYSDATE		    NOT NULL,
        MEM_DATE_LAST   	    DATE  DEFAULT SYSDATE    		NOT NULL,
        MEM_VERIFY              NUMBER DEFAULT 0,
        MEM_AUTHCODE		    CHAR(1) DEFAULT 'N'				NOT NULL
        --MEM_SESSION_KEY	        VARCHAR2(50)
        --MEM_SESSION_LIMIT	TIMESTAMP
    );
*/
public class MemberDTO extends BaseDTO{

    private Integer memNo;
    private String memId;
    private String memPwd;
    private String memEmail;
    private String memPhone;
    private String memAddr;
    private String memAddrDetail;

}
