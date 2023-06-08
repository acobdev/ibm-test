CREATE DATABASE IF NOT EXISTS ibmtestDB;

CREATE TABLE proveedores (
    id_proveedor    NUMBER(1)       PRIMARY KEY,
    nombre          VARCHAR2(20)    NOT NULL,
    fecha_alta      DATE,
    id_cliente      NUMBER(1)       NOT NULL
);

INSERT INTO proveedores(id_proveedor, nombre, fecha_alta, id_cliente) VALUES (1, 'Coca-Cola', TO_DATE('17/12/2015', 'DD/MM/YYYY'), 5);
INSERT INTO proveedores(id_proveedor, nombre, fecha_alta, id_cliente) VALUES (2, 'Pepsi', TO_DATE('20/04/2019', 'DD/MM/YYYY'), 5);
INSERT INTO proveedores(id_proveedor, nombre, fecha_alta, id_cliente) VALUES (3, 'Redbull', TO_DATE('05/01/2013', 'DD/MM/YYYY'), 6);
INSERT INTO proveedores(id_proveedor, nombre, fecha_alta, id_cliente) VALUES (4, 'Fanta', TO_DATE('27/10/2021', 'DD/MM/YYYY'), 7);
INSERT INTO proveedores(id_proveedor, nombre, fecha_alta, id_cliente) VALUES (5, 'Casera', TO_DATE('13/02/2009', 'DD/MM/YYYY'), 8);
INSERT INTO proveedores(id_proveedor, nombre, fecha_alta, id_cliente) VALUES (6, 'Trina', TO_DATE('04/04/2005', 'DD/MM/YYYY'), 6);