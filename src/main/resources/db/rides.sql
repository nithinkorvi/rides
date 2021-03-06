DROP TABLE ride_request CASCADE;
DROP TABLE ride CASCADE;
DROP TABLE ride_user CASCADE;

CREATE SEQUENCE ride_user_user_id_seq;

CREATE SEQUENCE ride_user_email_seq;

CREATE SEQUENCE ride_user_mobile_number_seq;

CREATE SEQUENCE ride_user_last_name_seq;

CREATE SEQUENCE ride_user_first_name_seq;

CREATE TABLE ride_user (
                user_id BIGINT NOT NULL DEFAULT nextval('ride_user_user_id_seq'),
                email VARCHAR NOT NULL DEFAULT nextval('ride_user_email_seq'),
                mobile_number VARCHAR NOT NULL DEFAULT nextval('ride_user_mobile_number_seq'),
                password VARCHAR(64) NOT NULL,
                last_name VARCHAR NOT NULL DEFAULT nextval('ride_user_last_name_seq'),
                first_name VARCHAR NOT NULL DEFAULT nextval('ride_user_first_name_seq'),
                CONSTRAINT ride_user_pk PRIMARY KEY (user_id)
);


ALTER SEQUENCE ride_user_user_id_seq OWNED BY ride_user.user_id;

ALTER SEQUENCE ride_user_email_seq OWNED BY ride_user.email;

ALTER SEQUENCE ride_user_mobile_number_seq OWNED BY ride_user.mobile_number;

ALTER SEQUENCE ride_user_last_name_seq OWNED BY ride_user.last_name;

ALTER SEQUENCE ride_user_first_name_seq OWNED BY ride_user.first_name;


CREATE SEQUENCE ride_request_id_seq;

CREATE TABLE ride (
                ride_id BIGINT NOT NULL DEFAULT nextval('ride_request_id_seq'),
                user_id BIGINT NOT NULL,
                passenger_count BIGINT NOT NULL,
                destination VARCHAR NOT NULL,
                destination_zipcode VARCHAR(12),
                description VARCHAR,
                ride_date TIMESTAMP NOT NULL,
                updated_date TIMESTAMP NOT NULL,
                created_date TIMESTAMP NOT NULL,
                source_zipcode VARCHAR(12),
                source VARCHAR NOT NULL,
                CONSTRAINT ride_pk PRIMARY KEY (ride_id)
);

ALTER SEQUENCE ride_request_id_seq OWNED BY ride.ride_id;


CREATE SEQUENCE ride_request_request_id_seq;

CREATE TABLE ride_request (
                request_id VARCHAR NOT NULL DEFAULT nextval('ride_request_request_id_seq'),
                source VARCHAR,
                notes VARCHAR,
                approved BOOLEAN,
                updated_date TIMESTAMP NOT NULL,
                destination_zipcode VARCHAR(12),
                created_date TIMESTAMP NOT NULL,
                source_zipcode VARCHAR(12),
                destination VARCHAR,
                ride_id BIGINT NOT NULL,
                user_id BIGINT NOT NULL,
                CONSTRAINT ride_request_pk PRIMARY KEY (request_id)
);


ALTER SEQUENCE ride_request_request_id_seq OWNED BY ride_request.request_id;

ALTER TABLE ride ADD CONSTRAINT user_ride_fk
FOREIGN KEY (user_id)
REFERENCES ride_user (user_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE ride_request ADD CONSTRAINT user_ride_request_fk
FOREIGN KEY (user_id)
REFERENCES ride_user (user_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE ride_request ADD CONSTRAINT ride_ride_request_fk
FOREIGN KEY (ride_id)
REFERENCES ride (ride_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;