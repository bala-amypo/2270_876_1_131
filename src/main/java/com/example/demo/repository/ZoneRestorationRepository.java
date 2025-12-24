public interface ZoneRestorationRecordRepository {
    Optional<ZoneRestorationRecord> findById(Long id);
    List<ZoneRestorationRecord> findByZoneIdOrderByRestoredAtDesc(Long zoneId);
    ZoneRestorationRecord save(ZoneRestorationRecord r);
}
