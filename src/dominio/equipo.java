/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author HP1000
 */
public class equipo {
    
    
    private int Idequipo;
    private String nombre;
    public static int id=1;
    private String origen;
    private String serie;
    private int Num_jugadores;
    private int Num_asistentes;
    private String detalles;
    private int cedula;
    private String nombresApellidos;
    private int edad;
    private int  pasaporte;

   
        
    

    public equipo(int Idequipo, String nombre, String origen, String serie, int Num_jugadores, int Num_asistentes, String detalles, int cedula, String nombresApellidos, int edad, int pasaporte) {
        this.Idequipo = Idequipo;
        this.nombre = nombre;
        this.origen = origen;
        this.serie = serie;
        this.Num_jugadores = Num_jugadores;
        this.Num_asistentes = Num_asistentes;
        this.detalles = detalles;
        this.cedula = cedula;
        this.nombresApellidos = nombresApellidos;
        this.edad = edad;
        this.pasaporte = pasaporte;
             id++;
    }
    
    
    
      public equipo(String nombre){
      this.nombre = nombre;    
      }

    public int getIdequipo() {
        return Idequipo;
    }

    public void setIdequipo(int Idequipo) {
        this.Idequipo = Idequipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNum_jugadores() {
        return Num_jugadores;
    }

    public void setNum_jugadores(int Num_jugadores) {
        this.Num_jugadores = Num_jugadores;
    }

    public int getNum_asistentes() {
        return Num_asistentes;
    }

    public void setNum_asistentes(int Num_asistentes) {
        this.Num_asistentes = Num_asistentes;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

   
        
        
}
