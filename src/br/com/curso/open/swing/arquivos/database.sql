/*DROP MAIS CREATE DA TABELA DE FUNCIONARIO*/
DROP TABLE IF EXISTS funcionario;
CREATE TABLE public.funcionario (
  id serial,
  nome VARCHAR(255) NOT NULL,
  sexo CHAR(1) NOT NULL,
  salario NUMERIC(15,2),
  data_de_entrada DATE NOT NULL,
  data_de_saida DATE,
  cidade VARCHAR(50) NOT NULL,
  logradouro VARCHAR(255) NOT NULL,
  numero VARCHAR(10),
  complemento VARCHAR(255),
  bairro VARCHAR(50) NOT NULL,
  uf CHAR(2) NOT NULL,
  cep CHAR(8),
  fk_cargo INTEGER NOT NULL,
  PRIMARY KEY(id)
);

/*DROP MAIS CREATE DA TABELA DE CARGO*/
DROP TABLE IF EXISTS cargo;
CREATE TABLE public.cargo (
  id serial,
  cargo VARCHAR(255) NOT NULL,
  PRIMARY KEY(id)
);

/*FUNCTION PARA MASCARAR O CEP*/
CREATE OR REPLACE FUNCTION public.masc_cep (
  cep text
)
RETURNS text AS
$body$
begin
    if length(cep) = 8
       then return substr(cep,1,2)||'.'||substr(cep,3,3)||'-'||substr(cep,6,3);
       else return cep;
    end if;
end
$body$
LANGUAGE 'plpgsql'
VOLATILE
CALLED ON NULL INPUT
SECURITY INVOKER
COST 100;

/*INSERT DAS TABELAS*/
INSERT INTO cargo (cargo) 
VALUES (E'suporte');

INSERT INTO funcionario ("nome", 
                         "sexo", 
                         "salario", 
                         "data_de_entrada", 
                         "data_de_saida", 
                         "cidade", 
                         "logradouro", 
                         "numero", 
                         "complemento", 
                         "bairro", 
                         "uf", 
                         "cep", 
                         "fk_cargo")
VALUES 
(E'Ftima', E'F', '1000', E'2021-05-01', null, E'Anpolis', E'Rua 1', E'N: 1', E'Complemento 1', E'Bairro 1', E'GO', E'75096570', (SELECT id from cargo where cargo = 'suporte' limit 1)),
(E'Lucyene', E'F', '1000', E'2021-05-01', null, E'Barra', E'Rua 2', E'N: 2', E'Complemento 2', E'Bairro 2', E'BA', E'47100970', (SELECT id from cargo where cargo = 'suporte' limit 1)),
(E'Joaquim', E'M', '1000', E'2021-05-01', null, E'Alto Belo', E'Rua 3', E'N: 3', E'Complemento 3', E'Bairro 3', E'MG', E'39394971', (SELECT id from cargo where cargo = 'suporte' limit 1)),
(E'Leonel', E'M', '1000', E'2021-05-01', null, E'Anpolis', E'Rua 4', E'N: 4', E'Complemento 4', E'Bairro 4', E'GO', E'75144501', (SELECT id from cargo where cargo = 'suporte' limit 1));