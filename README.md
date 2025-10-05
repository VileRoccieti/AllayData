# 📊 Allay Data / Allay Nexo: Sistema de Gestión de Datos con Java Swing

¡Un completo sistema de gestión de datos que simula una base de datos para usuarios, pedidos, envíos y mucho más, todo con una intuitiva interfaz gráfica construida con Java Swing! 🚀

---

## ✨ Descripción General

**Allay Data** es una aplicación de escritorio robusta y fácil de usar diseñada para administrar de manera eficiente la información de usuarios, pedidos, productos y transacciones. Este proyecto no solo permite la manipulación de datos complejos, sino que también ofrece funcionalidades avanzadas como la importación y exportación de datos, gestión de roles de usuario y un sistema de notificaciones. ¡Ideal para aprender sobre desarrollo de software de escritorio con Java y para proyectos que necesiten una base de datos simulada y funcional!

---

## 🌟 Puntos Destacados del Desarrollo

Este proyecto ha sido íntegramente desarrollado por mí, Ricardo Valencia, desde la concepción del código hasta el diseño de la interfaz gráfica. A pesar de las limitaciones inherentes a **Java Swing**, se ha puesto un gran énfasis en la profesionalidad y la funcionalidad, logrando una interfaz intuitiva y avanzada. ¡Todo el código y diseño son completamente originales! 👨‍💻✨

---

## 🚀 Características Principales

Este proyecto está lleno de funcionalidades diseñadas para ofrecer una experiencia de gestión completa:

* **👥 Gestión Avanzada de Usuarios:**
    * **Registro y Autenticación:** Creación de nuevas cuentas de usuario con credenciales seguras (correo y contraseña).
    * **Roles de Usuario:** Diferenciación entre **Administradores** y **Usuarios Normales**, cada uno con sus propios permisos.
    * **Estados de Cuenta:** Manejo de estados de usuario como **Habilitado**, **Deshabilitado** o con **Infracción**.
    * **Datos Detallados:** Almacenamiento de información completa del usuario: nombre, cédula, número de teléfono y dirección.

* **📦 Gestión de Pedidos y Productos (Estilo Tienda Virtual):**
    * Creación y seguimiento de **pedidos** con múltiples **productos**.
    * Manejo de **órdenes** de compra y su estado.
    * Simulación de **envíos** y **paquetes** asociados a cada pedido con seguimiento detallado.
    * Interfaz de **Tienda Online** para una navegación de productos intuitiva.

* **💸 Transacciones y Notificaciones Inteligentes:**
    * Registro de **transacciones financieras** con detalles como método de pago, entidad emisora y plataforma.
    * Sistema de **notificaciones** para mantener a los usuarios informados sobre el estado de sus pedidos y cuenta, incluyendo mensajes de pago exitoso, fallido o actualizaciones de cuenta.
    * Sistema de **Fondos de Usuario:** Los usuarios reciben fondos por cada compra, incentivando futuras transacciones.

* **🔄 Importación y Exportación de Datos:**
    * ¡Lleva tus datos a donde quieras! Exporta la información en formatos `.txt` y `.csv`.
    * Importa datos fácilmente para poblar la base de datos de manera masiva.

* **💻 Interfaz Gráfica Intuitiva y Detallada:**
    * Desarrollada completamente con **Java Swing**, ofreciendo una experiencia de usuario clásica y funcional con iconos personalizados.
    * Diseño organizado y fácil de navegar con paneles dedicados para **Overview**, **Users Manager**, **Orders Manager**, **Product Manager**, **Payments Manager** y **Notifications**.

---

## 🛠️ Tecnologías Utilizadas

* **Lenguaje de Programación:** **Java** ☕
* **Interfaz Gráfica:** **Java Swing** 🖼️
* **IDE Recomendado:** **Apache NetBeans** o **IntelliJ IDEA** (se usó NetBeans principalmente).

---

## ⚙️ Cómo Empezar

Para poner en marcha este proyecto en tu máquina local, sigue estos sencillos pasos.

### Prerrequisitos

Asegúrate de tener instalado lo siguiente:

* **JDK (Java Development Kit)** versión 8 o superior.
* Un IDE de tu preferencia compatible con Java, como NetBeans, IntelliJ IDEA o Eclipse.
* **Git** (opcional, para clonar el repositorio).

### Instalación

1.  **Clona el repositorio:**
    ```sh
    git clone https://github.com/VileRoccieti/AllayData.git
    ```
2.  **Abre el proyecto en tu IDE:**
    * Abre tu IDE preferido.
    * Selecciona la opción para abrir un proyecto existente y navega hasta la carpeta que acabas de clonar.

3.  **Ejecuta la aplicación:**
    * Busca el archivo `AllayNexo.java` (o el que contenga el método `main`) y ejecútalo.
    * ¡Y listo! La interfaz gráfica de Allay Data debería aparecer.

---

## 📸 Vistas Previas de la Aplicación

Aquí tienes un vistazo de cómo luce nuestra aplicación en acción, destacando su interfaz y funcionalidades:

### 🔑 Inicio de Sesión / Registro
Una interfaz clara para acceder o crear nuevas cuentas.

[![Inicio de Sesión](https://github.com/VileRoccieti/AllayData/blob/main/assets/im1.webp?raw=true)](https://github.com/VileRoccieti/AllayData/blob/main/assets/im1.webp?raw=true)

### 🛒 Dashboard de Productos (Estilo Tienda Virtual)
Explora y gestiona productos con detalles como ID, nombre, costo, marca y stock.
[![Dashboard de Productos](https://github.com/VileRoccieti/AllayData/blob/main/assets/im2.webp?raw=true)](https://github.com/VileRoccieti/AllayData/blob/main/assets/im2.webp?raw=true)

### 💰 Simulador de Pago Avanzado
Detalles completos para realizar pedidos, incluyendo dirección, método de pago, entidad emisora, estado (pendiente/fallido) y opciones de entrega. ¡Además, los usuarios acumulan fondos por cada compra!
[![Simulador de Pago](https://github.com/VileRoccieti/AllayData/blob/main/assets/im3.webp?raw=true)](https://github.com/VileRoccieti/AllayData/blob/main/assets/im3.webp?raw=true)

### 👤 Gestión de Usuarios
Panel de administración para gestionar usuarios, sus roles (Administrador/Normal), estados de cuenta (Habilitado/Deshabilitado/Infracción) y datos personales.
[![Gestión de Usuarios](https://github.com/VileRoccieti/AllayData/blob/main/assets/im4.webp?raw=true)](https://github.com/VileRoccieti/AllayData/blob/main/assets/im4.webp?raw=true)

### 📦 Gestión de Pedidos (Orders Manager)
Administra todos los pedidos, incluyendo destinos, costos de envío, ID de clientes y el estado actual del paquete (En espera, En ruta, Entregado, etc.).
[![Gestión de Pedidos](https://github.com/VileRoccieti/AllayData/blob/main/assets/im5.webp?raw=true)](https://github.com/VileRoccieti/AllayData/blob/main/assets/im5.webp?raw=true)

### 🛍️ Gestión de Productos (Product Manager)
Control total sobre el inventario, con detalles como ID de producto, nombre, costo, fecha de creación, empresa, tipo, peso, stock y dimensiones.
[![Gestión de Productos](https://github.com/VileRoccieti/AllayData/blob/main/assets/im6.webp?raw=true)](https://github.com/VileRoccieti/AllayData/blob/main/assets/im6.webp?raw=true)

### 💳 Gestión de Pagos (Payments Manager)
Supervisa todas las transacciones financieras, incluyendo código de pago, ID de orden, ID de cliente, monto, método de pago, entidad emisora, plataforma y estado del pago.
[![Gestión de Pagos](https://github.com/VileRoccieti/AllayData/blob/main/assets/im7.webp?raw=true)](https://github.com/VileRoccieti/AllayData/blob/main/assets/im7.webp?raw=true)

### 🔔 Gestión de Notificaciones
Central de notificaciones para administrar mensajes enviados a los usuarios, con detalles como ID de notificación, ID de usuario, fecha, hora, asunto, mensaje y estado (Leído/No Leído) y prioridad.

*(Nota: Si tienes una octava imagen para "Gestión de Notificaciones", puedes añadirla aquí con el mismo formato que las demás).*

---
## 🤝 ¿Quieres Contribuir?

¡Las contribuciones son lo que hace que la comunidad de código abierto sea un lugar increíble para aprender, inspirar y crear! Cualquier contribución que hagas será **muy apreciada**.

Si deseas contribuir, por favor sigue estos pasos:

1.  Haz un **Fork** del proyecto.
2.  Crea tu propia rama para la nueva funcionalidad (`git checkout -b feature/AmazingFeature`).
3.  Haz **Commit** de tus cambios (`git commit -m 'Add some AmazingFeature'`).
4.  Haz **Push** a tu rama (`git push origin feature/AmazingFeature`).
5.  Abre un **Pull Request**.

---

## 📜 Licencia

Este proyecto está distribuido bajo la Licencia MIT. Consulta el archivo `LICENSE` para más información.

---

¡Gracias por visitar nuestro repositorio! Si te gusta este proyecto, ¡no olvides darle una ⭐!
