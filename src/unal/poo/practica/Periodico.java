package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Periodico
        
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("MundoPeriodico.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,10);
        for(int j=0;j<3;j++){
           estudiante.turnLeft();
            }
        for(int j=0;j<2;j++){
           estudiante.move();
        estudiante.turnLeft();
            }
        estudiante.move();
        estudiante.canPickThing();
        estudiante.pickThing();
        for(int j=0;j<2;j++){
           estudiante.turnLeft();
            }
        estudiante.move();
      for(int k=0;k<2;k++){
         for(int j=0;j<3;j++){
           estudiante.turnLeft();
            }
        estudiante.move();
      }
      for(int j=0;j<3;j++){
           estudiante.turnLeft();
            }
        
}
}


