package stepdefinitions;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.aspectj.apache.bcel.classfile.Module;
import org.openqa.selenium.WebDriver;
import tasks.AgregarProducto;
import tasks.BuscarProducto;
import userinterfaces.HomePage;

import java.util.List;

public class EjemploGlobalSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Global");
    private HomePage homePage = new HomePage();

    @Dado("^que un nuevo cliente accede hasta la web de compras$")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @Cuando("^el agrega (.*) unidades de (.*) para (.*) al carro$")
    public void elAgregaUnProductoAlCarro(String cantidad, String descripcion, String tipoCategoria) {
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(descripcion, tipoCategoria),
                AgregarProducto.cantidad(cantidad)
        );
    }

    @Entonces("^el ve los productos listados en el carro de compras$")
    public void elVeLosProductosListadosEnElCarroDeCompras() {
    }

    @Cuando("^el agrega productos al carrito$")
    public void elAgregaProductosAlCarrito(List<String> datos) {
    }

    @Entonces("^el ve los productos listados en el carrito de compras$")
    public void elVeLosProductosListadosEnElCarritoDeCompras() {
    }


}
