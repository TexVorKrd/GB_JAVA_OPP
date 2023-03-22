package mvc.View;


import lombok.Getter;

@Getter
public enum MenuSelector {
    SALE("1", "Купить напиток"), INFO_SALE("2", "Информация о продажах"), INFO_STORAGE("3", "Информация о наличии"), EXIT("4", "ВЫХОД");

    private String id;
    private String value;


    MenuSelector(String id, String value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(id)
                .append(" - ")
                .append(value)
                .toString();
    }
}
