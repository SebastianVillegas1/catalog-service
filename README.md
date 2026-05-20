Proyecto: “UrbanDrip” 
 Contexto del sistema
“UrbanDrip” es una plataforma de venta online de ropa y zapatillas estilo streetwear, donde los usuarios pueden:
•	Registrarse e iniciar sesión 
•	Explorar productos por categoría 
•	Agregar productos al carrito 
•	Realizar compras 
•	Hacer seguimiento de sus pedidos 
El sistema simula una tienda real tipo Nike o Marketplace básico, pero con arquitectura de microservicios.
 Roles
•	Cliente → compra productos 
•	Administrador → gestiona productos y pedidos 




2. Microservicio de Catálogo (Productos + Categorías)
Responsabilidades:
•	CRUD de productos 
•	Gestión de stock 
•	Categorías (zapatillas, poleras, etc.) 
•	Búsqueda y filtros 
 Base de datos:
•	Productos 
•	Categorías 
 Interacción:
•	Consultado por: 
o	Carrito 
o	Pedidos 
•	Entrega precio y stock actualizado 


 Base de datos:
•	Catalogo

 

