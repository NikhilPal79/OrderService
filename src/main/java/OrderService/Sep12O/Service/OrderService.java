package OrderService.Sep12O.Service;

import OrderService.Sep12O.Entity.Order;
import OrderService.Sep12O.Entity.OrderStatus;
import OrderService.Sep12O.Repo.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    private OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public String createOrder(Order order) {
        order.setStatus(OrderStatus.CREATED);
        orderRepo.save(order);
        return "Order Created";
    }

    public String updateOrder(Long id, OrderStatus status) {
        Optional<Order> byId = orderRepo.findById(id);
        byId.ifPresent(o -> o.setStatus(status));
        return "Payment Done";

    }
}
