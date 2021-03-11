/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

/**
 *
 * @author Jhon Alexis
 */
public class Asignatura {
    private String nombre;
    private double notaMasAlta;
    private double notaMasBaja;
    private double promedio;
    
    public Asignatura (String nombre, double notaMasAlta, double promedio) {
         this.nombre = nombre;
         this.notaMasAlta = notaMasAlta;
         this.promedio = promedio;
     }

    Asignatura(String programacion_orientada_a_objetos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Asignatura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMasAlta() {
        return notaMasAlta;
    }

    public void setNotaMasAlta(double notaMasAlta) {
        this.notaMasAlta = notaMasAlta;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public double notaMasAlta(){
        
        Estudiante ve[] = new Estudiante[5];
        ve[0] = new Estudiante("Juan", 3.2);
        ve[1] = new Estudiante("Pablo", 4.7);
        ve[2] = new Estudiante("Maria", 2.5);  
        ve[3] = new Estudiante("Mario", 4.2);
        ve[4] = new Estudiante("Camila", 4.4);
        
        Estudiante mayore = new Estudiante();
        mayore.setNota(notaMasAlta);
        for(int i = 0; i < ve.length; i++){
           if(ve[i].getNota() > mayore.getNota());
           mayore = ve[i];
        }
        System.out.println("El estudiante: "+mayore.getNombre()+" tiene la mayor nota, que es: "+mayore.getNota());
        return 0;
    }
    
    public double notaMasBaja(){
        
        Estudiante ve[] = new Estudiante[5];
        ve[0] = new Estudiante("Juan", 3.2);
        ve[1] = new Estudiante("Pablo", 4.7);
        ve[2] = new Estudiante("Maria", 2.5);  
        ve[3] = new Estudiante("Mario", 4.2);
        ve[4] = new Estudiante("Camila", 4.4);
        
        Estudiante menore = new Estudiante();
        menore.setNota(ve[ve.length-1].getNota());
        for(int i = 0; i < ve.length; i++){
           if(ve[i].getNota() < menore.getNota());
           menore = ve[i];
        }
        System.out.println("El estudiante: "+menore.getNombre()+" tiene la menor nota, que es: "+menore.getNota());
        return 0;
    }
    
    public double calculaPromedioNotas(){
        
        Estudiante ve[] = new Estudiante[5];
        ve[0] = new Estudiante("Juan", 3.2);
        ve[1] = new Estudiante("Pablo", 4.7);
        ve[2] = new Estudiante("Maria", 2.5);  
        ve[3] = new Estudiante("Mario", 4.2);
        ve[4] = new Estudiante("Camila", 4.4);
        
        double suma = 0;
        for(int i = 0; i < ve.length; i++){
            suma += ve[i].getNota();
        }
        return suma / ve.length;
    }
}
