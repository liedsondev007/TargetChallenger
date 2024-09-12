package org.example;

import java.util.Scanner;

public class LampadaInterruptores {

    public static void main(String[] args) {

        boolean[] interruptores = {false, false, false};
        boolean[] lampadas = {false, false, false};
        boolean[] lampadasQuentes = {false, false, false};

        Scanner scanner = new Scanner(System.in);

        // 1ª Ação: Liga o primeiro interruptor (simula o calor após 5 minutos)
        System.out.println("Ligando o primeiro interruptor...");
        interruptores[0] = true;
        lampadas[0] = true; // Lâmpada acendeu
        lampadasQuentes[0] = true; // Lâmpada aqueceu
        esperar(5); // Simula o tempo de 5 minutos

        // 2ª Ação: Desliga o primeiro interruptor e liga o segundo
        System.out.println("Desligando o primeiro e ligando o segundo interruptor...");
        interruptores[0] = false;
        lampadas[0] = false; // Lâmpada desligou, mas ainda está quente
        interruptores[1] = true;
        lampadas[1] = true; // Lâmpada acendeu

        // 1ª ida até a sala das lâmpadas
        System.out.println("\nAgora, vá até a sala das lâmpadas...");

        // Verificando as condições das lâmpadas
        for (int i = 0; i < lampadas.length; i++) {
            if (lampadas[i]) {
                System.out.println("A lâmpada " + (i + 1) + " está acesa. (Interruptor 2)");
            } else if (lampadasQuentes[i]) {
                System.out.println("A lâmpada " + (i + 1) + " está apagada, mas quente. (Interruptor 1)");
            } else {
                System.out.println("A lâmpada " + (i + 1) + " está apagada e fria. (Interruptor 3)");
            }
        }

        scanner.close();
    }

    // Função para simular a espera de 5 minutos (em tempo real seria muito longo, aqui é só uma simulação)
    public static void esperar(int minutos) {
        System.out.println("Aguardando " + minutos + " minutos...");
        try {
            Thread.sleep(1000); // Simulando 1 segundo de espera
        } catch (InterruptedException e) {
            System.out.println("Erro na espera");
        }
    }
}
