CREATE TABLE JM3190309_MTM_UNI_PERSON(
ID BIGINT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR
);

CREATE TABLE JM3190309_MTM_UNI_ADDRESS(
ID BIGINT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR
);

CREATE TABLE JM3190309_MTM_UNI_PERSON_JM3190309_MTM_UNI_ADDRESS(
PERSON_ID BIGINT,
ADDRESS_ID BIGINT
);

ALTER TABLE JM3190309_MTM_UNI_PERSON_JM3190309_MTM_UNI_ADDRESS
ADD CONSTRAINT P_FK
FOREIGN KEY(PERSON_ID) REFERENCES JM3190309_MTM_UNI_PERSON(ID);

ALTER TABLE JM3190309_MTM_UNI_PERSON_JM3190309_MTM_UNI_ADDRESS
ADD CONSTRAINT A_FK
FOREIGN KEY(ADDRESS_ID) REFERENCES JM3190309_MTM_UNI_ADDRESS(ID);