CREATE TABLE contatos (
    id SERIAL,
    nome VARCHAR (30),
    email_principal VARCHAR (30),
    PRIMARY KEY (id)
);

CREATE TABLE telefones (
    id SERIAL,
    numero VARCHAR (30),
    contato_id INTEGER,
    PRIMARY KEY (id),
    FOREIGN KEY (contato_id) REFERENCES contatos (id)
);


