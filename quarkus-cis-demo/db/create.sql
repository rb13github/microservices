CREATE TABLE customer (
	cust_id serial PRIMARY KEY,
	firstname VARCHAR ( 50 )  NOT NULL,
	lastname VARCHAR ( 50 ) NOT NULL,
	email VARCHAR ( 255 ) UNIQUE NOT NULL,
	created_on TIMESTAMP DEFAULT current_timestamp,
    dob date NOT NULL,
	phone_no VARCHAR ( 50 )
);