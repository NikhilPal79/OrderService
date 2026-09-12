package OrderService.Sep12O.Controller;

import OrderService.Sep12O.Entity.Order;
import OrderService.Sep12O.Entity.OrderStatus;
import OrderService.Sep12O.Repo.OrderRepo;
import OrderService.Sep12O.Service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    private final OrderRepo orderRepo;
    private OrderService orderService;

    public OrderController(OrderService orderService, OrderRepo orderRepo) {
        this.orderService = orderService;
        this.orderRepo = orderRepo;
    }

    @PostMapping("/order/createOrder")
    public String createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @PutMapping("/payment/{id}")
    public String updateOrder(@PathVariable Long id, @RequestBody OrderStatus status) {
        return orderService.updateOrder(id, status);
    }

    @GetMapping
    public List<Order> getOrders() {
        return orderRepo.findAll();
    }


}
