package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class BuscarProducto implements Task {

    private String descripcion;
    private String tipoCategoria;
    public BuscarProducto(String descripcion, String tipoCategoria){
        this.descripcion = descripcion;
        this.tipoCategoria = tipoCategoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(descripcion).into(INPUT_BUSCAR_ARTICULO),
                Hit.the(Keys.ENTER).into(INPUT_BUSCAR_ARTICULO),
                Click.on(LINK_ARTICULO_ENCONTRADO.of(descripcion))  //Seleccionar producto a agregar
        );
    }

    public static BuscarProducto conDescripcion(String descripcion, String tipoCategoria) {
        return instrumented(BuscarProducto.class, descripcion, tipoCategoria);
    }
}
