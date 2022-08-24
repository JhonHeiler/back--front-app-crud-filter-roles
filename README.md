Proyecto que implementa un servicio apirest construido con springboot. El cliente es un proyecto en angular que consume el api.



En este repositorio encontrará dos carpetas:

* api: es el proyecto en java springboot.

* cliente: cliente es el proyecto construido en angular.



PRUEBA TECNICA:




INTRODUCCIÓN : Este repositorio consiste en mostrar las habilidades técnicas (Springbook-Java) a travéz de la resolución de los problemas planteados .

TECNOLOGÍA Y PATRONES DE DISEÑO EMPLEADO.

.Patron de diseño -> Inyección de dependencia.

.Rest con el framework -> springbook

.Mapeo objeto-relacional -> Hibernate

.Repositorios de git

.Angular



PLAN DE TRABAJO : El repositorio se realizó en 2 días y para ello se propuso dividir el proyecto en una serie de etapas que se detallarán a continuación :

ETAPA 1 : Plantear la lógica inicial de los problemas.

ETAPA 2 : Creacion y normalizacion de bases de datos .

ETAPA 3 : Plasmar la lógica en código(Api Rest) .

ETAPA 3 : Consumir Api Rest (CLIENTE)

ETAPA 4 : Versión final README.



ARCHIVOS IMPORTANTES El proyecto presenta los siguientes archivos para uso del usuario: README.md con descripción del repositorio, imagenes del mismo y organización. src: Todo el codigo fuente. controllers: Definimos las rutas. service: Toda la logica relacionada con la base de datos modelo: Nombres de la entidades (estrutura). : Frontend (consumidor de Api Rest).

CONFIGURACIÓN Y EJECUCIÓN. Para compilar el proyecto api utilice maven. Puede utilizar el intellij idea, IDE eclipse o Spring Tool Suit para compilar o ejecutar. Este levantará el servicio por el puerto 8080. Este proyecto conectará a una base de datos postgresql. Para compilar el proyecto cliente utilice Angular.
![1](https://user-images.githubusercontent.com/89054795/154942693-931248f2-9fab-4b48-b584-f97720b2e4c6.png)
![2](https://user-images.githubusercontent.com/89054795/154942715-87215407-e1e5-4516-b444-a94102478017.png)

![3](https://user-images.githubusercontent.com/89054795/154942734-5ebce577-f1b5-49f9-9e22-1aa9e7f4e2a2.png)
![5](https://user-images.githubusercontent.com/89054795/154942747-cafaeafc-8ae5-4ee9-932d-a79f93aef253.png)


Script para crear la Base de dato y las tablas en postgresql.


Nombre de la base de datos: registro
![d](https://user-images.githubusercontent.com/89054795/154803750-3333cbdc-1d76-400d-803c-c001544c9696.png)




--Tabla rol

CREATE TABLE rol (
	id_rol serial PRIMARY KEY,
	nombre varchar(50) not null unique
);



---Tabla usuario

CREATE TABLE usuario (
	id_usuario serial PRIMARY KEY,
        id_rol integer not null,
	nombre varchar(50) not null,
        activo varchar(1) not null,
        FOREIGN KEY (id_rol) REFERENCES rol(id_rol)	
);



