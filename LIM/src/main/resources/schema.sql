DROP TABLE IF EXISTS blog;
CREATE TABLE blog (
id BIGSERIAL PRIMARY KEY NOT NULL,
post varchar(1000) NOT NULL,
comment varchar(255)

)