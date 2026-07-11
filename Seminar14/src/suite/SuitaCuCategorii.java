package suite;

import Teste.PachetTuristicTest;
import Teste.PersoanaTest;
import categorii.CategorieBICEP;
import categorii.CategorieRIGHT;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTest.class})
@Categories.IncludeCategory({CategorieRIGHT.class})
@Categories.ExcludeCategory({CategorieBICEP.class})
public class SuitaCuCategorii {
}
