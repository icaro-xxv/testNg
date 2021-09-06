package projeto.testng.tests;

import org.testng.annotations.*;

public class Testes {


    @BeforeTest

    public void atesTete(){

        System.out.println("UMA VEZ ANTES DOS TESTES ");


    }
    @BeforeClass
    public void antesClasse(){

        System.out.println("Executado antes de todos os metodos da classe");

    }

    @BeforeMethod

    public void antesMetodo(){

        System.out.println("Executado antes de cada metodo");

    }

    //@Test(enabled = false)
    @Test(groups = "unitarios")

    public void teste1(){

        System.out.println("Sou o metodo de teste 1 ");
    }

    @Test(groups = "funcional")

    public void teste2(){

        System.out.println("Sou o metodo de teste 2");

    }

    @Ignore
    @Test
    public void teste3(){

        System.out.println("Sou o metodo de teste 3");

    }


    @Test(groups = "integracao")

    public void teste4(){

        System.out.println("Sou o metodo de teste 4");

    }

    @AfterMethod

    public void depoisMetodo(){

        System.out.println("Executado depois de cada metodo ");

    }

    @AfterClass

    public void depoisClasse(){

        System.out.println("Executado depois de todos os metodos da classe");

    }

    @AfterTest

    public void depoisTodosTeste(){

        System.out.println("EXECUTA UMA VEZ APÓS TODOS OS TESTES ");

    }


}
