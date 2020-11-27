package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class HomePage extends PageObject {
    public static final Target INPUT_BUSCAR_ARTICULO = Target.the("Input donde se va realizar la busqueda").located(By.id("search_query_top"));
    //public static final Target SELECT_TIPO_CATEGORIA = Target.the("Select tipo de categoria").located(By.id("search_query_top"));
    public static final Target BUTTON_BUSCAR_ARTICULO = Target.the("Boton buscar articulo").located(By.className("btn btn-default button-search"));
    public static final Target LINK_ARTICULO_ENCONTRADO = Target.the("Link objeto encontrado").locatedBy("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");
}
