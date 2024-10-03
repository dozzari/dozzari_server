package today.dozzari.server.page.domain;

public record PageItem(
        Integer index,
        String name,
        Integer price,
        PageItemType itemType
) {
}
