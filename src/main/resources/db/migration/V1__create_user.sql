CREATE TABLE "user"
(
    id       BIGINT AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL PRIMARY KEY,
    password VARCHAR(255),
    enabled  VARCHAR(255),
    role     VARCHAR(255)
);

INSERT INTO "user"
VALUES (1, 'user', '', 'true', 'USER')