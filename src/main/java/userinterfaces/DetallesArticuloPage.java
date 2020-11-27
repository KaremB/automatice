package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetallesArticuloPage {

    public static final Target ITEM_ARTICULO = Target.the("Caracteristicas del articulo").locatedBy("a.product_img_link > img.replace-2x.img-responsive");
    //public static final Target ITEM_ENVIO_DESDE = Target.the("Envío del artículo").locatedBy("(//div[@class='sku-property-text'])[1]");
    //public static final Target INPUT_CANTIDAD = Target.the("Input cantidad").located(By.id("quantity_wanted"));
    public static final Target BOTON_ANADIR_CESTA = Target.the("Botón añadir a la cesta").located(By.id("add_to_cart"));
    public static final Target BOTON_VER_CESTA = Target.the("Botón ver la cesta").locatedBy("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
}
