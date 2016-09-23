package com.example.eduardomatos.shapenumbers;


public class ShapeNumber {

    public boolean isTriangular(int number) {
        int currentTriangularNumber = 1;

        for(int i = 2; currentTriangularNumber <= number; i++) {
            if (currentTriangularNumber == number) {
                return true;
            }

            currentTriangularNumber += i;
        }

        return false;
    }

    public boolean isSquare(int number) {
        double sqrt = Math.sqrt(number);
        return Math.floor(sqrt) == sqrt;
    }
}
