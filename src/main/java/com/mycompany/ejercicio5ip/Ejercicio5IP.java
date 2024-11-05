package com.mycompany.ejercicio5ip;
//Copyright:Ruth Bautista(202320050047).
//Como primer paso en este programa se define un arreglo multidimensional que contiene información sobre 
//compañeros de la clase, y datos personales de ellos.
//Utilicé un bucle for para recorrer el arreglo y mostrar la información de cada uno en la consola.
public class Ejercicio5IP {

    public static void main(String[] args) {
        

        String[][] companeros = {
            {"Diana", "Selva", "Ingeniería en computación", "Choloma\n"},
            {"Jasson", "Ortega", "Ingeniería en P. Industrial", "Cofradía\n"},
            {"Noel", "Enamorado", "Ingeniería en P. Industrial", "Pto. Cortés\n"},
            {"Mirna", "Chirino", "Ingeniería en P. Industrial", "San Lorenzo Valle\n"},
            {"Blanca", "Da Costa", "Ingeniería en computación", "Pimienta Cortés\n"},
            {"Luis", "Ayala", "Ingeniería en P. Industrial", "Choluteca\n"},
            {"Michel", "Castillo", "Ingeniería en P. Industrial", "Choloma\n"},
            {"Bryan", "Vásquez", "Ingeniería Electrónica", "Choloma\n"},
            {"Ludyn", "Baquedano", "Ingeniería en P. Industrial", "Choluteca\n"},
            {"Melissa", "Galeano", "Ingeniería en computación", "Choluteca\n"}
        };

        for (String[] companero : companeros) {
            System.out.println("Nombre: " + companero[0] + ", Apellido: " + companero[1] +
                               ", Carrera: " + companero[2] + ", Lugar de residencia: " + companero[3]);
        }

        
    }
}
