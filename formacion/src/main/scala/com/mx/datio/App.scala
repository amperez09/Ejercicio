package com.mx.datio
import scala.io.Source._
import org.apache.log4j.Logger

object App {
  val logger = Logger.getLogger(App.getClass)

  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  def words(args : Array[String],word:String):(Int,Int)={
    logger.info("Inicia procesamiento")
    var path = foo(args)                                                                                                //Obtiene path del archivo
    var nlineas = 0
    var words = 0
    var arch = fromFile(path)
    for (line <- arch.getLines) {                                                                                       //Obtiene lineas del archivo
      if(line.mkString.contains(word)){                                                                                 //Encontrar Coincidencia
        words+=1
        println(line.mkString)
      }
      nlineas += 1
    }
    logger.info("Termina procesamiento")
    return (words,nlineas)
  }


  def main(args : Array[String])  {
    val startTimeMillis = System.currentTimeMillis()                                                                    //Inicio de tiempo

    var buscar="Multi-Family"                                                                                           //Coincidencia a encontrar
    var (lineas,palabra)=words(args,buscar)                                                                             //llamada a funcion
    logger.info("Imprimiendo ....")
    println("Lineas del archivo ", lineas)
    println("Coincidencias con Multi-Family", palabra)

    val endTimeMillis = System.currentTimeMillis()
    print("Tiempo: ms",endTimeMillis-startTimeMillis)                                                                                   //Fin de tiempo
  }
}


