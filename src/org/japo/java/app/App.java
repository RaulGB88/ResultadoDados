/* 
 * Copyright 2016  - Raul Granel - raul.granel@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

//Importación de la clase Random.
import java.util.Random;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        //Intancia objeto Random.
        Random rnd = new Random(System.currentTimeMillis());

        //Constantes.
        //Tiradas máximas y mínimas.
        final int TIRADAS_MAXIMAS = 20;
        final int TIRADAS_MINIMAS = 1;
        //Valores mínimos y máximos que pueden dar los dados.
        final int VALOR_MIN = 1;
        final int VALOR_MAX = 6;

        //Variables.
        //Resultado de los dados.
        int reslultadoDado1;
        int resultadoDado2;
        //Suma del resultado de los dados.
        int resultadoTotal;
        //Veces que a salido el número siete.
        int vecesSiete = 0;

        //Veces que se tira el dado.
        for (int tiradas = 0; tiradas <= TIRADAS_MAXIMAS; tiradas++) {

            //Resultado de los dados aleatorio.
            reslultadoDado1 = rnd.nextInt(VALOR_MAX - VALOR_MIN + 1) + VALOR_MIN;
            resultadoDado2 = rnd.nextInt(VALOR_MAX - VALOR_MIN + 1) + VALOR_MIN;

            //Suma del resultado de los dados.
            resultadoTotal = reslultadoDado1 + resultadoDado2;

            //Mensaje con el resultado de los dados y la suma de dichos resultados.
            System.out.printf("Dado 1.....: %d - Dado 2.....: %d - Resultado total.....: %d\n", reslultadoDado1, resultadoDado2, resultadoTotal);

            //Veces que la suma del resultado de los dados es 7..
            if (resultadoTotal == 7) {
                vecesSiete++;
            }
        }
        //Variable de porcentaje de veces que a salido el número siete.
        int porcentajeSiete = vecesSiete * 100 / TIRADAS_MAXIMAS;

        //Respuestas.
        System.out.println("Ya ha tirado el dado " + TIRADAS_MAXIMAS + " veces");
        //Mensaje con las veces que la suma de los rasultados de ambos dados es 7.
        System.out.println("Estas son las veces que ha salido el número siete en las tiradas: " + vecesSiete);
        //Mensaje con el procentaje de veces que a salido 7 de resultado.
        System.out.println("Este es el porcentaje de veces que a salido el número siete: " + porcentajeSiete + "%");
    }
}
