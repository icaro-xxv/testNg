package projeto.testng.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TesteClasse2 {

    @BeforeClass

    public void antesClasse() {

        System.out.println("Executa antes dos testes da classe ");
    }

    @Test
    public void teste1Classe2() {

        System.out.println("primeiro teste da classe 2");

    }

    @Test(groups = "unitario")

    public void teste2Classe2() {
        System.out.println("segundo teste da classe 2");

    }

    @Test(groups = "integracao")

    public void teste3Classe2() {
        System.out.println("terceiro teste da classe 2");

    }

    @Test(groups = "integracao")

    public void teste4Classe2() {
        System.out.println("quarto teste da classe 2");

    }
}
