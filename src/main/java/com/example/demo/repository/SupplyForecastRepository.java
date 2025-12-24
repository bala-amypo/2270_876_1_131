public interface SupplyForecastRepository {
    Optional<SupplyForecast> findById(Long id);
    Optional<SupplyForecast> findFirstByOrderByGeneratedAtDesc();
    List<SupplyForecast> findAll();
    SupplyForecast save(SupplyForecast f);
}
