CREATE TABLE User 
(
  ID int NOT NULL PRIMARY KEY,
  Salt TEXT NOT NULL,
  Hash TEXT NOT NULL,
  UserName TEXT NOT NULL
);

-- Split

CREATE TABLE Project 
(
  ID INTEGER NOT NULL PRIMARY KEY,
  Timestamp TEXT NOT NULL,
  Description TEXT NOT NULL
);

-- Split

CREATE TABLE Comment 
(
  ID INTEGER NOT NULL PRIMARY KEY,
  Timestamp TEXT NOT NULL,
  Text TEXT,
  IDTicket INTEGER NOT NULL
);

-- Split

CREATE TABLE Status
(
  ID INTEGER NOT NULL PRIMARY KEY,
  Color TEXT NOT NULL,
  Description TEXT
);

-- Split

CREATE TABLE Ticket 
(
  ID INTEGER NOT NULL PRIMARY KEY,
  Timestamp TEXT NOT NULL,
  Userstory TEXT NOT NULL,
  AcceptanceCriteria TEXT NOT NULL,
  Title TEXT NOT NULL,
  Creater INTEGER NOT NULL,
  IDProject INTEGER NOT NULL,
  IDStatus INTEGER NOT NULL
);

-- Split

CREATE TABLE ProjectMember
(
  IDUser INTEGER NOT NULL,
  IDProject INTEGER NOT NULL,
  PRIMARY KEY (IDUser, IDProject)
);

-- Split

CREATE TABLE UserComments
(
  IDUser INTEGER NOT NULL,
  IDComment INTEGER NOT NULL,
  PRIMARY KEY (IDUser, IDComment)  
);

-- Split

CREATE TABLE TicketEditor
(
  IDUser INTEGER NOT NULL,
  IDTicket INTEGER NOT NULL,
  Timestamp TEXT NOT NULL,
  PRIMARY KEY (IDUser, IDTicket)
);
