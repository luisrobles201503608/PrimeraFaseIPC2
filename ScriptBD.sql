
CREATE TABLE agencia (
    codigoagencia     int NOT NULL,
    direccion         varchar(500),
    telefono          int,
    horarioapertura   DATE,
    horariocierre     DATE
);

ALTER TABLE agencia ADD CONSTRAINT agencia_pk PRIMARY KEY ( codigoagencia );

CREATE TABLE cheque (
    correlativo              int NOT NULL,
    nombre                   varchar(70),
    monto                    int,
    firmadigital             varchar(50),
    cuenta_nocuenta          int NOT NULL,
    chequera_identificador   varchar(50) NOT NULL
);

ALTER TABLE cheque ADD CONSTRAINT cheque_pk PRIMARY KEY ( correlativo );

CREATE TABLE chequera (
    identificador     varchar(50) NOT NULL,
    cuenta_nocuenta   int
);

ALTER TABLE chequera ADD CONSTRAINT chequera_pk PRIMARY KEY ( identificador );

CREATE TABLE clienteindi (
    cui               varchar(20) NOT NULL,
    nombre            varchar(50),
    apellidos         varchar(50),
    fechanacimiento   DATE,
    telefono          int,
    correo            varchar(30),
    usuario           varchar(20),
    contraseña        varchar(20)
);

ALTER TABLE clienteindi ADD CONSTRAINT cliente_pk PRIMARY KEY ( cui );

CREATE TABLE clientenomi (
    codigoempresa   varchar(20) NOT NULL,
    nombreempresa   varchar(50),
    telefono        int,
    correo          varchar(30)
);

ALTER TABLE clientenomi ADD CONSTRAINT clienteindiv1_pk PRIMARY KEY ( codigoempresa );

CREATE TABLE cuenta (
    nocuenta          int NOT NULL,
    saldo             int,
    estado            varchar(30),
    clienteindi_cui   varchar(20) NOT NULL,
    tipocuenta_id     int NOT NULL
);

ALTER TABLE cuenta ADD CONSTRAINT cuenta_pk PRIMARY KEY ( nocuenta );

CREATE TABLE estadocuenta (
    nombreestado       varchar(30) NOT NULL,
    prestamo           int,
    transacterceros    int,
    transacpersonal    int,
    puntosacumulados   int,
    cuenta_nocuenta    int
);

ALTER TABLE estadocuenta ADD CONSTRAINT estadocuenta_pk PRIMARY KEY ( nombreestado );

CREATE TABLE prestamos (
    idprestamo         int NOT NULL,
    cantidadaprestar   int NOT NULL,
    cuenta_nocuenta    int NOT NULL
);

ALTER TABLE prestamos ADD CONSTRAINT prestamos_pk PRIMARY KEY ( idprestamo );

CREATE TABLE registronomina (
    idregistro        int NOT NULL,
    sueldoempleado    int,
    clientempresa     varchar(20) NOT NULL,
    cuenta_nocuenta   int NOT NULL
);

ALTER TABLE registronomina ADD CONSTRAINT registronomina_pk PRIMARY KEY ( idregistro,cuenta_nocuenta );

CREATE TABLE roloperador (
    idrol   int NOT NULL,
    rol     varchar(40)
);

ALTER TABLE roloperador ADD CONSTRAINT roloperador_pk PRIMARY KEY ( idrol );

CREATE TABLE tipocuenta (
    id     int NOT NULL,
    tipo   varchar(40)
);

ALTER TABLE tipocuenta ADD CONSTRAINT tipocuenta_pk PRIMARY KEY ( id );

CREATE TABLE trabajadorbanco (
    cui                     varchar(20) NOT NULL,
    nombre                  varchar(50),
    apellidos               varchar(50),
    fechanacimiento         DATE,
    telefono                int,
    correo                  varchar(30),
    usuario                 varchar(30),
    contraseña              varchar(20),
    roloperador_idrol       int NOT NULL,
    agencia_codigoagencia   int NOT NULL
);

ALTER TABLE trabajadorbanco ADD CONSTRAINT clienteindiv1_pkv2 PRIMARY KEY ( cui );

ALTER TABLE cheque ADD CONSTRAINT cheque_chequera_fk FOREIGN KEY ( chequera_identificador )
    REFERENCES chequera ( identificador );

ALTER TABLE cheque ADD CONSTRAINT cheque_cuenta_fk FOREIGN KEY ( cuenta_nocuenta )
    REFERENCES cuenta ( nocuenta );

ALTER TABLE chequera ADD CONSTRAINT chequera_cuenta_fk FOREIGN KEY ( cuenta_nocuenta )
    REFERENCES cuenta ( nocuenta );

ALTER TABLE cuenta ADD CONSTRAINT cuenta_clienteindi_fk FOREIGN KEY ( clienteindi_cui )
    REFERENCES clienteindi ( cui );

ALTER TABLE estadocuenta ADD CONSTRAINT estadocuentafk FOREIGN KEY ( cuenta_nocuenta )
    REFERENCES cuenta ( nocuenta );

ALTER TABLE prestamos ADD CONSTRAINT prestamos_fk FOREIGN KEY ( cuenta_nocuenta )
    REFERENCES cuenta ( nocuenta );

ALTER TABLE registronomina ADD CONSTRAINT registronomina_clientenomi_fk FOREIGN KEY ( clientempresa )
    REFERENCES clientenomi ( codigoempresa );

ALTER TABLE registronomina ADD CONSTRAINT registronomina_cuenta_fk FOREIGN KEY ( cuenta_nocuenta )
    REFERENCES cuenta ( nocuenta );

ALTER TABLE cuenta ADD CONSTRAINT tipocuenta_fk FOREIGN KEY ( tipocuenta_id )
    REFERENCES tipocuenta ( id );

ALTER TABLE trabajadorbanco ADD CONSTRAINT trabajadorbanco_agencia_fk FOREIGN KEY ( agencia_codigoagencia )
    REFERENCES agencia ( codigoagencia );

ALTER TABLE trabajadorbanco ADD CONSTRAINT trabajadorbanco_roloperador_fk FOREIGN KEY ( roloperador_idrol )
    REFERENCES roloperador ( idrol );
