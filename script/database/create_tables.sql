--Este script para criacao das tabelas no banco de dados

CREATE TABLE public.teste
(
    codigo integer NOT NULL,
    nome character varying (70),
    CONSTRAINT pk_teste PRIMARY KEY (codigo)
);

