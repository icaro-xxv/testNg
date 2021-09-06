package projeto.testng.retorno;

import org.testng.annotations.Test;

@Test(groups = {"testes-retorno","testes-unitarios"})
public class TestesRetorno {


    @Test(groups = {"retorno","unitario"})
    public String saudacao(){

        System.out.println("Bom dia!");
        return "Bom dia! ";

    }
    @Test(groups = {"booleano","integracao"})

    public boolean verdadeiroFalso(){

        System.out.println("verdadeiro");
        return true;

    }
    @Test(groups = {"void","unitario"})
    public void teste3ClasseRetorno(){
        System.out.println("Teste void da classe de retorno");
        System.out.println(saudacao());
    }

    @Test(groups = {"void","integracao"})
    public void teste4ClasseRetorno(){
        System.out.println("Teste void 3 da classe de retorno");
        System.out.println(verdadeiroFalso());
    }


}
