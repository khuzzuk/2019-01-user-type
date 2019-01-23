--V1.00__test.sql

CREATE TYPE phone_type AS ENUM ('LAND_LINE', 'MOBILE_LINE');

CREATE TABLE person (
id BIGSERIAL PRIMARY KEY,
first_name VARCHAR(255),
phone_number VARCHAR(255),
phone_type phone_type
);
