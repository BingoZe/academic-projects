/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import classes.Aluno;

public class AlunoTest {
    
    public Aluno aluno;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        aluno = new Aluno();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testStatusCursando() {
        assertEquals("Cursando", aluno.status());
    }
    
    @Test
    public void testCalcularMedia() {
        aluno.notaP1 = 6;
        aluno.notaP2 = 8;
        assertEquals(7, aluno.calcularMedia(), 0.001);
    }
    
    @Test
    public void testStatusAprovadoDireto() {
        aluno.notaP1 = 7;
        aluno.notaP2 = 8;
        assertEquals("Aprovado", aluno.status());
    }
    
    @Test
    public void testStatusSub() {
        aluno.notaP1 = 6;
        aluno.notaP2 = 6;
        assertEquals("Necessario fazer sub", aluno.status());
    }
    
    @Test
    public void testCalcularMediaSub() {
        aluno.notaP1 = 4;
        aluno.notaP2 = 7;
        aluno.notaSub = 8;
        assertEquals(7.5, aluno.calcularMediaSub(), 0.001);
    }
    
    @Test
    public void testStatusSubAprovado() {
        aluno.notaP1 = 6;
        aluno.notaP2 = 3;
        assertEquals("Necessario fazer sub", aluno.status());
        
        aluno.notaSub = 8;
        assertEquals("Aprovado", aluno.status());
    }
    
    @Test
    public void testStatusSubExame() {
        aluno.notaP1 = 6;
        aluno.notaP2 = 3;
        assertEquals("Necessario fazer sub", aluno.status());
        
        aluno.notaSub = 4;
        assertEquals("Necessario fazer exame", aluno.status());
    }
    
    @Test
    public void testStatusSubReprovado() {
        aluno.notaP1 = 2;
        aluno.notaP2 = 2;
        assertEquals("Necessario fazer sub", aluno.status());
        
        aluno.notaSub = 3;
        assertEquals("Reprovado", aluno.status());
    }
    
    @Test
    public void testCalculaMediaExame(){
        aluno.notaP1 = 6;
        aluno.notaP2 = 3;
        aluno.notaSub = 4;
        aluno.notaExame = 5;
        
        assertEquals(5.0, aluno.calcularMediaExame(),0.001);
    }
    
    @Test
    public void testStatusExameAprovado(){
        aluno.notaP1 = 6;
        aluno.notaP2 = 3;
        
        assertEquals("Necessario fazer sub",aluno.status());
        
        aluno.notaSub = 4;
        
        assertEquals("Necessario fazer exame", aluno.status());
        
        aluno.notaExame = 5;
        
        assertEquals("Aprovado",aluno.status());
        
    }
    
    @Test
    public void testStatusExameReprovado(){
        aluno.notaP1 = 6;
        aluno.notaP2 = 3;
        
        assertEquals("Necessario fazer sub",aluno.status());
        
        aluno.notaSub = 4;
        
        assertEquals("Necessario fazer exame",aluno.status());
        
        aluno.notaExame = 4;
        
        assertEquals("Reprovado",aluno.status());
    }
    
}