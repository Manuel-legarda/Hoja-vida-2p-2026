# Hoja de Vida - Proyecto Java

Proyecto Java con interfaz gráfica (Swing) para hoja de vida profesional.

## Estructura

```
hojadevida/
├── HojaDeVida.java           → Clase principal
├── modelo/DatosHojaVida.java → Tus datos (editar aquí)
└── vista/                    → Paneles de la interfaz
```

## Compilar y ejecutar

```bash
cd hoja-de-vida
javac -encoding UTF-8 -d . src/hojadevida/modelo/*.java src/hojadevida/vista/*.java src/hojadevida/*.java
java hojadevida.HojaDeVida
```

## Requisitos

- JDK 11 o superior
