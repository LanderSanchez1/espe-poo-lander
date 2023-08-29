/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo11_clase_math;

/**
 *
 * @author Lander Sanchez
 */
public class Funciones {
    public boolean repetido(int n, int[] nums, int generados){
        boolean res  = false;
        for(int i=0; i<generados; i++){
        if(n==nums[i]){
        res=true;
        break;
        }
        }
        return res;
    }
    public void ordenar(int[] nums) {
    int n = nums.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                // Intercambiar los elementos nums[j] y nums[j + 1]
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
        }
    }
}

    public void mostrar(int[]nums){

        for(int num:nums)
            System.out.print(num+",");
    }
}
