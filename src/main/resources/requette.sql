create table if not exists employees
(
    id         bigint auto_increment primary key,
    first_name varchar(255) null,
    last_name  varchar(255) null,
    mail       varchar(255) null,
    password   varchar(255) null
    );

INSERT INTO employees (first_name, last_name, mail, password) VALUES
('Laurent', 'GINA', 'laurentgina@mail.com', 'laurent'),
('Sophie', 'FONCEK', 'sophiefoncek@mail.com', 'sophie'),
('Agathe', 'FEELING', 'agathefeeling@mail.com', 'agathe');

select * from employees;