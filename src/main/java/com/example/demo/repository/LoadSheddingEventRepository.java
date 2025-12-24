public interface LoadSheddingEventRepository {
    Optional<LoadSheddingEvent> findById(Long id);
    List<LoadSheddingEvent> findAll();
    List<LoadSheddingEvent> findByZoneIdOrderByEventStartDesc(Long zoneId);
    LoadSheddingEvent save(LoadSheddingEvent e);
}
