/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jairo
 */
public class ObjetoGeografico {
    private String NombreCuerpoDeAgua;
    private int IdCuerpoDeAgua;
    private String Municipio;

    public ObjetoGeografico() {
    }

    public ObjetoGeografico(String NombreCuerpoDeAgua, int IdCuerpoDeAgua, String Municipio) {
        this.NombreCuerpoDeAgua = NombreCuerpoDeAgua;
        this.IdCuerpoDeAgua = IdCuerpoDeAgua;
        this.Municipio = Municipio;
    }

    public String getNombreCuerpoDeAgua() {
        return NombreCuerpoDeAgua;
    }

    public void setNombreCuerpoDeAgua(String NombreCuerpoDeAgua) {
        this.NombreCuerpoDeAgua = NombreCuerpoDeAgua;
    }

    public int getIdCuerpoDeAgua() {
        return IdCuerpoDeAgua;
    }

    public void setIdCuerpoDeAgua(int IdCuerpoDeAgua) {
        this.IdCuerpoDeAgua = IdCuerpoDeAgua;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }
    
    
    
    
    
    
    
    
}

