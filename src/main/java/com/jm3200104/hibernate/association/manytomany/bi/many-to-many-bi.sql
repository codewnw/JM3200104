CREATE TABLE JM3200104_MTM_BI_PERSON(
ID BIGINT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR
);

CREATE TABLE JM3200104_MTM_BI_ADDRESS(
ID BIGINT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR
);

CREATE TABLE JM3200104_MTM_BI_PERSON_JM3200104_MTM_BI_ADDRESS(
PERSON_ID BIGINT,
ADDRESSES_ID BIGINT
);

ALTER TABLE JM3200104_MTM_BI_PERSON_JM3200104_MTM_BI_ADDRESS
ADD CONSTRAINT JM3200104_MTM_BI_PERSON_FORKEY
FOREIGN KEY(PERSON_ID) REFERENCES JM3200104_MTM_BI_PERSON(ID);

ALTER TABLE JM3200104_MTM_BI_PERSON_JM3200104_MTM_BI_ADDRESS
ADD CONSTRAINT JM3200104_MTM_BI_ADDRESS_FORKEY
FOREIGN KEY(ADDRESSES_ID) REFERENCES JM3200104_MTM_BI_ADDRESS(ID);