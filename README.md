# 📊 Allay Data / Allay Nexo: Sistema de Gestión de Datos con Java Swing

¡Un completo sistema de gestión de datos que simula una base de datos para usuarios, pedidos, envíos y mucho más, todo con una intuitiva interfaz gráfica construida con Java Swing! 🚀

---

## ✨ Descripción General

**Allay Data** es una aplicación de escritorio robusta y fácil de usar diseñada para administrar de manera eficiente la información de usuarios, pedidos, productos y transacciones. Este proyecto no solo permite la manipulación de datos complejos, sino que también ofrece funcionalidades avanzadas como la importación y exportación de datos, gestión de roles de usuario y un sistema de notificaciones. ¡Ideal para aprender sobre desarrollo de software de escritorio con Java y para proyectos que necesiten una base de datos simulada y funcional!

---

## 🌟 Puntos Destacados del Desarrollo

Este proyecto ha sido íntegramente desarrollado por mí, Ricardo Valencia, desde la concepción del código hasta el diseño de la interfaz gráfica. A pesar de las limitaciones inherentes a **Java Swing**, se ha puesto un gran énfasis en la profesionalidad y la funcionalidad, logrando una interfaz intuitiva y avanzada. ¡Todo el código y diseño son completamente originales\! 👨‍💻✨

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

[![Inicio de Sesión](https://media.discordapp.net/attachments/1052634745579765791/1424431241842921544/image.png?ex=68e3ec78&is=68e29af8&hm=7827ea9ffe0747796408cd786bb89438d7d8e75f34c97f4952b0c42fc5dc03d7&=&format=webp&quality=lossless&width=676&height=805)](https://media.discordapp.net/attachments/1052634745579765791/1424431241842921544/image.png?ex=68e3ec78&is=68e29af8&hm=7827ea9ffe0747796408cd786bb89438d7d8e75f34c97f4952b0c42fc5dc03d7&=&format=webp&quality=lossless&width=676&height=805)

### 🛒 Dashboard de Productos (Estilo Tienda Virtual)
Explora y gestiona productos con detalles como ID, nombre, costo, marca y stock.
[![Dashboard de Productos](https://media.discordapp.net/attachments/1052634745579765791/1424431242228535448/image.png?ex=68e3ec78&is=68e29af8&hm=494d732a42db93952e4c4082a862dbadd35e8e3c37734bbae7f2668f22679f07&=&format=webp&quality=lossless&width=1649&height=790)](https://media.discordapp.net/attachments/1052634745579765791/1424431242228535448/image.png?ex=68e3ec78&is=68e29af8&hm=494d732a42db93952e4c4082a862dbadd35e8e3c37734bbae7f2668f22679f07&=&format=webp&quality=lossless&width=1649&height=790)

### 💰 Simulador de Pago Avanzado
Detalles completos para realizar pedidos, incluyendo dirección, método de pago, entidad emisora, estado (pendiente/fallido) y opciones de entrega. ¡Además, los usuarios acumulan fondos por cada compra!
[![Simulador de Pago](https://media.discordapp.net/attachments/1052634745579765791/1424431242794762370/image.png?ex=68e3ec78&is=68e29af8&hm=4054a02c37a5afdfeb81a7a021609a1349177dd5affa59525ab7860c7f3ed9fc&=&format=webp&quality=lossless&width=1651&height=788)](https://media.discordapp.net/attachments/1052634745579765791/1424431242794762370/image.png?ex=68e3ec78&is=68e29af8&hm=4054a02c37a5afdfeb81a7a021609a1349177dd5affa59525ab7860c7f3ed9fc&=&format=webp&quality=lossless&width=1651&height=788)

### 👤 Gestión de Usuarios
Panel de administración para gestionar usuarios, sus roles (Administrador/Normal), estados de cuenta (Habilitado/Deshabilitado/Infracción) y datos personales.
[![Gestión de Usuarios](https://media.discordapp.net/attachments/1052634745579765791/1424431243549741247/image.png?ex=68e3ec79&is=68e29af9&hm=26b466cd3f6b3bd0ebb4a5815112ec9c70fd9006a5704c6854a7f12da9a69e18&=&format=webp&quality=lossless&width=1563&height=774)](https://media.discordapp.net/attachments/1052634745579765791/1424431243549741247/image.png?ex=68e3ec79&is=68e29af9&hm=26b466cd3f6b3bd0ebb4a5815112ec9c70fd9006a5704c6854a7f12da9a69e18&=&format=webp&quality=lossless&width=1563&height=774)

### 📦 Gestión de Pedidos (Orders Manager)
Administra todos los pedidos, incluyendo destinos, costos de envío, ID de clientes y el estado actual del paquete (En espera, En ruta, Entregado, etc.).
[![Gestión de Pedidos](https://media.discordapp.net/attachments/1052634745579765791/1424431243986210867/image.png?ex=68e3ec79&is=68e29af9&hm=5a0365b7fbcd53666cfd896526c379ef4e5d4b17d1532bc8273d82853b98c9a4&=&format=webp&quality=lossless&width=1570&height=781)](https://media.discordapp.net/attachments/1052634745579765791/1424431243986210867/image.png?ex=68e3ec79&is=68e29af9&hm=5a0365b7fbcd53666cfd896526c379ef4e5d4b17d1532bc8273d82853b98c9a4&=&format=webp&quality=lossless&width=1570&height=781)

### 🛍️ Gestión de Productos (Product Manager)
Control total sobre el inventario, con detalles como ID de producto, nombre, costo, fecha de creación, empresa, tipo, peso, stock y dimensiones.
[![Gestión de Productos](https://media.discordapp.net/attachments/1052634745579765791/1424431244682334352/image.png?ex=68e3ec79&is=68e29af9&hm=ad24173d70f6a74d46a30fcb9bb5402d3e36715fbe16e165a7f5310d06b1a2e8&=&format=webp&quality=lossless&width=1564&height=775)](https://media.discordapp.net/attachments/1052634745579765791/1424431244682334352/image.png?ex=68e3ec79&is=68e29af9&hm=ad24173d70f6a74d46a30fcb9bb5402d3e36715fbe16e165a7f5310d06b1a2e8&=&format=webp&quality=lossless&width=1564&height=775)

### 💳 Gestión de Pagos (Payments Manager)
Supervisa todas las transacciones financieras, incluyendo código de pago, ID de orden, ID de cliente, monto, método de pago, entidad emisora, plataforma y estado del pago.
[![Gestión de Pagos](https://media.discordapp.net/attachments/1052634745579765791/1424431245114216625/image.png?ex=68e3ec79&is=68e29af9&hm=82bc9705893b203de9b42fae15e0250905062927496e952c2429582edb046915&=&format=webp&quality=lossless&width=1581&height=791)](https://media.discordapp.net/attachments/1052634745579765791/1424431245114216625/image.png?ex=68e3ec79&is=68e29af9&hm=82bc9705893b203de9b42fae15e0250905062927496e952c2429582edb046915&=&format=webp&quality=lossless&width=1581&height=791)

### 🔔 Gestión de Notificaciones
Central de notificaciones para administrar mensajes enviados a los usuarios, con detalles como ID de notificación, ID de usuario, fecha, hora, asunto, mensaje y estado (Leído/No Leído) y prioridad.
[![Gestión de Notificaciones](
