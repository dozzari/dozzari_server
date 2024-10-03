package today.dozzari.server.page.domain;

public record Item(
        Integer index,
        String name,
        Integer price,
        ItemType itemType
) {
}
