package controllers;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

import models.Maquina;

public class MaquinaController {
    public Stack<Maquina> filtrarPorSubred(List<Maquina> maquinas, int umbral){

    }

    public Set<Maquina> ordenarPorSubred(Stack<Maquina> pila){

    }

    public Map<Integer, Queue<Maquina>> agruparPorRiesgo(List<Maquina> maquinas){
        TreeMap<Integer, Queue<Maquina>> mapa = new TreeMap<>();
        for (Maquina m : maquinas){
            int riesgo = m.getRiesgo();
            mapa.putIfAbsent(riesgo, new LinkedList<>());
            mapa.get(riesgo).add(m);
        }
        return mapa;

    }

    public Stack<Maquina> explotarGrupo(Map<Integer, Queue<Maquina>> mapa){
        int Maxcant = -1;
        int riesgoSeleccionado = -1;
        Queue<Maquina>

        retunr Stack<Maquina>;


    }

}
