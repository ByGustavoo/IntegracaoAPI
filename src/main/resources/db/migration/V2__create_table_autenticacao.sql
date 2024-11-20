CREATE TABLE public.autenticacao(
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password TEXT NOT NULL
);