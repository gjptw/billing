--CREATE DATABASE billing WITH OWNER = developer ENCODING = 'UTF8' CONNECTION LIMIT = -1;

CREATE TABLE IF NOT EXISTS client (
                                      id               BIGSERIAL     NOT NULL,
                                      first_name       VARCHAR(100)  NOT NULL,
                                      last_name        VARCHAR(100)  NOT NULL,
                                      client_data_id   BIGINT NOT NULL,
                                      PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS client_data (
                                            id            BIGSERIAL      NOT NULL,
                                            minute_rate   BIGINT NOT NULL,
                                            balance       BIGINT NOT NULL,
                                            PRIMARY KEY (id)
);


ALTER TABLE client
    ADD FOREIGN KEY(client_data_id) REFERENCES client_data(id) ON UPDATE CASCADE
        ON DELETE CASCADE;

INSERT INTO client_data (id, minute_rate, balance) VALUES (1, 10500, 12500, 1);
INSERT INTO client_data (id, minute_rate, balance) VALUES (2, 700, 1400, 2);
INSERT INTO client_data (id, minute_rate, balance) VALUES (3, 800, 189000, 3);

INSERT INTO client (id, first_name, last_name, client_data_id) VALUES (1,'Ivan', 'Ivanov', 1);
INSERT INTO client (id, first_name, last_name, client_data_id) VALUES (2,'Boris', 'Borisov', 2);
INSERT INTO client (id, first_name, last_name, client_data_id) VALUES (3,'Petr', 'Petrov', 3);
