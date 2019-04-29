CREATE TABLE ACO_Details(
 
ACO_ID VARCHAR(36) not null AUTO_INCREMENT,
 
ACO_Name VARCHAR(36) not null,
 
Program_Year INTEGER,
 
ACO_TIN VARCHAR(36),
 
Track VARCHAR(36),

Agreement_Status BOOL,
 
Start_Date DATETIME,

Agreement_Period INTEGER,
 
Performance_Year INTEGER,
 
ACO_Contact_Phone_Number INTEGER,
 
ACO_Contact_Email VARCHAR(36),
 
User_Name VARCHAR(36),
 
TimeStamp DATETIME,
 
PRIMARY KEY (ACO_ID)

);

CREATE TABLE ACO_Participants(
 
ACO_Participant_ID VARCHAR(36) not null,
 
ACO_ID VARCHAR(36) not null,
 
ACO_Participant_Name VARCHAR(36) not null,
 
Medicare_Enrolled_TIN INTEGER,
 
Status BOOL,
 
Agreement_S3_Path VARCHAR(36),
 
Effective_Start_Date DATETIME,
 
User_Name VARCHAR(36),
 
Timestamp DATETIME,

PRIMARY KEY (ACO_Participant_ID),
 
FOREIGN KEY (ACO_ID) REFERENCES ACO_Details(ACO_ID)

);

CREATE TABLE ACO_Agreement_Details(
 
ACO_Agreement_ID VARCHAR(36),
 
ACO_ID VARCHAR(36),
 
Agreement_Start_Date DATETIME,
 
Renewal_Date DATETIME,
 
Last_Updated_Date DATETIME,
 
Termination_Date DATETIME,
 
Date_Of_Formation DATETIME,
 
ACO_Web_Page VARCHAR(36),
 
ACO_Public_Reporting_Page VARCHAR(36),

Address VARCHAR(36),
 
User_Name VARCHAR(36),
 
Timestamp DATETIME,
 
PRIMARY KEY (ACO_Agreement_ID),
 
FOREIGN KEY (ACO_ID) REFERENCES ACO_Details(ACO_ID)

); 

CREATE TABLE Email_Id(
Id INTEGER not null AUTO_INCREMENT,
Email_1 VARCHAR(36),
Email_2 VARCHAR(36),
Email_3 VARCHAR(36),
User_Name VARCHAR(36),
Timestamp DATETIME,
PRIMARY KEY (Id)
);