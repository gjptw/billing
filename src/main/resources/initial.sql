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