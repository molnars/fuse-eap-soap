drop table if exists accounts;
CREATE TABLE accounts (
  ID INT NOT NULL,
  NAME VARCHAR(100) NOT NULL,
  CATEGORY VARCHAR(50) NOT NULL,
  PRIMARY KEY (ID)
) ;
