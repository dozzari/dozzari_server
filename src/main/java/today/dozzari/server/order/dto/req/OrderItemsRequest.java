package today.dozzari.server.order.dto.req;

public record OrderItemsRequest(
        String name,
        Integer quantity
) {

}