public class LectorTextoPlano extends LectorDocumento{
    private String texto;
    public void abrirArchivo(String ruta) {
        if(ruta.endsWith("txt")) {
            texto = "contenido del archivo de texto plano ";
            System.out.println("abriendo archivo txt: " + ruta);
        } else {
            texto = "";
            System.out.println("error: formato no compatible");
        }
    }
    public String extraerTexto() {
        return texto;
    }

}
