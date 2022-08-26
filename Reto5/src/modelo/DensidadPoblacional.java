/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jairo
 */
public class DensidadPoblacional extends ObjetoGeografico{
    
    private int Habitantes;

    public DensidadPoblacional() {
    }

    public DensidadPoblacional(int Habitantes, String NombreCuerpoDeAgua, int IdCuerpoDeAgua, String Municipio) {
        super(NombreCuerpoDeAgua, IdCuerpoDeAgua, Municipio);
        this.Habitantes = Habitantes;
    }

    public int getHabitantes() {
        return Habitantes;
    }

    public void setHabitantes(int Habitantes) {
        this.Habitantes = Habitantes;
    }
    
    
    
    public String afectacion(){
        
        String margen="";
        if(Habitantes<1000){
            
            margen="0";
        
        } else if (Habitantes>=1000 && Habitantes<=5000){
            
            margen="1";
        } else if(Habitantes>5000){
            
            margen="2";
        }
        return margen;
    }
    
}
