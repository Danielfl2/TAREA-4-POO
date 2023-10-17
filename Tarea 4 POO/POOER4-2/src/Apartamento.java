/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
package Inmuebles;
public class Apartamento extends InmuebleVivienda {
    protected int númeroPisos;
    public Apartamento(int identificadorInmobiliario, int área, String dirección,
        int númeroHabitaciones, int númeroBaños) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección,
        númeroHabitaciones, númeroBaños);
    }
    void imprimir() {
        super.imprimir(); 
    }
}
