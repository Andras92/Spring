package responses;

import hu.flowacademy.kappa.request.ShopModell;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;
import responses.Shop;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class Shopcontroller {

    @GetMapping("shop")
    public List<Shop> getAllShop() {
        var x = new Shop();
        x.setName("Flow");
        return List.of(x,x,x);
    }

    @GetMapping("shop/{id}")
    public ResponseEntity <Shop> getAllShopId(@PathVariable int id) {
        if(id == 10) {
            return ResponseEntity.ok(new Shop());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("")
    public String postAllShopId() {
        return  "valami";
    }

}
