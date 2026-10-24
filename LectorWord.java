public class LectorWord extends LectorDocumento {
    private String texto;
    public void abrirArchivo(String ruta) {
        if(ruta.endsWith("docx")) {
            texto = "contenido del archivo word ";
            System.out.println("abriendo archivo word: " + ruta);
        } else {
            texto = "";
            System.out.println("error: formato no compatible");
        }
    }
    public String extraerTexto() {
        return texto;
    }
}