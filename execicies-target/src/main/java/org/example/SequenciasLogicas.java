package org.example;

public class SequenciasLogicas {

    public static void main(String[] args) {

        // Sequência a)
        int[] sequenciaA = {1, 3, 5, 7};
        int proximoA = sequenciaA[sequenciaA.length - 1] + 2;
        System.out.println("a) Próximo elemento: " + proximoA);

        // Sequência b)
        int[] sequenciaB = {2, 4, 8, 16, 32, 64};
        int proximoB = sequenciaB[sequenciaB.length - 1] * 2;
        System.out.println("b) Próximo elemento: " + proximoB);

        // Sequência c)
        int[] sequenciaC = {0, 1, 4, 9, 16, 25, 36};
        int proximoC = (int) Math.pow(sequenciaC.length, 2);
        System.out.println("c) Próximo elemento: " + proximoC);

        // Sequência d)
        int[] sequenciaD = {4, 16, 36, 64};
        int proximoD = (int) Math.pow(sequenciaD.length + 2, 2);
        System.out.println("d) Próximo elemento: " + proximoD);

        // Sequência e)
        int[] sequenciaE = {1, 1, 2, 3, 5, 8};
        int proximoE = sequenciaE[sequenciaE.length - 1] + sequenciaE[sequenciaE.length - 2];
        System.out.println("e) Próximo elemento: " + proximoE);

        // Sequência f)
        int[] sequenciaF = {2, 10, 12, 16, 17, 18, 19};
        int proximoF = 20; // O próximo número lógico é 20, pois segue a sequência dos números inteiros após 16
        System.out.println("f) Próximo elemento: " + proximoF);
    }
}
