clientescreate database proyectoDB;
use proyectoDB;
 create table if not exists Clientes (
 ID_Cliente int auto_increment primary key,
 Nombre varchar (50),
 Apellido varchar (50),
 Telefono varchar (11),
 Correo_Electronico varchar (200),
 Direccion varchar (200)
 );
 
 create table if not exists Productos (
 ID_Producto int auto_increment primary key,
 Nombre varchar (50),
 Descripcion text,
 Precio decimal (10, 2),
 Stock int
 );
 
 create table if not exists Pedidos (
 ID_Pedido int auto_increment primary key,
 ID_Cliente int,
 Fecha date,
 Estado enum ("Pendiente", "En progreso", "Completado"),
 foreign key (ID_Cliente) references Clientes (ID_Cliente)
 );
 
 create table if not exists Detalle_Pedido (
 ID_Detalle int auto_increment primary key,
 ID_Pedido int,
 ID_Producto int,
 Cantidad int,
 Precio_Unitario decimal (10, 2),
 foreign key (ID_Pedido) references Pedidos (ID_Pedido),
 foreign key (ID_Producto) references Productos (ID_Producto)
 );
 
 create table if not exists Facturas (
 ID_Factura int auto_increment primary key,
 ID_Pedido int,
 Total decimal (10, 2),
 Fecha_Emision date,
 foreign key (ID_Pedido) references Pedidos (ID_Pedido)
 );
 
 create table if not exists Empleados (
 ID_Empleado int auto_increment primary key,
 Nombre varchar (50),
 Apellido varchar (50),
 Cargo varchar (50),
 Fecha_Contratacion date
 );
 
 create table if not exists Produccion (
 ID_Produccion int auto_increment primary key,
 Fecha date,
 Descripcion text,
 Responsable int,
 foreign key (Responsable) references  Empleados (ID_Empleado)
 );
 
 create table if not exists Gastos (
 ID_Gastos int auto_increment primary key,
 Descripcion text,
 Monto decimal (10, 2),
 Fecha date
 );
 
 