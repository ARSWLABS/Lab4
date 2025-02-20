# 🚀 Laboratorio de Gestión de Planos Arquitectónicos 🏗️

🎯 **Objetivo:** Construir un modelo de clases para la capa lógica de una aplicación que permita gestionar planos arquitectónicos de una prestigiosa compañía de diseño. A continuación, se describen los pasos para configurar y ejecutar la aplicación utilizando inyección de dependencias con Spring Framework.

---
## 📌 Requisitos

- ☕ **Java 8 o superior**
- 🛠️ **Maven**
- 🌱 **Spring Framework**
- 💻 **IDE (Eclipse, IntelliJ, VS Code)**

---
## 📂 Estructura del Proyecto

El proyecto sigue la siguiente estructura:

```
/src
│   ├── main/java/edu/eci/arsw/blueprints
│   │   ├── config
│   │   ├── model
│   │   ├── persistence
│   │   │   └── impl
│   │   ├── services
│   │   └── ui
│   └── resources
/test
│   └── java/edu/eci/arsw/blueprints/test/persistence/impl
```

---
## 📖 Descripción del Proyecto

🎯 **Objetivo del laboratorio:**

1. 📌 Implementar un modelo de clases para gestionar planos arquitectónicos.
2. 🏗️ Configurar la aplicación con inyección de dependencias usando Spring Framework.
3. 🔍 Completar las operaciones de consulta de planos:
   - `getBlueprint()`
   - `getBlueprintsByAuthor()`
4. 🛠️ Probar el esquema de persistencia `InMemoryBlueprintPersistence`.
5. 🎛️ Implementar filtros para reducir el tamaño de los planos:
   - 🗑️ **(A) Filtrado de redundancias:** elimina puntos consecutivos repetidos.
   - 🎭 **(B) Filtrado de submuestreo:** elimina 1 de cada 2 puntos de forma intercalada.

---
## ⚙️ Configuración

### 1️⃣ Configurar el archivo de configuración de Spring:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-4.2.xsd
          http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.2.xsd">

    <bean id="blueprintsServices" class="edu.eci.arsw.blueprints.services.BlueprintsServices">
    </bean>

</beans>
```

---
## 🚀 Ejecución

### 🏗️ Clonar y configurar el proyecto

1️⃣ **Clonar el repositorio:**
```sh
  git clone https://github.com/ARSWLABS/Lab4
```
2️⃣ **Ingresar al directorio del proyecto:**
```sh
  cd SpringBoot_REST_API_Blueprints-master
```
3️⃣ **Compilar el proyecto con Maven:**
```sh
  mvn package
```

### 📢 Ejecutar en el IDE

1️⃣ Abrir el proyecto en Visual Studio Code, IntelliJ o Eclipse.
2️⃣ Ejecutar la clase principal desde el IDE con **Run**.

### 📌 Probar la funcionalidad

1️⃣ **Para probar la funcionalidad, agregar al método `main` la creación y consulta de planos:**
   - Crear y registrar planos con `addNewBlueprint()`.
   - Consultar planos por autor con `getBlueprintsByAuthor()`.
   - Consultar un plano específico con `getBlueprint()`.

2️⃣ **Probar los filtros:**
   - Cambiar la anotación para inyectar el filtro deseado en `BlueprintServices`.

---
## 🧪 Pruebas

✅ Ejecutar las pruebas unitarias con `mvn test`

Nota: Recuerda estar en el mismo directorio que en donde esta el pom en consola

---
## 🤝 Contribución

1️⃣ Hacer fork del repositorio.
2️⃣ Crear una rama con la nueva funcionalidad o corrección de bug.
3️⃣ Hacer pull request con la descripción de los cambios.

---
## 📝 Licencia

Este proyecto está bajo la **Licencia MIT**.

📌 _¡Contribuye y mejora la gestión de planos arquitectónicos con nosotros!_ 🚀

