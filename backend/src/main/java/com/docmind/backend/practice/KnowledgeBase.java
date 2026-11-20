public class KnowledgeBase {
    private Long id;
    private String name;
    private String description;
    private Long ownerId;
    public KnowledgeBase(Long id, String name, String description, Long ownerId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getOwnerId() {
        return ownerId;
    }


}
