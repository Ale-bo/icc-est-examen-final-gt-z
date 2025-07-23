package models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Maquina {
    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private  int subred;
    private int riesgo;

    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
    }
    

    public String getNombre() {
        return nombre;
    }



    public String getIp() {
        return ip;
    }



    public List<Integer> getCodigos() {
        return codigos;
    }



    public int getSubred() {
        return subred;
    }



    public int getRiesgo() {
        return riesgo;
    }
    
    private int calcularSubred(){
        String[] partes = ip.split("\\.");
        return Integer.parseInt(partes[3]);
    }
    
    private int calcularRiesgo(){
        int sumDiv3 = 0;
        for(int  codigo :codigos){
            if(codigo % 3 == 0){
                sumDiv3 += codigo;
            }
        }
        String nombreSinEspacios = nombre.replace()
        Set<Character> caractersUnicos = new HashSet<>(); 
        for (char c : nombreSinEspacios.toCharArray()){
            caractersUnicos.add(c);
        }
        return  sumDiv3 = caractersUnicos.size();
    }


    @Override
    public String toString() {
        return "Maquina [nombre=" + nombre 
        + ", ip=" + ip 
        + ", codigos=" + codigos 
        + ", subred=" + getSubred() 
        + ", riesgo="+ getRiesgo()
        + "]";
    }

    
}
