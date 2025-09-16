/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package projetomatheus.projetoatividade2;

/**
 *
 * @author mathe
 */
public class Aluno{
    public String nome;
    public int rgm;
    public float nota_p1;
    public float nota_p2;
    public float nota_exame;
 }

public float calculaMedia(){
    return (this.nota_p1+this.nota_p2)/2;
}
