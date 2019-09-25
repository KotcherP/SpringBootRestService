package pack;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping
    public BaseResponse showStatus(){
        return new BaseResponse("yo",777);
    }
}
