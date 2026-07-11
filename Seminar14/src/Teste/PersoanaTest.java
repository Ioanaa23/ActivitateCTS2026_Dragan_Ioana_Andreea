package Teste;

import static org.junit.Assert.*;

import categorii.CategorieBICEP;
import categorii.CategorieRIGHT;
import clase.IPersoana;
import clase.Persoana;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PersoanaTest {

    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(CategorieBICEP.class)
    public void testErrorConditionCheckCNP() {
        Persoana p = new Persoana("Gigel", "5234523");
        p.checkCNP();
    }

    @Test(timeout = 10)
    public void testPerformanceCheckCNP(){
        IPersoana p = new Persoana("Gigel", "5030303766554");
        p.checkCNP();
    }

    @Test
    @Category({CategorieRIGHT.class, CategorieBICEP.class})
    public void testCorect(){
        IPersoana p = new Persoana("Ion", "5030303766554");
        Assert.assertEquals("M", p.getSex());
    }
}