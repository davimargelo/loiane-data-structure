package queue.data;

public class Doc {
    private String name;
    private String pages;

    public Doc() {
    }

    public Doc(String name, String pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }
}
