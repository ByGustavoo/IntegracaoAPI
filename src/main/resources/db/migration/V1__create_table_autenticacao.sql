CREATE SCHEMA IF NOT EXISTS seguranca;

CREATE TABLE IF NOT EXISTS seguranca.autenticacao(
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password TEXT NOT NULL
);