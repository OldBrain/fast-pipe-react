create table users (
id bigserial primary key,
name varchar(1024),
password varchar(1024)
)

INSERT INTO users (name,password) VALUES
('Андрей','232565');
