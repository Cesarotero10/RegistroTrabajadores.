/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrogeneral;

import java.util.ArrayList;
import java.util.Iterator;


public class RegistroGeneral {

   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        ArrayList<Trabajadores> empleado;
        empleado = new ArrayList();
        empleado.add(new Trabajadores("Pérez García José","sistemas",670,30,5));
        empleado.add(new Trabajadores("Pérez Marcel José","Sistemas",680,29,6));
        empleado.add(new Trabajadores("Sosa Villa Elizabeth","Sistemas",670,30,3));
        empleado.add(new Trabajadores("Ramirez Xotla Pedro","Sistemas",675,27,0));
        empleado.add(new Trabajadores("Péres Herrera diana","Recursos Humanos",450,25,0));
        empleado.add(new Trabajadores("García Díaz Jesús","Recursos humanos",455,30,0));
        empleado.add(new Trabajadores("Díaz Juarez Jessica","Ventas",400,28,0));
        empleado.add(new Trabajadores("Orozco Paz Pedro","ventas",410,30,0));
        empleado.add(new Trabajadores("Blanco Medina Javier","Ventas",400,30,4));
        
        System.out.println("═════════════════════════");
        
        Iterator<Trabajadores> iter = empleado.iterator();;
        int montoTotal = 0;
        while (iter.hasNext()){
            Trabajadores trabajadores = iter.next();
            System.out.println("------------------------------------------------");
            System.out.println("Nombre del Trabajador: "+ trabajadores.getNombre());
            System.out.println("Departamento: "+ trabajadores.getDepartamento());
            System.out.println("Sueldo diario: "+ trabajadores.getSueldoDiario()+" Pesos");
            System.out.println("Dias trabajados: "+ trabajadores.getDiasTrabajados()+" Días");
            System.out.println("Horas extra: "+ trabajadores.getHorasExtra()+" hrs");
            
            System.out.println("Sueldo mensual:" + (trabajadores.getSueldoDiario() * trabajadores.getDiasTrabajados()) +" Pesos" );
            montoTotal += trabajadores.getSueldoDiario() * trabajadores.getDiasTrabajados();
            
            System.out.println("Monto por horas extra:" + ((trabajadores.getSueldoDiario() * trabajadores.getDiasTrabajados()) + (trabajadores.getHorasExtra()*85 )) +" pesos");
            montoTotal += trabajadores.getHorasExtra() * 85;
        }
        System.out.println("═════════════════════════");
        System.out.println("Todos los sueldos más horas extra: " + montoTotal + " pesos");
        System.out.println("═════════════════════════");
        
        Iterator<Trabajadores> iter2 = empleado.iterator();
        
        int menosDiasTrabajados = 31;
        String trabajadorConMenosDias = "" ;
        
        while (iter2.hasNext()) {
            Trabajadores trabajadores = iter2.next();
            if (trabajadores.getDiasTrabajados() < menosDiasTrabajados){
                menosDiasTrabajados = trabajadores.getDiasTrabajados();
                trabajadorConMenosDias = trabajadores.getNombre();
            }
            
        }
        System.out.println("Trabajador con menos días trabajando: " + trabajadorConMenosDias);
        System.out.println("═════════════════════════");
        
        Iterator<Trabajadores> iter3 = empleado.iterator();
        int masHorasExtra = 0;
        String trabajadorConMasHorasExtra = "";
        
        while (iter3.hasNext()) {
            Trabajadores trabajadores = iter3.next();
            if (trabajadores.getHorasExtra()> masHorasExtra){
                masHorasExtra = trabajadores.getHorasExtra();
                trabajadorConMasHorasExtra = trabajadores.getNombre();
            }
            
        }
        System.out.println("Trabajador con más horas extra: " + trabajadorConMasHorasExtra);
        System.out.println("═════════════════════════");
        
     
    }
}
