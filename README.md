# filesSprings
Trabalhando com arquivos Spring com mysql

A ideia do formulario e fazer com que o usuario selecione um arquivo para upload e depois gravar o arquivo e tipo selecionado
no banco de dados mysql.

Até consegui selecionar o arquivo, porém no não esta gravando o tipo do arquivo e o conteudo esta gravando como se fosse um 
arquivo texto independentemente do tipo selecionado.

Minha tabela de anexo no banco dados esta definida assim:
CREATE TABLE `tab_anexos` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '	',
  `conteudo` longblob,
  `content_type` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8
