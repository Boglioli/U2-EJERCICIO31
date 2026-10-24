public class LectorPDF extends LectorDocumento{
    private String texto;
    public void abrirArchivo(String ruta) {
        if(ruta.endsWith("pdf")) {
            texto = "contenido del archivo pdf ";
            System.out.println("abriendo archivo pdf: " + ruta);
        } else {
            texto = "";
            System.out.println("error: formato no compatible");
        }
    }
    public String extraerTexto() {
        return texto;
    }
}
