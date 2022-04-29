package com.company;

import Classes.Pyramid;
import Classes.Pyramids;
import Classes.Square;
import Classes.Squares;

public class Main {

    /**
     * 19. Создать класс квадрат, член класса – длина стороны. Предусмотреть в классе методы
     * вычисления и вывода сведений о фигуре – диагональ, периметр, площадь. Создать производный класс
     * – правильная пирамида с апофемой (апофема – высота какой-либо боковой стороны) А, добавить в
     * класс метод определения объема фигуры, перегрузить методы расчета площади и вывода сведений о
     * фигуре. Написать программу, демонстрирующую работу с этими классами: дано N квадратов и M
     * пирамид, найти среднюю площадь квадратов и пирамиду с минимальной площадью.
     * @param args
     */
    public static void main(String[] args) {
        final int N = 50;
        final int M = 50;
        Squares squares = new Squares(N);
        Pyramids pyramids = new Pyramids(M);
        for (int i = 0; i < N; i++) {
            squares.add(new Square((int) (Math.random() * 20 + 1)));
        }
        for (int i = 0; i < M; i++) {
            pyramids.add(new Pyramid((int) (Math.random() * 20 + 1), (int) (Math.random() * 20 + 1)));
        }
        System.out.println(squares);
        System.out.println("AvgS = " + squares.getAvgS());
        System.out.println("-----------------------------------");
        System.out.println(pyramids);
        System.out.println("Min S Pyramid: " + pyramids.getMinS());
    }
}
