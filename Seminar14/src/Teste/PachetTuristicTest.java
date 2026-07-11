package Teste;

import categorii.CategorieBICEP;
import categorii.CategorieRIGHT;
import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import dubluri.FakePerson;
import dubluri.StubPersoana;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PachetTuristicTest {

    @Test
    @Category(CategorieRIGHT.class)
    public void testAplicaDiscount() {
        IPersoana persoana = new StubPersoana();
        PachetTuristic p = new PachetTuristic(persoana, "Craiova", 400.0);
        p.aplicaDiscountVarstnici(10);
        Assert.assertEquals(360, p.getPret(), 0.01);
    }

    @Test
    @Category(CategorieBICEP.class)
    public void testAplicaDiscountBoundaryFake(){
        IPersoana persoanaFake = new FakePerson();
        ((FakePerson)persoanaFake).setGetVarstaValue(65);
        PachetTuristic p = new PachetTuristic(persoanaFake, "Craiova", 400.0);
        p.aplicaDiscountVarstnici(10);
        Assert.assertEquals(360,p.getPret(), 0.01);
    }

    @Test
    @Category(CategorieRIGHT.class)
    public void testNuAplicaDiscountCuFake(){
        IPersoana persoanaFake = new FakePerson();
        ((FakePerson)persoanaFake).setGetVarstaValue(21);
        PachetTuristic p = new PachetTuristic(persoanaFake, "Craiova", 400.0);
        p.aplicaDiscountVarstnici(10);
        Assert.assertEquals(400.0, p.getPret(), 0.01);
    }
}