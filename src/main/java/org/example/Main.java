package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Lugar lugar = new Lugar(1, "Calle Celia", "Almeria", "Almeria");

        Proyecto construirCasa = new Proyecto(LocalDate.of(2010, 10, 15), LocalDate.of(2017, 05, 12), "Proyecto construir casa", lugar);
        Empleado empleadito = new Empleado("Sergio", "Segura", "Caballero", "Gerente", construirCasa);
        Empleado empleadito2 = new Empleado("Carla", "Miranda", "Salmeron", "Limpieza", construirCasa);
        Empleado empleadito3 = new Empleado("Alberto", "Ruiz", "Ruiz", "Cuidador de casa", null);
    }
}