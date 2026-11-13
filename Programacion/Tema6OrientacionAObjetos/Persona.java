public class Persona {

        /***************************************************************************************************************************
        *
        * Clase Persona. Ejemplo de clase sencilla para representar datos de personas. 
        *
        ****************************************************************************************************************************/

        //Enumerados de la clase persona
        // Es parecido a establecer un tipo de datos "específico" del problema a resolver
        // Es de ayuda cuando queremos reconocer en el código valores con semántica (significado) propio
        public enum Trabajo
        {
            NOACTIVO, DESEMPLEADO, EMPLEADO, AUTONOMO, JUBILADO
        }

        //ESTADO - Atributos
        private String nombre;
        private String apellidoPaterno;
        private String apellidoMaterno;
        private int iEdad;
        private String direccion;
        private Trabajo situacion;
        
        
        //Constructor. Tenemos siempre la garantía de que se ejecutará antes que ningún otro método
        // Esto es así también en otros lenguajes, p.e. BASIC. Por eso podemos tener garantizado
        // que todos los objetos persona que usemos, tendrán valores en sus atributos, es decir, tendrán estados.
 
        public Persona(String nom, String app, String apm, int nedad, String dir, Trabajo situacion){
                this.nombre=nom;
                this.apellidoPaterno=app;
                this.apellidoMaterno=apm;
                this.iEdad=nedad;
                this.direccion=dir;
                this.situacion=situacion;
        }
        
        public boolean mayorEdad(){
                boolean resultado;

                if(iEdad>=18)
                        resultado = true;
                else
                        resultado = false;

                return resultado;
        }
        
        public String mostrarDatos(){

                //Lo de llamar resultado a la variable que devolvemos una vez construido 
                //el proceso realizado es una "costumbre". Se pueden usar otros nombres.

                String datos;

                datos="Los datos son: \n";
                datos+=this.nombre+"\n";
                datos+=this.apellidoPaterno+"\n";
                datos+=this.apellidoMaterno+"\n";
                datos+=this.iEdad+"\n";
                datos+=this.direccion+"\n";
                datos+="Situación laboral: ";
                switch(this.situacion) {
                   case Trabajo.NOACTIVO: datos+="No tiene edad de trabajar";
                        break;
                   case Trabajo.DESEMPLEADO: datos+="En edad Activa. No tiene trabajo";
                        break;
                   case Trabajo.EMPLEADO: datos+="En edad Activa. Empleado por cuenta ajena";
                        break;
                   case Trabajo.AUTONOMO: datos+="En edad Activa. Autonomo o empresario";
                        break;
                   case Trabajo.JUBILADO: datos+="Jubilado";
                        break;
                }

                return datos;
        }

        //Este método no devuelve nada, sólo afecta al "interior" del objeto.
        public void cumpleA() {
                iEdad++;  //sumamos un año a la edad cuando es nuestro cumple.
        }
        
}
