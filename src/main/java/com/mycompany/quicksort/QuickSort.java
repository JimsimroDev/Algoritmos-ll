//Para cada uno de los ejercicios aplicar los algoritmos vistos . Además se debe cumplir con los siguientes requerimientos:
//1. Imprimir la lista inicial
//2. Imprimir el cada uno de los movimientos o el paso a paso (según el algoritmo) seguido para ordenar la lista.
//3. Imprimir la lista ordenada.
//4. Utilizar como herramienta PSeInt o Raptor
//Ejercicio 1: con Burbuja
//Ejercicio 2: con Quick Sort
//Implementar un programa en pseudocodigo (PSeInt o Raptor)
//y java (NetBeans o Eclipse) que ordene una lista con los valores {47, 1, 5, 3, 7, 13, 25, 60, 0}

package com.mycompany.quicksort;

import java.util.Arrays;

/**
 *
 * @author Jimmis J. Simanca
 */
public class QuickSort {

  

        int dividir(int arr[], int bajo, int alto) {
            int pivote = arr[alto];
            int i = (bajo-1);
            for (int j=bajo; j<alto; j++) {
                if (arr[j] <= pivote) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[alto];
            arr[alto] = temp;
            System.out.println("Lista dividida en 2 partes = " + Arrays.toString(arr));
            return i + 1;
        }

        void sort(int arr[], int bajo, int alto) {
            if (bajo < alto) {
                int pi = dividir(arr, bajo, alto);
                
                System.out.println("Sublista Actual = " + Arrays.toString(Arrays.copyOfRange(arr, bajo, alto+1)));
                System.out.println("Lista antes de dividir la izquierda = " + Arrays.toString(arr));
                sort(arr, bajo, pi-1);
                System.out.println("Lista antes de dividir la derecha = " + Arrays.toString(arr));
                sort(arr, pi+1, alto);
                System.out.println("Lista después de dividir todo = " + Arrays.toString(arr));
            }
        }

        static void mostrarArray(int arr[]) {
            int n = arr.length;
            
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            System.out.println(arr);
        }

        public static void main(String args[]) {
            int arreglo[] = {47, 1, 5, 3, 7, 13, 25, 60, 0};
            int n = arreglo.length;
            System.out.println("Lista Inicial = " + Arrays.toString(arreglo));
            QuickSort objeto = new QuickSort();
            objeto.sort(arreglo, 0, n-1);
            System.out.println("Lista Ordenada = " + Arrays.toString(arreglo));
        }
    }

