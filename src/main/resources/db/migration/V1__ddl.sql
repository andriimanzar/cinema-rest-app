CREATE TABLE IF NOT EXISTS users
(
    id           BIGSERIAL,
    first_name   VARCHAR(255) NOT NULL,
    last_name    VARCHAR(255) NOT NULL,
    email        VARCHAR(255) NOT NULL,
    phone_number VARCHAR(255) NOT NULL,
    user_role    VARCHAR(255) NOT NULL,
    CONSTRAINT users_PK PRIMARY KEY (id),
    CONSTRAINT users_email_UQ UNIQUE(email),
    CONSTRAINT users_phone_number_UQ UNIQUE(phone_number)
);

CREATE TABLE IF NOT EXISTS movies
(
    id           BIGSERIAL,
    title        VARCHAR(255) NOT NULL,
    genre        VARCHAR(255) NOT NULL,
    duration     BIGINT       NOT NULL,
    director     VARCHAR(255) NOT NULL,
    release_year INT          NOT NULL,
    country      VARCHAR(255) NOT NULL,
    description  VARCHAR(255) NOT NULL,
    poster_url   VARCHAR(255),
    trailer_url  VARCHAR(255),
    CONSTRAINT movies_PK PRIMARY KEY (id),
    CONSTRAINT movies_title_UQ UNIQUE (id)
);

CREATE TABLE IF NOT EXISTS halls
(
    id                  BIGSERIAL,
    name                VARCHAR(255) NOT NULL,
    rows_count          INT          NOT NULL,
    seats_number_in_row INT          NOT NULL,
    CONSTRAINT halls_PK PRIMARY KEY (id),
    CONSTRAINT halls_name_UQ UNIQUE (name)
);



CREATE TABLE IF NOT EXISTS movie_sessions
(
    id                 BIGSERIAL,
    movie_id           BIGINT                      NOT NULL,
    hall_id            BIGINT                      NOT NULL,
    session_start_time TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    ticket_price       NUMERIC                     NOT NULL,
    CONSTRAINT movie_sessions_PK PRIMARY KEY (id),
    CONSTRAINT movie_sessions_movies_movie_id_FK FOREIGN KEY (movie_id) REFERENCES movies (id),
    CONSTRAINT movie_sessions_halls_hall_id_FK FOREIGN KEY (hall_id) REFERENCES halls (id)
);

CREATE TABLE IF NOT EXISTS seats
(
    id               BIGSERIAL,
    row_number       INT     NOT NULL,
    seat_number      INT     NOT NULL,
    is_reserved      BOOLEAN NOT NULL,
    movie_session_id BIGINT  NOT NULL,
    CONSTRAINT seats_PK PRIMARY KEY (id),
    CONSTRAINT seats_movie_sessions_movie_session_id_FK FOREIGN KEY (movie_session_id) REFERENCES movie_sessions (id)
);

CREATE TABLE IF NOT EXISTS tickets
(
    id               BIGSERIAL,
    user_id          BIGINT  NOT NULL,
    movie_session_id BIGINT  NOT NULL,
    seat_id          BIGINT  NOT NULL,
    price            NUMERIC NOT NULL,
    is_payed         BOOLEAN NOT NULL,
    CONSTRAINT tickets_PK PRIMARY KEY (id),
    CONSTRAINT tickets_users_user_id_FK FOREIGN KEY (user_id) REFERENCES users (id),
    CONSTRAINT tickets_movie_sessions_movie_session_id_FK FOREIGN KEY (movie_session_id) REFERENCES movie_sessions (id),
    CONSTRAINT tickets_seats_seat_id_FK FOREIGN KEY (seat_id) REFERENCES seats (id)
);

