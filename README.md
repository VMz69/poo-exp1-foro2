# Portada de trabajo
**UNIVERSIDAD DON BOSCO**  
Dirección de Educación a Distancia  

**MATERIA:**  
Programación Orientada a Objetos POO901 G01T (Virtual)  

**DOCENTE:**  
Rafael Alexander Torres Rodríguez  

**INTEGRANTES:**  
- MR251336 - Darwin Ezequiel Martínez Rosales  
- GH251230 - Fernando José Gómez Hernández  
- AV251709 - Milton Adalberto Ayala Ventura  
- SG240238 - Nelson Mauricio Solano Guardado  
- VM251307 - Victor Emmanuel Velasco Martinez  

**LINK VIDEO:**  
[https://youtu.be/ApE3S8x5rtI?si=93q_25_-AqTr2J9T](https://youtu.be/ApE3S8x5rtI?si=93q_25_-AqTr2J9T)  

**LINK REPOSITORIO DE PROYECTO:**  
[https://github.com/VMz69/poo-exp1-foro2](https://github.com/VMz69/poo-exp1-foro2)  

---

# 💻 Gestión de Equipos en Tienda

Aplicación en **Java (Swing)** que permite el registro de diferentes modelos de equipos (Desktops, Laptops y Tablets).  
Se aplican principios de **POO, Herencia y validaciones de datos**.

---

## 🚀 Requerimientos

- ✅ Interfaces gráficas con **Swing (JOptionPane)**
- ✅ Registro para **3 tipos de equipos**:

| 🖥️ **Desktops** | 💻 **Laptops** | 📱 **Tablets** |
|-----------------|----------------|----------------|
| Fabricante      | Fabricante     | Fabricante     |
| Modelo          | Modelo         | Modelo         |
| Microprocesador | Microprocesador| Microprocesador|
| Memoria         | Memoria        | Tamaño diagonal pantalla |
| Tarjeta gráfica | Tamaño de pantalla | ¿Capacitiva/Resistiva? |
| Tamaño de torre | Capacidad disco duro | Tamaño memoria NAND |
| Capacidad disco duro |                | S.O.          |

- ✅ Aplicación de **POO**  
- ✅ Uso de **Herencia**:  
  - Clase **Padre**  
  - 3 **Subclases Hijas** (1 por cada tipo de equipo)  
- ✅ Instanciación de objetos desde el **Main**  
- ✅ Almacenamiento en **ArrayList**  
- ✅ **Validaciones**: no se permiten campos vacíos  

---

## ⚙️ Instalación y ejecución

Compilar y ejecutar desde consola:  
```bash
javac Main.java
java Main
```

O abrir el proyecto en un IDE (ej. NetBeans, IntelliJ, VSCode) y ejecutar la clase `Main`.

---

## 📖 Ejemplo de uso en código

```java
Desktop desktop = new Desktop(
    "Lenovo",
    "Thinkcentre",
    "Intel Core i7 860 2.80GHz",
    "2GB RAM",
    "GeForce 8400 GS",
    "19 pulgadas",
    "500GB"
);

equipos.add(desktop);
```

---

## 🎨 Apariencia de la aplicación

Menú principal:  
1. Registrar equipo  
   - Desktops  
   - Laptops  
   - Tablets  
2. Ver equipos registrados  
   - Desktops  
   - Laptops  
   - Tablets  
3. Salir  

📌 *Se recomienda incluir capturas de pantalla de los formularios JOptionPane.*  

---

## 🖼️ Ejemplo de visualización final

| 🖥️ **Desktops** | 💻 **Laptops** | 📱 **Tablets** |
|-----------------|----------------|----------------|
| Lenovo *(Thinkcentre)* | Toshiba *(Satellite S50 Series)* | Samsung *(Tab 4)* |
| Intel Core i7 860 2.80GHz | Intel Core i3-2330M | Nvidia Dual Core |
| 2GB RAM | 4GB RAM | Pantalla 10.1” |
| GeForce 8400 GS | Pantalla 17” | Capacitiva |
| Torre 19” | Disco 320GB | NAND 16GB |
| Disco 500GB |  | Android |

---

## 📅 Fecha de entrega

- **27 de septiembre de 2025** (prórroga)  

---

## 🎤 Defensa de la actividad

- La defensa será realizada en **Teams**, grabada y subida a **YouTube**.  
- Duración aproximada: **15-20 min**.  
- Se debe elaborar el archivo **CARATULA.txt** para entrega en aula digital.  

---

## 📜 Licencia

Proyecto con fines **académicos y educativos**.  
