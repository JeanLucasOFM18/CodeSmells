package com.ejemplos.codesmells.service;

public class FuncionesService {

    // Función larga (demasiadas líneas y responsabilidades)
    public int calculate(int a, int b, String operation) {
        int result = 0;

        // Código duplicado (en los condicionales de suma y resta)
        if (operation.equals("add")) {
            result = a + b; // Operación de suma
            System.out.println("Sum operation performed"); // Comentario innecesario
        } else if (operation.equals("subtract")) {
            result = a - b; // Operación de resta
            System.out.println("Subtract operation performed"); // Comentario innecesario
        } else if (operation.equals("multiply")) {
            result = a * b; // Operación de multiplicación
        } else if (operation.equals("divide")) {
            // Números mágicos: el 0 está hardcodeado
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Cannot divide by 0"); // Comentario innecesario
            }
        } else {
            System.out.println("Unknown operation");
        }

        // Código muerto: nunca se usa esta variable
        String unusedVariable = "This is not used";

        // Excesivo uso de condicionales: múltiples else-if
        return result;
    }

    // Función con muchos parámetros (más de 3)
    public double calculateWithPrecision(int a, int b, String operation, double precision, int scale) {
        // Algoritmo ficticio para cálculos con precisión
        return Math.round((a + b) * precision) / scale;
    }

    // Función con nombre inapropiado
    public void x() {
        System.out.println("Invalid function name");
    }

    // Función anidada
    public int nestedFunctionExample(int x, int y) {
        int result = 0;
        if (x > 0) {
            if (y > 0) {
                result = x + y;
            } else {
                result = x - y;
            }
        } else {
            result = y * 2;
        }
        return result;
    }

}