package classes;

/**
 *
 * @author mathe
 */
public class Aluno {

    public float notaP1 = -1;
    public float notaP2 = -1;
    public float notaSub = -1;
    public float notaExame = -1;

    public float calcularMedia() {
        return (notaP1 + notaP2) / 2;
    }

    public float calcularMediaSub() {
        float max;
        
        // Verifica qual é a maior nota entre P1 e P2
        if (notaP1 > notaP2) {
            max = notaP1;
        } else {
            max = notaP2;
        }
        return (max + notaSub) / 2;
    }

    public float calcularMediaExame() {
        float media;

        // Verifica se a nota da substitutiva (Sub) foi utilizada
        if (notaSub < 0) {
            media = calcularMedia();
        } else {
            media = calcularMediaSub();
        }
        return (media + notaExame) / 2;
    }

    public String status() {
        if (notaP1 < 0 && notaP2 < 0) {
            return "Cursando";
        }

        float media = calcularMedia();

        if (media >= 7.0) {
            return "Aprovado";
        }

        // Verifica se é necessário fazer a substitutiva (Sub)
        if (notaSub < 0) {
            return "Necessario fazer sub";
        }

        media = calcularMediaSub();

        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 3.0) {
            if (notaExame < 0) {
                return "Necessario fazer exame";
            }
            media = calcularMediaExame();
            if (media >= 5.0) {
                return "Aprovado";
            } else {
                return "Reprovado";
            }
        }
        return "Reprovado";
    }
}
