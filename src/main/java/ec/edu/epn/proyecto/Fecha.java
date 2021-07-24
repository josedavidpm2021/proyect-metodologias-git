package ec.edu.epn.proyecto;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fecha {
    private int dia, mes, anio;

    public Fecha(String fecha) {
        setFecha(fecha);
    }

    public void setFecha(String fecha){
        StringTokenizer tk = new StringTokenizer(fecha,"/");
        this.dia = Integer.parseInt(tk.nextToken());
        this.mes = Integer.parseInt(tk.nextToken());
        this.anio = Integer.parseInt(tk.nextToken());
    }
    
    public boolean validarFecha(String patron,String fecha){
        Pattern pat = Pattern.compile(patron);
        Matcher mat = pat.matcher(fecha);
        return mat.matches();
    }
            
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    } 
}