public class Main {
    public static void main(String[] args) {
        String[] archivos = {
                "documento.pdf", "informe.docx" , "notas.txt" , "imagen.jpg"
        };
        LectorDocumento lector;
        for (int i = 0; i < archivos.length; i++) {
            if(archivos[i].endsWith("pdf")) {
                lector = new LectorPDF();
            } else if
            (archivos[i].endsWith("docx")) {
                lector = new LectorWord();
            } else if
            (archivos[i].endsWith("txt")) {
                lector = new LectorTextoPlano();
            } else {
                System.out.println("archivo no compatible: " + archivos[i]);
                continue;
            }
            lector.abrirArchivo(archivos[i]);
            System.out.println(lector.extraerTexto());
            
            }
        }
    }

