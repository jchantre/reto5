/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jairo
 */
public class CuerpoDeAgua extends ObjetoGeografico{
    private String TipoCuerpoDeAgua;
    private String TipoDeAgua;
    private double IRCA;
    private static float Contar;
    private String ParaArreglo;

    public CuerpoDeAgua() {
        
        ParaArreglo="";
    }

        public CuerpoDeAgua(String NombreCuerpoDeAgua, int IdCuerpoDeAgua, String Municipio, String TipoCuerpoDeAgua, String TipoDeAgua, double IRCA) {
        super(NombreCuerpoDeAgua, IdCuerpoDeAgua, Municipio);
        this.TipoCuerpoDeAgua = TipoCuerpoDeAgua;
        this.TipoDeAgua = TipoDeAgua;
        this.IRCA = IRCA;
    }

    public String getTipoCuerpoDeAgua() {
        return TipoCuerpoDeAgua;
    }

    public void setTipoCuerpoDeAgua(String TipoCuerpoDeAgua) {
        this.TipoCuerpoDeAgua = TipoCuerpoDeAgua;
    }

    public String getTipoDeAgua() {
        return TipoDeAgua;
    }

    public void setTipoDeAgua(String TipoDeAgua) {
        this.TipoDeAgua = TipoDeAgua;
    }

    public double getIRCA() {
        return IRCA;
    }

    public void setIRCA(double IRCA) {
        this.IRCA = IRCA;
    }

    public static float getContar() {
        return Contar;
    }

    public static void setContar(float Contar) {
        CuerpoDeAgua.Contar = Contar;
    }

    public String getParaArreglo() {
        return ParaArreglo;
    }

    public void setParaArreglo(String ParaArreglo) {
        this.ParaArreglo = ParaArreglo;
    }
    
    
    
    
    
    
    
    public String nivel(){
        
        String Riesgo="";
        
        if(IRCA>=0 && IRCA<=5){
                
            Contar++;
            Riesgo="SIN RIESGO";

        } else if(IRCA>5 && IRCA<=14){

            Contar++;
            Riesgo="BAJO";

        }else if(IRCA>14 && IRCA<=35){

            Contar++;
            Riesgo="MEDIO";

        }else if(IRCA>35 && IRCA<=80){

            Riesgo="ALTO";

        }else if(IRCA>80 && IRCA<=100){

            Riesgo="INVIABLE SANITARIAMENTE";

        }
        
        return Riesgo;

    }
    
    // me permite evitar errores por marcacion de mas de 1 espacio al
    //registrar en la base de datos
    public String arreglo(){
        String TxtNew="";
        ParaArreglo.strip();
        // 4 espacios
        String p1[]=ParaArreglo.split("    ");
        String arreglo1="";
        
        for (int i = 0; i < p1.length; i++) {
            
            arreglo1+=p1[i]+"   ";
            
            
        }
        
        arreglo1=arreglo1.strip();
        
         //3 espacios
        String p2[]=arreglo1.split("   ");
        String arreglo2="";
        
        for (int i = 0; i < p2.length; i++) {
            
            arreglo2+=p2[i]+"  ";
            
        }
        
        arreglo2=arreglo2.strip();
        
        String p3[]= arreglo2.split("  ");
        String arreglo3="";
        
        for (int i = 0; i < p3.length; i++) {
            
            arreglo3+=p3[i]+" ";
            
        }
        
        arreglo3=arreglo3.strip();
        
        try {
            Double.parseDouble(arreglo3);
            
            String p4[]=arreglo3.split(" ");
            String arreglo4=p4[0];
            TxtNew=arreglo4;
            
            
            
        } catch (NumberFormatException e) {
           
            TxtNew=arreglo3;
        }
        
        
        return TxtNew;
    }
    
    
    
}

