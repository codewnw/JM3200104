CREATE TABLE JM3200104_MTM_UNI_PERSON(
ID BIGINT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR
);

CREATE TABLE JM3200104_MTM_UNI_ADDRESS(
ID BIGINT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR
);

CREATE TABLE JM3200104_MTM_UNI_PERSON_JM3200104_MTM_UNI_ADDRESS(
PERSON_ID BIGINT,
ADDRESSES_ID BIGINT
);

ALTER TABLE JM3200104_MTM_UNI_PERSON_JM3200104_MTM_UNI_ADDRESS
ADD CONSTRAINT JM3200104_MTM_UNI_PERSON_FK
FOREIGN KEY(PERSON_ID) REFERENCES JM3200104_MTM_UNI_PERSON(ID);

ALTER TABLE JM3200104_MTM_UNI_PERSON_JM3200104_MTM_UNI_ADDRESS
ADD CONSTRAINT JM3200104_MTM_UNI_ADRESS_FK
FOREIGN KEY(ADDRESSES_ID) REFERENCES JM3200104_MTM_UNI_ADDRESS(ID);